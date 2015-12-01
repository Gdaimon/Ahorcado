package modelo; 

public class Palabras 
{ 
	public String palabra;	 
	public String descripcion;
	public char   complejidad;  
	public int    cantLetras;
	 
	
	public Palabras()
	{
		this.palabra     = null;
		this.descripcion = null;
		this.complejidad = ' '; 
		this.cantLetras  = 0;
	}
	
	//ingreso de complejidad manual
//	public Palabras(String palabra, String descripcion, char complejidad)
//	{
//		this.palabra     = palabra;
//		this.descripcion = descripcion;
//		this.complejidad = complejidad; 
//		this.cantLetras  = palabra.length();
//	}
	
	//calcula la complejidad
	public Palabras(String palabra, String descripcion)
	{
		this.palabra     = palabra;
		this.descripcion = descripcion;
		this.complejidad = calculaComplejidad(palabra); 
		this.cantLetras  = palabra.length();
	}
	
	 
	//alta= hasta 5 letras; media=entre 6 y 9;  alta=mayor a 10 letras 
	public char calculaComplejidad(String palabras)  //se puede hacelo mas complejo, verificando vocales y consonantes
	{
		char complejidad ='0';
		int  cantidadLetras = palabras.length();
		if(cantidadLetras <= 5)
		{
			complejidad = 'B';
		}
		else
			if(cantidadLetras >5 && cantidadLetras<=10)
			{
				complejidad = 'M';
			}
			else
				if(cantidadLetras >10)
				{
					complejidad = 'A';
 				} 
		return complejidad;
	}
	
	

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(char complejidad) {
		this.complejidad = complejidad;
	}

	public int getCantLetras() {
		return cantLetras;
	}

	public void setCantLetras(int cantLetras) {
		this.cantLetras = cantLetras;
	} 
	
	
}
