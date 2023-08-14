package convertidor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.text.DecimalFormat;


public class Convertir extends JFrame implements ActionListener {
	private static JButton btnclose;
	private static JDialog dialogo;
	static JPanel panel;
	
	private static void cuerpo (double operacion,JComboBox menuconversor,String moneda2) {
		
        JFrame ventanaPrincipal = (JFrame) SwingUtilities.getWindowAncestor(menuconversor);
        dialogo = new JDialog(ventanaPrincipal,"Resultado de conversion",true);
        dialogo.setSize(200, 150);
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10)); 
        DecimalFormat df = new DecimalFormat("#.##");
        JLabel label = new JLabel("Es igual a " + df.format(operacion)+" "+moneda2);
        label.setBounds(300, 20, 150, 30);
        btnclose = new JButton("Cerrar");
        btnclose.setBounds(179, 216, 89, 23);
        btnclose.setFocusPainted(false);
      
        panel.add(label);
        panel.add(btnclose);
        dialogo.add(panel);
        btnclose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(e.getSource() ==btnclose) {
        			dialogo.dispose();
        		}
        }});
        
        panel.add(label);
    
        panel.add(btnclose);
        dialogo.add(panel);
        
        int x = ventanaPrincipal.getX() + (ventanaPrincipal.getWidth() - dialogo.getWidth()) / 2;
        int y = ventanaPrincipal.getY() + (ventanaPrincipal.getHeight() - dialogo.getHeight()) / 2;
        dialogo.setLocation(x, y);
        dialogo.setVisible(true);
		
	}

	public static void Operaciones(double cantidad,String moneda,JComboBox menuconversor) {
		
		double operacion;
		String moneda2;
		switch (moneda) {
		case "- Convertir de DOPESO a Dólar": {
			
			operacion =cantidad / 56.90;
			cuerpo(operacion,menuconversor,moneda2="Dolar");
			
			break;
			
			
		}
		case "- Convertir de DOPESO a Euros": {
			
			operacion =cantidad / 62.39;
			cuerpo(operacion,menuconversor,moneda2="Euros");
			
			break;
			
			
		}
		case "- Convertir de DOPESO a Libras Esterlinas": {
			
			operacion =cantidad / 72.23;
			cuerpo(operacion,menuconversor,moneda2="Libras Esterlinas");
			
			break;
			
			
		}
		case "- Convertir de DOPESO a Yen Japonés": {
			
			operacion =cantidad / 0.39;
			cuerpo(operacion,menuconversor,moneda2="Yen Japones");
			
			break;
			
			
		}
		case "- Convertir de DOPESO a Won sul-coreano": {
			
			operacion =cantidad / 0.043;
			cuerpo(operacion,menuconversor,moneda2="Won sul-coreano");
			
			break;
			
			
		}
		case " - Convertir de Dólar a DOPESO": {
			
			operacion =cantidad * 56.90;
			cuerpo(operacion,menuconversor,moneda2="DOPESO");
			
			break;
			
			
		}
		case "- Convertir de Euros a DOPESO": {
			
			operacion =cantidad * 62.39;
			cuerpo(operacion,menuconversor,moneda2="DOPESO");
			
			break;
			
			
		}
		case "- Convertir de Libras Esterlinas a DOPESO": {
			
			operacion =cantidad * 72.23;
			cuerpo(operacion,menuconversor,moneda2="DOPESO");
			
			break;
			
			
		}
		case "- Convertir de Yen Japonés a DOPESO": {
			
			operacion =cantidad * 0.39;
			cuerpo(operacion,menuconversor,moneda2="DOPESO");
			
			break;
			
			
		}
		case "- Convertir de Won sul-coreano a DOPESO": {
			
			operacion =cantidad * 0.043;
			cuerpo(operacion,menuconversor,moneda2="DOPESO");
			
			break;
			
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + moneda);
		}
		
		
 	 	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	
	


}
