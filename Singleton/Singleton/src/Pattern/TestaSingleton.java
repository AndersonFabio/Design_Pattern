package Pattern;

public class TestaSingleton {

	public static void main(String[] args) {
		Configuracao configuracao = Configuracao.getInstance();
		System.out.println(configuracao.getPropriedade("time-zone"));
		System.out.println(configuracao.getPropriedade("currency-code"));
		
		Configuracao configuracao2 = Configuracao.getInstance();
		System.out.println(configuracao2.getPropriedade("time-zone"));
		System.out.println(configuracao2.getPropriedade("currency-code"));
		
	}

}
