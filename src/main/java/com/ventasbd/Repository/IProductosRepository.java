package com.ventasbd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventasbd.Models.Productos;

public interface IProductosRepository extends JpaRepository<Productos, Integer> {

}
