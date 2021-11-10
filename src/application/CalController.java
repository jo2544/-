package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalController implements Initializable {
	@FXML Label lblR, lblD;
	@FXML Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,btn7, btn8, btn9;
	@FXML Button btnClear, btnMul, btnAdd, btnEqual, btnMinus, btnDiv;
	
	String num= "", op;
    int x, y;

    private CalModel model = new CalModel();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void btn0Action(ActionEvent event) {
		makenum(0);
	}
	
	public void btn1Action(ActionEvent event) {
		makenum(1);
	}
	
	public void btn2Action(ActionEvent event) {
		makenum(2);
	}
	
	public void btn3Action(ActionEvent event) {
		makenum(3);
	}
	
	public void btn4Action(ActionEvent event) {
		makenum(4);
	}
	
	public void btn5Action(ActionEvent event) {
		makenum(5);
	}
	
	public void btn6Action(ActionEvent event) {
		makenum(6);
	}
	
	public void btn7Action(ActionEvent event) {
		makenum(7);
	}	
	
	public void btn8Action(ActionEvent event) {
		makenum(8);
	}
	
	public void btn9Action(ActionEvent event) {
		makenum(9);
	}
	
	public void btnMulAction(ActionEvent event) {
		op = "*";
		makelog(op);
	}
	
	public void btnAddAction(ActionEvent event) {
		op = "+";
		makelog(op);
	}
	
	public void btnEqualAction(ActionEvent event) {
		int y= Integer.parseInt(lblR.getText());
        num = lblD.getText();

        lblD.setText(num + y + " = ");
        int result = model.calculate(op, x ,y);

        lblR.setText(Integer.toString(result));

        num = lblD.getText();
        lblD.setText(num+result);
	}
	
	public void btnMiusAction(ActionEvent event) {
		op = "-";
		makelog(op);
	}
	
	public void btnDivAction(ActionEvent event) {
		op = "/";
		makelog(op);
	}
	
	public void btnClearAction(ActionEvent event) {
		lblR.setText("");
		lblD.setText("");
	}
	public void makenum(int n) {
		num = lblR.getText();
		lblR.setText(num+Integer.toString(n));
		//Integer.parseInt(문자열)
	}
	
	public void makelog(String op) {
		int x = Integer.parseInt(lblR.getText());
		lblR.setText("");
		lblD.setText(Integer.toString(x) + " " + op + " ");
	}
}
