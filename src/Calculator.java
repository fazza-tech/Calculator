import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	boolean isoperatorClicked=false;

	JFrame jf;
	String oldValue;
	float result=0;
	int operator=0;
	
	
	JLabel displayLabel;
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton subButton;
	JButton multiButton;
	JButton addButton;
	JButton clearButton;
	
	ImageIcon image = new ImageIcon("logo.png");//create image icon
	
	

	public Calculator() {
		
		jf = new JFrame("Calculator"); //Jframe Object Created
		jf.setLayout(null);
		jf.setSize(450,700); // set width and height
		jf.setLocation(300,200); //set location of the application (x,y)
		jf.getContentPane().setBackground(Color.black);
		jf.setResizable(false);
		jf.setIconImage(image.getImage());//change icon of frame
		
		
		//Label 
		
		displayLabel = new JLabel();
		displayLabel.setBounds(30, 40, 370, 80);
		displayLabel.setBackground(Color.black); //setting label background color
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); //setting text alignment to right
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Verdana", Font.PLAIN, 45)); //set font size
		jf.add(displayLabel);

		
		//Button
		
		sevenButton = new JButton("7"); //button number
		sevenButton.setBounds(30,130,80,80); //button size
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Verdana", Font.PLAIN, 35)); //set font size
		sevenButton.setBackground(new java.awt.Color(184, 182, 178));
		sevenButton.setForeground(Color.WHITE);
		sevenButton.setFocusPainted(false);
		jf.add(sevenButton);  //add to Jframe
		
		eightButton = new JButton("8");
		eightButton.setBounds(125,130,80,80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		eightButton.setFocusPainted(false);
		eightButton.setBackground(new java.awt.Color(184, 182, 178));
		eightButton.setForeground(Color.WHITE);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(220,130,80,80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		nineButton.setFocusPainted(false);
		nineButton.setBackground(new java.awt.Color(184, 182, 178));
		nineButton.setForeground(Color.WHITE);
		jf.add(nineButton);
		
		fourButton = new JButton("4"); 
		fourButton.setBounds(30,230,80,80); 
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		fourButton.setFocusPainted(false);
		fourButton.setFocusPainted(false);
		fourButton.setBackground(new java.awt.Color(184, 182, 178));
		fourButton.setForeground(Color.WHITE);
		jf.add(fourButton);  
		
	    fiveButton = new JButton("5");
		fiveButton.setBounds(125,230,80,80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		fiveButton.setFocusPainted(false);
		fiveButton.setFocusPainted(false);
		fiveButton.setBackground(new java.awt.Color(184, 182, 178));
		fiveButton.setForeground(Color.WHITE);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(220,230,80,80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		sixButton.setFocusPainted(false);
		sixButton.setFocusPainted(false);
		sixButton.setBackground(new java.awt.Color(184, 182, 178));
		sixButton.setForeground(Color.WHITE);
		jf.add(sixButton);
	
		oneButton = new JButton("1"); 
		oneButton.setBounds(30,330,80,80); 
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		oneButton.setFocusPainted(false);
		oneButton.setFocusPainted(false);
		oneButton.setBackground(new java.awt.Color(184, 182, 178));
		oneButton.setForeground(Color.WHITE);
		jf.add(oneButton);  
		
		twoButton = new JButton("2");
		twoButton.setBounds(125,330,80,80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		twoButton.setFocusPainted(false);
		twoButton.setBackground(new java.awt.Color(184, 182, 178));
		twoButton.setForeground(Color.WHITE);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(220,330,80,80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		threeButton.setFocusPainted(false);
		threeButton.setBackground(new java.awt.Color(184, 182, 178));
		threeButton.setForeground(Color.WHITE);
		jf.add(threeButton);
		
		dotButton = new JButton("."); 
		dotButton.setBounds(220,430,80,80); 
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		dotButton.setFocusPainted(false);
		dotButton.setBackground(new java.awt.Color(184, 182, 178));
		dotButton.setForeground(Color.WHITE);
		jf.add(dotButton);  
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(30,430,175,80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		zeroButton.setFocusPainted(false);
		zeroButton.setBackground(new java.awt.Color(184, 182, 178));
		zeroButton.setForeground(Color.WHITE);
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(220,530,180,80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		equalButton.setBackground(new java.awt.Color(252, 207, 3));
		equalButton.setForeground(Color.WHITE);
		equalButton.setFocusPainted(false);
		jf.add(equalButton);
		
		//arithmetic operations
		
		divButton = new JButton("/");
		divButton.setBounds(320,130,80,80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		divButton.setBackground(new java.awt.Color(252, 207, 3));
		divButton.setForeground(Color.WHITE);
		divButton.setFocusPainted(false);
		divButton.setFocusPainted(false);
		jf.add(divButton);
		
		multiButton = new JButton("x");
		multiButton.setBounds(320,230,80,80);
		multiButton.addActionListener(this);
		multiButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		multiButton.setBackground(new java.awt.Color(252, 207, 3));
		multiButton.setForeground(Color.WHITE);
		multiButton.setFocusPainted(false);
		jf.add(multiButton);
		
		subButton = new JButton("-");
		subButton.setBounds(320,330,80,80);
		subButton.addActionListener(this);
		subButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		subButton.setBackground(new java.awt.Color(252, 207, 3));
		subButton.setForeground(Color.WHITE);
		subButton.setFocusPainted(false);
		jf.add(subButton);
		
		addButton = new JButton("+");
		addButton.setBounds(320,430,80,80);
		addButton.addActionListener(this);
		addButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		addButton.setBackground(new java.awt.Color(252, 207, 3));
		addButton.setForeground(Color.WHITE);
		addButton.setFocusPainted(false);
		jf.add(addButton);
		
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(30,530,175,80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Verdana", Font.PLAIN, 35));
		clearButton.setForeground(Color.WHITE);
		clearButton.setBackground(new java.awt.Color(255, 68, 71));
		clearButton.setFocusPainted(false);
		jf.add(clearButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //automatic exit from
		
	
	} 
	
	public static void  main(String[] args) {
		new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sevenButton ) {
			if(isoperatorClicked) {
				displayLabel.setText("7");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource() == eightButton) {
			if(isoperatorClicked) {
				displayLabel.setText("8");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource() == nineButton) {
			if(isoperatorClicked) {
				displayLabel.setText("9");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if(e.getSource() == fourButton) {
			if(isoperatorClicked) {
				displayLabel.setText("4");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource() == fiveButton) {
			if(isoperatorClicked) {
				displayLabel.setText("5");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource() == sixButton) {
			if(isoperatorClicked) {
				displayLabel.setText("6");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource() == oneButton) {
			if(isoperatorClicked) {
				displayLabel.setText("1");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource() == twoButton) {
			if(isoperatorClicked) {
				displayLabel.setText("2");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if(e.getSource() == threeButton) {
			if(isoperatorClicked) {
				displayLabel.setText("3");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource() == zeroButton) {
			if(isoperatorClicked) {
				displayLabel.setText("0");
				isoperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		else if(e.getSource() == dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if(e.getSource() == divButton) {
			operator=1;
			isoperatorClicked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("/");

		}
		else if(e.getSource() == multiButton) {
			operator=2;
			isoperatorClicked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("x");
		}
		else if(e.getSource() == subButton) {
			operator=3;
			isoperatorClicked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("-");
		}
		else if(e.getSource() == addButton) {
			operator=4;
			isoperatorClicked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("+");
		} 
		else if(e.getSource() == clearButton) {
			displayLabel.setText(" ");
		}
		else if (e.getSource() == equalButton) {
            String newValue = displayLabel.getText();
            float oldvalueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);
            if (operator == 1) {
                result = oldvalueF/newValueF;
            }else if(operator == 2) {
                result=oldvalueF*newValueF;
            }else if(operator == 3) {
                result=oldvalueF-newValueF;
            }else if(operator == 4) {
                result=oldvalueF+newValueF;
            }
            displayLabel.setText(result +" ");
    }

}

}