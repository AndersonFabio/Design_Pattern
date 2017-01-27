package Pattern;

public class EmissorEmail implements Emissor {

	@Override
	public void envia(String mensagem) {
		
		System.out.println("Teste de envio de mensagem por email");
		System.out.println(mensagem);
	}
}
