package com.demo3.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo3.demo.entidad.Estudiante;
import com.demo3.demo.interfaces.IEstudiante;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Autowired
	private IEstudiante repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante1 = new Estudiante("Federico", "Ara", "fede@gmail.com");
		repositorio.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Jorge", "Gomez", "jorge@gmail.com");
		repositorio.save(estudiante2);
		*/
	}
}
