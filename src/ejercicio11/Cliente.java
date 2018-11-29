package ejercicio11;

public class Cliente extends Persona {
	protected String CIF;
	
	public Cliente(String nombre, String apellidos, String direccion, String CIF) {
		super(nombre, apellidos, direccion);
		this.CIF = CIF;
	}
	
	public Cliente(String CIF) {
		this.CIF = CIF;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String CIF) {
		this.CIF = CIF;
	}
}
