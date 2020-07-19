package week1.day2;

public class LearnConditions_Switch {
public static void main(String[] args) {
	String seat = "Third Class";
	switch (seat) {
	case "Balcony":
		System.out.println("It costs Rs. 250");
		break;
	case "First Class":
		System.out.println("It costs Rs. 200");
		break;
	case "Second Class":
		System.out.println("It costs Rs. 150");
		break;
	default:
		System.out.println("Choose a valid category");
		break;
	}
}
}
