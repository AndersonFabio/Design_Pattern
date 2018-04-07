package Pattern;

public class TestaSingleton {

	public static void main(String[] args) {
		System.out.println(Configuracao.getInstance().getPropriedade("time-zone"));
		System.out.println(Configuracao.getInstance().getPropriedade("currency-code"));
		
		System.out.println(Configuracao.getInstance().getPropriedade("time-zone"));
		System.out.println(Configuracao.getInstance().getPropriedade("currency-code"));
		
	}

}
