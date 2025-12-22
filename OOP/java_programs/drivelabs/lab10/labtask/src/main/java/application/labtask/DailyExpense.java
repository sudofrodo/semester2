package application.labtask;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class DailyExpense extends Application {

    private List<Double> expenses = new ArrayList<>();
    private Label totalLabel;
    private Label averageLabel;
    private ListView<String> expenseList;

    @Override
    public void start(Stage stage) {

        // ---------- Title ----------
        Label title = new Label("Daily Expense Calculator (JavaFX)");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        HBox titleBox = new HBox(title);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setPadding(new Insets(10, 0, 10, 0));
        titleBox.setStyle("-fx-background-color: #f2f2f2;");

        // ---------- Input Row ----------
        TextField inputField = new TextField();
        inputField.setPromptText("Enter expense amount");
        inputField.setPrefWidth(200);

        Button addButton = new Button("Add Expense");
        addButton.setPrefHeight(30);

        HBox inputRow = new HBox(10, inputField, addButton);
        inputRow.setAlignment(Pos.CENTER_LEFT);

        // ---------- Expense List ----------
        Label expenseListLabel = new Label("Expense List:");
        expenseListLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        expenseList = new ListView<>();
        expenseList.setPrefHeight(150);

        VBox listBox = new VBox(5, expenseListLabel, expenseList);

        // ---------- Summary ----------
        totalLabel = new Label("Total: 0");
        totalLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        averageLabel = new Label("Average: 0");
        averageLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        VBox summaryBox = new VBox(5, totalLabel, averageLabel);

        // ---------- Main Layout ----------
        VBox main = new VBox(20,
                titleBox,
                inputRow,
                listBox,
                summaryBox
        );

        main.setPadding(new Insets(20));
        main.setStyle("-fx-background-color: #ffffff;");
        main.setPrefWidth(500);

        Scene scene = new Scene(main);

        // Add Button Logic
        addButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(inputField.getText());
                expenses.add(amount);

                expenseList.getItems().add("Expense: " + amount);

                updateSummary();

                inputField.clear();
            } catch (Exception ex) {
                showAlert("Please enter a valid number!");
            }
        });

        stage.setTitle("Daily Expense Calculator");
        stage.setScene(scene);
        stage.show();
    }

    private void updateSummary() {
        double total = expenses.stream().mapToDouble(Double::doubleValue).sum();
        double average = expenses.isEmpty() ? 0 : total / expenses.size();

        totalLabel.setText("Total: " + total);
        averageLabel.setText("Average: " + average);
    }

    private void showAlert(String text) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText(text);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
