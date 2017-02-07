package recursion.view;

import javax.swing.JFrame;
import recursion.controller.RecursionController;
import java.awt.Dimension;
import recursion.view.RecursionPanel;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel appPanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new RecursionPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Hi there friend");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}

	public RecursionController getBaseController()
	{
		return baseController;
	}
}
