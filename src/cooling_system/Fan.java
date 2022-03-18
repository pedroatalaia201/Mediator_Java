package cooling_system;

public class Fan 
{
	private Mediator mediator;
	public boolean isOn = false;
	
	public Fan() {}

	public void turnOn()
	{
		if(this.mediator == null)
		{
			setMediator();
		}
		
		mediator.start();
		isOn = true;
	}
	
	public void turnOff()
	{
		if(this.mediator == null)
		{
			setMediator();
		}
		
		isOn = false;
		mediator.stop();
	}
	
	private void setMediator()
	{
		this.mediator = new Mediator();
		return;
	}
}