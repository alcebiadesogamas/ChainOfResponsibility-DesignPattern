package br.ufes.model;

/**
 *
 * @author Alcebiades
 */
public class Numbers {
    
    private int number1;
    private int number2;
    private String operationType;
    
    public Numbers(int number1, int number2, String ot){
        this.number1 = number1;
        this.number2 = number2;
        this.operationType = ot;
    }
    
    public int getNumber1(){return this.number1;}
    public int getNumber2(){return this.number2;}
    public String getOperationType(){return this.operationType;}
    
}
