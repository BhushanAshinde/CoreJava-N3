package org.tnsif.treaddemo;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p=new SimpleThreadProgram();
		p.setName("java Thread");
		p.setPriority(8);
		p.start();
		System.out.println("current thread"+p);
	}

}
