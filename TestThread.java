package pkg1;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		//start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}	
	}
}
public class TestThread {
	public static void main(String[] args) {
		System.out.println("Thread");
		MyThread t1=new MyThread("ChildThread");
		t1.start();

	}


}
