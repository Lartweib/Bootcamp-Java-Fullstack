package com.demo3.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo3.demo.entidad.Estudiante;
import com.demo3.demo.interfaceService.IestudianteService;
import com.demo3.demo.interfaces.IEstudiante;

@Service
public class EstudianteService implements IestudianteService {

	@Autowired
	private IEstudiante repositorio;

	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudianteId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Long id) {
		repositorio.deleteById(id);
	}

}
