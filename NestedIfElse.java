package conditnalstatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
	
		  int a = 12, b = 18 , c = 20;
		  int result = 0;
		  
//		  ternary operator nesting
		  result = a > b ? a>c ? a : c : b> c ? b:c ;       
		  
//		  if(a>b) {
//			  if(a>c) {
//				  result = a;
//			  }else {
//				  result = c;
//			  }
//		  }else {
//			  if(b>c) {
//				  result = b;
//				  
//			  }else {
//				  result = c;  
//			  }
//		 }
		  System.out.println("largest of the three number is " + result);
	}

}
