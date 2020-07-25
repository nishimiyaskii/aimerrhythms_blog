package com.aimerrhythms.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aimerrhythms
 * @data 2020/7/21 17:36
 */
@Controller
public class TestController {
    @RequestMapping("/index")
    public String index() {
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
