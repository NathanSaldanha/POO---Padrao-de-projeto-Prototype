package pacote;

public class Teste_prototype {

	public static void main(String[] args) {
		Repositorio_inimigo.loadRepo();
		
		Inimigo fantasma_clone = (Inimigo) Repositorio_inimigo.getInimigo("1");
		 ((Fantasma) fantasma_clone).ataque();
		 System.out.println("Inimigo: "+ fantasma_clone.getTipo());
		 System.out.println("Nivel: "+ fantasma_clone.getNivel());
		 
		 Inimigo besta_clone = (Inimigo) Repositorio_inimigo.getInimigo("2");
		 ((Besta) besta_clone).ataque();
		 System.out.println("Inimigo: "+ besta_clone.getTipo());
		 System.out.println("Nivel: "+ besta_clone.getNivel());
		
	}
}
