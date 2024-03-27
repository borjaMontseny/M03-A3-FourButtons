package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Principal {

	@FXML
	private AnchorPane panel;

	@FXML
	private Button btnRed;

	@FXML
	private Button btnGreen;

	@FXML
	private Button btnBlue;

	@FXML
	private Button btnGrey;

	@FXML
	void clickBtnRed(ActionEvent event) {
		panel.setStyle("-fx-background-color: red");
	}

	@FXML
	void clickBtnGreen(ActionEvent event) {
		panel.setStyle("-fx-background-color: green");
	}

	@FXML
	void clickBtnBlue(ActionEvent event) {
		panel.setStyle("-fx-background-color: blue");
	}

	@FXML
	void clickBtnGrey(ActionEvent event) {
		panel.setStyle("-fx-background-color: grey");
	}

}
