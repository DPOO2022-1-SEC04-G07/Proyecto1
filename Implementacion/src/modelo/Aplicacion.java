package modelo;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Scanner;

public class Aplicacion {

	private ArrayList<Proyecto> proyectos;
	
	private Proyecto proyectoActual;
	
	public Aplicacion() {
		this.proyectos = new ArrayList<Proyecto>();
	}
	
	public void agregarProyecto(Proyecto nuevoProyecto)
	{
		
	}
	
	public Participante buscarParticipante() {
		
	}
	
	public Proyecto buscarProyecto() {
		
	}
	
	public void ejecutarCrearProyecto() {
		
	}
	
	public void ejecutarSeleccionarProyecto() {
		
	}
	
	public void agregarParticipante(){
		
	}
	
	public void crearActividad() {
		
	}
	
	public void continuarActividad() {
		
	}
	
	public void modificarActividad() {
		
	}
	
	public void generarReporte() {
		
	}
	
	
			
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación");
		System.out.println("1. Crear proyecto");
		System.out.println("2. Abrir proyecto");
		System.out.println("3. Añadir participante");
		System.out.println("4. Crear Actividad");
		System.out.println("5. Continuar Actividad");
		System.out.println("6. Modificar Actividad");
		System.out.println("7. Generar Reporte de tiempos");
		System.out.println("8. Salir de la aplicación");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a la aplicación de proyectos");
		Aplicacion aplicacion = new Aplicacion();
		Scanner sc= new Scanner(System.in); 
		
		boolean continuar = true;
		while (continuar == true)
		{
			try
			{
			aplicacion.mostrarMenu();
			System.out.println("Seleccione una opcion: ");
			int opcionSeleccionada = sc.nextInt();
			
			if (opcionSeleccionada == 1) 
			{
				aplicacion.ejecutarCrearProyecto();
			}
			else if (opcionSeleccionada == 2) 
			{
				aplicacion.ejecutarSeleccionarProyecto();
			}
			else if (opcionSeleccionada == 3)
			{
				aplicacion.agregarParticipante();
			}
			else if (opcionSeleccionada == 4)
			{
				aplicacion.crearActividad();
			}
			else if (opcionSeleccionada == 5)
			{
				aplicacion.continuarActividad();
			}
			else if (opcionSeleccionada == 6)
			{
				aplicacion.modificarActividad();
			}
			else if (opcionSeleccionada == 7)
			{
				aplicacion.generarReporte();	
			}
			else if (opcionSeleccionada == 8)
			{
				System.out.println("Saliendo de la aplicación ...");
				continuar = false;
			}
			else
			{
				System.out.println("Por favor seleccione una opción válida.");
			}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
}
	


	

