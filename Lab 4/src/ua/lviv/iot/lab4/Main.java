/**
 * 
 */
package ua.lviv.iot.lab4;

import java.io.IOException;

import ua.lviv.iot.lab4.StringProcessor;


/**
 * @author Sonia
 * @version 1.1
 * @since 2018-02-26
 */
public class Main {
	public static void main(String[] args) {
		StringProcessor stringProcessor = new StringProcessor();
        String finalStr = "";
      
        try {
            finalStr = stringProcessor.readInputText();
        } catch(IOException e) {
            e.printStackTrace();
        }

        finalStr = StringProcessor.processText(finalStr);

        stringProcessor.showResult(finalStr);
	}
}
