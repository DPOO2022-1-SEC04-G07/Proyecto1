package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
	
	public void buscarParticipante(Aplicacion aplicacion) 
	{
		Proyecto proyectoActual = aplicacion.getProyectoActual();
		ArrayList<Participante> participantes = proyectoActual.getParticipantes();
		Iterator<Participante> iter = participantes.iterator();
		while (iter.hasNext()) {
			Participante participante = iter.next();
			String nombre = participante.getNombre();
			String correo = participante.getCorreo();
			System.out.println(nombre + ": " + correo);
		}
	}
	
	public void buscarProyecto(Aplicacion aplicacion, Scanner sc) {
		ArrayList<Proyecto> proyectos = aplicacion.getProyectos();
		int contador = 1;
		Iterator<Proyecto> iter = proyectos.iterator();
		while (iter.hasNext()){
			Proyecto proyecto = iter.next();
			String nombre = proyecto.getNombre();
			String info = proyecto.getInfo();
			System.out.println(contador+". Nombre: " + nombre + "   Descrpción: " + info );
			contador += 1;
		}
		System.out.println("\nEscriba el número del proyecto seleccionado: ");
		int opcion = sc.nextInt();
		int indice = opcion-1 ;
		Proyecto seleccionProyecto = proyectos.get(indice);
		
		sc.nextLine();
		System.out.println("El proyecto seleccionado es: ");
		String nombre = seleccionProyecto.getNombre();
		String info = seleccionProyecto.getInfo();
		System.out.println("Nombre: " + nombre + "   Descrpción: " + info );
		System.out.println("\n¿Desea continuar? (Si o No):");
		String opcion2 = sc.nextLine();
		if (opcion2.equals("Si")) {
			aplicacion.setProyectoActual(seleccionProyecto);
		}
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
	
	public void agregarParticipante(String nombre, String correo, Aplicacion aplicacion)
	{
		Participante participante = new Participante(nombre,correo);
		Proyecto proyectoActual = aplicacion.getProyectoActual();
		ArrayList<Proyecto> proyectos = aplicacion.getProyectos();
		Iterator<Proyecto> iter = proyectos.iterator();
		while (iter.hasNext()) {
			Proyecto proyecto = iter.next();
			if (proyecto.equals(proyectoActual)){
				iter.remove();
			}
		}
		ArrayList<Participante> listaVieja = proyectoActual.getParticipantes();
		listaVieja.add(participante);
		proyectoActual.setParticipantes(listaVieja);
		aplicacion.setProyectoActual(proyectoActual);
		proyectos.add(proyectoActual);
		aplicacion.setProyectos(proyectos);
		
		
	}
	
	public void crearActividad(String nombre, String laInfo, String fechaInicial, String fechaFinal) {
		Actividad actividad = new Actividad(nombre, laInfo, fechaInicial, fechaFinal);
		
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
		System.out.println("2. Proyecto seleccionado actual");
		System.out.println("3. Abrir proyecto");
		System.out.println("4. Añadir participante al proyecto");
		System.out.println("5. Crear Actividad");
		System.out.println("6. Continuar Actividad");
		System.out.println("7. Modificar Actividad");
		System.out.println("8. Generar Reporte de tiempos");
		System.out.println("9. Salir de la aplicación");
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
				
				System.out.println("\nIngrese el nombre del dueño del proyecto: ");
				String nombreD = sc.nextLine();
				
				System.out.println("\nIngrese el correo electronico del dueño del proyecto:");
				String correo = sc.nextLine();
				
				Proyecto proyecto = aplicacion.ejecutarCrearProyecto(nombre, descripcion, objDate, fechaFinal, nombreD, correo);
				ArrayList<Proyecto> actualizacionLista = aplicacion.agregarProyecto(proyecto, aplicacion);
				
				aplicacion.setProyectos(actualizacionLista);
				aplicacion.setProyectoActual(proyecto);
			}
			
			else if (opcionSeleccionada == 3) 
			{
				System.out.print("Buscando proyectos...\n");
				aplicacion.buscarProyecto(aplicacion,sc);
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
				sc.nextLine();
				System.out.println("\nLista actual de participantes: ");
				aplicacion.buscarParticipante(aplicacion);
				System.out.println("\n¿Desea continuar? (Si o No):");
				String opcion = sc.nextLine();
				if (opcion.equals("Si")) {
					System.out.println("\nCreando participante...");
					
					System.out.println("\nIngrese el nombre; ");
					String nombre = sc.nextLine();
					System.out.println("\nIngrese el correo; ");
					String correo = sc.nextLine();
					aplicacion.agregarParticipante(nombre,correo,aplicacion);
					System.out.println("Participante agregado existosamente.");
				}
				
			}
			else if (opcionSeleccionada == 5)
			{
				sc.nextLine();
				
				System.out.println("\nCreando actividad...");
				
				System.out.println("\nIngrese el nombre de la actividad: ");
				String nombre = sc.nextLine();
				
				System.out.println("\nIngrese una breve descripción de la actividad: ");
				String info = sc.nextLine();
				
				System.out.println("\nFecha Inicio: ");
				
				Date fecheInicio = new Date();
				
				System.out.println(objDate.toString());
				
				System.out.println("\nFecha Entrega (MM-DD-AAAA): ");
				
				String fechaFinal = sc.nextLine();
				
				Actividad actividad = aplicacion.crearActividad(nombre, info, fechaInicio, fechaFinal);
			
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
				System.out.println("\nSaliendo de la aplicación ...");
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
	


	

