package ejercicio11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteVip cv = new ClienteVip("12345678", 22.5);
		System.out.println("Primer cliente DNI " + cv.getCIF() + " " + "descuento " + cv.getDescuento());
		ClienteVip cv2 = new ClienteVip("juanjo", "br", "mediterranea", "12345678V", 2.25);
		System.out.println("Segundo cliente " + cv2.toString());
	}
}
