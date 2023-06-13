package com.back.provatest.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "TBL_CARRO")
public class Carro implements Serializable {
   @Id      
   private Integer id;
   private String name;
   private Integer valor;
   private Integer ano;
   private String descricao;
   private String imagem;

   public Carro() {
   }


   public Carro(Integer id, String name, Integer valor, Integer ano, String descricao, String imagem) {
      this.id = id;
      this.name = name;
      this.valor = valor;
      this.ano = ano;
      this.descricao = descricao;
      this.imagem = imagem;
   }
   
   public Integer getId() {
      return id;
   }
   public void setId(Integer id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public Integer getValor() {
      return valor;
   }
   public void setValor(Integer valor) {
      this.valor = valor;
   }
   public Integer getAno() {
      return ano;
   }
   public void setAno(Integer ano) {
      this.ano = ano;
   }
   public String getDescricao() {
      return descricao;
   }
   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }
   public String getImagem() {
      return imagem;
   }
   public void setImagem(String imagem) {
      this.imagem = imagem;
   }


   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }


   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Carro other = (Carro) obj;
      if (id == null) {
         if (other.id != null)
            return false;
      } else if (!id.equals(other.id))
         return false;
      return true;
   }


}
