package br.etec.prova.view;

import java.sql.Connection;
import br.etec.prova.model.Assalariado;
import br.etec.prova.persistence.*;

public class AssalariadoExec {
	public static void main(String args[]) {
		Assalariado assalariado = new Assalariado();
		try {

			assalariado.setSalario("Matheus");

			Connection connection = Conexao.getConnection();
			AssalariadoJdbcDao assalariadoJdbcDao = new AssalariadoJdbcDao(connection);

			assalariadoJdbcDao.salvar(assalariado);
			assalariadoJdbcDao.listar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
