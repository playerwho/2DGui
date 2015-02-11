package gui.view;

import java.awt.Color;

import javax.swing.*;

import gui.controller.GuiAppController;
import gui.view.GuiFrame;

public class GuiPanel extends JPanel
{
	private GuiAppController baseController;
	private SpringLayout baseLayout;
	private JTable dTable;
	private JLabel appLabel;
	
	
	public GuiPanel(GuiAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		dTable = new JTable();
		appLabel = new JLabel();
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, dTable, 72, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, dTable, 96, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, dTable, 213, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, dTable, 255, SpringLayout.WEST, this);
		
	}

	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(dTable);
		this.add(appLabel);
	}

	private void setupPane()
	{
		dTable.setBackground(Color.MAGENTA);
	}
	
	private void setupListeners()
	{
		
	}
}
