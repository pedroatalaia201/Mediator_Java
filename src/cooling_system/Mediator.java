package cooling_system;
import javax.swing.JOptionPane;

public class Mediator 
{
	private Fan fan = new Fan();
	private PowerSupplier powerSupplier = new PowerSupplier();
	
	public Mediator() {}
	
	public void press()
	{
		if(fan.isOn)
		{
			fan.turnOff();
			JOptionPane.showMessageDialog(null, "Now the fan is off");
		}
		else
		{
			fan.turnOn();
			JOptionPane.showMessageDialog(null, "The fan is on");
		}
	}
	
	public void start()
	{
		powerSupplier.turnOn();
	}
	
	public void stop()
	{
		powerSupplier.turnOff();
	}
}
