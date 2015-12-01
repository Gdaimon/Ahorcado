 
package modelo; 

import java.util.LinkedList;


public class Juego 
{
	public Object           administrador;
	public Jugador1         jugador1;
	public Temas            temas;
	public VerificarGanador verificaGanador;
	public LinkedList<Jugador1> listaJugadores;
	 
	
	public Juego()
	{ 
	   this.temas           = new Temas();
	   this.verificaGanador = new VerificarGanador();
	   this.jugador1		= new Jugador1();
	   this.listaJugadores  = new LinkedList<Jugador1>();	   
	   this.listaJugadores.add(crearJugador("nn", 0, 0));
	}
	 
	public Jugador1 crearJugador(String nombre, int puntaje, int intentos)
	{
	  jugador1 = new Jugador1(nombre, puntaje, intentos);
	  return jugador1;
	}
	
	public String mostrarAyudaLetras(String palabra, int nivel)
	{
		
		char [] arr = new char[palabra.length()];		
		for(int i=0;i<palabra.length();i++)
		{
			arr[i]='-';
		} 
		
		if(palabra.length() <= 5 && palabra.length() >= 3 && nivel == 1)
		{
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<2; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			}
		} 
		
		if(palabra.length() <= 5 && nivel == 2)
		{
			//mostrar 1 letras
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<1; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			} 
		}
		
		if(palabra.length() <= 5 && nivel == 3)
		{
			//mostrar 0 letras
		}
		
		if((palabra.length() > 5 && palabra.length() <= 10) && nivel == 1)
		{
			//mostrar 3 letras
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<3; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			}
		}
		
		if((palabra.length() > 5 && palabra.length() <= 10) && nivel == 2)
		{
			//mostrar 2 letras
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<2; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			}
		}
		
		if((palabra.length() > 5 && palabra.length() <= 10) && nivel == 3)
		{
			//mostrar 1 letras
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<1; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			}
		}
		
		if(palabra.length() > 10 && nivel == 1)
		{
			//mostrar 4 letras
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<4; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			}
		}
		
		if(palabra.length() > 10 && nivel == 2)
		{
			//mostrar 3 letras
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<3; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			}
		}
		
		if(palabra.length() > 10 && nivel == 3)
		{
			//mostrar 3 letras
			NumerosAleatorios na = new NumerosAleatorios(0,palabra.length()-1);   
			for(int i=0; i<3; i++)
			{ 
				int num1 = na.generar();
				arr[num1]= palabra.charAt(num1);   //solo graba las letras a mostrar 
			}
		} 
		String    p = new String(arr);
		
		return p;  //palabra con espacios
		
	}
	
	public void acumularPuntos(int nivel, Jugador1 jugador) 
	{
		 switch(nivel)
		 {
	 	 case 1: jugador.setPuntaje(jugador.getPuntaje()+10); break;		 
		 case 2: jugador.setPuntaje(jugador.getPuntaje()+20); break;
		 case 3: jugador.setPuntaje(jugador.getPuntaje()+30); break; 
		 }
	}
	
	public void restarPuntos(int contador, Jugador1 jugador) 
	{
		 switch(contador)
		 {
		 case 1: jugador.setPuntaje(jugador.getPuntaje()-1); break;
		 case 2: jugador.setPuntaje(jugador.getPuntaje()-2); break;
		 case 3: jugador.setPuntaje(jugador.getPuntaje()-3); break; 
		 case 4: jugador.setPuntaje(jugador.getPuntaje()-4); break; 
		 }
	}
	
 
	public void mostrarColgado() 
	{
		
	}
	
	public void mostrarPalabra()
	{
	
	}

	public Object getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Object administrador) {
		this.administrador = administrador;
	}

	public Jugador1 getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador1 jugador1) {
		this.jugador1 = jugador1;
	}

	public Temas getTemas() {
		return temas;
	}

	public void setTemas(Temas temas) {
		this.temas = temas;
	}
	
	public Jugador1 buscarJugador(String jugador)
	{
		for(int i=0; i< listaJugadores.size(); i++)
		{
			if(listaJugadores.get(i).nombre.equals(jugador))
			{
				return listaJugadores.get(i);
			}
		}
		return null;
	}
	
}
