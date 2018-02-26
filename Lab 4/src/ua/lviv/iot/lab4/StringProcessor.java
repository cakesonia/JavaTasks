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
 * @version 1.1
 * @since 2018-02-26
 */
public class StringProcessor {
	public String readInputText() throws IOException {
		//add error handling here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        	System.out.print("Enter String: ");
		        	return br.readLine();
		}
	
	// do all work here
	public static String processText(String inputText) {
		// convert input string to char array
		inputText = inputText.toLowerCase();
		String[] items = inputText.split("\\W{0,1}\\s");
		List<String> itemList = Arrays.asList(items);
         
        // sort tempArray
        Collections.sort(itemList);
        
        return itemList.toString();     
    }
	
	// add implementation here
	public void showResult(String resultText /* or pass your class instance as parameter */) {
		
		System.out.println("\nYour string:\n" + resultText);
	} 

}
