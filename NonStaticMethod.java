package com.method;
/*1) NonStaticMethod.--> When you define any method in the class without static keyword
					   is known as NonStaticMethod.
 */
public class NonStaticMethod {
	
	void x1() {
		System.out.println("This is the Non-StaticMethod in java");
	}
	
	public static void main(String[] args) {
		// only one ways calling method in Non-static method.
				
		//1.By using Create the Object.
		NonStaticMethod nonstaticMethod = new NonStaticMethod();
		nonstaticMethod.x1();//ObjectName.MethodName
			
	}

}
