import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class HelloNameDialog {
    /*
     * Auther: Josh Franke Purpose: Print Hello Name Dialog Date: May 26 2019
     * Version: 1.0
     */
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?\n");
        showMessageDialog(null, "Hello, " + result + "!");
    }   
}