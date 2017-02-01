package Pattern;

import java.util.List;

public interface Pool<T> {
	
	T acquire();
	void release(T t);
	int totalFuncionarios();
	List<Funcionario> getFuncionarios();
}
