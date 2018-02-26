/**
 * 
 */
package ua.lviv.iot.lab4;

import java.io.IOException;

import ua.lviv.iot.lab4.StringProcessor;

/**
 * @author Sonia
 * @version 1.2
 * @since 2018-02-26
 */
public class Main {
	public static void main(String[] args) {
		StringProcessor stringProcessor = new StringProcessor();
		String finalString = "";

		try {
			finalString = stringProcessor.readInputText();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finalString = StringProcessor.processText(finalString);

		stringProcessor.showResult(finalString);
	}
}
