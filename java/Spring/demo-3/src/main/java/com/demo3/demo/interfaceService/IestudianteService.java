package com.demo3.demo.interfaceService;

import java.util.List;

import com.demo3.demo.entidad.Estudiante;

public interface IestudianteService {
	
	public List<Estudiante>listarTodosLosEstudiantes();

	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudianteId(Long id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long id) ;
}
