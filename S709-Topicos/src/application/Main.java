package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/*-
 * Inicia a aplicação
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/application/view/AppView.fxml"));
			Scene scene = new Scene(root, 1000, 600);
			scene.getStylesheets()
					.add(getClass().getResource("/application/view/css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("S709 - Tópico");
			primaryStage.show();

			maximizarJanela(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	private void maximizarJanela(Stage stage) {
		// ajusta a janela, tentando maximizar
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();
		stage.setX(bounds.getMinX());
		stage.setY(bounds.getMinY());
		stage.setWidth(bounds.getWidth());
		stage.setHeight(bounds.getHeight());
	}
}
