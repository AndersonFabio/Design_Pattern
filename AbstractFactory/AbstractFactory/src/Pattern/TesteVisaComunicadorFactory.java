package Pattern;

public class TesteVisaComunicadorFactory {
	
	public static void main(String args[]) {
		
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia("Mensagem Visa");
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}
