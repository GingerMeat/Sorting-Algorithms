package algorithms.extra;
import java.util.Random;
public class StringArray {
	private static String makeString(int size) {
		String newString = "";
		for (int i=0; i<size; i++) {
			newString = newString + (char) (new Random().nextInt(26) + 65);
		}
		return newString;
	}
	
	public static String[] makeArray(int arraySize, int stringSize) {
		String[] array = new String[arraySize];
		for (int i=0; i<arraySize; i++) {
			array[i] = makeString(stringSize);
		}
		return array;
	}
}
