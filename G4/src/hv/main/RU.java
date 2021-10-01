package hv.main;

public class RU implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Mgr m = null;
		m = new Mgr();
		m.run();
		
		System.out.println("The eagle has landed!!!");
		}

}
