package modelo;

public class Entretenimiento extends Palabras
{
	public String tipoEntretenimiento;

	public Entretenimiento(String palabra, String descripcion,String tipoEntretenimiento)
	{
		super(palabra, descripcion);
		this.tipoEntretenimiento = tipoEntretenimiento;
	}

	public String getTipoEntretenimiento() {
		return tipoEntretenimiento;
	}

	public void setTipoEntretenimiento(String tipoEntretenimiento) {
		this.tipoEntretenimiento = tipoEntretenimiento;
	}
	
}
