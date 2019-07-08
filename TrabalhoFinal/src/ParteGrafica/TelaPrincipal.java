package ParteGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.SystemColor;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 649, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JDesktopPane jdpPrincipal = new JDesktopPane();
		frame.getContentPane().add(jdpPrincipal, BorderLayout.CENTER);
		
		JButton CADASTRO = new JButton("CADASTRO");
		CADASTRO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jdCadastrar obj = new jdCadastrar();
				jdpPrincipal.add(obj);
				obj.setVisible(true);
			
			}
		});
		toolBar.add(CADASTRO);
		
		
		JToggleButton tglbtnRastrear = new JToggleButton("RASTREAR");
		toolBar.add(tglbtnRastrear);
		
		
	}

}
