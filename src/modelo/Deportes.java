package modelo;

public class Deportes extends Palabras
{
	public String tipoDeporte;
	public String datos;
	
	public Deportes(String palabra, String descripcion, String tipoDeporte, String datos )
	{
		super(palabra, descripcion);
		this.tipoDeporte  = tipoDeporte;
		this.datos        = datos;
	}

	public String getTipoDeporte() {
		return tipoDeporte;
	}

	public void setTipoDeporte(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}
	
}
