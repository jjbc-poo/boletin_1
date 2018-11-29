package ejercicio11;

public class ClienteVip extends Cliente {
	private double descuento;
	
	public ClienteVip(String nif, double descuento) {
		super(nif);
		this.descuento = descuento;
	}
	
	public ClienteVip(String nombre, String apellidos, String direccion, String CIF, double descuento) {
		super(nombre, apellidos, direccion, CIF);
		System.out.println(CIF);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
		String msg = "Nombre: " + super.getNombre() + "\n" + "Apellidos " + super.getApellidos() + "\n" + "Dirección " + super.getDireccion() + "\n"
				+ "CIF " + super.getCIF() + "\ndescuento " + descuento;
		
		return msg;
	}
	
}
