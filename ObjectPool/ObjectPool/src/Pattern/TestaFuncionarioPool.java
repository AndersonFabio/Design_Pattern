package Pattern;

import java.util.ArrayList;
import java.util.List;

public class TestaFuncionarioPool {

	public static void main(String[] args) throws Exception {
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		List<Funcionario> releaseFuncionarios = new ArrayList<Funcionario>();
		
		
		System.out.println("Numero de Funcionários: "+funcionarioPool.totalFuncionarios());

		Funcionario funcionario = funcionarioPool.acquire();

		if(funcionario == null) {
			throw new Exception("Não há funcionários disponíveis");
		}
		
		while( funcionario != null) {
			System.out.println("Funcionário: "+funcionario.getNome());
			releaseFuncionarios.add(funcionario);
			funcionario = funcionarioPool.acquire();
		}
		System.out.println("Numero de Funcionários: "+funcionarioPool.totalFuncionarios());
		
		for(Funcionario item : releaseFuncionarios) {
			funcionarioPool.release(item);
			System.out.println("Numero de Funcionários: "+funcionarioPool.totalFuncionarios());
		}
		
		funcionario = funcionarioPool.acquire();
		
		while( funcionario != null) {
			System.out.println("Funcionário: "+funcionario.getNome());
			funcionario = funcionarioPool.acquire();
		}
		System.out.println("Numero de Funcionários: "+funcionarioPool.totalFuncionarios());

	}

}
