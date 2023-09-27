package facade;

public class Combo {
	private Bebida bebida = new Bebida (); 
	private Burguer burguer = new Burguer ();
	private Sobremesa sobremesa = new Sobremesa ();
	private int tp;
	//método montar combo
	public void CriarCombo (int tipo) {
		tp = tipo;
		if(tipo == 1) { 
				bebida.setMl(400); bebida.setDescricao("Coca Cola"); bebida.setPreco(10.00);
				burguer.setGramas(200); burguer.setDescricao("X-Bacon"); burguer.setPreco(35.00);
				sobremesa.setTamanho("G"); sobremesa.setDescricao("Sorvete"); sobremesa.setPreco(10.00);
		} else {
			bebida.setMl(500); bebida.setDescricao("Fanta"); bebida.setPreco(8.00);
			burguer.setGramas(300); burguer.setDescricao("X-Egg"); burguer.setPreco(38.00);
			sobremesa.setTamanho("M"); sobremesa.setDescricao("Chocolate"); sobremesa.setPreco(12.00);					
		}
	}
	//método mostrar combo
	@Override
	public String toString() {
		return "Combo: " + tp + "\n" +
				"Bebida: " + bebida.getDescricao() + "; Tamanho: " + bebida.getMl() + "ml" +
				"\nBurguer: " + burguer.getDescricao() +"; Gramas: " + burguer.getGramas() + "g" +
				"\nSobremesa: " + sobremesa.getDescricao() + "; Tamanho: " + sobremesa.getTamanho() +
				"\nValor do combo: R$" + (sobremesa.getPreco() + burguer.getPreco() + bebida.getPreco());
	}
	
}
