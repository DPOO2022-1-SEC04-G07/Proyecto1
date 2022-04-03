package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {

	private String nombre;
	
	private String info;
	
	private Date fechaInicial;
	
	private String fechaFinal;
	
	private ArrayList<Participante> participantes;
	
	private ArrayList<Actividad> actividades;

	public Proyecto(String elNombre, String laInfo, Date fechaI, String fechaF, String nombre, String correo) {
			this.nombre = elNombre;
			this.info = laInfo;
			this.fechaInicial = fechaI;
			this.fechaFinal = fechaF;
			Participante dueño = new Participante(nombre,correo);
			ArrayList<Participante> losParticipantes = new ArrayList<Participante>();
			losParticipantes.add(dueño);
			this.participantes = losParticipantes;
			ArrayList<Actividad> lasActividades = new ArrayList<Actividad>();
			this.actividades = lasActividades;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getInfo()
	{
		return info;
	}
	
	public ArrayList<Participante> getParticipantes()
	{
		return participantes;
	}
	

	public void agregarActividad(Actividad nuevaActividad){
		
	}
	
	public Actividad buscarActividad() {
		
	}
	
}
