package Pattern;

public class TesteMastercardComunicadorFactory {

	public static void main(String[] args) {
		
		ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
		
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia("Mensagem Mastercard");
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}
