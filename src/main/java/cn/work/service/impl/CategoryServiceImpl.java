package cn.work.service.impl;

import cn.work.dao.CategoryDao;
import cn.work.entity.Category;
import cn.work.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author 刘畅
 * @version 2019/5/24
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;
    @Override
    public void insertT(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void deleteById(int id) {
        categoryDao.delete(id);
    }

    @Override
    public Category getCategory(int id) {
        return categoryDao.findOne(id);
    }

    @Override
    public List<Category> getAllCategorys() {
        return categoryDao.findAll();
    }

    @Override
    public void add(Category category) {
        categoryDao.save(category);
    }
}
