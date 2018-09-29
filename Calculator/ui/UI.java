package ui;

import java.awt.EventQueue;
import java.awt.desktop.ScreenSleepEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import com.ibm.icu.text.NumberFormat;

import backend.Postfix;
import backend.PostfixEvaluator;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;

public class UI extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField display;
	private boolean reslutShown=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display = new JFormattedTextField(NumberFormat.getIntegerInstance());
		display.setBackground(SystemColor.window);
		display.setBounds(10, 11, 302, 63);
		contentPane.add(display);
		display.setColumns(10);
		
		
		StringBuilder displayText= new StringBuilder();
		
		
		JButton clearAllBtn = new JButton("CA");
		clearAllBtn.setBackground(new Color(0, 0, 0));
		clearAllBtn.setForeground(new Color(255, 255, 255));
		clearAllBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText(null);
			}
		});
		clearAllBtn.setBounds(254, 143, 58, 44);
		contentPane.add(clearAllBtn);
		
		JButton equalsBtn = new JButton("=");
		equalsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Postfix postfix= new Postfix();
				PostfixEvaluator evaluator=new PostfixEvaluator();
				String postfixString=postfix.convertToPostfix(display.getText());
				display.setText(evaluator.evaluate(postfixString));
				reslutShown=true;
				
			}
		});
		equalsBtn.setBackground(new Color(0, 0, 0));
		equalsBtn.setForeground(new Color(255, 255, 255));
		equalsBtn.setBounds(169, 375, 58, 44);
		contentPane.add(equalsBtn);
		
		JButton zeroBtn = new JButton("0");
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String zero= display.getText()+zeroBtn.getText();
				display.setText(zero);
				reslutShown=false;
			}
		});
		zeroBtn.setBackground(new Color(0, 0, 0));
		zeroBtn.setForeground(new Color(255, 255, 255));
		zeroBtn.setBounds(89, 375, 58, 44);
		contentPane.add(zeroBtn);
		
		JButton commaBtn = new JButton(".");
		commaBtn.setBackground(new Color(0, 0, 0));
		commaBtn.setForeground(new Color(255, 255, 255));
		commaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String coma= display.getText()+commaBtn.getText();
				display.setText(coma);
				reslutShown=false;
			}
		});
		commaBtn.setBounds(10, 375, 58, 44);	
		contentPane.add(commaBtn);
		
		JButton numberOne = new JButton("1");
		numberOne.setBackground(new Color(0, 0, 0));
		numberOne.setForeground(new Color(255, 255, 255));
		numberOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String one= display.getText()+numberOne.getText();
				display.setText(one);
				reslutShown=false;
				
			}
		});
		numberOne.setBounds(10, 312, 58, 44);
		contentPane.add(numberOne);
		
		JButton numberTwo = new JButton("2");
		numberTwo.setBackground(new Color(0, 0, 0));
		numberTwo.setForeground(new Color(255, 255, 255));
		numberTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String two=display.getText()+ numberTwo.getText();
				display.setText(two);
				reslutShown=false;
				
			}
		});
		
		numberTwo.setBounds(89, 312, 58, 44);
		contentPane.add(numberTwo);
		
		JButton numberThree = new JButton("3");
		numberThree.setBackground(new Color(0, 0, 0));
		numberThree.setForeground(new Color(255, 255, 255));
		numberThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String three= display.getText()+numberThree.getText();
				display.setText(three);
				reslutShown=false;
			}
		});
		numberThree.setBounds(169, 312, 58, 44);
		contentPane.add(numberThree);
		
		JButton addBtn = new JButton("+");
		addBtn.setBackground(new Color(0, 0, 0));
		addBtn.setForeground(new Color(255, 255, 255));
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String plus= display.getText()+addBtn.getText();
				display.setText(plus);
				reslutShown=false;
			}
		});
		addBtn.setBounds(254, 375, 58, 44);
		contentPane.add(addBtn);
		
		JButton subtractBtn = new JButton("-");
		subtractBtn.setBackground(new Color(0, 0, 0));
		subtractBtn.setForeground(new Color(255, 255, 255));
		subtractBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String minus= display.getText()+subtractBtn.getText();
				display.setText(minus);
				reslutShown=false;
			}
		});
		subtractBtn.setBounds(254, 312, 58, 44);
		contentPane.add(subtractBtn);
		
		JButton numberSix = new JButton("6");
		numberSix.setBackground(new Color(0, 0, 0));
		numberSix.setForeground(new Color(255, 255, 255));
		numberSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String six= display.getText()+numberSix.getText();
				display.setText(six);
				reslutShown=false;
			}
		});
		numberSix.setBounds(169, 250, 58, 44);
		contentPane.add(numberSix);
		
		JButton numberFive = new JButton("5");
		numberFive.setBackground(new Color(0, 0, 0));
		numberFive.setForeground(new Color(255, 255, 255));
		numberFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String five= display.getText()+numberFive.getText();
				display.setText(five);
				reslutShown=false;
			}
		});
		numberFive.setBounds(89, 250, 58, 44);
		contentPane.add(numberFive);
		
		JButton numberFour = new JButton("4");
		numberFour.setBackground(new Color(0, 0, 0));
		numberFour.setForeground(new Color(255, 255, 255));
		numberFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String four= display.getText()+numberFour.getText();
				display.setText(four);
				reslutShown=false;
			}
		});
		numberFour.setBounds(10, 250, 58, 44);
		contentPane.add(numberFour);
		
		JButton numberSeven = new JButton("7");
		numberSeven.setBackground(new Color(0, 0, 0));
		numberSeven.setForeground(new Color(255, 255, 255));
		numberSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String seven= display.getText()+numberSeven.getText();
				display.setText(seven);
				reslutShown=false;
			}
		});
		numberSeven.setBounds(10, 195, 58, 44);
		contentPane.add(numberSeven);
		
		JButton numberEight = new JButton("8");
		numberEight.setBackground(new Color(0, 0, 0));
		numberEight.setForeground(new Color(255, 255, 255));
		numberEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String eight= display.getText()+numberEight.getText();
				display.setText(eight);
				reslutShown=false;
			}
		});
		numberEight.setBounds(89, 195, 58, 44);
		contentPane.add(numberEight);
		
		JButton numberNine = new JButton("9");
		numberNine.setBackground(new Color(0, 0, 0));
		numberNine.setForeground(new Color(255, 255, 255));
		numberNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String nine= display.getText()+numberNine.getText();
				display.setText(nine);
				reslutShown=false;
			}
		});
		numberNine.setBounds(169, 195, 58, 44);
		contentPane.add(numberNine);
		
		JButton multiplyBtn = new JButton("*");
		multiplyBtn.setBackground(new Color(0, 0, 0));
		multiplyBtn.setForeground(new Color(255, 255, 255));
		multiplyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String multiply= display.getText()+multiplyBtn.getText();
				display.setText(multiply);
				reslutShown=false;
			}
		});
		multiplyBtn.setBounds(254, 195, 58, 44);
		contentPane.add(multiplyBtn);
		
		JButton ClearBtn = new JButton("<-");
		ClearBtn.setForeground(new Color(255, 255, 255));
		ClearBtn.setBackground(new Color(0, 0, 0));
		ClearBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (display.getText().length()>0) {
						displayText.append(display.getText());
						String modifiedText=displayText.deleteCharAt(display.getText().length()-1).toString();
						display.setText(modifiedText);
						displayText.setLength(0);
					}	
				}
			}
		);
		ClearBtn.setBounds(10, 143, 217, 44);
		contentPane.add(ClearBtn);
		
		JButton divideBtn = new JButton("/");
		divideBtn.setBackground(new Color(0, 0, 0));
		divideBtn.setForeground(new Color(255, 255, 255));
		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (reslutShown) {
					display.setText("");
				}
				String divide= display.getText()+divideBtn.getText();
				display.setText(divide);
				reslutShown=false;
			}
		});
		divideBtn.setBounds(254, 250, 58, 44);
		contentPane.add(divideBtn);
	}
}
