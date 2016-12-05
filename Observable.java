package clock;

public interface Observable {

	public void attach (Observer observer, String granularity);
	public void detach (Observer observer);
	public void Notify (String Type);
}
