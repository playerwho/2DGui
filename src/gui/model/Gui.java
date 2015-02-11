package gui.model;

public class Gui
{
	private String name;
	private double temp;
	private boolean isCool;
	
	public String getName()
	{
		return name;
	}
	
	public double getNumber()
	{
		return temp;
	}
	
	public boolean isCool()
	{
		return isCool;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNumber(double number)
	{
		this.temp = number;
	}
	
	public void setCool(boolean cool)
	{
		this.isCool = cool;
	}
	
	@Override
	public String toString()
	{
		String tempInfo ="";
		
		tempInfo +="hi! I'm a temperature object! my name is " + name;
		tempInfo += "it is this warm outside..." + temp;
		if(isCool)
		{
			tempInfo += "its actually cold!";
		}
		else
		{
			tempInfo += "its considered warm!";
		}
		
		return tempInfo;
	}
}
