package com.ijse.online_store.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.Category;
import com.ijse.online_store.repository.CategoryRepository;
import com.ijse.online_store.service.CategoreyService;

@Service
public class CategoryServiceImpl implements CategoreyService {

  @Autowired
  CategoryRepository categoryRepository;

  @Override
  public List<Category> getAllCategory() {
    return categoryRepository.findAll();
  }

  @Override
  public Category getCategoreyById(Long Id) {
    return categoryRepository.findById(Id).orElse(null);
  }

  @Override
  public Category createCategory(Category category) {
    return categoryRepository.save(category);
  }

  @Override
  public Category updateCategory(Long Id, Category category) {
    Category existingCategorey = categoryRepository.findById(Id).orElse(null);

    if (existingCategorey != null) {
      existingCategorey.setCategoryName(category.getCategoryName());
      return categoryRepository.save(existingCategorey);
    } else {
      return null;
    }
  }

}
