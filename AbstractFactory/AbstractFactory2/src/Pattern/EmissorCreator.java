package Pattern;

public class EmissorCreator {
	
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public Emissor create(int bandeira) {
		if(bandeira == EmissorCreator.VISA) {
			return new EmissorVisa();
		} else if(bandeira == EmissorCreator.MASTERCARD) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException("Bandeira Desconhecida");
		}
	}

}
