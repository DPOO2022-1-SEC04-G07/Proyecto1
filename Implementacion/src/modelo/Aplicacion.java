package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aplicacion {

	private ArrayList<Proyecto> proyectos;
	
	private Proyecto proyectoActual;
	
	public Aplicacion() {
		this.proyectos = new ArrayList<Proyecto>();
	}
	
	public ArrayList<Proyecto> getProyectos()
	{
		return proyectos;
	}
	
	public Proyecto getProyectoActual()
	{
		return proyectoActual;
	}
	
	public void setProyectos(ArrayList<Proyecto> actualizacionLista)
	{
		this.proyectos = actualizacionLista; 
	}
	
	public void setProyectoActual(Proyecto actualizacionProyecto)
	{
		this.proyectoActual = actualizacionProyecto;
	}
		
	
	public ArrayList<Proyecto> agregarProyecto(Proyecto nuevoProyecto, Aplicacion aplicacion)
	{
		ArrayList<Proyecto> lista = getProyectos();
		lista.add(nuevoProyecto);
		return lista;
	}
	
	public Participante buscarParticipante() {
		
	}
	
	public Proyecto buscarProyecto() {
		
	}
	
	public Proyecto ejecutarCrearProyecto(String nombre, String descripcion, Date objDate, String fechaFinal, String nombreD, String correo) {
		Proyecto proyecto = new Proyecto(nombre,descripcion,objDate,fechaFinal,nombreD,correo);
		return proyecto;
	}
	
	public Proyecto ejecutarProyectoActual(Aplicacion aplicacion)
	{
		return aplicacion.getProyectoActual();
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
		System.out.println("\nOpciones de la aplicaci�n");
		System.out.println("1. Crear proyecto");
		System.out.println("2. Proyecto seleccionado actual");
		System.out.println("3. Abrir proyecto");
		System.out.println("4. A�adir participante al proyecto");
		System.out.println("5. Crear Actividad");
		System.out.println("6. Continuar Actividad");
		System.out.println("7. Modificar Actividad");
		System.out.println("8. Generar Reporte de tiempos");
		System.out.println("9. Salir de la aplicaci�n");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a la aplicaci�n de proyectos");
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
				sc.nextLine();
				
				System.out.println("\nCreando proyecto...");
				System.out.println("\nIngrese el Titulo del proyecto: ");
				String nombre = sc.nextLine();
				
				System.out.println("\nIngrese la descripcion del proyecto: ");
				String descripcion = sc.nextLine();
				
				System.out.println("\nFecha Inicio: ");
				Date objDate = new Date();
				System.out.println(objDate.toString());
				
				System.out.println("\nFecha Entrega en formato (MM-DD-AAAA): ");
				String fechaFinal = sc.nextLine();
				
				System.out.println("\nIngrese el nombre del due�o del proyecto: ");
				String nombreD = sc.nextLine();
				
				System.out.println("\nIngrese el correo electronico del due�o del proyecto:");
				String correo = sc.nextLine();
				
				Proyecto proyecto = aplicacion.ejecutarCrearProyecto(nombre, descripcion, objDate, fechaFinal, nombreD, correo);
				ArrayList<Proyecto> actualizacionLista = aplicacion.agregarProyecto(proyecto, aplicacion);
				aplicacion.setProyectos(actualizacionLista);
				aplicacion.setProyectoActual(proyecto);
			}
			
			else if (opcionSeleccionada == 3) 
			{
				aplicacion.ejecutarSeleccionarProyecto();
			}
			else if (opcionSeleccionada == 2) 
			{
				Proyecto proyectoActual = aplicacion.ejecutarProyectoActual(aplicacion);
				System.out.println("\nNombre proyecto actual: " + proyectoActual.getNombre());
				System.out.println("Descripcion: " + proyectoActual.getInfo());
			}
			else if (opcionSeleccionada == 4)
			{
				aplicacion.agregarParticipante();
			}
			else if (opcionSeleccionada == 5)
			{
				aplicacion.crearActividad();
			}
			else if (opcionSeleccionada == 6)
			{
				aplicacion.continuarActividad();
			}
			else if (opcionSeleccionada == 7)
			{
				aplicacion.modificarActividad();
			}
			else if (opcionSeleccionada == 8)
			{
				aplicacion.generarReporte();	
			}
			else if (opcionSeleccionada == 9)
			{
				System.out.println("\nSaliendo de la aplicaci�n ...");
				continuar = false;
			}
			else
			{
				System.out.println("Por favor seleccione una opci�n v�lida.");
			}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los n�meros de las opciones.");
			}
		}
	}
}
	


	

