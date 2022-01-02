package fr.bobsonic.mdkexample.logger;

import fr.bobsonic.mdkexample.utils.Constants;

public class Logger {

    public static void debug(String msg) {
    	System.out.println(ConsoleColors.CYAN + "[" + Constants.MOD_NAME + "]" + ConsoleColors.GREEN + " [Debug] " + ConsoleColors.RESET + msg);
    }

}
