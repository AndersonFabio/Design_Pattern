package Pattern;

public class TesteEmissor {
	
	public static void main(String args[]) {
		
		Emissor emissorSMS = new EmissorCreateFactory().create(EmissorCreateFactory.SMS);
		emissorSMS.envia("Teste");
		
		Emissor emissorEMAIL = new EmissorCreateFactory().create(EmissorCreateFactory.EMAIL);
		emissorEMAIL.envia("Teste");
		
		Emissor emissorJMS = new EmissorCreateFactory().create(EmissorCreateFactory.JMS);
		emissorJMS.envia("Teste");
	
	}

}
