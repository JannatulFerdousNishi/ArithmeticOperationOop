/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author User
 */
public class TableRowClass {
    private int op1, op2, result;
    private String opName;

    public TableRowClass() {
    }

    public TableRowClass(int op1, int op2, int result, String opName) {
        this.op1 = op1;
        this.op2 = op2;
        this.result = result;
        this.opName = opName;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

 

    @Override
    public String toString() {
        return "TableRowClass{" + "op1=" + op1 + ", op2=" + op2 + ", result=" + result + ", opName=" + opName + '}';
    }
    
    
}
