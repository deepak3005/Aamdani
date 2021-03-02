import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import java.awt.Cursor;

public class NewStudentSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField student_name;
	private JTextField student_phone;
	private JTextField student_email;
	private JTextField student_specialization;
	private JPasswordField student_password;
	private JPasswordField student_confirm_password;
	private JTextField student_year;
	private JTextField student_sapid;
	private JComboBox student_degree;
	private JComboBox student_course;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewStudentSignUp frame = new NewStudentSignUp();
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
	public NewStudentSignUp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setBounds(60, 85, 59, 21);
		txtrName.setEditable(false);
		txtrName.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrName.setBackground(Color.LIGHT_GRAY);
		txtrName.setText("Name");
		contentPane.add(txtrName);
		
		JTextArea txtrPhoneNo = new JTextArea();
		txtrPhoneNo.setBounds(60, 120, 86, 22);
		txtrPhoneNo.setEditable(false);
		txtrPhoneNo.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrPhoneNo.setBackground(Color.LIGHT_GRAY);
		txtrPhoneNo.setText("Phone No.");
		contentPane.add(txtrPhoneNo);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setBounds(60, 155, 59, 21);
		txtrEmail.setEditable(false);
		txtrEmail.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrEmail.setBackground(Color.LIGHT_GRAY);
		txtrEmail.setText("Email");
		contentPane.add(txtrEmail);
		
		JTextArea txtrSetPassword = new JTextArea();
		txtrSetPassword.setBounds(60, 190, 96, 22);
		txtrSetPassword.setEditable(false);
		txtrSetPassword.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrSetPassword.setBackground(Color.LIGHT_GRAY);
		txtrSetPassword.setText("Set Password");
		contentPane.add(txtrSetPassword);
		
		JTextArea txtrShopName = new JTextArea();
		txtrShopName.setBounds(60, 365, 86, 22);
		txtrShopName.setEditable(false);
		txtrShopName.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrShopName.setBackground(Color.LIGHT_GRAY);
		txtrShopName.setText("SAP ID");
		contentPane.add(txtrShopName);
		
		JTextArea txtrAddress = new JTextArea();
		txtrAddress.setBounds(60, 260, 59, 22);
		txtrAddress.setEditable(false);
		txtrAddress.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrAddress.setBackground(Color.LIGHT_GRAY);
		txtrAddress.setText("Course");
		contentPane.add(txtrAddress);
		
		JTextArea txtrDistanceFromUpes = new JTextArea();
		txtrDistanceFromUpes.setBounds(60, 225, 133, 22);
		txtrDistanceFromUpes.setEditable(false);
		txtrDistanceFromUpes.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrDistanceFromUpes.setBackground(Color.LIGHT_GRAY);
		txtrDistanceFromUpes.setText("Confirm Password");
		contentPane.add(txtrDistanceFromUpes);
		
		student_name = new JTextField();
		student_name.setAutoscrolls(false);
		student_name.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_name.setBounds(235, 80, 184, 21);
		student_name.setFont(new Font("Calibri", Font.PLAIN, 14));
		contentPane.add(student_name);
		student_name.setColumns(10);
		
		student_phone = new JTextField();
		student_phone.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_phone.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_phone.setBounds(235, 115, 184, 22);
		student_phone.setColumns(10);
		contentPane.add(student_phone);
		
		student_email = new JTextField();
		student_email.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_email.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_email.setBounds(235, 150, 184, 21);
		student_email.setColumns(10);
		contentPane.add(student_email);
		
		student_specialization = new JTextField();
		student_specialization.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_specialization.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_specialization.setBounds(235, 290, 184, 22);
		student_specialization.setColumns(10);
		contentPane.add(student_specialization);
	  
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(475, 255, 126, 40);
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent arg0) 
			{
				String stuName = student_name.getText();
                String stuPhone = student_phone.getText();
                String stuEmail = student_email.getText();
                String stuPswd = student_password.getText();
                String stuConfirmpswd = student_confirm_password.getText();
                String stuDegree = (String)student_degree.getSelectedItem();
                String stuCourse = (String)student_course.getSelectedItem();
                String stuSpecialization = student_specialization.getText();
                String stuYear = student_year.getText();
                String stuSapid = student_sapid.getText();
                int len = stuPhone.length();

                String msg = "" + stuName;
                msg += " \n";
                if (len != 10) 
                {
                    JOptionPane.showMessageDialog(null, "Enter a valid mobile number");
                }
                
                else if (stuName.length()==0||stuPhone.length()==0||stuEmail.length()==0||stuPswd.length()==0||stuConfirmpswd.length()==0||stuDegree.length()==0||stuCourse.length()==0||stuYear.length()==0||stuSapid.length()==0) 
                {
                    JOptionPane.showMessageDialog(null, "Please fill out all the fields.");
                }
                
                else if (stuPswd.compareTo(stuConfirmpswd)!=0) 
                {
                    JOptionPane.showMessageDialog(null, "Password did not match with the confirmed password !");
                }

                else
                {
                	try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aamdani", "root", "root");

                        String query1 = "SELECT * FROM student_sign_up where student_email ='" + stuEmail + "'";
                        String query3 = "SELECT * FROM shopkeeper_sign_up where shopkeeper_email ='" + stuEmail + "'";
                        
                        String query2 = "INSERT INTO Student_Sign_Up values('" + stuName + "','" + stuPhone + "','" + stuEmail + "','" +
                        		stuPswd + "','" + stuConfirmpswd + "','" + stuSpecialization + "','" + stuYear + "','" + stuSapid + "','" + stuDegree + "','" + stuCourse + "')";

                        Statement sta = connection.createStatement();
                        Statement sta2 = connection.createStatement();
                        
                        ResultSet rs = sta.executeQuery(query1);
                        ResultSet rs2 = sta2.executeQuery(query3);
                        
                        if(rs.next()==false&&rs2.next()==false)
                        {
                        	int x = sta.executeUpdate(query2);
                            if (x != 0) 
                            {
                            	JOptionPane.showMessageDialog(null,"Welcome, " + msg + "Your account is sucessfully created.");
                                connection.close();
                            } 
                        }
                        else
                        {
                        	JOptionPane.showMessageDialog(null, "This email already exists !");
                        }
                        
                    }
                        catch (Exception exception) {
                        exception.printStackTrace();
                    }
             
    				dispose();
    				FindJobButtonClicked pjbc = new FindJobButtonClicked();
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
		txtrCreateAccount.setBounds(57, 25, 233, 31);
		txtrCreateAccount.setEditable(false);
		txtrCreateAccount.setFont(new Font("Calibri", Font.BOLD, 30));
		txtrCreateAccount.setBackground(Color.LIGHT_GRAY);
		txtrCreateAccount.setText("CREATE ACCOUNT");
		contentPane.add(txtrCreateAccount);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(475, 119, 133, 128);
		Image img = new ImageIcon(this.getClass().getResource("/New-Student-Medium.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel);
		
		student_password = new JPasswordField();
		student_password.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_password.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_password.setBounds(235, 185, 184, 21);
		contentPane.add(student_password);
		
		student_confirm_password = new JPasswordField();
		student_confirm_password.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_confirm_password.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_confirm_password.setBounds(235, 220, 184, 21);
		contentPane.add(student_confirm_password);
		
		student_degree = new JComboBox();
		student_degree.setName("");
		student_degree.setMaximumRowCount(10);
		student_degree.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_degree.setModel(new DefaultComboBoxModel(new String[] {"B.Tech", "M.Tech", "BBA", "MBA", "BCA", "MCA", "B.SC", "M.SC", "B.DES", "M.DES", "LL.B", "LLM", "BA", "MA", "B.COM", "B.Pharma", "BJMC"}));
		student_degree.setBounds(235, 255, 67, 21);
		contentPane.add(student_degree);
		
		JTextArea txtrYearOfStudy = new JTextArea();
		txtrYearOfStudy.setText("Year of study");
		txtrYearOfStudy.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrYearOfStudy.setEditable(false);
		txtrYearOfStudy.setBackground(Color.LIGHT_GRAY);
		txtrYearOfStudy.setBounds(60, 330, 96, 22);
		contentPane.add(txtrYearOfStudy);
		
		student_year = new JTextField();
		student_year.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_year.setColumns(10);
		student_year.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_year.setBounds(235, 325, 184, 22);
		contentPane.add(student_year);
		
		student_course = new JComboBox();
		student_course.setModel(new DefaultComboBoxModel(new String[] {"CSE", "Chemical", "Design", "Upstream"}));
		student_course.setName("");
		student_course.setMaximumRowCount(10);
		student_course.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_course.setBounds(312, 255, 107, 21);
		contentPane.add(student_course);
		
		JTextArea txtrSpecialization = new JTextArea();
		txtrSpecialization.setText("Specialization (if any)");
		txtrSpecialization.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrSpecialization.setEditable(false);
		txtrSpecialization.setBackground(Color.LIGHT_GRAY);
		txtrSpecialization.setBounds(60, 295, 151, 22);
		contentPane.add(txtrSpecialization);
		
		student_sapid = new JTextField();
		student_sapid.setFont(new Font("Calibri", Font.PLAIN, 14));
		student_sapid.setColumns(10);
		student_sapid.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		student_sapid.setBounds(235, 360, 184, 22);
		contentPane.add(student_sapid);
	}
}
