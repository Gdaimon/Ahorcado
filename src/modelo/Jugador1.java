package modelo; 

public class Jugador1 
{
	public String nombre;
	public int    puntaje;
	public int    intentos;
	
	public Jugador1(String nombre, int puntaje, int intentos)
	{
		this.nombre   = nombre;
		this.puntaje  = puntaje;
		this.intentos = intentos;
	}
	
	public Jugador1()
	{
		this.nombre   = "";
		this.puntaje  = 0;
		this.intentos = 0;
	} 
	
	public int escogerNivel() 
	{
		return 0;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}


	public int getIntentos() {
		return intentos;
	}


	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	 
}
