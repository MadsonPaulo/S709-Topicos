package application.model.dao;

import java.util.ArrayList;
import java.util.List;

import application.model.domain.Resultado;

public class ResultadoDao {

	public List<Resultado> consultarResultados() {
		ArrayList<Resultado> lista = new ArrayList<Resultado>();

		lista.add(new Resultado(50L, 11122233344L, "Modulo S400", "Teste 400"));
		lista.add(new Resultado(49L, 11122233344L, "Modulo S048", "Teste 048"));
		lista.add(new Resultado(48L, 11122233344L, "Modulo S849", "Teste 849"));

		return lista;
	}
}
