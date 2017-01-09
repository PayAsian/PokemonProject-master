package poke.view;

import javax.swing.JFrame;

import java.awt.Dimension;

import poke.controller.PokemonController;


public class PokemonFrame extends JFrame
{
	private PokemonController baseController;
	private PokemonPanel appPanel;
	
	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel= new PokemonPanel(baseController);
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("");
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
		
		
	}
	
	public void PokemonFrame()
	{
		testedFrame.getTitle = true;
	}
}
