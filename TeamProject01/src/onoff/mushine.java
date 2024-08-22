package onoff;

class Fan implements RemoteControl 
{
	  @Override
	  public void turnOn() 
	  {
	    System.out.println("Fan is turned on"); // 선풍기를 켰어요!
	  }

	  @Override
	  public void turnOff() 
	  {
	    System.out.println("Fan is turned off"); // 선풍기를 껐어요!
	  }
}

class Audio implements RemoteControl 
{
	  @Override
	  public void turnOn() 
	  {
	    System.out.println("Audio is turned on."); // 오디오를 켰어요!
	  }

	  @Override
	  public void turnOff()
	  {
	    System.out.println("Audio is turned off."); // 오디오를 껐어요!
	  }
}

class Television implements RemoteControl 
{
	  @Override
	  public void turnOn() 
	  {
	    System.out.println("Television is turned on."); // TV를 켰어요!
	  }

	  @Override
	  public void turnOff() 
	  {
	    System.out.println("Television is turned off."); // TV를 껐어요!
	  }
}

