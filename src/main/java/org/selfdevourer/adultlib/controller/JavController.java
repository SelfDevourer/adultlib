package org.selfdevourer.adultlib.controller;

import org.selfdevourer.adultlib.entity.Jav;
import org.selfdevourer.adultlib.service.IJavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JavController {

    @Autowired
    private IJavService javService;

    @GetMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Jav> javList = javService.selectHome();
        model.addAttribute("javs", javList);
        return "jav/list";
    }

    @RequestMapping("/page")
    @ResponseBody
    public Page<Jav> page(Integer index) {
        return javService.selectPage(index);
    }

    @GetMapping("/details/{id}")
    public String details(Model model, @PathVariable("id") String id) {
        Jav jav = javService.findById(id);
        System.out.println(jav);
        model.addAttribute("jav", jav);
        return "jav/details";
    }
}
