package com.lanou.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@Controller
public class UploadController {
    @RequestMapping("/upload")
    public void upload(@RequestParam("head") CommonsMultipartFile img, HttpServletRequest request) throws IOException {
        System.out.println(img.getSize());
        System.out.println(img.getOriginalFilename());
        String filename = new Date().getTime() + ".jpg";
        String realPath = request.getServletContext().getRealPath("/img") + "/" + filename;
        IOUtils.copy(img.getInputStream(),new FileOutputStream(realPath));
    }
}
