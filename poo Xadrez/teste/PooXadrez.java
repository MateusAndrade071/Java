package teste;

import Xadrez.Bispo;
import Xadrez.Cavalo;
import Xadrez.Peao;
import Xadrez.Peca;

public class PooXadrez {

	public static void main(String[] args) {
		Peca Peao = new Peao();
		Peca Cavalo = new Cavalo();
		Peca Bispo = new Bispo();
		
		Peao.mover();
		Cavalo.mover();
		Bispo.mover();
	}

}
