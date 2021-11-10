package org.phone;

public class empoloyeeInfo {
	public void companyName(long pn,String name,double d) {
		System.out.println("your employeeId "+pn);
		System.out.println("your name "+name);
		System.out.println("your salary "+d);
		System.out.println("bashout mani");
		System.out.println("  ");

	}
public static void main(String[] args) {
	empoloyeeInfo g=new empoloyeeInfo();
	g.companyName(902500084, "akashnelson", 23.45);
	
}
}
