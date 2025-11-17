package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {
	static HashMap<Character, String> morse = new HashMap<>();
	static HashMap<String, Character> reverse = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	static char temp = 0;
	static String translateW = "";

	public static void main(String[] args) throws Exception {
		try {
			builtCodeMorse();
			traslate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void builtCodeMorse() {

		morse.put('A', ".-");
		morse.put('B', "-...");
		morse.put('C', "-.-.");
		morse.put('D', "-..");
		morse.put('E', ".");
		morse.put('F', "..-.");
		morse.put('G', "--.");
		morse.put('H', "....");
		morse.put('I', "..");
		morse.put('J', ".---");
		morse.put('K', "-.-");
		morse.put('L', ".-..");
		morse.put('M', "--");
		morse.put('N', "-.");
		morse.put('O', "---");
		morse.put('P', ".--.");
		morse.put('Q', "--.-");
		morse.put('R', ".-.");
		morse.put('S', "...");
		morse.put('T', "-");
		morse.put('U', "..-");
		morse.put('V', "...-");
		morse.put('W', ".--");
		morse.put('X', "-..-");
		morse.put('Y', "-.--");
		morse.put('Z', "--..");
		morse.put('0', "-----");
		morse.put('1', ".----");
		morse.put('2', "..---");
		morse.put('3', "...--");
		morse.put('4', "....-");
		morse.put('5', ".....");
		morse.put('6', "-....");
		morse.put('7', "--...");
		morse.put('8', "---..");
		morse.put('9', "----.");
		morse.put('.', ".-.-.-");
		morse.put(',', "--..--");
		morse.put(':', "---...");
		morse.put('?', "..--..");
		morse.put('\'', ".----.");
		morse.put('-', "-....-");
		morse.put('/', "-..-.");
		morse.put('"', ".-..-.");
		morse.put('@', ".--.-.");
		morse.put('=', "-...-");
		morse.put('!', "-.-.--");

		reverse.put(".-", 'A');
		reverse.put("-...", 'B');
		reverse.put("-.-.", 'C');
		reverse.put("-..", 'D');
		reverse.put(".", 'E');
		reverse.put("..-.", 'F');
		reverse.put("--.", 'G');
		reverse.put("....", 'H');
		reverse.put("..", 'I');
		reverse.put(".---", 'J');
		reverse.put("-.-", 'K');
		reverse.put(".-..", 'L');
		reverse.put("--", 'M');
		reverse.put("-.", 'N');
		reverse.put("---", 'O');
		reverse.put(".--.", 'P');
		reverse.put("--.-", 'Q');
		reverse.put(".-.", 'R');
		reverse.put("...", 'S');
		reverse.put("-", 'T');
		reverse.put("..-", 'U');
		reverse.put("...-", 'V');
		reverse.put(".--", 'W');
		reverse.put("-..-", 'X');
		reverse.put("-.--", 'Y');
		reverse.put("--..", 'Z');
		reverse.put("-----", '0');
		reverse.put(".----", '1');
		reverse.put("..---", '2');
		reverse.put("...--", '3');
		reverse.put("....-", '4');
		reverse.put(".....", '5');
		reverse.put("-....", '6');
		reverse.put("--...", '7');
		reverse.put("---..", '8');
		reverse.put("----.", '9');
		reverse.put(".-.-.-", '.');
		reverse.put("--..--", ',');
		reverse.put("---...", ':');
		reverse.put("..--..", '?');
		reverse.put(".----.", '\'');
		reverse.put("-....-", '-');
		reverse.put("-..-.", '/');
		reverse.put(".-..-.", '"');
		reverse.put(".--.-.", '@');
		reverse.put("-...-", '=');
		reverse.put("-.-.--", '!');
	}

	public static void traslate() throws Exception {

		System.out.println("Ingresa la palabra que quieras traducir a Morse Code");
		String phrasal = sc.nextLine().toUpperCase();
		if (phrasal.length() == 0) {
			throw new Exception("El texto está vacío");
		}
		for (int i = 0; i < phrasal.length(); i++) {
			temp = phrasal.charAt(i);
			if (Character.isWhitespace(temp))
				translateW += morse.get('=');
			else if (morse.containsKey(temp)) {
				translateW += morse.get(temp) + " ";

			} else {
				throw new Exception("Tu texto contiene caracteres que no se reconocen");
			}
		}
		System.out.println("La traduccion al Morse es  " + translateW);

	}
	

}
