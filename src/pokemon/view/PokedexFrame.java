package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;

public class PokedexFrame extends JFrame
{
	private PokedexController app;
	private PokedexPanel PokedexPanel;

	public PokedexFrame(PokedexController app)
	{
		super();
		this.app = app;
		this.PokedexPanel = new PokedexPanel(app);

		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(PokedexPanel);
		this.setSize(800, 800);
		this.setTitle("Pokemon Inheritance");
		this.setResizable(false);
		this.setVisible(true);
	}
}
