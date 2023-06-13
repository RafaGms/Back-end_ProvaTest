package com.back.provatest.resorce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.provatest.entities.Carro;
import com.back.provatest.service.CarroService;

@RestController
@RequestMapping("Carros")
@CrossOrigin
public class CarroController {

   @Autowired
   private CarroService carroService;

   @GetMapping("{id}")
   public Carro getCar(@PathVariable int id) {
      return carroService.getCarroById(id);
   }

   @GetMapping
   public List<Carro> getCarro() {
      return carroService.getCarro();
   }
}
