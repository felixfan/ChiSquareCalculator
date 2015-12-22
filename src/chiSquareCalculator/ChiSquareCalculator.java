/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chisquarecalculator;

import javax.swing.SwingUtilities;

/**
 *
 * @author felixfan
 */
public class ChisquareCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ChisqCal();
            }
	});
    }
}
