package br.etec.prova.view;

	import java.sql.Connection;


	import br.etec.prova.model.Empregado;
	import br.etec.prova.persistence.*;
	
public class ConexaoView {
	public static void main (String args[]) {
		Empregado empregado = new Empregado();
		try {	
		
			empregado.setNome("Lucas");
			empregado.setSobrenome("Mendes");
			empregado.setCPF("46075153888");
			
			
			Connection connection = Conexao.getConnection();
			EmpregadoJdbcDao EmpregadoJdbcDao = new EmpregadoJdbcDao(connection);
			
			
				EmpregadoJdbcDao.salvar(empregado);
				EmpregadoJdbcDao.listar();
				EmpregadoJdbcDao.alterar(empregado);
				EmpregadoJdbcDao.excluir(1);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
