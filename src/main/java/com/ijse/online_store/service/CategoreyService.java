package com.ijse.online_store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.online_store.entity.Category;

@Service
public interface CategoreyService {

  List<Category> getAllCategory();

  Category getCategoreyById(Long Id);

  Category createCategory(Category category);

  Category updateCategory(Long Id,Category category);

}
