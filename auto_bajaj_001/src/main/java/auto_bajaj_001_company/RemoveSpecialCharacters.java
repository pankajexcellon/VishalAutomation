package auto_bajaj_001_company;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		String str = "Auto@123!Test   #";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
				result = result + ch;
			}
		}

		System.out.println("String without special character is " + result);

	}

}
