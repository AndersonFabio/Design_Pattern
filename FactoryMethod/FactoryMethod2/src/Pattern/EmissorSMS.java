package Pattern;

public class EmissorSMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem via SMS");
		System.out.println(mensagem);
	}

	
}
