import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		System.out.println(Math.abs(num));
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = in.nextDouble();
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		System.out.println(Math.floor(num1 / num2));
		System.out.println(Math.ceil(num1 / num2));
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num1 = in.nextInt();
		System.out.println(Math.round(Math.sqrt(num1)));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = in.nextDouble();
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		System.out.println(Math.pow(num1, num2));
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = in.nextDouble();
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		System.out.print("Input one more number: ");
		double num3 = in.nextDouble();
		System.out.println(Math.max((Math.max(num1, num2)), num3));
		System.out.println(Math.min((Math.min(num1, num2)), num3));
	}
	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String text = in.nextLine();
		System.out.println(text.contains("on"));
		
	}
	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String word = in.nextLine();
		System.out.println(word.equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String text = in.nextLine();
		System.out.print("Input a letter: ");
		String letter = in.nextLine();
		System.out.println(text.indexOf(letter)); 
		System.out.println(text.lastIndexOf(letter));
	}

	public static void q9() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String text = in.nextLine();
		System.out.println("Your sentence is " + text.length() + " characters long");
	}
	public static void q10() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		System.out.print("Input a word to replace: ");
		String word1 = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word2 = in.nextLine();
		sentence = sentence.replaceAll(word1, word2);
		System.out.println(sentence);
	}

	public static void q11() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		sentence = sentence.trim();
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		
	}

	public static void q12() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		System.out.println(word.substring(0, 4));
		System.out.println(word.substring(word.length() - 4));
	}
	

}
