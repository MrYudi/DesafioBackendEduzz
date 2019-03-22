package com.example.demo.models;

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
	private String titulo;
	private String categoria; //Poderia ser Enum
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

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object arg0) 
	{
		return this.id == arg0;
	}
		
}
