package guidemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CreateAboutMenu extends JMenu {

	private final DrawPanel panel; // the panel whose text is controlled by this menu

	public CreateAboutMenu(DrawPanel owner) {

		super("About");
		this.panel = owner;
		final JMenuItem mahmoud = new JMenuItem("Mahmoud Alsalmo");
		mahmoud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebPage("https://www.linkedin.com/in/mahmoud-alsalmo/");
			}
		});
		add(mahmoud);

	}
	public void openWebPage(String url) {
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		}
	}


}
