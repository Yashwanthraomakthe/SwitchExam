package JavaQuestions;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String number = "this is test123 788 xyz987";
		int strLength = number.length();
		int sum = 0;
		for (int i = 0; i < strLength; i++) {
			char c = number.charAt(i);
			if (Character.isDigit(c)) {
				sum = sum + Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println("SumOfNumbersInString from programTwo " + sum); // Output is 53

	}

}
