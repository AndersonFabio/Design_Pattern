package Pattern;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioPool implements Pool<Funcionario> {
	
	private List<Funcionario> funcionarios;
	
	public FuncionarioPool() {
		this.funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("Anderson"));
		funcionarios.add(new Funcionario("Marcus"));
		funcionarios.add(new Funcionario("Junior"));
		funcionarios.add(new Funcionario("Sandra"));
	}

	@Override
	public Funcionario acquire() {
		if(this.funcionarios.size() > 0) {
			return this.funcionarios.remove(0);
		} else {
			return null;
		}
	}
	
	public int totalFuncionarios() {
		return funcionarios.size();
	}
	
	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	@Override
	public void release(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		
	}
	

}
