import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Main {
	private static String image_path="src/Images/dora.jpg";
	//private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
           Frame f= new Frame();
           f.setLayout(new BorderLayout());
       
           
           f.optionPane();
           f.readImage(image_path);
           
           f.setVisible(true);
   		   f.setSize(1200, 700);
   		   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
