import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;


public class Frame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	
	private JPanel panelImage;
	private JPanel panelOption;
	private JPanel panelOptionColor;
	private JPanel panelFile;
	private Border border;
	private JButton bt;
	private JRadioButton radioButtonFile1;
	private JRadioButton radioButtonFile2;
	private JRadioButton radioButtonFile3;
	private JRadioButton radioButtonFile4;
	private JRadioButton radioButtonFile5;
	private JRadioButton radioButtonFile6;
	private JRadioButton radioButtonFile7;
	private JRadioButton radioButtonFile8;
	private JRadioButton radioButtonFile9;
	private ButtonGroup bg;
	private String image_path="src/Images/dora.jpg";
	ImageIcon i =new ImageIcon(image_path);
	static String doraString = "dora";
    static String chatString = "chat";
    static String filleString = "fille";
    static String pommierString = "pommier";
    static String poneyString = "poney";
    static String poussinString = "poussin";
    private JLabel label;

	
	public Frame() {
		super("Coloriage d'enfant");
		
	}
	public JPanel readImage( String image_path){
		
		panelImage= new JPanel();
		panelImage.setPreferredSize(new Dimension (1000,700));
		panelImage.setBackground(Color.WHITE);
		//ImageIcon background = new ImageIcon(image_path);
		//JLabel label = new JLabel();
		//label.setBounds(0,0,1000,700);
		//label.setIcon(background);

        panelImage = new JPanel();
		panelImage.setLayout(null);
		panelImage.add(createImage(image_path),BorderLayout.CENTER);
	    this.add(panelImage,BorderLayout.CENTER);
	   // this.setBackground(Color.blue);
	    return panelImage;
	}
	
	//methode qui retourne un imageIcon
	public JLabel createImage(String image_path){
		ImageIcon background = new ImageIcon(image_path);
	    label = new JLabel();
		label.setBounds(0,0,1000,700);
		label.setIcon(background);
		return label;
		
	}
	
	public JPanel optionPane(){
		panelOption= new JPanel();
		panelOption.setBackground(Color.BLUE);
		panelOption.setPreferredSize(new Dimension (300,50));
		
		
	   panelFile = new JPanel(new GridLayout(3,3));
	   // panelFile.setBorder(BorderFactory.createTitledBorder(loweredetched, "Choose File", EtchedBorder.LOWERED, getDefaultCloseOperation()));
	   // title = BorderFactory.createTitledBorder( loweredetched, "title");
       // title.setTitleJustification(TitledBorder.LEFT);
       border=BorderFactory.createTitledBorder("Choose File");
       panelFile.setBorder(border);
       panelFile.setBackground(Color.BLUE);
       panelFile.setOpaque(true);
		
		
		new JLabel("Choose File");


	radioButtonFile1=new JRadioButton(doraString);
	radioButtonFile1.setMnemonic(KeyEvent.VK_B);
	radioButtonFile1.setActionCommand(doraString);
	radioButtonFile1.setSelected(true);
		
		
		
	radioButtonFile2=new JRadioButton(chatString);
	radioButtonFile2.setMnemonic(KeyEvent.VK_B);
	radioButtonFile2.setActionCommand(chatString);
		
		
		
    radioButtonFile3=new JRadioButton(filleString);
    radioButtonFile3.setMnemonic(KeyEvent.VK_B);
	radioButtonFile3.setActionCommand(filleString);
		
		radioButtonFile4=new JRadioButton(pommierString);
		radioButtonFile4.setMnemonic(KeyEvent.VK_B);
		radioButtonFile4.setActionCommand(pommierString);
			
		radioButtonFile5=new JRadioButton(poneyString);
		radioButtonFile5.setMnemonic(KeyEvent.VK_B);
		radioButtonFile5.setActionCommand(poneyString);
			
		radioButtonFile6=new JRadioButton(poussinString);
		radioButtonFile6.setMnemonic(KeyEvent.VK_B);
		radioButtonFile6.setActionCommand(poussinString);
		
		radioButtonFile7=new JRadioButton("File7");
		radioButtonFile8=new JRadioButton("File8");
		radioButtonFile9=new JRadioButton("File9");
		
		bg =new ButtonGroup();
		bg.add(radioButtonFile1);
		bg.add(radioButtonFile2);
		bg.add(radioButtonFile3);
		bg.add(radioButtonFile4);
		bg.add(radioButtonFile5);
		bg.add(radioButtonFile6);
		bg.add(radioButtonFile7);
		bg.add(radioButtonFile8);
		bg.add(radioButtonFile9);
		
		radioButtonFile1.addActionListener(this);
		radioButtonFile2.addActionListener(this);
		radioButtonFile3.addActionListener(this);
		radioButtonFile4.addActionListener(this);
		radioButtonFile5.addActionListener(this);
		radioButtonFile6.addActionListener(this);
	
		
		//panelOption.add(chooseFile,BorderLayout.CENTER);
		panelFile.add(radioButtonFile1);//,BorderLayout.EAST);
		panelFile.add(radioButtonFile2);//,BorderLayout.EAST);
		panelFile.add(radioButtonFile3);//,BorderLayout.EAST);
		panelFile.add(radioButtonFile4);//,BorderLayout.WEST);
		panelFile.add(radioButtonFile5);//,BorderLayout.WEST);
		panelFile.add(radioButtonFile6);//,BorderLayout.WEST);
		panelFile.add(radioButtonFile7);//,BorderLayout.WEST);
		panelFile.add(radioButtonFile8);//,BorderLayout.WEST);
		panelFile.add(radioButtonFile9);//,BorderLayout.WEST);
		
		
		panelOptionColor=new JPanel();
		
		bt= new JButton();
		bt.setText("Choose Color");
		 MouseAdapter actionListener = new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                Color background = JColorChooser.showDialog(null,
	                        "JColorChooser Sample", null);
	                if (background != null) {
	                    bt.setBackground(background);
	                }
	            }
	        };
	        bt.addMouseListener(actionListener);
		
		
	
	   
	    panelOptionColor.add(bt,BorderLayout.SOUTH);
		panelOption.add(panelFile,BorderLayout.NORTH);
		panelOption.add(panelOptionColor);
		
	    this.add(panelOption,BorderLayout.EAST);
		
		return panelOption;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//ImageIcon background = new ImageIcon(image_path);
		 label.setIcon(new ImageIcon("src/Images/"
              + e.getActionCommand()
              + ".jpg"));
		 
	}
	/*	if(e.getSource() == radioButtonFile1){
			System.out.println("moi c doraaa");
			image_path="src/Images/dora.jpg";
		    readImage(image_path);
		    System.out.println("dora " + image_path);
			
		}
		if(e.getSource() == radioButtonFile2){
			panelImage.setBackground(Color.DARK_GRAY);
		
			
			/*System.out.println("moi c le chat ");
			image_path="src/Images/chat.jpg";
			readImage(image_path);
		    System.out.println("chat " + image_path);*/
		}
		
		/*AbstractButton picture = null;
		picture.setIcon(new ImageIcon("src/Images/" 
                 + e.getActionCommand() 
                 + ".jpg"));
		

	}}
*/


	
	
	
	
	


	        
		
	

	
	
	

	
	
	
	
	


