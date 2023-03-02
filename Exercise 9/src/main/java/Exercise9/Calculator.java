package Exercise9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Calculator extends Application {

        private TextField num1Field;
        private TextField num2Field;
        private Label resultLabel;

        public void start(Stage primaryStage)
        {
            primaryStage.setTitle("Calculator");

            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setHgap(5);
            grid.setVgap(5);

            num1Field = new TextField();
            num1Field.setPromptText("Enter number");
            GridPane.setConstraints(num1Field, 0, 0);

            num2Field = new TextField();
            num2Field.setPromptText("Enter number");
            GridPane.setConstraints(num2Field, 0, 1);

            Button addButton = new Button("+");
            addButton.setOnAction(e -> addNumbers());
            GridPane.setConstraints(addButton, 1, 0);

            Button subtractButton = new Button("-");
            subtractButton.setOnAction(e -> subtractNumbers());
            GridPane.setConstraints(subtractButton, 1, 1);

            Button multiplyButton = new Button("*");
            multiplyButton.setOnAction(e -> multiplyNumbers());
            GridPane.setConstraints(multiplyButton, 2, 0);

            Button divideButton = new Button("/");
            divideButton.setOnAction(e -> divideNumbers());
            GridPane.setConstraints(divideButton, 2, 1);

            resultLabel = new Label();
            GridPane.setConstraints(resultLabel, 0, 2);

            grid.getChildren().addAll(num1Field, num2Field, addButton, subtractButton, multiplyButton, divideButton, resultLabel);

            Scene scene = new Scene(grid, 300, 150);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        private void addNumbers() {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 + num2;
            resultLabel.setText("Result: " + result);
        }

        private void subtractNumbers() {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 - num2;
            resultLabel.setText("Result: " + result);
        }

        private void multiplyNumbers() {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 * num2;
            resultLabel.setText("Result: " + result);
        }

        private void divideNumbers() {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            if (num2 == 0) {
                resultLabel.setText("Error: division by zero");
            } else {
                double result = num1 / num2;
                resultLabel.setText("Result: " + result);
            }
        }

        public static void main(String[] args)
        {
            launch(args);
        }
    }

