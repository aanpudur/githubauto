package excercise7;

public class AddOperator implements Operator {
  
  @Override
  public int execute(int number1, int number2) {
    return number1 + number2;
  }
  
  @Override 
  public String toString(){     
    return "Addition operator ";    
  }
}
