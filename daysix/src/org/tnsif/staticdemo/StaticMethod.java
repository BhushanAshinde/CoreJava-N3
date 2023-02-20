package org.tnsif.staticdemo;

public class StaticMethod {
	
		private static double salary=5000;
		
		public static void display()
		{
			System.out.println("Salary is: "+salary);
		}
		//getter
		public double getSalary() {
			return salary;
			
		//setter
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		

	

}
