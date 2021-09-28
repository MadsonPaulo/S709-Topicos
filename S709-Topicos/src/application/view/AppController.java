package application.view;

import java.net.URL;
import java.util.ResourceBundle;

import application.controller.MainController;
import application.model.domain.Resultado;
import application.model.to.ListaStrings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class AppController implements Initializable {
	private MainController controller = new MainController();

	@FXML
	private TableView<ListaStrings> tblTopico;

	@FXML
	private TableColumn<ListaStrings, String> colTopicoIdOt;

	@FXML
	private TableColumn<ListaStrings, String> colTopicoIdTarefa;

	@FXML
	private TableColumn<ListaStrings, String> colTopicoCPF;

	@FXML
	private TextArea txtLog;

	@FXML
	private Button btnS400;

	@FXML
	private Button btnS849;

	@FXML
	private TableView<ListaStrings> tblResultado;

	@FXML
	private TableColumn<ListaStrings, String> colResSeq;

	@FXML
	private TableColumn<ListaStrings, String> colResCpf;

	@FXML
	private TableColumn<ListaStrings, String> colResModulo;

	@FXML
	private TableColumn<ListaStrings, String> colResInformacoes;

	private ObservableList<ListaStrings> listaTopicos = FXCollections.observableArrayList();
	private ObservableList<ListaStrings> listaResultados = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		colTopicoIdOt.setCellValueFactory(new PropertyValueFactory<ListaStrings, String>("string1"));
		colTopicoIdTarefa.setCellValueFactory(new PropertyValueFactory<ListaStrings, String>("string2"));
		colTopicoCPF.setCellValueFactory(new PropertyValueFactory<ListaStrings, String>("string3"));

		colResSeq.setCellValueFactory(new PropertyValueFactory<ListaStrings, String>("string1"));
		colResCpf.setCellValueFactory(new PropertyValueFactory<ListaStrings, String>("string2"));
		colResModulo.setCellValueFactory(new PropertyValueFactory<ListaStrings, String>("string3"));
		colResInformacoes.setCellValueFactory(new PropertyValueFactory<ListaStrings, String>("string4"));

		tblTopico.setItems(listaTopicos);
		tblResultado.setItems(listaResultados);

		atualizarTabelaResultados();
	}

	public void incluirNovaSolicitacao() {
		logar("Incluiu nova solicitacao");
	}

	public void desinscreverS400() {
		logar("Clicou em desinscrever S400");
	}

	public void desinscreverS849() {
		logar("Clicou em desinscrever S849");
	}

	private void logar(String str) {
		txtLog.setText(String.format("%s%s\n", txtLog.getText(), str));
	}

	private void atualizarTabelaResultados() {
		listaResultados.clear();

		for (Resultado r : controller.obterResultados()) {
			listaResultados.add(new ListaStrings(r.getSequencial().toString(), r.getCpf().toString(), r.getModulo(),
					r.getInformacoes()));
		}
	}
}
