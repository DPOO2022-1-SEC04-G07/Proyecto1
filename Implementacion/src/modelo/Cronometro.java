package modelo;

public class Cronometro {
  
  private double tiempo;
	
	
	public void iniciarTiempo(double iniTiempo) {
		
	}
	
	public void finalizarTiempo(double finTiempo) {
		
	}
	
	
	
	public static void main (String[] args ) {
	TimerTask tarea = new TimerTask () {
		/*condicion
		 * 
		 */
	public void run () {
	System.out.println ("Han pasado 5 segundos desde lo anterior");
	}
	};
	Timer m = new Timer ();
	m.Schedule (tarea, 5000, 5000);//que durará en comenzar 5000 milisegundos (5 segundos) y se repetirá cada 5 segundos
	}

}
