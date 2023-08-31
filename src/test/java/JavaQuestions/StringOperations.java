package JavaQuestions;

public class StringOperations {

	public static void main(String[] args) {

		programOne();
		System.out.println("----------------------------");
		programTwo();

	}

	public static void programOne() {
		String str = "WelCome to AlignTech";

		String[] strArray = str.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}

	public static void programTwo() {

		String str = "AlignTech To WelCome";

		int strLength = str.length();
		String revString = "";
		for (int i = strLength - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);

		}

		System.out.println("Reversed String is  " + revString);

	}

}
