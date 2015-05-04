package gui.controller;

import javax.swing.JOptionPane;

import gui.model.Gui;
import gui.view.GuiFrame;

public class GuiAppController
{
	private Gui[][] mtTemp;
	private GuiFrame appFrame;

	public GuiAppController()
	{
		mtTemp = new Gui[3][2];
		fillMtTempArray();
		appFrame = new GuiFrame(this);
		
	}

	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "hiii");
	}

	public Gui[][] getGui()
	{
		return mtTemp;
	}

	public GuiFrame getAppFrame()
	{
		return appFrame;
	}

	private void fillMtTempArray()
	{
		Gui monday = new Gui("monday", 23.1, true);
		mtTemp[0][0] = monday;

		for (int row = 0; row < mtTemp.length; row++)
		{
			for (int col = 0; col < mtTemp[0].length; col++)
			{
				if (mtTemp[row][col] == null)
				{
					double temp = (Math.random() * 144);
					boolean isCool;
					if (temp < 32)
					{
						isCool = true;
					}
					else
					{
						isCool = false;
					}
					mtTemp[row][col] = new Gui("random " + (temp / 3), temp, true);
				}
			}
		}
	}

}
