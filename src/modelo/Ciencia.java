package modelo;

public class Ciencia extends Palabras
{
	public String tipoCiencia;
	public String epoca;   //moderna-antigua-contenporanea
	
	public Ciencia(String palabra, String descripcion, String tipoCiencia, String epoca)
	{
		super(palabra, descripcion);
		this.tipoCiencia  = tipoCiencia;
		this.epoca        = epoca;
	}

	public String getTipoCiencia() {
		return tipoCiencia;
	}

	public void setTipoCiencia(String tipoCiencia) {
		this.tipoCiencia = tipoCiencia;
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}
	
	
}
