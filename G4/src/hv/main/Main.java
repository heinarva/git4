package hv.main;

public class Main {


	private static RU r = null;
	
	public static void main(String[] args) {
		
		r = new RU();
		
		javax.swing.SwingUtilities.invokeLater(r);
		
		}
	
	}
