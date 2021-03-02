import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Cursor;

public class NewShopkeeperSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField shopkeeper_name;
	private JTextField shopkeeper_phone;
	private JTextField shopkeeper_email;
	private JTextField shopkeeper_shop_name;
	private JTextField shopkeeper_shop_address;
	private JPasswordField shopkeeper_password;
	private JPasswordField shopkeeper_confirm_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewShopkeeperSignUp frame = new NewShopkeeperSignUp();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewShopkeeperSignUp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setBounds(53, 95, 45, 21);
		txtrName.setEditable(false);
		txtrName.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrName.setBackground(Color.LIGHT_GRAY);
		txtrName.setText("Name");
		contentPane.add(txtrName);
		
		JTextArea txtrPhoneNo = new JTextArea();
		txtrPhoneNo.setBounds(53, 140, 77, 22);
		txtrPhoneNo.setEditable(false);
		txtrPhoneNo.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrPhoneNo.setBackground(Color.LIGHT_GRAY);
		txtrPhoneNo.setText("Phone No.");
		contentPane.add(txtrPhoneNo);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setBounds(53, 185, 45, 21);
		txtrEmail.setEditable(false);
		txtrEmail.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrEmail.setBackground(Color.LIGHT_GRAY);
		txtrEmail.setText("Email");
		contentPane.add(txtrEmail);
		
		JTextArea txtrSetPassword = new JTextArea();
		txtrSetPassword.setBounds(53, 230, 96, 22);
		txtrSetPassword.setEditable(false);
		txtrSetPassword.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrSetPassword.setBackground(Color.LIGHT_GRAY);
		txtrSetPassword.setText("Set Password");
		contentPane.add(txtrSetPassword);
		
		JTextArea txtrShopName = new JTextArea();
		txtrShopName.setBounds(53, 320, 86, 22);
		txtrShopName.setEditable(false);
		txtrShopName.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrShopName.setBackground(Color.LIGHT_GRAY);
		txtrShopName.setText("Shop name");
		contentPane.add(txtrShopName);
		
		JTextArea txtrAddress = new JTextArea();
		txtrAddress.setBounds(53, 365, 133, 22);
		txtrAddress.setEditable(false);
		txtrAddress.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrAddress.setBackground(Color.LIGHT_GRAY);
		txtrAddress.setText("Shop Address");
		contentPane.add(txtrAddress);
		
		JTextArea txtrDistanceFromUpes = new JTextArea();
		txtrDistanceFromUpes.setBounds(53, 275, 133, 22);
		txtrDistanceFromUpes.setEditable(false);
		txtrDistanceFromUpes.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrDistanceFromUpes.setBackground(Color.LIGHT_GRAY);
		txtrDistanceFromUpes.setText("Confirm Password");
		contentPane.add(txtrDistanceFromUpes);
		
		shopkeeper_name = new JTextField();
		shopkeeper_name.setAutoscrolls(false);
		shopkeeper_name.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		shopkeeper_name.setBounds(215, 90, 179, 21);
		shopkeeper_name.setFont(new Font("Calibri", Font.PLAIN, 14));
		contentPane.add(shopkeeper_name);
		shopkeeper_name.setColumns(10);
		
		shopkeeper_phone = new JTextField();
		shopkeeper_phone.setFont(new Font("Calibri", Font.PLAIN, 14));
		shopkeeper_phone.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		shopkeeper_phone.setBounds(215, 135, 179, 22);
		shopkeeper_phone.setColumns(10);
		contentPane.add(shopkeeper_phone);
		
		shopkeeper_email = new JTextField();
		shopkeeper_email.setFont(new Font("Calibri", Font.PLAIN, 14));
		shopkeeper_email.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		shopkeeper_email.setBounds(215, 180, 179, 21);
		shopkeeper_email.setColumns(10);
		contentPane.add(shopkeeper_email);
		
		shopkeeper_shop_name = new JTextField();
		shopkeeper_shop_name.setFont(new Font("Calibri", Font.PLAIN, 14));
		shopkeeper_shop_name.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		shopkeeper_shop_name.setBounds(215, 315, 179, 22);
		shopkeeper_shop_name.setColumns(10);
		contentPane.add(shopkeeper_shop_name);
		
		shopkeeper_shop_address = new JTextField();
		shopkeeper_shop_address.setFont(new Font("Calibri", Font.PLAIN, 14));
		shopkeeper_shop_address.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		shopkeeper_shop_address.setBounds(215, 360, 179, 22);
		shopkeeper_shop_address.setColumns(10);
		contentPane.add(shopkeeper_shop_address);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(435, 340, 190, 40);
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent arg0) 
			{
				String shopkeeperName = shopkeeper_name.getText();
                String shopkeeperPhone = shopkeeper_phone.getText();
                String shopkeeperEmail = shopkeeper_email.getText();
                String shopkeeperPswd = shopkeeper_password.getText();
                String shopkeeperConfirmpswd = shopkeeper_confirm_password.getText();
                String shopkeeperShopName = shopkeeper_shop_name.getText();
                String shopkeeperShopAddress = shopkeeper_shop_address.getText();
                int len = shopkeeperPhone.length();

                String msg = "" + shopkeeperName;
                msg += " \n";
                if (len != 10) 
                {
                    JOptionPane.showMessageDialog(null, "Enter a valid mobile number !");
                }
                
                else if(shopkeeperName.length()==0||shopkeeperPhone.length()==0||shopkeeperEmail.length()==0||shopkeeperPswd.length()==0||shopkeeperConfirmpswd.length()==0||shopkeeperShopName.length()==0||shopkeeperShopAddress.length()==0) 
                {
                    JOptionPane.showMessageDialog(null, "Please fill out all the fields.");
                }
                
                else if (shopkeeperPswd.compareTo(shopkeeperConfirmpswd)!=0) 
                {
                    JOptionPane.showMessageDialog(null, "Password did not match with the confirmed password !");
                }

                else
                {
                	try 
                    {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aamdani", "root", "root");
                        
                        String query1 = "SELECT * FROM shopkeeper_sign_up where shopkeeper_email ='" + shopkeeperEmail + "'";
                        String query3 = "SELECT * FROM student_sign_up where student_email ='" + shopkeeperEmail + "'";

                        String query2 = "INSERT INTO shopkeeper_sign_up values('" + shopkeeperName + "','" + shopkeeperPhone + "','" + shopkeeperEmail + "','" +
                        		shopkeeperPswd + "','" + shopkeeperConfirmpswd + "','" + shopkeeperShopName + "','" + shopkeeperShopAddress + "')";

                        Statement sta = connection.createStatement();
                        Statement sta2 = connection.createStatement();
                        
                        ResultSet rs = sta.executeQuery(query1);
                        ResultSet rs1 = sta2.executeQuery(query3);
                        
                        if(rs.next()==false&&rs1.next()==false)
                        {
                        	int x = sta.executeUpdate(query2);
                            if (x != 0) 
                            {
                            	JOptionPane.showMessageDialog(null,"Welcome, " + msg + "Your account is sucessfully created");
                                connection.close();
                            }
                        }
                        else
                        {
                        	JOptionPane.showMessageDialog(null, "This email already exists !");
                        }
                        
                    }
                    catch (Exception exception) 
                    {
                        exception.printStackTrace();
                    }
    				
    				dispose();
    				PostJobButtonClicked pjbc = new PostJobButtonClicked();
    				pjbc.setVisible(true);
                }
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(btnNewButton);
		
		JTextArea txtrCreateAccount = new JTextArea();
		txtrCreateAccount.setBounds(49, 33, 233, 31);
		txtrCreateAccount.setEditable(false);
		txtrCreateAccount.setFont(new Font("Calibri", Font.BOLD, 30));
		txtrCreateAccount.setBackground(Color.LIGHT_GRAY);
		txtrCreateAccount.setText("CREATE ACCOUNT");
		contentPane.add(txtrCreateAccount);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(430, 95, 195, 200);
		Image img = new ImageIcon(this.getClass().getResource("/NewUserIcon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel);
		
		shopkeeper_password = new JPasswordField();
		shopkeeper_password.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		shopkeeper_password.setFont(new Font("Calibri", Font.PLAIN, 14));
		shopkeeper_password.setBounds(215, 225, 179, 21);
		contentPane.add(shopkeeper_password);
		
		shopkeeper_confirm_password = new JPasswordField();
		shopkeeper_confirm_password.setFont(new Font("Calibri", Font.PLAIN, 14));
		shopkeeper_confirm_password.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		shopkeeper_confirm_password.setBounds(215, 270, 179, 21);
		contentPane.add(shopkeeper_confirm_password);
	}
}
