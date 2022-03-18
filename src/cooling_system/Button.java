package cooling_system;

public class Button 
{
	private Fan fan = new Fan();
	public Button() {}
	
	public void press()
	{
		 if(fan.isOn == true){
			 fan.turnOff();
		 } 
		 else 
		 {
	        fan.turnOn();
	     }
	}
}