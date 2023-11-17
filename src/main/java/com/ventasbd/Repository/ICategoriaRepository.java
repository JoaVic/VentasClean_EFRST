package com.ventasbd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventasbd.Models.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>  {

}
