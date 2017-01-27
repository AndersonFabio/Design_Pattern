package Pattern;

public class Teste {

	public static void main(String[] args) {
		
		ComunicadorFactory visa = new VisaComunicadorFactory();
		visa.emissor().envia("Anderson");;
		System.out.println(visa.receptor().recebe());
		
		ComunicadorFactory master = new MastercardComunicadorFactory();
		master.emissor().envia("Anderson");;
		System.out.println(master.receptor().recebe());

	}

}
