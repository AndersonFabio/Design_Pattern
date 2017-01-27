package Pattern;

public class EmissorJMS implements Emissor {

	public void envia(String mensagem) {
		System.out.println("Teste de envio de mensagem via JMS");
		System.out.println(mensagem);
	}
}
