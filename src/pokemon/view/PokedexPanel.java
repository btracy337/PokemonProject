package pokemon.view;

//import pokemon.controller.ImageIcon;
import pokemon.controller.PokedexController;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokedexPanel extends JPanel
{
	private PokedexController app;
	private SpringLayout appLayout;
	private JButton changeButton;
	private JButton saveButton;
	private JComboBox<String> pokedexDropdown;
	private JTextField healthPointsText;
	private JTextField attackPointsText;
	private JTextField enhancementModifierText;
	private JTextField numberText;
	private JTextField nameText;
	private JTextField canEvolveText;
	private JLabel healthPointsLabel;
	private JLabel attackPointsLabel;
	private JLabel enhancementModifierLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel canEvolveLabel;
	private JLabel imageLabel;
	private ImageIcon pokemonIcon;

	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		appLayout = new SpringLayout();
		healthPointsText = new JTextField("0");
		
		attackPointsText = new JTextField("0");
		
		enhancementModifierText = new JTextField("0");
	
		numberText = new JTextField("0");
		
		nameText = new JTextField("Pokemon");
		canEvolveText = new JTextField("false");
		
		healthPointsLabel = new JLabel("This Pokemon's health is");
		
		attackPointsLabel = new JLabel("This Pokemon's attack level is");
		
		enhancementModifierLabel = new JLabel("This Pokemon's ehancement level is");
		
		numberLabel = new JLabel("This Pokemon's number is");
		
		nameLabel = new JLabel("My name is");
		
		canEvolveLabel = new JLabel("This Pokemon can evolve");
		
		imageLabel = new JLabel("pokemon goes here", pokemonIcon, JLabel.CENTER);
		changeButton = new JButton("Click here to change the pokevalues");
		saveButton = new JButton("Save");

		
		pokedexDropdown = new JComboBox<String>();
		
		pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.jpeg"));
		setupPanel();
		setupLayout();
		setupDropdown();
		setupListeners();
	}

	private void setupPanel()
	{
		this.add(healthPointsText);
		this.add(attackPointsText);
		this.add(enhancementModifierText);
		this.add(numberText);
		this.add(nameText);
		this.add(canEvolveText);
		this.add(healthPointsLabel);
		this.add(attackPointsLabel);
		this.add(enhancementModifierLabel);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(canEvolveLabel);
		this.add(changeButton);
		this.add(saveButton);
		this.add(imageLabel);
		this.add(pokedexDropdown);
		this.setLayout(appLayout);
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, healthPointsText, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, attackPointsText, 0, SpringLayout.EAST, healthPointsText);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementModifierText, 72, SpringLayout.SOUTH, attackPointsText);
		appLayout.putConstraint(SpringLayout.EAST, enhancementModifierText, 0, SpringLayout.EAST, healthPointsText);
		appLayout.putConstraint(SpringLayout.EAST, numberText, 0, SpringLayout.EAST, healthPointsText);
		appLayout.putConstraint(SpringLayout.EAST, nameText, 0, SpringLayout.EAST, canEvolveText);
		appLayout.putConstraint(SpringLayout.WEST, canEvolveText, 0, SpringLayout.WEST, healthPointsText);
		appLayout.putConstraint(SpringLayout.WEST, healthPointsText, 63, SpringLayout.EAST, healthPointsLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthPointsLabel, 25, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthPointsLabel, -166, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackPointsText, -5, SpringLayout.NORTH, attackPointsLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackPointsLabel, 57, SpringLayout.SOUTH, healthPointsLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackPointsLabel, -159, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementModifierLabel, 82, SpringLayout.SOUTH, attackPointsLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhancementModifierLabel, 0, SpringLayout.EAST, attackPointsLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 86, SpringLayout.SOUTH, enhancementModifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberText, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, healthPointsLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameText, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, healthPointsLabel);
		appLayout.putConstraint(SpringLayout.NORTH, canEvolveLabel, 457, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -52, SpringLayout.NORTH, canEvolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, canEvolveText, -5, SpringLayout.NORTH, canEvolveLabel);
		appLayout.putConstraint(SpringLayout.EAST, canEvolveLabel, 0, SpringLayout.EAST, attackPointsLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 69, SpringLayout.SOUTH, changeButton);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 23, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, 17, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 1, SpringLayout.NORTH, healthPointsText);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, numberText);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 48, SpringLayout.WEST, this);
	}
private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		if(app.isInt(attackPointsText.getText()) && app.isDouble(enhancementModifierText.getText()) && app.isInt(healthPointsText.getText()))
		{
			String [] data = new String[5];
			
			//code goes here
			app.updatePokemon(index, data);
		}
	}
private void updateFields(int index)

{
	String [] data = app.getPokemonData(index);
	healthPointsText.setText(data[0]);
	attackPointsText.setText(data[1]);
	enhancementModifierText.setText(data[2]);
	numberText.setText(data[3]);
	nameText.setText(data[4]);
	canEvolveText.setText(data[5])
}
	private void changeImageDisplay(String name) {
		String path = "/pokemon/view/images/";
		String defaultName = "ultraball";
		String extension = " .jpeg";
		try {
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase()+ extension));
		}
		catch(NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path+defaultName+extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
		
	}

	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)
			{
				sendDataToController();
			}
		});
		pokedexDropdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				changeImageDisplay(name);
			}
		});
	saveButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent click)
		{
			app.savePokedex();
		}
	});
	}
	
	private void setupDropdown() {
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
		
	}

}
