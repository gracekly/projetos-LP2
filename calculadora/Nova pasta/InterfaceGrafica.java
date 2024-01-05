import java.awt.Dialog.ModalityType;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfaceGrafica extends JFrame implements ActionListener{
	private JTextField num1, num2, result;
	private JLabel plus, error;
	private JButton somar;
	
	public InterfaceGrafica() {
		super("Somar");
		initComponents();
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setSize(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void initComponents() {
		num1 = new JTextField(3);
		num2 = new JTextField(3);
		result = new JTextField(3);
		result.setEditable(false);
		
		plus = new JLabel("+");
		error = new JLabel("");
		error.setText("Insira somente valores inteiros.");
		
		somar = new JButton("=");
		somar.addActionListener(this);
		somar.setToolTipText("Clique aqui para ver o resultado.");
		
		this.add(num1);
		this.add(plus);
		this.add(num2);
		this.add(somar);
		this.add(result);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int x = Integer.parseInt(num1.getText());
			int y = Integer.parseInt(num2.getText());
			
			int resultado = x + y;
			
			result.setText(""+resultado);
		}
		catch (Exception exc) {
			JDialog janelaErro = new JDialog(this, "Erro", true);
			janelaErro.setLayout(new FlowLayout());
			janelaErro.add(error);
			janelaErro.setSize(300,100);
			janelaErro.setVisible(true);
		}
	}
	
}
