package cn.edu.nenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController Class
 *
 * @author <b>Siamese_miao</b>, Copyright &#169; 2018
 * @version 1.0, 2019-05-20 14:32
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("")
    public String list(Model model){
        System.out.println("indexController.class");
        return "index";
    }

}
