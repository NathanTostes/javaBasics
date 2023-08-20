package joptionpane;

import javax.swing.JOptionPane;

public class JOptionPanes {

    public static void main(String[] args){
        int val;
        int tot = 0;
        int num = 0;
        int even = 0;
        int odd = 0;
        int abv = 0;
        do{
        val = Integer.parseInt(JOptionPane.showInputDialog(null , 
                "<html>Enter a number: <br> (0 value interrupts)</html>"
        )); 
        tot += val;
        if (val == 0){
            break;
        }
        ++num;
        if (val % 2 == 0){
            ++even;
        } else {
            ++odd;
        }
        if (val > 100){
            ++abv;
        }
        } while (val != 0);
        int media = tot / num;
        JOptionPane.showMessageDialog(
                null, 
                "<html> --- Final results ---"
                + "Total value: " + tot + "<br>"
                + "Number of values: " + num + "<br>"
                + "Number of evens: " + even + "<br>"
                + "Number of odds: " + odd + "<br>"
                + "Number of values above one hundred: " + abv + "<br>" 
                + "Avarage of values: " + media + "<br>"
                + "</html>"
                );
    }
}
