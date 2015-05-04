package gui.view;

import gui.controller.GuiAppController;
import javax.swing.*;

public class GuiFrame extends JFrame
{
	private GuiPanel appPanel;
	
	public GuiFrame(GuiAppController baseController)
	{
		appPanel = new GuiPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		//Optional
		this.setSize(600,600);
		
		//required
		this.setContentPane(appPanel);
		//Required
		this.setVisible(true);
		
		
	}
}
