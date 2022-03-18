package cooling_system;

public class Button 
{
	private Mediator mediator = new Mediator();
	
	public Button() {}
	
	public void press()
	{
		mediator.press();
	}
}