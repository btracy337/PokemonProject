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

public PokedexPanel(PokedexController app)
{
	
}

private void setupPanel()
{
	this.setLayout(appLayout);
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
}
private void setupLayout()
{
	
	
}
private void setupListeners()
{
	
	
}
}
