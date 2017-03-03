package excercise7;

public class MultiplyOperator implements Operator {
  
 int multiplicationResult;
  
  @Override
  public int execute(int number1, int number2) {
    multiplicationResult = number1 * number2;
    return multiplicationResult;
  }
  
  @Override 
  public String toString(){     
    return "multiplication operator";    
  }
}
