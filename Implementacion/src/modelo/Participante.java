package modelo;

public class Participante {

	private String nombre;
	
	private String correo;
	
	
	public Participante(String elNombre, String elCorreo)
	{
		this.nombre = elNombre;
		this.correo = elCorreo;
	}
	
	
	
	public String darNombre()
	{
		return nombre;
	}
	
	public String darCorreo()
	{
		return correo;
	}
	
}
