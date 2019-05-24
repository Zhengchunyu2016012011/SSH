package cn.work.service;

import cn.work.entity.Category;

import java.util.List;
/**
 *
 * @author 刘畅
 * @version 2019/5/24
 */
public interface CategoryService {
    public void insertT(Category category);
    public void deleteById(int id);
    public Category getCategory(int id);
    public List<Category> getAllCategorys();
    public void add(Category category);
}
