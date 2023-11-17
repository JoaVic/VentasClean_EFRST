package com.ventasbd.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Productos")
@Data
public class Productos {
	@Id
	private int producto_id ;
	private String nombre;
	private String descripcion;
	private Double peso ;
	private Double precio ;
	private String fecha_vencimiento ;
	private String fecha_fabricacion;
	private String fecha_envio;
	private int cantidad ;
	private int categoria_id;
}
