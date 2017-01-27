package Pattern;

public class EmissorJMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem via JMS");
		System.out.println(mensagem);
	}
}
