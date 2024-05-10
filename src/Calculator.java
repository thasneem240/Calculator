/********************************************
 * Author: A.S.M.Thasneem 					*
 * Index Number: DSE/21/120					*
 * Title: Calculator						*
 * ******************************************/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
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
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setFont(new Font("Dialog", Font.PLAIN, 18));
		frmCalculator.setTitle("\t\t\t\t\tCalculator");
		frmCalculator.setBounds(100, 100, 498, 470);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 18));
		lblNewLabel.setBounds(128, 11, 190, 60);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(50, 72, 109, 60);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(259, 72, 109, 60);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD(+)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Check the 2 text fields are empty or not 
				
				if( !(textField.getText().isEmpty() || textField_1.getText().isEmpty() ))
				{
					double num1,num2,answer;
					try 
					{
						num1 = Double.parseDouble(textField.getText());
						num2 = Double.parseDouble(textField_1.getText());
						
						answer = num1 + num2;
						textField_2.setText(Double.toString(answer));
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Number format","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 196, 89, 50);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnSub = new JButton("SUB(-)");
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// Check the 2 text fields are empty or not 
				
				if( !(textField.getText().isEmpty() || textField_1.getText().isEmpty() ))
				{
					double num1,num2,answer;
					try 
					{
						num1 = Double.parseDouble(textField.getText());
						num2 = Double.parseDouble(textField_1.getText());
						
						answer = num1 - num2;
						textField_2.setText(Double.toString(answer));
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Number format","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnSub.setBounds(132, 196, 89, 50);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("MUL(*)");
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// Check the 2 text fields are empty or not 
				
				if( !(textField.getText().isEmpty() || textField_1.getText().isEmpty() ))
				{
					double num1,num2,answer;
					try 
					{
						num1 = Double.parseDouble(textField.getText());
						num2 = Double.parseDouble(textField_1.getText());
						
						answer = num1 * num2;
						textField_2.setText(Double.toString(answer));
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Number format","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnMul.setBounds(248, 196, 89, 50);
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btnClr = new JButton("CLR");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClr.setBounds(369, 196, 89, 60);
		frmCalculator.getContentPane().add(btnClr);
		
		JButton btnDiv = new JButton("DIV(/)");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// Check the 2 text fields are empty or not 
				
				if( !(textField.getText().isEmpty() || textField_1.getText().isEmpty() ))
				{
					double num1,num2,answer;
					try 
					{
						num1 = Double.parseDouble(textField.getText());
						num2 = Double.parseDouble(textField_1.getText());
						
						answer = num1 / num2;
						textField_2.setText(Double.toString(answer));
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Number format","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDiv.setBounds(10, 275, 89, 50);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnMod = new JButton("MOD(%)");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// Check the 2 text fields are empty or not 
				
				if( !(textField.getText().isEmpty() || textField_1.getText().isEmpty() ))
				{
					double num1,num2,answer;
					try 
					{
						num1 = Double.parseDouble(textField.getText());
						num2 = Double.parseDouble(textField_1.getText());
						
						answer = num1 % num2;
						textField_2.setText(Double.toString(answer));
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Number format","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMod.setBounds(132, 275, 89, 50);
		frmCalculator.getContentPane().add(btnMod);
		
		JButton btnAvg = new JButton("AVG");
		btnAvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// Check the 2 text fields are empty or not 
				
				if( !(textField.getText().isEmpty() || textField_1.getText().isEmpty() ))
				{
					double num1,num2,answer;
					try 
					{
						num1 = Double.parseDouble(textField.getText());
						num2 = Double.parseDouble(textField_1.getText());
						
						answer = (num1 + num2) / 2.0;
						textField_2.setText(Double.toString(answer));
					}
					catch(NumberFormatException e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Number format","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnAvg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAvg.setBounds(248, 275, 89, 50);
		frmCalculator.getContentPane().add(btnAvg);
		
		JLabel lblNewLabel_1 = new JLabel("Final Answer =");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 375, 165, 30);
		frmCalculator.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(197, 363, 213, 57);
		frmCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
