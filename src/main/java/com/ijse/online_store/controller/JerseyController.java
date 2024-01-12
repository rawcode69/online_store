package com.ijse.online_store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.online_store.dto.JerseyDTO;
import com.ijse.online_store.entity.Jersey;
import com.ijse.online_store.service.JerseyService;


@RestController
public class JerseyController {
  @Autowired
  JerseyService jerseyService;

  @GetMapping("/jersey")
  public ResponseEntity<List<Jersey>> getAllJerseies() {
    try {
      return ResponseEntity.status(HttpStatus.OK).body(jerseyService.getAllJersies());
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
  }

  @GetMapping("/jersey/{id}")
  public ResponseEntity<?> getJerseyById(@PathVariable Long id) {

    Jersey jersey = jerseyService.getJerseyById(id);

    // System.out.println(jersey.getJerseyName());

    if (jersey != null) {
      return ResponseEntity.status(HttpStatus.OK).body(jersey);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Jersey Not Found");
    }

  }

  @PostMapping("/jersey")
  public ResponseEntity<?> createJerey(@RequestBody JerseyDTO jerseyDTO) {

    Jersey newJersey = jerseyService.createJersey(jerseyDTO);

    if (newJersey != null) {
      return ResponseEntity.status(HttpStatus.CREATED).body(newJersey);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Jersey Not Created");
    }

  }

  @PutMapping("/jersey/{id}")
  public ResponseEntity<?> updateEntity(@PathVariable Long Id, @RequestBody Jersey jersey) {

    Jersey findJersey = jerseyService.getJerseyById(Id);

    if (findJersey != null) {
      try {
        return ResponseEntity.status(HttpStatus.CREATED).body(jerseyService.updateJersey(Id, findJersey));
      } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Jersey Not Updated");
      }
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Jersey Not Found");
    }

  }

  @DeleteMapping("jersey/{id}") // This is not working....
  public ResponseEntity<String> deleteJersey(@PathVariable Long id) {

    try {
      Jersey jersey = jerseyService.getJerseyById(id);
      if (jersey != null) {
        jerseyService.deleteJersey(id);
        // logger.info("Jersey with ID {} deleted successfully.", id);
        return ResponseEntity.ok("Jersey deleted successfully");
      } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Jersey not found");
      }
    } catch (Exception e) {
      // logger.error("Error deleting Jersey with ID {}", id, e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting jersey");
    }

  }

}
