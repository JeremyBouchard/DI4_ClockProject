

package clock;

public class Clock implements Observable {
	private int hour;
	private int minute;
	private int second;
	
	public static final String HOUR="hour";
	public static final String MINUTE="minute";
	public static final String SECOND="second";
	
	public void attach (Observer observer, String granularity){}
	public void detach (Observer observer){}
	public void Notify (String Type){}
	
	public void setHour (int hour){}
	public void setMinute (int minute){}
	public void setSecond (int second){}
	public void setTime (int hour, int minute, int second){}
}
