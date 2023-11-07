package com.example.regformrevised;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegistrationController {
    @FXML
    private TextField FirstNameTextField;

    @FXML
    private TextField LastNameTextField;

    @FXML
    private TextField EmailTextField;

    @FXML
    private TextField DOBTextField;

    @FXML
    private TextField ZipTextField;

    @FXML
    private TextField RegistrationButton;

    @FXML
    private Label FirstNameError;

    @FXML
    private Label LastNameError;

    @FXML
    private Label EmailErrorCode;

    @FXML
    private Label DOBErrorCode;

    @FXML
    private Label ZipErrorCode;

    @FXML
    private Label SucessfulReg; //have to add to scene

    public RegistrationController() {
    }

    @FXML
    protected void initialize() {
        FirstNameError.setOpacity(0.0);
        LastNameError.setOpacity(0.0);
        EmailErrorCode.setOpacity(0.0);
        DOBErrorCode.setOpacity(0.0);
        ZipErrorCode.setOpacity(0.0);
        SucessfulReg.setOpacity(0.0);
    }

    private boolean isValid(String input, String pattern) {
        return input.matches(pattern);
    }

    private void checkAllFieldsValid() {
        if (FirstNameError.getOpacity() == 0.0 && LastNameError.getOpacity() == 0.0 &&
                EmailErrorCode.getOpacity() == 0.0 && DOBErrorCode.getOpacity() == 0.0 &&
                ZipErrorCode.getOpacity() == 0.0) {
            SucessfulReg.setOpacity(1.0);
        } else {
            SucessfulReg.setOpacity(0.0);
        }
    }

    @FXML
    protected void checkFirstName() {
        if (!isValid(FirstNameTextField.getText(), "^[A-Za-z]{2,25}$")) {
            FirstNameError.setOpacity(1.0);
        } else {
            FirstNameError.setOpacity(0.0);
        }
        checkAllFieldsValid();
    }

    @FXML
    protected void CheckLastName() {
        if (!isValid(LastNameTextField.getText(), "^[A-Za-z]{2,25}$")) {
            LastNameError.setOpacity(1.0);
        } else {
            LastNameError.setOpacity(0.0);
        }
        checkAllFieldsValid();
    }

    @FXML
    protected void CheckEmail() {
        if (!isValid(EmailTextField.getText(), "^[a-zA-Z0-9._%+-]+@farmingdale\\.edu$")) {
            EmailErrorCode.setOpacity(1.0);
        } else {
            EmailErrorCode.setOpacity(0.0);
        }
        checkAllFieldsValid();
    }

    @FXML
    protected void CheckDOB() {
        if (!isValid(DOBTextField.getText(), "^\\d{2}/\\d{2}/\\d{4}$")) {
            DOBErrorCode.setOpacity(1.0);
        } else {
            DOBErrorCode.setOpacity(0.0);
        }
        checkAllFieldsValid();
    }

    @FXML
    protected void EnterZipCode() {
        if (!isValid(ZipTextField.getText(), "^\\d{5}")) {
            ZipErrorCode.setOpacity(1.0);
        } else {
            ZipErrorCode.setOpacity(0.0);
        }
        checkAllFieldsValid();
    }
}
