package com.back.provatest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.provatest.entities.Carro;
import com.back.provatest.repossitoies.CarroRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CarroService {

@Autowired
private CarroRepository carroRepository;

public Carro getCarroById(int id){
   return carroRepository.findById(id).orElseThrow(
      () -> new EntityNotFoundException("Card Carro não encontrado")
   );
}

public List<Carro> getCarro(){
return carroRepository.findAll();
}

}
