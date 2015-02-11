package gui.view;

import gui.controller.GuiAppController;
import javax.swing.JFrame;

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
		this.setSize(500,500);
		this.setContentPane(appPanel);
		this.setVisible(true);
		
	}
}
