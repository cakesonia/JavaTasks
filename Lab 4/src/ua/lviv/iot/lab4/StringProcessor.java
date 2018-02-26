/**
 * 
 */
package ua.lviv.iot.lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Sonia
 * @version 1.2
 * @since 2018-02-26
 */
public class StringProcessor {
	// do all work here
	public static String processText(String inputText) {
		inputText = inputText.toLowerCase();
		String[] items = inputText.split("\\W{0,1}\\s");
		List<String> itemList = Arrays.asList(items);
		Collections.sort(itemList);

		return itemList.toString();
	}

	public String readInputText() throws IOException {
		// add error handling here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String: ");
		return br.readLine();
	}

	// add implementation here
	public void showResult(String resultText) {

		System.out.println("\nYour string:\n" + resultText);
	}

}
