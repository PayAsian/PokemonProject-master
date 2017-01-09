package poke.view;

import poke.controller.PokemonController;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;



public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	private JTextArea PokeDisplay;
	
	setupPokeDisplay();
	setupPanel();
	setupLayout();
	setupListeners();
	
public PokemonPanel(PokemonController baseController)
{
	this.baseController = baseController;
	this.baseLayout = new SpringLayout();
	this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/images/pokeball.png"));
	this.updateButton = new JButton("Update the stats!");
	this.nameField = new JTextField(25);
	this.combatField = new JTextField(5);
	this.healthField = new JTextField(5);
	this.speedField = new JTextField(5);
	this.numberField = new JTextField(5);
	this.advancedArea = new JTextArea(10, 25);
	this.pokedexSelector = new JComboBox(new String [] {"Charamander", "Volcanion", "Squritle", "Chinchou","Pikachu" });
	this.advancedLabel = new JLabel("Advanced information");
	this.combatLabel = new JLabel("Combat Points:");
	this.healthLabel = new JLabel("Health Points:");
	this.speedLabel = new JLabel("Speed Rate:");
	this.numberLabel = new JLabel("Pokemon Number:");
	this.nameLabel = new JLabel("My name is:");
	this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
	
}

private void setupPokemonDisplay()
{
	PokeDisplay.setEditable(false);
	PokeDisplay.setEnabled(false);
	PokeDisplay.setLineWrap(true);
	PokeDisplay.setWrapStyleWord(true);
	
}

private void setupPokemonPanel()
{
	this.setLayout(baseLayout);
	this.setBackground(Color.CYAN);
	this.add(updateButton);
	this.add(nameField);
	this.add(speedField);
	this.add(numberField);
	this.add(advancedArea);
	this.add(pokedexSelector);
	this.add(advancedArea);
	this.add(pokedexSelector);
	this.add(advancedLabel);
	this.add(combatLabel);
	this.add(healthLabel);
	this.add(speedLabel);
	this.add(numberLabel);
	this.add(nameLabel);
	this.add(pokemonLabel);
	this.add(PokeDisplay);
	
}

private void setupPokemonLayout()
{
	
}

private void setupDropdown()
{
	pokedexSelctor.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent selection);
			});
	
	this.addMouseListener(new ActionListener()
	{
		public void mouseEntered(MouseEvent enterred)
		{
			JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the program");
		}
		
		public void mouseReleased(MouseEvent released)
		{
			 System.out.println("released");
		}
		
		public void mouseExited(MouseEvent exited)
		{
			JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse exited the program");
		}
		
		public void mouseClicked(MouseEvent clicked)
		{
			System.out.println("clicked");
		}
		
		public void mousePressed(MouseEvent pressed)
		{
			System.out.println("pressed");
		}
		
	});
}

private void setupPokemonListeners()
{
	
	
	
	pokedexSelector.addActionListener(new ActionListener()
			{
				public void actionPerfromed(ActionEvent selection)
				{
				
				int selected = pokexSelector.getSelectedindex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeedPoints() + "");
				healthField.setTest(baseController.getPokedex().get(selected).getHealthPoints);
				advancedArea.setText(baseController.getPokedex().get(selected).getHealthPoints 
						+ "\n\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				}
			});
	
	updateButton.addActionListener(new ActionListener()
			{
				
			});
	
	this.addMouseListener(new MouseListener()
			{
		
			});	
	
	this.addMouseMotionListener(new MouseMotionListener()
	{
		public void mouseDragged(MouseEvent dragged)
		{
			setRandomColor();
		}
			
		public void mouseMoved(MouseEvent moved)
		{
			if((Math.abs(moved.getX() - updateButton.getX()) < 5) || (Math.abs(moved.getY() - updateButton.getY()) <5))
				{
					updateButton.setLocation(moved.getX() + 10, moved.getY() - 10 );
				}
		}
	});
}

private void setRandomColor()
{
	int red = (int)(Math.random() * 256);
	int green = (int)(Math.random() * 256);
	int blue = (int)(Math.random() * 256);
	
	this.setBackground(new Color(red, green, blue));
}

private void changeColorBasedOnData(String data)
{
	if (data.contains("Electric"))
	{
		this.setBackground(Color.YELLOW);
	}
	else if (data.contains("Fire"))
	{
		this.setBackground(Color.RED);
	}
	else if (data.contains("Water"))
	{
		this.setBackground(Color.BLUE);
	}
	
	repaint();
	
}

private void changeImageDisplay(String name)
{
	String path = "/poke/view/images";
	String defaultName = "ultraball";
	String extension = ".png";
	try
	{
		pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
	}
	catch (NullPointerException missFile)
	{
		pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
	}
	
	pokemonLabel.setIcon(pokemonIcon);
	repaint();
}

private boolean isValidDouble(String input)
{
	
}

private boolean isValidInterger(String input)
{
	
}

private boolean isValidName(String name)
{
	
}

}

