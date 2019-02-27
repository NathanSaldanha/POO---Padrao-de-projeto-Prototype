package pacote;

public class Teste_sem_prototype {

	public static void main(String[] args) {
		
		
		Fantasma fantasma = new Fantasma();
		fantasma.setId("1");
		fantasma.setEnergia(10);
		fantasma.setForca(5);
		fantasma.setNivel(1);
		fantasma.ataque();
		
		System.out.println("Inimigo: "+ fantasma.getTipo());
		System.out.println("Nivel: "+ fantasma.getNivel());
		
		Besta besta = new Besta();
		besta.setId("2");
		besta.setEnergia(10);
		besta.setForca(5);
		besta.setNivel(7);
		besta.ataque();
		
		System.out.println("Inimigo: "+ besta.getTipo());
		 System.out.println("Nivel: "+ besta.getNivel());
		
	}
}
