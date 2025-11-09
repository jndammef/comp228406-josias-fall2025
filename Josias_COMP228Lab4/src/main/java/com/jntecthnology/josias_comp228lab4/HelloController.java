package com.jntecthnology.josias_comp228lab4;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    // Text fields for student information
    @FXML
    private TextField fullNameField;
    
    @FXML
    private TextField addressField;
    
    @FXML
    private TextField cityField;
    
    @FXML
    private TextField provinceField;
    
    @FXML
    private TextField postalCodeField;
    
    @FXML
    private TextField phoneField;
    
    @FXML
    private TextField emailField;
    
    @FXML
    private RadioButton computerScienceRadio;
    
    @FXML
    private RadioButton businessRadio;
    
    @FXML
    private ToggleGroup majorGroup; // ToggleGroup is used here to group both radio buttons to prevent the user to select both at the same time

    @FXML
    private ComboBox<String> courseComboBox;

    @FXML
    private ListView<String> courseListView;

    @FXML
    private CheckBox studentCouncilCheckBox;
    
    @FXML
    private CheckBox volunteerCheckBox;

    @FXML
    private TextArea displayTextArea;
    
    // Method to handle major selection and populate courses
    @FXML
    protected void majorSelection() {
        courseComboBox.getItems().clear();
        
        if (computerScienceRadio.isSelected()) {
            courseComboBox.getItems().addAll(
                "COMP 228 - Java Programming",
                "COMP 229 - Data Structures",
                "COMP 230 - Web Development",
                "COMP 231 - Database Management"
            );
        } else if (businessRadio.isSelected()) {
            courseComboBox.getItems().addAll(
                "COMP 272 - Accounting",
                "COMP 251 - Marketing",
                "COMP 234 - Finance",
                "COMP 285 - Portfolio Management"
            );
        }
    }
    
    // Method to automatically add selected course to ListView when user selects from ComboBox
    @FXML
    protected void courseSelection() {
        String selectedCourse = courseComboBox.getValue();
        
        if (selectedCourse != null && !selectedCourse.isEmpty()) {
            if (!courseListView.getItems().contains(selectedCourse)) {
                courseListView.getItems().add(selectedCourse);
            }
        }
    }
    
    // We used this method to display all student information
    @FXML
    protected void displayInfo() {
        StringBuilder info = new StringBuilder(); //we prefered StringBuilder rather than multiple string concatenation
        
        info.append(" ####### BELOW ARE STUDENT INFORMATION ######\n\n");
        
        info.append("Full Name: ").append(fullNameField.getText()).append("\n");
        info.append("Address: ").append(addressField.getText()).append("\n");
        info.append("City: ").append(cityField.getText()).append("\n");
        info.append("Province: ").append(provinceField.getText()).append("\n");
        info.append("Postal Code: ").append(postalCodeField.getText()).append("\n");
        info.append("Phone Number: ").append(phoneField.getText()).append("\n");
        info.append("Email: ").append(emailField.getText()).append("\n\n");
        
        info.append("Major: ");
        if (computerScienceRadio.isSelected()) {
            info.append("Computer Science\n\n");
        } else if (businessRadio.isSelected()) {
            info.append("Business\n\n");
        } else {
            info.append("Major Not selected by the student\n\n");
        }
        
        info.append("Selected Courses:\n");
        if (courseListView.getItems().isEmpty()) {
            info.append(" Student did not select any courses\n");
        } else {
            for (String course : courseListView.getItems()) {
                info.append("  - ").append(course).append("\n");
            }
        }
        info.append("\n");
        
        info.append("Activities:\n");
        if (studentCouncilCheckBox.isSelected()) {
            info.append("  - Student Council\n"); // we had to use - to indicate a new item (just for a little style)
        }
        if (volunteerCheckBox.isSelected()) {
            info.append("  - Volunteer Work\n");
        }
        if (!studentCouncilCheckBox.isSelected() && !volunteerCheckBox.isSelected()) {
            info.append("  No activities selected by the student\n");
        }
        
        displayTextArea.setText(info.toString());
    }
}
