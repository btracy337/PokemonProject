package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;

public class PokedexFrame extends JFrame
{
	private PokedexController app;
	private PokedexPanel panel;

	public PokedexFrame(PokedexController app)
	{
		super();
		this.app = app;
		this.panel = new PokedexPanel();

		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(PokedexPanel);
		this.setSize(800, 800);
		this.setTitle("");
		this.setResizable(false);
		this.setVisible(true);
	}
}
