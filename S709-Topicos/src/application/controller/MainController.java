package application.controller;

import java.util.List;

import application.model.dao.ResultadoDao;
import application.model.domain.Resultado;

public class MainController {
	private ResultadoDao resultadoDao = new ResultadoDao();

	public List<Resultado> obterResultados() {
		return resultadoDao.consultarResultados();
	}

}
