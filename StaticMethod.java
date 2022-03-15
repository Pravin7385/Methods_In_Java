package com.method;
/*Method in java --> It is block of Statement that are used to perform
  					same task called as Method
 1) Static Method.--> When you define any method in the class with static keyword
					is known as StaticMethod.
*/
public class StaticMethod {
	
	static void x1() {
		System.out.println("This is Static Method in java");
	}
	
// how to call method in main method-->
	public static void main(String[] args) {
		
		// there are three ways calling method in static method.
		//1.By using Class Name.
		StaticMethod.x1();//ClassName.MethodName
	
		//2.By using Create the Object.
		StaticMethod staticMethod = new StaticMethod();
		staticMethod.x1();//ObjectName.MethodName
		
		//3. By Direct to call MethodName
		x1(); // MethodName
	}
}
