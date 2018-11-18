package ejercicio3;

public class Producto {
	
	private String nombre;
	private float precio;
	
	public Producto() {
		this.precio = 0;
		System.out.println("Producto creado");
	}
	
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getInformacion() {
		String msg = "Nombre: " + nombre + ", Precio " + precio;
		return msg;
	}
	
}
