package hust.soict.dsai.javafx.src;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;
import java.awt.Color.*;
import java.awt.Canvas.*;

public class PainterController {
    @FXML
    private ToggleGroup Tools;

    @FXML
    private VBox drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        RadioButton selectedTools = (RadioButton) Tools.getSelectedToggle();
        String toogleGroupValue = selectedTools.getText();

        if (toogleGroupValue == "Pen") {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        } else if (toogleGroupValue == "Eraser") {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.WHITE);
            drawingAreaPane.getChildren().add(newCircle);
        }
        
    }

}

