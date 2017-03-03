package excercise7;

public class SubstractOperator implements Operator{
  
 int substract;

  
  @Override
  public int execute(int number1, int number2) {
    substract = number1 - number2;
    return substract;
  }
  
  @Override 
  public String toString(){     
    return "Substraction operator ";    
  }

}
