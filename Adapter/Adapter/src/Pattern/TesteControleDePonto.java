package Pattern;

public class TesteControleDePonto {

	public static void main(String[] args) throws InterruptedException {
		Funcionario funcionario = new Funcionario("Marcus Vinicius");
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
	}

}
