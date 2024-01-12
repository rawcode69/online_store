package com.ijse.online_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.online_store.entity.Category;
import com.ijse.online_store.service.CategoreyService;

@RestController
public class CategoreyController {

  @Autowired
  CategoreyService categoreyService;

  @GetMapping("/categories")
  public ResponseEntity<List<Category>> getAllCategories() {
    try {
      return ResponseEntity.status(HttpStatus.OK).body(categoreyService.getAllCategory());
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
  }

  @PostMapping("/categories")
  public ResponseEntity<?> createCategory(@RequestBody Category category) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED).body(categoreyService.createCategory(category));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Category Not Created");
    }
  }

  @GetMapping("/categories/{id}")
  public ResponseEntity<Category> getCategoretById(@PathVariable Long id) {

    Category category = categoreyService.getCategoreyById(id);

    if (category != null) {
      return ResponseEntity.status(HttpStatus.OK).body(category);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

  }

  @PutMapping("/categories/{id}")
  public ResponseEntity<?> updateCategory(@PathVariable Long id, @RequestBody Category category) {

    Category category2 = categoreyService.getCategoreyById(id);

    if (category2 != null) {
      try {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoreyService.updateCategory(id, category2));
      } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Category Not Updated");
      }

    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Category Not Found");
    }

  }

}
