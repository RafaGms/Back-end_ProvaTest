package com.back.provatest.repossitoies;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.provatest.entities.Carro;

public interface CarroRepository extends JpaRepository <Carro,Integer>{
   
}
