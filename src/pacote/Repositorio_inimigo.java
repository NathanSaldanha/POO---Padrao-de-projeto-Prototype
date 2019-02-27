package pacote;

import java.util.Hashtable;

public class Repositorio_inimigo {
	
	private static Hashtable<String, Inimigo> inimigosRepo = new Hashtable<String, Inimigo>();
		
	public static Inimigo getInimigo(String inimigoId) {
		Inimigo protoInimigo = inimigosRepo.get(inimigoId);
		return (Inimigo) protoInimigo.clone();
	}
	
	public static void loadRepo() {
		
		Fantasma fantasma = new Fantasma();
		fantasma.setId("1");
		fantasma.setEnergia(10);
		fantasma.setForca(5);
		fantasma.setNivel(1);
		inimigosRepo.put(fantasma.getId(),fantasma);
		
		Besta besta = new Besta();
		besta.setId("2");
		besta.setEnergia(12);
		besta.setForca(2);
		besta.setNivel(7);
		inimigosRepo.put(besta.getId(),besta);
	}
		
	
}
