package convertidor;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnsiguiente;
	private JTextField txtbnt;
	private JComboBox menuconversor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbpregunta = new JLabel("A qué moneda quiere convertir?");
		lbpregunta.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lbpregunta.setBounds(121, 53, 183, 14);
		contentPane.add(lbpregunta);
		
		JLabel lbtitulo = new JLabel("Bienvenido al convertidor de monedas");
		lbtitulo.setBounds(77, 11, 277, 21);
		lbtitulo.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		contentPane.add(lbtitulo);
		
		menuconversor = new JComboBox();
		menuconversor.setModel(new DefaultComboBoxModel(new String[] {"- Convertir de DOPESO a Dólar", "- Convertir de DOPESO a Euros", "- Convertir de DOPESO a Libras Esterlinas", "- Convertir de DOPESO a Yen Japonés", "- Convertir de DOPESO a Won sul-coreano", " - Convertir de Dólar a DOPESO", "- Convertir de Euros a DOPESO", "- Convertir de Libras Esterlinas a DOPESO", "- Convertir de Yen Japonés a DOPESO", "- Convertir de Won sul-coreano a DOPESO"}));
		menuconversor.setBounds(131, 88, 235, 22);
		contentPane.add(menuconversor);
		
		btnsiguiente = new JButton("Convertir");
		btnsiguiente.setBounds(179, 216, 89, 23);
		btnsiguiente.setFocusable(false);
		contentPane.add(btnsiguiente);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad a convertir");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblNewLabel.setBounds(121, 126, 197, 21);
		contentPane.add(lblNewLabel);
		
		txtbnt = new JTextField();
		txtbnt.setBounds(131, 158, 173, 20);
		contentPane.add(txtbnt);
		txtbnt.setColumns(10);
		btnsiguiente.addActionListener(this);
			
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnsiguiente) {
			 Convertir op = new Convertir();
			 op.Operaciones(Double.parseDouble(txtbnt.getText()), menuconversor.getSelectedItem().toString(), menuconversor);
		
		}
		
	}
	}

