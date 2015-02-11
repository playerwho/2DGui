package gui.controller;

import javax.swing.JOptionPane;

import gui.model.Gui;

public class GuiAppController
{
	private Gui [][] mtTemp;
	
	public GuiAppController()
	{
		mtTemp = new Gui [3][2];
	}
	
	private void fillMtTempArray()
	{
		for(int row = 0; row < mtTemp.length; row++)
		{
			for(int col = mtTemp[row].length - 1; col >= 0; col--)
			{
				String name = row + "" + col + "Day????????";
				double temp = (Math.random() * 12);
				boolean isCool = (temp < 55);
				
				mtTemp[row][col] = new Gui(name, temp, isCool);
			}
		}	
	}
	
	public void start()
	{
		fillMtTempArray();
		JOptionPane.showMessageDialog(baseFrame,  "welcomeeeee!");
	}
}
