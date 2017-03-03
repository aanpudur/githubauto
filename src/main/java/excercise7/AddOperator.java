package excercise7;

public class AddOperator implements Operator {
  
  int total;

  
  @Override
  public int execute(int number1, int number2) {
    total = number1 + number2;
    return total;
  }
  
  @Override 
  public String toString(){     
    return "Addition operator ";    
  }
  

}
