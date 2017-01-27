package Pattern;

public class EmissorVisa implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a visa.");
		System.out.println(mensagem);
	}
	

}
