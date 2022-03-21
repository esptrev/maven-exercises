package main;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class StringManipulation {

    private static String bufferInput = "";


    public static void main(String[] args) {
        Input mavenInput = new Input();
        bufferInput =  mavenInput.getString("Please enter something here:  ");
        verifyInput();

    }

    public static void verifyInput() {
        System.out.print("Did you enter numbers? Simon Says: " + StringUtils.isNumeric(bufferInput) + "\n");
        System.out.println("Here's your input with the capitalization reversed: " + StringUtils.swapCase(bufferInput) + "\n");
        System.out.println("And here it is in reverse order: " + StringUtils.reverse(bufferInput));
    }
}
