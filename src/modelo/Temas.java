package modelo; 

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Temas 
{
	public String 			   tema;
	public String 			   descripcion;
	public int    		       nivel;
	public LinkedList <String> listaTemas; 
	public LinkedList <Object> listaPalabras;
	
	public Temas()
	{
		listaTemas    = new LinkedList<String>();
		listaPalabras = new LinkedList<Object>(); 
		cargarPalabra("Generico");
	}
	
	public Object elegirPalabra(char complejidad, String tema)
	{
		LinkedList<Object> listaP = new LinkedList<Object>(); 
		
		//investigar cómo hacer un instanceof generico
		
		for(int i=0; i< listaPalabras.size();i++)		 
		{				
			Object objPalabra = listaPalabras.get(i);  
			
			if(tema == "Generico")
			{ 
				if(objPalabra instanceof Palabras)         
		 		{ 
		 			Palabras p = (Palabras) objPalabra; 
		 			if(p.complejidad == complejidad)
		 			{ 
		 				listaP.add(p); 
		 			} 
			    }
			}
			
			if(tema == "Entretenimiento")
			{
				if(objPalabra instanceof Entretenimiento)         
		 		{
		 			Palabras p = (Palabras) objPalabra;
		 			if(p.complejidad == complejidad)
		 			{
		 				listaP.add(p);
		 			} 	
			    }
			}
			
			if(tema == "Deportes")
			{
				if(objPalabra instanceof Deportes)         
				{
					Palabras p = (Palabras) objPalabra;
					if(p.complejidad == complejidad)
					{
						listaP.add(p);
					} 	
				}
			}	
			
			if(tema == "Ciencia")
			{
				if(objPalabra instanceof Ciencia)         
				{
					Palabras p = (Palabras) objPalabra;
					if(p.complejidad == complejidad)
					{
						listaP.add(p);
					} 
				}
			}
				
			if(tema == "Historia")
			{
				if(objPalabra instanceof Historia)         
				{
					Palabras p = (Palabras) objPalabra;
					if(p.complejidad == complejidad)
					{
						listaP.add(p);
					} 	
				}
			}
				
			if(tema == "Geografia")
			{
				if(objPalabra instanceof Geografia)         
				{
					Palabras p = (Palabras) objPalabra;
					if(p.complejidad == complejidad)
					{
						listaP.add(p);
					} 	
				}
			}		
					
			if(tema == "Idiomas")
			{
				if(objPalabra instanceof Idiomas)         
				{ 
					Palabras p = (Palabras) objPalabra; 
					if(p.complejidad == complejidad)
					{ 
						listaP.add(p);
					} 	
				}
			}		 
	 	} 	 
		
		if(listaP.size() !=0)
		{
			int indice = (int)(Math.random()*(listaP.size()-1))+0;   
			return listaP.get(indice);
		}
		else
		{
			return null;
		}		 
	}
	
	
	
	public void escogerTema() 
	{
	
	}
	
	public void cargarTema() 
	{
	
	}
	
	public void modificarTema() 
	{
	
	}
	
	public void consultarTema() 
	{
	
	}
	
	public void borrarTema()
	{
	
	}
	
	public String cargarPalabra(String tema)
	{
//en un futuro se puede cargar desde un archivo - habilitar la linea siguiente
 	    LeeArchivo(null);
		
//Palabras genericas
	//complejidad alta (mas de 10 letras)
		Object palabra = new Palabras("paralelepipedo", "geometria");
		listaPalabras.add(palabra);
    //complejidad media (mas entre 6 a 10 letras)
		palabra = new Palabras("juan", "nombre");
		listaPalabras.add(palabra);
		
    //complejidad baja (hasta 5 letras)
		palabra = new Palabras("chucho", "profesor");
		listaPalabras.add(palabra);
		
//Palabras idiomas	
	//complejidad media (mas entre 6 a 10 letras)
		Object palabraI = new Idiomas("police", "tombo", "ingles", "oficial"); 
		listaPalabras.add(palabraI); 
	//complejidad baja (hasta 5 letras)
		
	//complejidad alta (mas de 10 letras)
		
		
//Palabras Deportes
	//complejidad media (mas entre 6 a 10 letras)
			 
	//complejidad baja (hasta 5 letras)
				
	//complejidad alta (mas de 10 letras)	
		
		
		
//Palabras Entretenimiento
		
	//complejidad media (mas entre 6 a 10 letras)
		 
	//complejidad baja (hasta 5 letras)
					
	//complejidad alta (mas de 10 letras)		
		
		
//Palabras Geografia
	//complejidad media (mas entre 6 a 10 letras)
		 
	//complejidad baja (hasta 5 letras)
					
	//complejidad alta (mas de 10 letras)	
		
		
		
//Palabras ciencia
	//complejidad media (mas entre 6 a 10 letras)
		 
	//complejidad baja (hasta 5 letras)
					
	//complejidad alta (mas de 10 letras)	
		
				
		return null;
	}
	
//----------------------------------------------------------------------------------------------	
	public void LeeArchivo(String path)
	{ 
		File archivo = new File("./DATA/palabras.txt");
		Scanner s1 = null;
		Object palabra;

		try { 
			s1 = new Scanner(archivo); 
			while (s1.hasNextLine())
			{
				String linea = s1.nextLine();	 
				String [] cortarString = linea.split(";");		
				
				// aca va la logica de leer cada indice del array y grabarlos en cada tema
				// [0] indica de que tema es
				
				if(cortarString[0].equals("Palabras"))
				{ 
					palabra = new Palabras(cortarString[1], cortarString[2]);
					listaPalabras.add(palabra);					
					
				}
				if(cortarString[0].equals("Ciencia"))
				{
					palabra = new Ciencia(cortarString[1], cortarString[2],cortarString[3],cortarString[4]);
					listaPalabras.add(palabra);		
				}
				if(cortarString[0].equals("Deportes"))
				{
					palabra = new Deportes(cortarString[1], cortarString[2],cortarString[3],cortarString[4]);
					listaPalabras.add(palabra);		
				}
				if(cortarString[0].equals("Entretenimiento"))
				{
					palabra = new Entretenimiento(cortarString[1], cortarString[2],cortarString[3]);
					listaPalabras.add(palabra);	
				}
				if(cortarString[0].equals("Geografia"))
				{
					palabra = new Geografia(cortarString[1], cortarString[2],cortarString[3],cortarString[4]);
					listaPalabras.add(palabra);	
				}
				if(cortarString[0].equals("Historia"))
				{
					palabra = new Historia(cortarString[1], cortarString[2],cortarString[3],cortarString[4],cortarString[5]);
					listaPalabras.add(palabra);		
				}
				if(cortarString[0].equals("Idiomas"))
				{
					palabra = new Idiomas(cortarString[1], cortarString[2],cortarString[3],cortarString[4]);
					listaPalabras.add(palabra);	
				}
				  
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if (s1 != null)
					s1.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}  	
//------------------------------------------------------------------------------------------------------
	
} //fin clase


//grabar en archivo inicio
//StringBuffer StringLamina = new StringBuffer();
//String nombreArchivo      = "LaminaJugador1"; 
//StringLamina.append(PanelJugador.lJugador.toString()); 
//GuardarArchivoXML(StringLamina, nombreArchivo);	    
//fin grabar en archivo 


 





