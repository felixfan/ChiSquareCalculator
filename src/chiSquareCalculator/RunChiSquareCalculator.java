package chiSquareCalculator;

import javax.swing.SwingUtilities;

public class RunChiSquareCalculator {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new ChiSquareCalculator();
			}
		});

	}

}
