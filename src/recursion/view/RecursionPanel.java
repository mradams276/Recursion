package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;
import recursion.view.RecursionPanel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibButton, factButton;
	private SpringLayout baseLayout;
	private JTextArea displayArea;
	private JTextField inputField;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		factButton = new JButton("Calculate factorial seq.");
		fibButton = new JButton("Calculate fibinachi seq.");
		this.displayArea = new JTextArea(5, 25);
		this.inputField = new JTextField(15);
		

		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 121, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -24, SpringLayout.NORTH, displayArea);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -107, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 33, SpringLayout.SOUTH, displayArea);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -58, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -234, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 17, SpringLayout.EAST, factButton);

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(displayArea);
		this.add(inputField);
		this.add(factButton);
		this.add(fibButton);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText(baseController.transferFactorial(inputField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText(baseController.transferFibonacci(inputField.getText()));
			}
		});
		
	}
	
	public RecursionController getBaseController()
	{
		return baseController;
	}
	

}
