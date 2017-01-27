package Pattern;

public class EmissorCreator {
	
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	
	public Emissor create(int tipoDeMensagem) {
		if(tipoDeMensagem == EmissorCreator.SMS) {
			return new EmissorSMS();
		} else if( tipoDeMensagem == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		} else if( tipoDeMensagem == EmissorCreator.JMS) {
			return new EmissorJMS();
		} else {
			throw new IllegalArgumentException("Emissor Desconhecido");
		}
	}

}
