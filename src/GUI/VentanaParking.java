package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import contenedor.contenedorCoches;
import models.Coche;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

public class VentanaParking {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblMatricula;
	private JLabel lblHoraEntrada;
	private JLabel lblHoraSalida;
	private JLabel lblTotalAPagar;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblImporteEntregado;
	private JLabel lblCambio;
	private JLabel label_1;
	private JLabel label_2;
	private Calendar Inicio;
	private Calendar Fin;
	private float cajaTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaParking window = new VentanaParking();
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
	public VentanaParking() {
		
		componentsInitializers();
		componentsAdders();
		componentsProperties();
		componentsListeners();
		
		
	}
	/**
	 * COntiene los listeners de lso componentes
	 */
	private void componentsListeners(){
		
		//Boton Entrada vehiculo
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				try {
					obtenerDatos();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ya existe", "Ya existe", JOptionPane.ERROR_MESSAGE);
				}
				
				habilitarCampos(false);
				
			}
		});
		
		//Boton pagar y salida
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				try {
					habilitarCampos(true);
					cargarDatosCoche(textField.getText());
				} catch (Exception e) {
					
				}
					
			}
		});
		
		//Boton mostrar total
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Total: " + cajaTotal+"€", "TOTAL", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		
	}
	/**
	 * Inicializa los componentes
	 */
	private void componentsInitializers(){
		frame = new JFrame();
		textField = new JTextField();
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		btnNewButton = new JButton("Entrada Vehiculo");
		btnNewButton_1 = new JButton("Pago y Salida");
		btnNewButton_2 = new JButton("Caja del dia");
		lblMatricula = new JLabel("Matricula:");
		lblHoraEntrada = new JLabel("Hora Entrada:");
		lblHoraEntrada.setEnabled(false);
		lblHoraSalida = new JLabel("Hora Salida:");
		lblHoraSalida.setEnabled(false);
		lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setEnabled(false);
		lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		label = new JLabel("\u20AC");
		label.setEnabled(false);
		lblImporteEntregado = new JLabel("Importe Entregado:");
		lblImporteEntregado.setEnabled(false);
		lblCambio = new JLabel("Cambio:");
		lblCambio.setEnabled(false);
		label_1 = new JLabel("");
		label_1.setEnabled(false);
		label_2 = new JLabel("\u20AC");
		label_2.setEnabled(false);
		
	}
	/**
	 * Añade los componentes al frame
	 */
	private void componentsAdders(){
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton_2);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(lblMatricula);
		frame.getContentPane().add(lblHoraEntrada);
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(lblHoraSalida);
		frame.getContentPane().add(textField_2);
		frame.getContentPane().add(lblTotalAPagar);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(label);
		frame.getContentPane().add(lblImporteEntregado);
		frame.getContentPane().add(textField_3);
		frame.getContentPane().add(lblCambio);
		frame.getContentPane().add(label_1);
		frame.getContentPane().add(label_2);
	}
	/**
	 * define las propiedades de los ocmponentes
	 */
	private void componentsProperties() {
		
		frame.setBounds(100, 100, 568, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		btnNewButton.setBounds(0, 0, 170, 58);
		
		btnNewButton_1.setBounds(190, 0, 175, 58);
		
		btnNewButton_2.setBounds(376, 0, 176, 58);
		
		textField.setToolTipText("");
		textField.setBounds(20, 92, 280, 40);
		
		textField.setColumns(10);
		
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMatricula.setBounds(20, 69, 142, 26);
		
		lblHoraEntrada.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHoraEntrada.setBounds(20, 134, 142, 26);
		
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(20, 158, 280, 40);
		
		lblHoraSalida.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHoraSalida.setBounds(20, 196, 142, 26);
		
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		textField_2.setBounds(20, 223, 280, 40);
		
		lblTotalAPagar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotalAPagar.setBounds(357, 79, 162, 56);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(411, 133, 62, 27);
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(473, 133, 22, 26);
		
		lblImporteEntregado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblImporteEntregado.setBounds(357, 196, 162, 26);
		
		textField_3.setToolTipText("");
		textField_3.setColumns(10);
		textField_3.setBounds(357, 223, 150, 40);
		
		lblCambio.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCambio.setBounds(357, 274, 86, 26);
		
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(357, 311, 86, 27);
		
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(449, 312, 46, 26);
		
		
	}

//-------------------------------------------------------------------------------------
	/**
	 * Coge los datos del cuadro trexto e inicializa el contador
	 * @throws Exception
	 */
	private void obtenerDatos() throws Exception{
		
		if(contenedorCoches.getContenedorCoches().getListaCoches().contains(textField.getText())){
			throw new Exception("[ERROR].-Ya ha entrado ese coche.");
		}
		contenedorCoches.getContenedorCoches().aniadirCoche(new Coche(textField.getText(), capturarTiempo()));
		
	}
	/**
	 * Captura el tiempo actual
	 * @return
	 */
	private String capturarTiempo(){
		
		Inicio = Calendar.getInstance();
		
		String hora = Inicio.get(Calendar.HOUR_OF_DAY) + ":"
		+ Inicio.get(Calendar.MINUTE) + ":" + Inicio.get(Calendar.SECOND);
		
		return hora;
		
	}
	/**
	 * Coge los ddatos
	 * @param matri
	 * @throws Exception
	 */
	private void cargarDatosCoche(String matri) throws Exception{
		
		Coche car = null;
		
		for(Coche aux : contenedorCoches.getContenedorCoches().getListaCoches()){
			if(aux.getMatricula().equals(matri)){
				car = aux;
			}
			
		}
		
		rellenaCampos(car);
		
	}
	/**
	 * 	Inserta los datos ocrrespondientes a la matricula en los campos
	 * @param car
	 */
	private void rellenaCampos(Coche car){
		
		Fin = Calendar.getInstance();
		Calendar aux = Calendar.getInstance();
		float total = 0.0f;
		
		String horaFin = (Fin.get(Calendar.HOUR_OF_DAY) + ":" + Fin.get(Calendar.MINUTE) + ":"
				+ Fin.get(Calendar.SECOND));
		
		
		textField.setText(car.getMatricula());
		textField_1.setText(car.getFechaInicio());
		textField_2.setText(horaFin);

		float diferencia = (Fin.getTimeInMillis() - Inicio.getTimeInMillis());
		
		total = calcularTotal(diferencia);
		
		lblNewLabel.setText(String.valueOf(total)); 
		
		
		label_1.setText(String.valueOf(calcularCambio(total))); 
		
		cajaTotal += total;
		
	}
	/**
	 * Calcula el total
	 * @param dif el tiempo que ha estado
	 * @return float del tiempo
	 */
	private float calcularTotal(float dif){
		float diferen = dif/1000/60;
		float total = 0.0f;
		
		if(diferen < 30){
			total += 30 * 0.06f;
			diferen -= 30;
		}
		if(diferen < 60){
			total += 29 * 0.01;
			diferen -= 29;
		}
		if(diferen <= 720){
			total += 659 * 0.03;
			diferen -= 720;
		}
		if(diferen > 720){
			total += (diferen - 720) *0.15;
		}
		
		return total;
		
	}
	/**
	 * calcula cuanto cambio de tiene que dr
	 * @param total lo que ha costado en total
	 * @return devuleve el cambio
	 */
	private float calcularCambio(float total){
		float cambio = 0.0f;
		
		float pagado = Float.parseFloat(textField_3.getText());
		
		cambio = pagado - total;
		
		return cambio; 
		
		
	}
	/**
	 * habilita los campos inicialmente bloqueados
	 * @param b
	 */
	private void habilitarCampos(boolean b){
		lblTotalAPagar.setEnabled(b);
		lblNewLabel.setEnabled(b);
		lblCambio.setEnabled(b);
		lblImporteEntregado.setEnabled(b);
		label_1.setEnabled(b);
		label.setEnabled(b);
		label_2.setEnabled(b);
		textField_3.setEnabled(b);
		
		
	}
	
}



















