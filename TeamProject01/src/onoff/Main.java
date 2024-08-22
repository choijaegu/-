package onoff;

public class Main 
{
	  public static void main(String[] args) 
	  {
	    RemoteControl fan = new Fan();
	    fan.turnOn(); // 선풍기를 켜요!
	    fan.turnOff(); // 선풍기를 꺼요!

	    RemoteControl tv = new Television();
	    tv.turnOn(); // TV를 켜요!
	    tv.turnOff(); // TV를 꺼요!

	    RemoteControl audio = new Audio();
	    audio.turnOn(); // 오디오를 켜요!
	    audio.turnOff(); // 오디오를 꺼요!
	  }
}