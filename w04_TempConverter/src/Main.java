/* *********************************************
Title:      Week 4 - Temperature Converter
Author:     Clint MacDonald
Date:       Jan. 25, 2024
Purpose:    To practice using the Tools.java file and to continue
            to hone our OOP modularity skills.
 */

// main collection class for application execution
public class Main {

    // <editor-fold desc="Global Variables">
    final static double CONV_RATIO = 9./5.;
    final static double CONV_TERM = 32.;
    final static String FAHRENHEIT = "F", CELCIUS = "C", YES = "Y", NO = "N";
    // </editor-fold>

    // startup method to initialize the app
    public static void main(String[] args) {
        initializeApp();
        runApp();
    }

    //<editor-fold desc="Application Workflow Methods">
    private static void initializeApp() {
        System.out.println("************************************");
        System.out.println("Welcome to the Temperature Converter");
        System.out.println("by Clint MacDonald");
        System.out.println("************************************");
        System.out.println("\nYou will be able to enter a temperature and the associated units");
        System.out.println("and you will be given the conversion temperature in the other unit.\n");
    }

    private static void runApp() {
        String unit = "C";
        String playAgain = YES;


        while (playAgain.equalsIgnoreCase(YES)) {
            double inTemp = Tools.getDblFromConsole("Enter your starting temperature:");
            String inUnit = Tools.getSingleCharFromConsole("Enter the Units for the temperature entered:");
            double newTemp;
            String outUnit;

            switch (inUnit.toUpperCase()) {
                //System.out.println("TEST: inUnit");
                case CELCIUS:
                    newTemp = convertCtoF(inTemp);
                    System.out.println("The conversion is: " + newTemp + " ° " + FAHRENHEIT);
                    break;
                case FAHRENHEIT:
                    newTemp = convertFtoC(inTemp);
                    System.out.println("The conversion is: " + newTemp + " ° " + CELCIUS);
                    break;
                default:
                    System.out.println("The units entered are not compatible with this program!");
            }

            playAgain = Tools.getSingleCharFromConsole("Do you want to convert another temperature (Y or N)?");
        }
    }

    //</editor-fold>

    //<editor-fold desc="Application Specific Calculators">
    private static double convertCtoF(double sourceTemp) {
        return sourceTemp * CONV_RATIO + CONV_TERM;
    }

    private static double convertFtoC(double sourceTemp) {
        return (sourceTemp - CONV_TERM) / CONV_RATIO;
    }

    //</editor-fold>

}