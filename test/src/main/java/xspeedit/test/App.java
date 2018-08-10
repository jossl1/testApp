package xspeedit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Main app
 *
 */
public class App {
	
	
	public static void main(String[] args) {
		// String representation of articles
		String articles = "163841689525773";

		// If articles string in argument
		if (args.length == 1) {
			articles = args[0];
		}

		//Test if string is valid
		if (articles != null && !articles.isEmpty() && isNumeric(articles)) {

			// Convert the string to an array of Integer representing each article
			Integer[] intArray = convertStringToIntegerArray(articles);

			// Sort the array in reverse order
			Arrays.sort(intArray, Collections.reverseOrder());

			// Add the articles to the boxes using algorithm
			List<Box> boxArray = packingAlgorithm(intArray);

			// Display ouput in console
			System.out.println(displayBoxContentWithSeparator(boxArray, '/'));

		} else {
			// Display error ouput in console
			System.out.println("Error : Invalid String argument");
		}

	}

	/**
	 * Method to convert a given string of Integer to an array of Integer
	 * 
	 * @param string
	 *            The string to be converted
	 * @return The array of Integer
	 */
	public static Integer[] convertStringToIntegerArray(String string) {

		final int length = string.length();

		Integer[] intArray = new Integer[length];

		for (int i = 0; i < length; i++) {

			intArray[i] = Character.getNumericValue(string.charAt(i));
		}

		return intArray;
	}

	/**
	 * Method to display the content of boxes with a separator
	 * 
	 * @param boxArray
	 *            the array of boxes
	 * @param separator
	 *            the separator
	 * @return string representation of the content of each box
	 */
	public static String displayBoxContentWithSeparator(List<Box> boxArray, char separator) {

		String finalString = "";

		StringBuilder stringBuilder = new StringBuilder();

		for (Box box : boxArray) {
			stringBuilder.append(box.getContent()).append(separator);
		}

		// Deleting the last char
		finalString = stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();

		return finalString;

	}

	/**
	 * Algorithm to optimize packing of articles in boxes with creating minimal
	 * number of boxes.
	 * 
	 * @param intArray
	 *            the Integer array of articles sorted in reverse order
	 * @return an array of boxes containing the articles
	 */
	public static List<Box> packingAlgorithm(Integer[] intArray) {

		// Initialize a new array of boxes
		List<Box> boxArray = new ArrayList<Box>();

		for (int num : intArray) {

			boolean initialiseNewBox = true;

			for (Box box : boxArray) {
				if (box.getCapacity() >= num) {
					box.addContent(num);
					initialiseNewBox = false;
					break;
				}

			}

			// Create new box if necessary with a capacity of 10
			if (initialiseNewBox) {
				Box box = new Box(10);
				box.addContent(num);
				boxArray.add(box);
			}

		}

		// Return the array
		return boxArray;

	}

	/**
	 * Check if string is numeric using regex
	 * 
	 * @param s
	 *            the string
	 * @return boolean
	 */
	public static boolean isNumeric(String s) {
		return s != null && s.matches("^[0-9]*$");
	}
}
