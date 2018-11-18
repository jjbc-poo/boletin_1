package ejercicio5;

public class Cronometro {
	private long t_inicio;
	public Cronometro() {
		
	}
	
	public void start() {
		t_inicio = System.currentTimeMillis();
	}
	
	public long stop() {
		long aux_tempo = (System.currentTimeMillis() - t_inicio) / 1000;
		return aux_tempo;
	}
}
