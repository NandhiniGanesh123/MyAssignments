package week1.day1;

public class Mobile {
	
 public void makeCall() {
	 System.out.println("calling");
 }
 public void sendMsg() {
	 System.out.println("sending msg");
 }
 
 public static void main(String[] args) {
	
	 Mobile obj=new Mobile();
	 obj.makeCall();
	 obj.sendMsg();
	 
}
}
