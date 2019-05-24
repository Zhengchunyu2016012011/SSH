package cn.work.controller;


import cn.work.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author 刘畅
 * @version 2019/5/24
 */
@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/index.html",method = RequestMethod.GET)
     public String index(){
        return "index";
    }
    @RequestMapping(value = "/categories",method = RequestMethod.GET)
    public String categories(Model map){
        map.addAttribute("itemList",articleService.getAllArticles());
        return "categoriesPage";
    }
    @RequestMapping(value = "/search",method=RequestMethod.GET)
    public String search(Model map, @RequestParam String search){
        map.addAttribute("itemList",articleService.searchByName(search));
        System.out.println(articleService.searchByName(search));
        return "searchPage";
    }


}
