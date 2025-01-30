package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label welcomeText;

    // ToDo 01: Add two text fields to the GUI so that the user can find the sum
    @FXML
    private TextField textField1; // First number input field
    @FXML
    private TextField textField2; // Second number input field

    // ToDo 02: When the button is clicked, show the output on the screen
    @FXML
    protected void onCalculateButtonClick() {
        // Get values from the TextFields
        String input1 = textField1.getText();
        String input2 = textField2.getText();

        try {
            // ToDo 03: You should accept only the numeric values
            // Try parsing the input values to double
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            // Calculate the sum
            double sum = num1 + num2;

            // Show the result on the welcomeText label
            welcomeText.setText("Sum: " + sum);
        } catch (NumberFormatException e) {
            // If parsing fails (i.e., user input is not numeric), display an error message
            welcomeText.setText("Please enter valid numbers!");
        }
    }
}
