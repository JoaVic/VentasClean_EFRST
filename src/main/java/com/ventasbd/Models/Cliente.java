package com.ventasbd.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "Clientes")
@Data
public class Cliente {
	@Id
	private int cliente_id;
	private String dni;
	private String fecha_nacimiento;
	private String nombre_apellidos;
	private String direccion;
	private String fecha_compra;
	private String email;
	private String telefono;
}
