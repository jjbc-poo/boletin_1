package examen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("juanjo ", "12345678S");
		Articulo art1 = new Articulo("consola",c1);
		System.out.println("Producto creado y asignado a " + art1.getCliente().getDni());
		System.out.println("Cantidad de articulos de la empresa " + Articulo.art_totales);
		Articulo art2 = new Articulo ("tv", c1);
		System.out.println("Producto creado y asignado a " + art2.getCliente().getNombre());
		System.out.println("Cantidad de artículos de la empresa " + Articulo.getArt_totales());
		Juego juego = new Juego("spiro", c1, Plataforma.XBOX);
		System.out.println("Nuevo producto consola " + juego.getPlataforma());
		System.out.println("Cantidad de artículos de la empresa " + Juego.getArt_totales());
	}
}
