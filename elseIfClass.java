package conditnalstatements;

public class elseIfClass {

	public static void main(String[] args) {
		
		
//		int number = 35;
//		
//		if(number <= 10) {
//			System.out.println("Number is less then 10");
//		}else if(number > 10 && number <=20) {
//			System.out.println("number is greater than 10 and less than 20");
//		}else if (number > 20 && number <= 30) {
//			System.out.println("number is greater than 20 and less tahn 30");
//		}else {	
//			System.out.println("number is greater than 30"); 
//		}
		
		
		int a = 15;
		int b = 18;
		
		int maxOfBothNumbers = 0;
		maxOfBothNumbers = a > b ? a : b;
		
		System.out.println("max of both number is " + maxOfBothNumbers);
		
	}

}

//Shorthand If...Else (ternary Operator)
//
//variable = (conditin) ? expressiontrue : expressionFalse;