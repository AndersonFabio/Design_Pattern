package Pattern;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePonto {
	
	public void registraEntrada(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = sdf.format(calendar.getTime());
		System.out.println("Entrada "+f.getNome()+" as "+format);
	}
	
	public void registraSaida(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = sdf.format(calendar.getTime());
		System.out.println("Saída: "+f.getNome()+" as "+format);
	}

}
