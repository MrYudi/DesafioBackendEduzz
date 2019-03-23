package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id; //Obs.: precisa ser Integer invez de int devido ao JPA
	
	@Column(name="Titulo", length=100, nullable=false) 
	private String titulo;
	@Column(name="Categoria", length=100, nullable=false) 
	private String categoria; //Poderia ser Enum
	@Column(name="Texto", length=100, nullable=false) 
	private String texto;
	
	public Blog() 
	{
	}
	
	public Blog(String titulo, String categoria, String texto) 
	{
		this.titulo = titulo;
		this.categoria = categoria;
		this.texto = texto;
	}

	//Get/Set
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
		
}
