package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios = new HashSet<Deportista>();
	private Map<String, Evento> competencias = new HashMap<String,Evento>();
	
	public Club(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
	}
	
	public Integer getCantidadSocios() {
		return this.socios.size();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public void crearEvento(TipoDeEvento tipo, String nombreEvento) {
		 this.competencias.put(nombreEvento, new Evento(tipo));
	}


	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {
		if(this.competencias.containsKey(deportista)) {
			
		}
		throw new NoEstaPreparado();
	}

	
	
	
	
}
