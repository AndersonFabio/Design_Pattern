package Pattern;

public class EmissorEmail implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando Mensagem via Email");
		System.out.println(mensagem);
	}
}
