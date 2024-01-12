package com.ijse.online_store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.online_store.dto.JerseyDTO;
import com.ijse.online_store.entity.Jersey;

@Service
public interface JerseyService {

  List<Jersey> getAllJersies();

  Jersey getJerseyById(Long Id);

  Jersey createJersey(JerseyDTO jerseyDTO);

  Jersey updateJersey(Long Id, Jersey jersey);

  void deleteJersey(Long Id);
}
