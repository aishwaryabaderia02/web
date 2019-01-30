package day4;

public class Animations implements Runnable {
	String a = "- -";
	String b = "+ +";
	String c = "^ ^";
	String d = "* *";
	String e = " _ ";
	@Override
	public void run() {
		String ThreadName = Thread.currentThread().getName();
		if(ThreadName == "t1"){
			System.out.println(a.charAt(0) + a.charAt(1) + a.charAt(0));
			System.out.println(e);
		}
		else if(ThreadName == "t2"){
			System.out.println(b.charAt(0) + b.charAt(1) + b.charAt(0));
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.getName();
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t2 = new Thread();
		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
