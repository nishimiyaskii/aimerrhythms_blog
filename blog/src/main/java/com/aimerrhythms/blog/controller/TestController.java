package com.aimerrhythms.blog.controller;

import com.aimerrhythms.blog.exception.BlogNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aimerrhythms
 * @data 2020/7/21 17:36
 */
@Controller
public class TestController {

    @GetMapping("/index")
    public String index() {
        /*
            error文件夹名和400.html、500.html都是规定的名字
         */
//        int i = 1 / 0;
        String blog = null;
        if (blog == null) {
            throw new BlogNotFoundException("博客不存在...");
        }
        return "index";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "blog";
    }

    @RequestMapping("/types")
    public String types() {
        return "types";

    }
    @RequestMapping("/tags")
    public String tags() {
        return "tags";
    }

    @RequestMapping("/archives")
    public String archives() {
        return "archives";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/admin/blogs")
    public String blogs() {
        return "admin/blogs";
    }

    @RequestMapping("/admin/publish")
    public String publish() {
        return "admin/publish";
    }
}
