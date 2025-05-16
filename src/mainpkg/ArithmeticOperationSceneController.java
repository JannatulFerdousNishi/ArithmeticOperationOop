/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class ArithmeticOperationSceneController implements Initializable {

    @FXML    private TextField xTextField;
    @FXML    private TextField yTextField;
    @FXML    private Button addButton;
    @FXML    private TableView<TableRowClass> arithmeticOperationTableView;
    @FXML    private TableColumn<TableRowClass, String> operand1TableColumn;
    @FXML    private TableColumn<TableRowClass, String> operand2TableColumn;
    @FXML    private TableColumn<TableRowClass, String> operationTableColumn;
    @FXML    private TableColumn<TableRowClass, String> resultTableColumn;


    public void initialize(URL url, ResourceBundle rb) {
        
        operand1TableColumn.setCellValueFactory(
                new PropertyValueFactory<TableRowClass,String>("op1")
        );
        operand2TableColumn.setCellValueFactory(
                new PropertyValueFactory<TableRowClass,String>("op2")
        );
        operationTableColumn.setCellValueFactory(
                new PropertyValueFactory<TableRowClass,String>("opName")
        );
        resultTableColumn.setCellValueFactory(
                new PropertyValueFactory<TableRowClass,String>("result")
        );    
        
        //arithmeticOperationTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }    

    @FXML
    private void addButtonOnMOuseClick(MouseEvent event) {
        String xStr, yStr;
        xStr = xTextField.getText();    //"12"
        yStr = yTextField.getText();    //"13"
        int xVal, yVal, sum;
        xVal = Integer.parseInt(xStr);  //12
        yVal = Integer.parseInt(yStr);  //13
        sum = xVal + yVal;                  //25

        arithmeticOperationTableView.getItems().add(
                new TableRowClass(xVal, yVal, sum, "Addition")
        );
        /*
        for(TableRowClass temp: arithmeticOperationTableView.getItems()){
            System.out.println(temp.toString());
        }
        */
    }

    @FXML
    private void addButtonOnMOuseExited(MouseEvent event) {
        addButton.setText("Add");
    }

    @FXML
    private void addButtonOnMOuseEntered(MouseEvent event) {
        addButton.setText("Get out of my teriroty!");
    }

    @FXML
    private void subtractButtonOnMOuseClick(ActionEvent event) { 
        int result = 
                    Integer.parseInt(xTextField.getText()) 
                    - 
                    Integer.parseInt(yTextField.getText());


        arithmeticOperationTableView.getItems().add(
            new TableRowClass(
                Integer.parseInt(xTextField.getText()),
                Integer.parseInt(yTextField.getText()),
                result, "Subtraction"
            )
        );
 
    }

    @FXML
    private void multiplyButtonOnMOuseClick(ActionEvent event) {
        int result = 
                    Integer.parseInt(xTextField.getText()) 
                    * 
                    Integer.parseInt(yTextField.getText());

        arithmeticOperationTableView.getItems().add(
            new TableRowClass(
                Integer.parseInt(xTextField.getText()),
                Integer.parseInt(yTextField.getText()),
                result, "Multiplication"
            )
        );  
     
    }
    
}
