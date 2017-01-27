package Pattern;

public class EmissorSMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Envio de Mensagem por SMS");
		System.out.println(mensagem);
	}
}
