package com.jk.controller;

import com.jk.pojo.Goods;
import com.jk.service.Impl.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService GoodsService;

    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }


   @RequestMapping("/queryGoods")
    public String queryGoods(Model model,Goods goods){
       List<Goods> list = GoodsService.queryGoods(goods);
       model.addAttribute("list",list);
       return "show";
   }

   @RequestMapping("/querywheregoods")
    public String querywheregoods(Integer goodsid,Model model){
        Goods goods = GoodsService.querywheregoods(goodsid);
        model.addAttribute("goods",goods);
        return "update";
   }


    @RequestMapping("/updategoods")
    @ResponseBody
    public void updategoods(Goods goods){
        GoodsService.updategoods(goods);
    }

    @RequestMapping("/toaddgoods")
    public String toaddgoods(){
        return "addgoods";
    }

    @RequestMapping("/addgoods")
    @ResponseBody
    public void addgoods(Goods goods){
        GoodsService.addgoods(goods);
    }

    @RequestMapping("/deletegoods")
    @ResponseBody
    public void deletegoods(Integer goodsid){
        GoodsService.deletegoods(goodsid);
    }

    @RequestMapping("/uploadPhoto")
    @ResponseBody
    public String uploadPhoto(MultipartFile userphoto, HttpServletRequest req) throws Exception{
        //获取原文件名称
        String fileName = userphoto.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String folderPath = req.getSession().getServletContext().getRealPath("/")+
                "upload/";
        File file = new File(folderPath);
//	        该目录是否已经存在
        if(!file.exists()){
            //   创建文件夹
            file.mkdir();
        }
        String onlyFileName = sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.'));
        FileOutputStream fos = new FileOutputStream(folderPath+onlyFileName);
        fos.write(userphoto.getBytes());
        fos.flush();
        fos.close();
        return  "upload/"+onlyFileName;
    }

    @RequestMapping("test")
    public String test(){
        return "ooooo";
    }

}
