package examen;

public class Articulo {
	static int art_totales = 0;
	protected String nombre;
	protected Cliente cliente;
	
	
	public Articulo(String nombre, Cliente cliente) {
		this.nombre = nombre;
		this.cliente = cliente;
		sumarArticulo();
	}


	public String getNombre() {
		return nombre;
	}
	
	public void sumarArticulo() {
		art_totales++;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public static int getArt_totales() {
		return art_totales;
	}
		
}
