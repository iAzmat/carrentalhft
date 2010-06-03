package de.hft.carrental.ui.splash.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import de.hft.carrental.ui.WindowPage;
import de.hft.carrental.ui.WindowPageSection;
import de.hft.carrental.ui.main.MainWindow;

public final class LoginSection extends WindowPageSection implements
		ActionListener {

	private static final long serialVersionUID = 1064521119735654437L;

	private static final String AC_LOGIN = "login";

	public LoginSection(WindowPage page) {
		super(page, "Login");

		JTextField loginTextField = new JTextField(15);
		loginTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				// Nothing to do.
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					performLogin();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// Nothing to do.
			}
		});
		add(loginTextField);

		JButton loginButton = new JButton("Login!");
		loginButton.setActionCommand(AC_LOGIN);
		loginButton.addActionListener(this);
		add(loginButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals(AC_LOGIN)) {
			performLogin();
		}
	}

	private void performLogin() {
		getWindowPage().getWindow().setVisible(false);
		new MainWindow();
	}

}
