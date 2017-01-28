package Pattern;

public class TestaGeradorDeBoleto {

	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
		System.out.println("\n");
		
		boletoBuilder = new ItauBoletoBuilder();
		geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
		System.out.println("\n");
	}

}
