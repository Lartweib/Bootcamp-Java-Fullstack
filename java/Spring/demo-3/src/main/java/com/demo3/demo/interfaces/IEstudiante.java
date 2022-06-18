package com.demo3.demo.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo3.demo.entidad.Estudiante;

@Repository
public interface IEstudiante extends JpaRepository<Estudiante, Long>{
	
}
