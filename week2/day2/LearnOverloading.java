package week2.day2;

public class LearnOverloading {
public void add(int a,int b) {
	System.out.println(a+b);
}
public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public void add(double a,double b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	LearnOverloading obj = new LearnOverloading();
	obj.add(5, 4, 1);
	obj.add(5, 6);
	obj.add(10.034, 25.054);
	
	
	
	
	
	
	
	
	
}
}
