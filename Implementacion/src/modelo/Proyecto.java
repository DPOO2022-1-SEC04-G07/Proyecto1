package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {

	private String nombre;
	
	private String info;
	
	private Date fechaInicial;
	
	private Date fechaFinal;
	
	private ArrayList<Participante> participantes;
	
	private ArrayList<Actividad> actividades;

	public Proyecto(String elNombre, String laInfo, Date fechaI, Date fechaF, ArrayList<Participante> losParticipantes, ArrayList<Actividad> lasActividades) {
			this.nombre = elNombre;
			this.info = laInfo;
			this.fechaInicial = fechaI;
			this.fechaFinal = fechaF;
			this.participantes = losParticipantes;
			this.actividades = lasActividades;
	}
	
	public Proyecto(String elCorreo) {
		
	}

	public Proyecto(String elCorreo) {
	
	}

	public void agregarActividad(Actividad nuevaActividad){
		
	}
	
	public Actividad buscarActividad() {
		
	}
	
}
