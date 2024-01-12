package com.ijse.online_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.online_store.entity.Jersey;

@Repository
public interface JerseyRepository extends JpaRepository<Jersey,Long> {

}
