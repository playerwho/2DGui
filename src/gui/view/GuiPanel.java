package gui.view;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import gui.controller.GuiAppController;
import gui.view.GuiFrame;
import gui.model.*;

public class GuiPanel extends JPanel
{
	private GuiAppController baseController;
	private SpringLayout baseLayout;
	private JTable dTable;
	private JScrollPane tablePane;
	private TableCellWrapRenderer myCellRenderer;
	
	
	
	
	
	public GuiPanel(GuiAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		myCellRenderer = new TableCellWrapRenderer();
		

		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		String [] colHeader = {"Column 1"," Column 2"};
		dTable = new JTable(new DefaultTableModel(baseController.getGui(), colHeader));
		
		
		for(int col =0; col < dTable.getColumnCount(); col++)
		{
			dTable.getColumnModel().getColumn(col).setCellRenderer(myCellRenderer);
		}
		
		tablePane = new JScrollPane(dTable);
		
		
		
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, tablePane, 30, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, tablePane, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, tablePane, -30, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, tablePane, -50, SpringLayout.EAST, this);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(tablePane);
		
	}
	
	private void setupListeners()
	{
		
	}
}
