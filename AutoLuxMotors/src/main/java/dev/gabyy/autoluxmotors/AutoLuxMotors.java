package dev.gabyy.autoluxmotors;

import dev.gabyy.autoluxmotors.gui.MainScreen;
import dev.gabyy.autoluxmotors.logic.Controller;

/**
 *
 * @author Gabyyhshss
 */
public class AutoLuxMotors {

    public static void main(String[] args) {
        Controller control = new Controller();
        
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
        mainScreen.setLocationRelativeTo(null);
    }
}
