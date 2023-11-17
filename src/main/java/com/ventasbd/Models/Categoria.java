package com.ventasbd.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "Categorias")
@Data
public class Categoria {
	@Id
	private int categoria_id; 
	private String nombre; 
	private String descripcion;
}
