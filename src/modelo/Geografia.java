package modelo;

public class Geografia extends Palabras
{
	public String continente;
	public String tipoGeografia;
	 
	
	public Geografia(String palabra, String descripcion,String continente, String tipoGeografia)
	{
		super(palabra, descripcion);
		this.continente    = continente;
		this.tipoGeografia = tipoGeografia;
	}


	public String getContinente() {
		return continente;
	}


	public void setContinente(String continente) {
		this.continente = continente;
	}


	public String getTipoGeografia() {
		return tipoGeografia;
	}


	public void setTipoGeografia(String tipoGeografia) {
		this.tipoGeografia = tipoGeografia;
	}
	
	

}
