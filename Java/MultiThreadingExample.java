
class Task extends Thread{				//using threads in java
	public void run() {
System.out.println("Task 1 started");
try {
	Thread.sleep(1000); //1 sec
}
catch(Exception e){
	System.out.println();
}
System.out.println("Task 1 completed");
}
}


class Task1 extends Thread{
	public void run() {
System.out.println("Task 2 started");
try {
	Thread.sleep(400);		//0.4 sec
}
catch(Exception e){
	System.out.println();
}
System.out.println("Task 2 completed");
}
}



public class MultiThreadingExample {
	public static void main(String[] args) {
		Task t1 = new Task();
		Task1 t2 = new Task1();
		
		t1.start();
		t2.start();
		}

	
}
