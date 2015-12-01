package modelo;

public class Idiomas extends Palabras
{	
	String nombreIdioma;
	String pais; 
	
	
	public Idiomas(String palabra, String descripcion,String nombreIdioma, String pais)
	{
		super(palabra, descripcion);
		this.nombreIdioma =nombreIdioma;
		this.pais         =pais;
	}


	public String getNombreIdioma() {
		return nombreIdioma;
	}


	public void setNombreIdioma(String nombreIdioma) {
		this.nombreIdioma = nombreIdioma;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
