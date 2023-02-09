package com.api.sgl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sgl.entity.ChaveWindowsEntity;

@Repository
public interface ChaveWindowsRepository extends JpaRepository<ChaveWindowsEntity, Long>{

}
