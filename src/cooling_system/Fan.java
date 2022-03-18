package cooling_system;
import javax.swing.JOptionPane;

public class Fan 
{
	private PowerSupplier powerSupplier = new PowerSupplier();
	public boolean isOn = false;
	
	public Fan() {}

	public void turnOn()
	{
		powerSupplier.turnOn();
		isOn = true;
		JOptionPane.showMessageDialog(null, "The fan is on");
	}
	
	public void turnOff()
	{
		isOn = false;
		JOptionPane.showMessageDialog(null, "The fan is off");		
		powerSupplier.turnOff();
	}
}