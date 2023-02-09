package com.api.sgl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sgl.entity.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long>{

}
