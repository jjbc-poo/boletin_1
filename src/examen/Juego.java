package examen;

public class Juego extends Articulo {
	
	private Plataforma plataforma;
	private Cliente cliente;
	
	public Juego(String nombre, Cliente cliente, Plataforma plataforma) {
		super(nombre, cliente);
		this.cliente = cliente;
		this.plataforma = plataforma;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
