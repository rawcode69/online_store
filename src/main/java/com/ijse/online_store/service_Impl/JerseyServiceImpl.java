package com.ijse.online_store.service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.online_store.dto.JerseyDTO;
import com.ijse.online_store.entity.Category;
import com.ijse.online_store.entity.Jersey;
import com.ijse.online_store.repository.CategoryRepository;
import com.ijse.online_store.repository.JerseyRepository;
import com.ijse.online_store.service.JerseyService;

import jakarta.transaction.Transactional;

@Service
public class JerseyServiceImpl implements JerseyService {

  @Autowired
  JerseyRepository jerseyRepository;

  @Autowired
  CategoryRepository categoryRepository;

  @Override
  public List<Jersey> getAllJersies() {
    return jerseyRepository.findAll();
  }

  @Override
  public Jersey getJerseyById(Long Id) {
    return jerseyRepository.findById(Id).orElse(null);
  }

  @Override
  public Jersey createJersey(JerseyDTO jerseyDTO) {

    Category category = categoryRepository.findById(jerseyDTO.getCategoryId()).orElse(null);

    if (category != null) {
      Jersey jersey = new Jersey();

      jersey.setCategory(category);
      jersey.setJerseyName(jerseyDTO.getJerseyName());
      jersey.setJerseyYear(jerseyDTO.getJerseyYear());
      jersey.setJerseyTeam(jerseyDTO.getJerseyTeam());
      jersey.setIsJerseyNew(jerseyDTO.getIsJerseyNew());
      jersey.setJerseyDescription(jerseyDTO.getJerseyDescription());
      jersey.setJerseyPrice(jerseyDTO.getJerseyPrice());
      jersey.setJerseyDiscount(jerseyDTO.getJerseyDiscount());
      jersey.setQuantity_S(jerseyDTO.getQuantity_S());
      jersey.setQuantity_M(jerseyDTO.getQuantity_M());
      jersey.setQuantity_L(jerseyDTO.getQuantity_L());
      jersey.setQuantity_XL(jerseyDTO.getQuantity_XL());

      return jerseyRepository.save(jersey);

    } else {
      return null;
    }

  }

  @Override
  public Jersey updateJersey(Long Id, Jersey jersey) {
    Jersey existingJersey = jerseyRepository.findById(Id).orElse(null);

    if (existingJersey != null) {

      existingJersey.setJerseyName(jersey.getJerseyName());
      existingJersey.setJerseyDescription(jersey.getJerseyDescription());
      existingJersey.setIsJerseyNew(jersey.getIsJerseyNew());
      existingJersey.setJerseyDiscount(jersey.getJerseyDiscount());
      existingJersey.setJerseyPrice(jersey.getJerseyPrice());
      existingJersey.setJerseyTeam(jersey.getJerseyTeam());
      existingJersey.setJerseyYear(jersey.getJerseyYear());
      existingJersey.setQuantity_S(jersey.getQuantity_S());
      existingJersey.setQuantity_M(jersey.getQuantity_M());
      existingJersey.setQuantity_L(jersey.getQuantity_L());
      existingJersey.setQuantity_XL(jersey.getQuantity_XL());

      return jerseyRepository.save(existingJersey);
    } else {
      return null;
    }
  }

  @Transactional
  @Override
  public void deleteJersey(Long Id) {
    jerseyRepository.deleteById(Id);
  }

}
