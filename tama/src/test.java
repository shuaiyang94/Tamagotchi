import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class test {

	private JFrame frmTmagotchi;
	private JTextField textField;
	private MyPet pet;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frmTmagotchi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTmagotchi = new JFrame();
		frmTmagotchi.setResizable(false);
		frmTmagotchi.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ALEXSHUAI\\Desktop\\JAVA\\tama\\img\\Tamagotchi-Egg-Icon.png"));
		frmTmagotchi.setTitle("Tamagotchi");
		frmTmagotchi.setBounds(100, 100, 563, 422);
		frmTmagotchi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTmagotchi.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel Home = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0) );
		//frmTmagotchi.getContentPane().add(Home);
		
		//JLabel lblHome = new JLabel(new ImageIcon("/Users/alex/Documents/workspace/GUI/img/tama_home.jpg"));
		//lblHome.setBounds(100, 100, 563, 422);
		//ImageIcon background = new ImageIcon("/img/background.png");
		//Home.add(lblHome);
		
		JMenuBar menuBar = new JMenuBar();
		frmTmagotchi.setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Jeu");
		menuBar.add(mnGame);
		
		JMenuItem mntmNew = new JMenuItem("Nouveau");
		mnGame.add(mntmNew);
		
		/*
		 *  Create a new pet by menu item "Nouveau"
		 */
		/*
		JPanel createPet=new JPanel();
		createPet.setVisible(false);
		createPet.setPreferredSize( new Dimension(540, 360) );
		Home.add(createPet);
		createPet.setLayout(null);
		*/
		/*
		 *  Game interface
		 */
		JPanel game=new JPanel();
		game.setVisible(true);
		game.setPreferredSize( new Dimension(540, 360) );
		Home.add(game);
		game.setLayout(null);
		
		JButton btnFeed = new JButton("Nourir");
		btnFeed.setBounds(0, 307, 90, 53);
		game.add(btnFeed);
		
		JButton btnDrink = new JButton("Boire");
		btnDrink.setBounds(360, 307, 90, 53);
		game.add(btnDrink);
		
		JButton btnSleep = new JButton("Dormir");
		btnSleep.setBounds(177, 307, 96, 53);
		game.add(btnSleep);
		
		JButton btnDicipline = new JButton("Dicipline");
		btnDicipline.setBounds(272, 307, 89, 53);
		game.add(btnDicipline);
		
		JButton btnClean = new JButton("Nettoyer");
		btnClean.setBounds(89, 307, 89, 53);
		game.add(btnClean);
		
		JButton btnPlay = new JButton("Jouer");
		btnPlay.setBounds(450, 307, 90, 53);
		game.add(btnPlay);
		
		JPanel Environment = new JPanel();
		Environment.setBounds(0, 0, 540, 306);
		game.add(Environment);
		Environment.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ALEXSHUAI\\Desktop\\JAVA\\tama\\img\\bowl.png"));
		lblNewLabel_1.setBounds(243, 254, 64, 26);
		Environment.add(lblNewLabel_1);
		
		
		JLabel lblVie = new JLabel("Vie");
		lblVie.setBounds(41, 229, 14, 14);
		Environment.add(lblVie);
		
		JProgressBar progressHealth = new JProgressBar();
		progressHealth.setBounds(65, 229, 93, 14);
		Environment.add(progressHealth);
		
		JLabel lblFaim = new JLabel("Faim");
		lblFaim.setBounds(33, 254, 22, 14);
		Environment.add(lblFaim);
		
		JProgressBar progressHunger = new JProgressBar();
		progressHunger.setBounds(65, 252, 93, 14);
		Environment.add(progressHunger);
		
		JLabel lblEnergy = new JLabel("Energie");
		lblEnergy.setBounds(21, 277, 36, 14);
		Environment.add(lblEnergy);
		
		JProgressBar progressEnergy = new JProgressBar();
		progressEnergy.setBounds(65, 277, 93, 14);
		Environment.add(progressEnergy);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ALEXSHUAI\\Desktop\\JAVA\\tama\\img\\livingroom.png"));
		lblNewLabel.setBounds(0, 0, 540, 306);
		Environment.add(lblNewLabel);
		frmTmagotchi.getContentPane().add(Home);
		
		
		
		/*JLabel lblName = new JLabel("nom");
		lblName.setBounds(32, 34, 34, 21);
		createPet.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(81, 34, 102, 20);
		createPet.add(textField);
		textField.setColumns(10);
		
		JButton btnCancel = new JButton("Annuler");
		btnCancel.setBounds(257, 185, 89, 23);
		createPet.add(btnCancel);
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(32, 82, 109, 23);
		createPet.add(rdbtnMale);
		
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(145, 82, 109, 23);
		createPet.add(rdbtnFemale);
		
		JButton btnOk = new JButton("ok");
		btnOk.setBounds(112, 185, 89, 23);
		// ok button's action set pet's informations
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String str = textField.getText();
				if(str.equals(""))
				{
					JOptionPane.showMessageDialog(frmTmagotchi,"Veuillez donner un nom.");
				}
				else if(rdbtnMale.isSelected()) {
					JOptionPane.showMessageDialog(null,rdbtnMale.getText());
					//pet.setName(textField.getText());
					//pet.setGender(rdbtnMale.getText());
					createPet.setVisible(false);
					game.setVisible(true);
				} 
				else if(rdbtnFemale.isSelected()) {
					JOptionPane.showMessageDialog(null,rdbtnFemale.getText());
					//pet.setName(textField.getText());
					//pet.setGender(rdbtnFemale.getText());
				}
				else {
					JOptionPane.showMessageDialog(frmTmagotchi,"Veuillez choisir le sexe.");
				}
			}
		});
		createPet.add(btnOk);
        
		// cancel button's action
		btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	createPet.setVisible(false);
            	rdbtnMale.setSelected(false);
            	rdbtnFemale.setSelected(false);
            	textField.setText("");
            }
        });
		
		frmTmagotchi.getContentPane().add(Home);
		//frmTmagotchi.getContentPane().add(createPet);
		
		// new game menu item for display the create pet panel
        mntmNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	createPet.setVisible(true);
            }
        });
		*/
        
		
		JMenuItem mntmResume = new JMenuItem("Reprendre");
		mnGame.add(mntmResume);
		
		JMenuItem mntmSave = new JMenuItem("Enregistrer");
		mnGame.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Enregistrer sous...");
		mnGame.add(mntmSaveAs);
		
		JMenuItem mntmExit = new JMenuItem("Quitter");
		mnGame.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Aide");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpText = new JMenuItem("Aide ?");
		mnHelp.add(mntmHelpText);
		
		JMenuItem mntmAbout = new JMenuItem("props de Tamagotchi");
		mnHelp.add(mntmAbout);
	}
}


/*class MenuItem implements ActionListener {

	public void actionPerformed(ActionEvent evt){
		String composant = evt.getActionCommand();
		showStatus("Action sur le composant : " + composant);
	}
}*/