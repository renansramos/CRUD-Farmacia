package com.farmacia.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do produto não pode estar em branco")
    @Size(max = 100, message = "O nome do produto deve ter no máximo 100 caracteres")
    private String nome_produto;

    @NotNull(message = "O preço do produto não pode estar em branco")
    @PositiveOrZero(message = "O preço do produto deve ser maior ou igual a zero")
    private Double preco_produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public Double getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(Double preco_produto) {
		this.preco_produto = preco_produto;
	}
    
    

   
}
