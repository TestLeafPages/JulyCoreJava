package week3.day2;

public class VerifyPin {
public void verifyPin(int pin) {
	int originalPin = new LearnEncapsulation().getPin();
	if(pin==originalPin) {
		System.out.println("Pin Matched");
	}
	else {
		System.out.println("Pin Mismatch");
	}
}
public void setPin(int newpin) {
	new LearnEncapsulation().setPin(1234);
}
public static void main(String[] args) {
	new VerifyPin().verifyPin(1234);
}
}
