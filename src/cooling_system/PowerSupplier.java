package cooling_system;
import javax.swing.JOptionPane;

public class PowerSupplier 
{
	public boolean isOn = false;
	
	public PowerSupplier() {}
	
	public void turnOn() 
	{
		JOptionPane.showMessageDialog(null, "Turning on the power supplie");
		isOn = true;
	}
	
	public void turnOff() 
	{
		JOptionPane.showMessageDialog(null, "Turning off the power supplie");
		isOn = false;
	}
}