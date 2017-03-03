package excercise7;

public class DivideOperator implements Operator{
  
 int divResult;
  
  @Override
  public int execute(int number1, int number2) {
    divResult = number1 / number2;
    return divResult;
  }
  
  @Override 
  public String toString(){     
    return "Division operator ";    
  }
}
