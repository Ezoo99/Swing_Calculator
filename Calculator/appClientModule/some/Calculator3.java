package some;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextComponent txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(15, 16, 398, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				String EnerNumber = txtDisplay.getText() +  btn7.getText();
				txtDisplay.setText();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(15, 200, 80, 80);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(116, 200, 80, 80);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(224, 200, 80, 80);
		frame.getContentPane().add(btn9);
		
		JButton btnP = new JButton("+");
		btnP.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnP.setBounds(333, 100, 80, 80);
		frame.getContentPane().add(btnP);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(15,300, 80, 80);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(116, 300, 80, 80);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(224, 300, 80, 80);
		frame.getContentPane().add(btn6);
		
		JButton btnS = new JButton("-");
		btnS.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnS.setBounds(333, 200, 80, 80);
		frame.getContentPane().add(btnS);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(15,400, 80, 80);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(116, 400, 80, 80);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(224, 400, 80, 80);
		frame.getContentPane().add(btn3);
		
		JButton btnM = new JButton("*");
		btnM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnM.setBounds(333, 300, 80, 80);
		frame.getContentPane().add(btnM);
		
		JButton btnDec = new JButton(".");
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDec.setBounds(15,500, 80, 80);
		frame.getContentPane().add(btnDec);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(116, 500, 80, 80);
		frame.getContentPane().add(btn0);
		
		JButton btnRem = new JButton("Rem");
		btnRem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRem.setBounds(224, 500, 80, 80);
		frame.getContentPane().add(btnRem);
		
		JButton btnEq = new JButton("=");
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEq.setBounds(333, 500, 80, 80);
		frame.getContentPane().add(btnEq);
		
		JButton btnBack = new JButton("<-");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(15, 100, 180, 80);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(224, 100, 80, 80);
		frame.getContentPane().add(btnClear);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(333, 400, 80, 80);
		frame.getContentPane().add(btnDiv);
	}

}
