package pacote;

public class Fantasma extends Inimigo {
	
	public Fantasma() {
		tipo = "Fantasma";
	}
	void ataque() {
		System.out.println("Fantasma atacando... Boo!");
	}
}
