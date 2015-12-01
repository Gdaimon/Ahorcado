package modelo;

import java.util.LinkedList;

import javax.swing.ImageIcon;
  
public class VerificarGanador 
{
//	public ImageIcon imgPartes;
	public String    palabraCompleta;
	public String    palabraEnJuego;
	public char      letraEntrante;
	public LinkedList <ImageIcon> listaPartesCuerpo;
	public int       contadorPartes; 
	public boolean   acierto, gameOver, ganador; 

	
	public VerificarGanador()
	{
		inicializar();
		cargarImagenes();
	}
	
	public void inicializar()
	{
		this.palabraCompleta = null;
		this.palabraEnJuego  = null;
		this.letraEntrante   = ' ';
		this.contadorPartes  = 0;		
		this.acierto         = true;
		this.gameOver        = false;
	}
	
	public void cargarImagenes()
	{
		listaPartesCuerpo = new LinkedList<ImageIcon>();
		ImageIcon Imagen; 
		
	//	Imagen = new ImageIcon(getClass().getResource("Ahorcado.png"));  //presentacion		 
	//	listaPartesCuerpo.add(Imagen);
		
		Imagen = new ImageIcon(getClass().getResource("Ahorcado0.png"));  //inicio		 
		listaPartesCuerpo.add(Imagen);
		
		Imagen = new ImageIcon(getClass().getResource("Ahorcado1.png"));  //cabeza		 
		listaPartesCuerpo.add(Imagen);
		 
		Imagen = new ImageIcon(getClass().getResource("Ahorcado2.png"));  //Cuerpo		 
		listaPartesCuerpo.add(Imagen);
		
		Imagen = new ImageIcon(getClass().getResource("Ahorcado3.png"));  //brazo derecho		 
		listaPartesCuerpo.add(Imagen);
		
		Imagen = new ImageIcon(getClass().getResource("Ahorcado4.png"));  //brazo izquierdo		 
		listaPartesCuerpo.add(Imagen);
		
		Imagen = new ImageIcon(getClass().getResource("Ahorcado5.png"));  //pierna derecha		 
		listaPartesCuerpo.add(Imagen);
		
		Imagen = new ImageIcon(getClass().getResource("Ahorcado6.png"));  //pierna izquierda		 
		listaPartesCuerpo.add(Imagen);
		
		Imagen = new ImageIcon(getClass().getResource("Ahorcado7.png"));  //ojos  - fin		 
		listaPartesCuerpo.add(Imagen);		
	}
	
	public ImageIcon getImagenParteCuerpo(int indiceLista) 
	{
		ImageIcon i = null;
		
		i=listaPartesCuerpo.get(indiceLista);
		return i;
	}
	
	public void estado(String palabraCompleta, String palabraEnJuego, char letraEntrante) 
	{
		this.palabraCompleta = palabraCompleta;
		String l=String.valueOf(letraEntrante); 
		if(palabraCompleta.contains(l))
		{
			char [] arr1 = new char[palabraCompleta.length()];
			char [] arr2 = new char[palabraCompleta.length()];			
			arr1 = palabraCompleta.toCharArray();
			arr2 = palabraEnJuego.toCharArray();

			for(int i=0;i<palabraCompleta.length();i++)
			{
				if(arr1[i] == letraEntrante)
				{
					arr2[i]= letraEntrante;
				}						 
			} 
			String p = new String(arr2);
			this.palabraEnJuego = p; 
			this.acierto = true;
			 
			
			if((this.palabraEnJuego.equals(this.palabraCompleta)) && this.palabraCompleta !=null)
			{
				ganador = true;
			}
			else
			{
				ganador = false;
			} 
		}
		else
		{ 
			this.contadorPartes++;
			this.acierto = false;
		}
		
		if(contadorPartes == listaPartesCuerpo.size()-1)
		{
			gameOver = true;
		}
		else
		{
			gameOver = false;
		} 
	} 
}
