package clock;

import java.util.ArrayList;

public interface ClockChangeManager {

	public void register(Observable observable, Observer observer);
	
	public void unregister(Observable observable, Observer observer);
	
	public void Notify();
}
