package cn.work.service;

import cn.work.entity.Article;

import java.util.List;

/**
 *
 * @author 刘畅
 * @version 2019/5/24
 */
public interface ArticleService {
    public void insertT(Article article);
    public void deleteById(int pkId);
    public Article getArticle(int pkId);
    public List<Article> getAllArticles();
    public List<Article> searchByName(String name);
}
