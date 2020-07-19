package week1.day2;

public class PrimeNumber {
public static void main(String[] args) {
	int number = 47;
	// To count the number of divisors
	int count = 0;
	// Prime number has 2 divisors - 1 and itself
	for(int i = 1 ; i <= number ; i++) {
		if(number%i==0) {
			count++;
		}
	}
	if(count == 2) {
		System.out.println("The number is prime number");
	}
	else {
		System.out.println("The number is a non prime number");
	}
	
}
}
