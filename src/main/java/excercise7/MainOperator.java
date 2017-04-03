package excercise7;

public class MainOperator {

	static int num1 = 678;
	static int num2 = 24;

	public static void main(String[] args) {
		Operator add = new AddOperator();
		Operator multiply = new MultiplyOperator();
		Operator divide = new DivideOperator();
		Operator substract = new SubstractOperator();

		int addition = add.execute(num1, num2);
		int multiplication = multiply.execute(num1, num2);
		int division = divide.execute(num1, num2);
		int substraction = substract.execute(num1, num2);

		System.out.println("toString method returns:: " + add.toString());
		System.out.println("sum of " + num1 + "+" + num2 + " is: " + addition + "\n");
		System.out.println("toString method returns:: " + multiply.toString());
		System.out.println("result of " + num1 + "*" + num2 + " is: " + multiplication + "\n");
		System.out.println("toString method returns:: " + divide.toString());
		System.out.println("result of " + num1 + "/" + num2 + " is: " + division + "\n");
		System.out.println("toString method returns:: " + substract.toString());
		System.out.println("result of " + num1 + "-" + num2 + " is: " + substraction + "\n");

	}
}
