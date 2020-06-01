/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

/**
 * @author Antonella Benicio
 *
 */
@Component
public class Equipo {
	private String nombre;
	private Estadio estadio;
	
	//constructor
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor
	
	public Equipo(Estadio estadio) {
		super();
		this.estadio = estadio;
	}

	//getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + "]";
	}
	
	//to string
	
	


}
