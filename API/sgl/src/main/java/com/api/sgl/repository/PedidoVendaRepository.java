package com.api.sgl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sgl.entity.PedidoVendaEntity;

@Repository
public interface PedidoVendaRepository extends JpaRepository<PedidoVendaEntity, Long>{

}
