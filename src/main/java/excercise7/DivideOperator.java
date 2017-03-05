package excercise7;

public class DivideOperator implements Operator{
  
  public int execute(int number1, int number2) {
    return number1 / number2;
  }
  
  @Override 
  public String toString(){     
    return "Division operator ";    
  }
}
