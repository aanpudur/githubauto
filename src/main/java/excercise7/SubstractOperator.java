package excercise7;

public class SubstractOperator implements Operator{
  
  @Override
  public int execute(int number1, int number2) {
    return number1 - number2;

  }
  
  @Override 
  public String toString(){     
    return "Substraction operator ";    
  }
  
 
}
