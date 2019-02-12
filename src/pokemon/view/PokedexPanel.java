package pokemon.view;
import pokemon.controller.PokedexController;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokedexPanel extends JPanel
{
private PokedexController app;
private SpringLayout appLayout;
private JButton changeButton;
private JComboBox pokedexDropdown;
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

public PokedexPanel(PokedexController app)
{
	super();
	this.app = app;
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
	imageLabel = new JLabel("Your Pokemon here");
	
	changeButton = new JButton("Click here to change the pokevalues");
	pokedexDropdown = new JComboBox(); //stub
	
	setupPanel();
	setupLayout();
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
	this.add(imageLabel);
	this.add(pokedexDropdown);
	this.setLayout(appLayout);
}
private void setupLayout()
{
	
	
}
private void setupListeners()
{
	
	
}
}
