package Pattern;

public class TesteEmissores {
	
	public static void main(String args[]) {
		
		Emissor emissor1 = new EmissorCreator().create(EmissorCreator.SMS);
		emissor1.envia("Teste de Mensagem SMS");
		
		Emissor emissor2 = new EmissorCreator().create(EmissorCreator.EMAIL);
		emissor2.envia("Teste de Mensagem EMAIL");
		
		Emissor emissor3 = new EmissorCreator().create(EmissorCreator.JMS);
		emissor3.envia("Teste de Mensagem JMS");
	}

}
