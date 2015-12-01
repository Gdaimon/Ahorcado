package modelo;

public class Historia extends Palabras
{
	public String epoca;
	public String lugar;
	public String personaje;
	
	public Historia(String palabra, String descripcion,String epoca, String lugar, String personaje)
	{
		super(palabra, descripcion);
		this.epoca     = epoca;
		this.lugar     = lugar;
		this.personaje = personaje;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}
	
	
}
