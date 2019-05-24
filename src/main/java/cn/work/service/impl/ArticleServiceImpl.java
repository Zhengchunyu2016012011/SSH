package cn.work.service.impl;

import cn.work.dao.ArticleDao;
import cn.work.entity.Article;
import cn.work.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author 刘畅
 * @version 2019/5/24
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;
    @Override
    public void insertT(Article article) {
        articleDao.save(article);
    }

    @Override
    public void deleteById(int pkId) {
        articleDao.delete(pkId);
    }

    @Override
    public Article getArticle(int pkId) {
        return articleDao.findOne(pkId);
    }

    @Override
    public List<Article> getAllArticles() {
        return articleDao.findAll();
    }

    @Override
    public List<Article> searchByName(String name) {
        return articleDao.getArticleByNameLike(name);
    }

}
