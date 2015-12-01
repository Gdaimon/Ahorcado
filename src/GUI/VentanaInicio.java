package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;

import modelo.Ciencia;
import modelo.Deportes;
import modelo.Entretenimiento;
import modelo.Geografia;
import modelo.Historia;
import modelo.Idiomas;
import modelo.Juego;
import modelo.Jugador1; 
import modelo.Palabras;

public class VentanaInicio extends JFrame {

	private JPanel 		panelPrincipal;
	private JTextField 	textFieldLetra;
	public  JLabel      lblPalabra,  lblLabelAhorcado, lblAyudaText,lblLabel_Puntos_Acumulados;
	
	public  JButton 	botonPulsado, botonAhorcado, btnButtonAhocado;	
	public  JButton     btnButton_a, btnButton_b,btnButton_c,btnButton_d,btnButton_e,btnButton_f,btnButton_g, 
						btnButton_h, btnButton_i,btnButton_j,btnButton_k,btnButton_l,btnButton_m,btnButton_ñ, 
						btnButton_o, btnButton_p,btnButton_q,btnButton_r,btnButton_s,btnButton_t,btnButton_u, 
						btnButton_v, btnButton_w,btnButton_x,btnButton_y,btnButton_z,btnButton_n; 
	public  JList 		list;
	public  String[] 	values;
	
	public JPanel 		panel_Centro, panel_Centro_Teclado, panel_Centro1_Ahorcado, panel_Centro_Tema_1, panel_Centro_Tema_2;
	private JTextField 	textFieldNombre;
	private JTextField 	textField_tema; 
	
    public static final String ADMINISTRADOR = "ADMINISTRADOR"; 
    
    public Juego 		juego;
    public String 		ayuda1, ayuda2, ayuda3, ayuda4;
    public ImageIcon 	imagen;
    public String 		nombrePalabra = " ";
    public String       pEnJuego;
    public String       nivel;
    public int   	    contadorAyuda;
    public Jugador1     jugador;
 // public LinkedList<Jugador1> listaJugadores;
    
	/**
	 * Create the frame.
	 */
	public VentanaInicio() 
	{ 
		juego 		   = new Juego();
		imagen 		   = new ImageIcon();
//		listaJugadores = new LinkedList<Jugador1>();
		jugador        = new Jugador1();
		jugador  	   = juego.buscarJugador("nn");
 		contadorAyuda  = 1;
 		pEnJuego       = null;
		
		//Construccion de panels
		setTitle("El Ahorcado");
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 396);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(panelPrincipal);
		
		//Construccion paneles del Norte
		JPanel panelNorte = new JPanel();
		panelPrincipal.add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_Norte1 = new JPanel();
		panelNorte.add(panel_Norte1);
		panel_Norte1.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_Norte1_1 = new JPanel();
		panel_Norte1_1.setBackground(Color.GREEN);
		panel_Norte1.add(panel_Norte1_1);
		panel_Norte1_1.setLayout(new GridLayout(1, 2, 0, 0));
		panel_Norte1_1.setBorder(new LineBorder(new Color(192, 192, 192), 2)); 
		
		lblPalabra = new JLabel("");
		lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabra.setFont(new Font("Arial Unicode MS", Font.BOLD, 21));
		lblPalabra.setForeground(Color.BLUE);
		lblPalabra.setBackground(Color.GREEN);
		panel_Norte1_1.add(lblPalabra);
		
		JPanel panel_Norte1_2 = new JPanel();
		panel_Norte1_2.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		panel_Norte1.add(panel_Norte1_2);
		panel_Norte1_2.setLayout(new GridLayout(1, 2, 0, 0)); 
		
		JPanel panel_Norte2 = new JPanel();
		panel_Norte2.setForeground(new Color(0, 0, 255));
		panelNorte.add(panel_Norte2);
		panel_Norte2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_Norte2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY)); 
		
		//Construccion de paneles del sur
		JPanel panel_Sur = new JPanel();
		panelPrincipal.add(panel_Sur, BorderLayout.SOUTH);
		panel_Sur.setLayout(new GridLayout(2, 1, 1, 1));
		
		JPanel panel_Sur1 = new JPanel();
		panel_Sur.add(panel_Sur1);
		
		JPanel panel_Sur2 = new JPanel();
		panel_Sur.add(panel_Sur2);
		
		//Construcción de paneles de Este
		JPanel panel_Este = new JPanel();
		panelPrincipal.add(panel_Este, BorderLayout.WEST);
		panel_Este.setLayout(new GridLayout(3, 1, 0, 0));
		
		//Construcción de paneles del Oeste
		JPanel panel_Oeste = new JPanel();
		panelPrincipal.add(panel_Oeste, BorderLayout.EAST);
		panel_Oeste.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_Oeste1 = new JPanel();
		panel_Oeste.add(panel_Oeste1);
		panel_Oeste1.setLayout(new GridLayout(3, 1, 1, 1));
		
		JPanel panel_Oeste2 = new Imagenes(1);
		panel_Oeste.add(panel_Oeste2);
		panel_Oeste2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_Oeste2_1 = new JPanel();
		panel_Oeste2.add(panel_Oeste2_1);
		
		JPanel panel_Oeste2_2 = new Imagenes(1);
		panel_Oeste2_2.setBorder(new LineBorder(Color.BLUE));
		panel_Oeste2.add(panel_Oeste2_2);
		
		//Construcción de paneles del Centro
		panel_Centro = new JPanel();
		panelPrincipal.add(panel_Centro, BorderLayout.CENTER);
		panel_Centro.setLayout(new GridLayout(1, 2, 0, 0));
		
		panel_Centro1_Ahorcado = new Imagenes(2);
		panel_Centro1_Ahorcado.setBorder(new LineBorder(Color.YELLOW, 2, true));
		panel_Centro1_Ahorcado.setBackground(Color.YELLOW);
//		panel_6.setBorder(BorderFactory.createLineBorder(Color.black)); 
		panel_Centro1_Ahorcado.setToolTipText("");
		panel_Centro.add(panel_Centro1_Ahorcado);
		panel_Centro1_Ahorcado.setLayout(new GridLayout(1, 1, 0, 0)); 		
		
		panel_Centro_Teclado = new JPanel();
		panel_Centro_Teclado.setBackground(Color.YELLOW);
		panel_Centro_Teclado.setBorder(new LineBorder(Color.YELLOW, 2, true));
		panel_Centro.add(panel_Centro_Teclado);
		panel_Centro_Teclado.setLayout(new GridLayout(6, 6, 1, 1));
//		panel_5.setBorder(BorderFactory.createLineBorder(Color.black)); 
		
		panel_Centro_Tema_1 = new JPanel();
		panel_Centro_Tema_1.setBorder(new LineBorder(Color.GREEN, 2, true));
		panel_Centro_Tema_1.setBackground(Color.YELLOW);
//		panel_Centro.add(panel_Centro_Tema_1);
		panel_Centro_Tema_1.setLayout(new BorderLayout(0, 0));
		
		panel_Centro_Tema_2 = new JPanel();
		panel_Centro_Tema_1.add(panel_Centro_Tema_2, BorderLayout.SOUTH);
		panel_Centro_Tema_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		//Array para el JList de TEMAS
		values = new String[] {"Entretenimiento", "Deportes", "Ciencia", "Historia", "Geografia", "Idiomas", "Generico"};
		
		
		//Construcción de JLabels
		JLabel lblLabel_Titulo_Letra = new JLabel("Letra  ");
		lblLabel_Titulo_Letra.setHorizontalAlignment(SwingConstants.RIGHT); 
		
		JLabel lblAyuda = new JLabel("Ayuda:");
		lblAyuda.setForeground(Color.BLUE);		
		
	    lblAyudaText = new JLabel("");
		lblAyudaText.setBackground(Color.BLUE);		
		
		JLabel lblNewLabel_Titulo_Nombre_Judagor = new JLabel("Nombre");		
		
		JLabel lblLabel_Titulo_Lista_Tema = new JLabel("Seleccione el tema");
		lblLabel_Titulo_Lista_Tema.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLabel_Titulo_Lista_Tema.setForeground(Color.RED);
		lblLabel_Titulo_Lista_Tema.setBackground(Color.BLUE); 
		
		final JLabel lblLabel_tema = new JLabel();		 
		
		lblLabel_tema.setBackground(Color.YELLOW);
		lblLabel_tema.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLabel_tema.setForeground(Color.RED); 
		
		JLabel lblLabel_Titulo_Nivel = new JLabel("Nivel");
		
//		lblLabelAhorcado = new JLabel("");
//		lblLabelAhorcado.setEnabled(true);
		
		
		//Construcción de JTextFields
		textFieldLetra = new JTextField();
		textFieldLetra.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldLetra.setFont(new Font("Arial", Font.BOLD, 14));
		textFieldLetra.setForeground(Color.BLACK);		 
		
		textFieldLetra.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setEnabled(true);
		textFieldNombre.setEditable(false);
		textFieldNombre.setText("");		
		textFieldNombre.setColumns(10);
		
		final JButton btnButton_OK = new JButton("OK");
		btnButton_OK.setVisible(false); 
		
		
		
		JLabel lblTemaSeleccionado = new JLabel("Tema seleccionado"); 
		
		textField_tema = new JTextField();
		textField_tema.setEditable(false);		
		textField_tema.setColumns(10);  
		
		//Construcción de JButtons
		JButton btnButton_Nombre = new JButton("Ingresar Nombre");
		
		
		btnButton_Nombre.setForeground(Color.BLUE);
		btnButton_Nombre.setBackground(Color.green);
		
		JButton btnCargar = new JButton("Seleccionar Tema");
		
		btnCargar.setForeground(Color.BLUE);
		btnCargar.setBackground(Color.green);
		
		JButton btnButton_Reiniciar = new JButton("Reiniciar");
		btnButton_Reiniciar.setBackground(Color.LIGHT_GRAY);
		
		JButton btnButton_Salir = new JButton("Salir");
		btnButton_Salir.setBackground(Color.LIGHT_GRAY);
		
		btnButton_a = new JButton("a");
		btnButton_a.setBackground(Color.CYAN); 
		
		btnButton_c = new JButton("c");
		btnButton_c.setBackground(Color.CYAN);
		
		btnButton_d = new JButton("d");
		btnButton_d.setBackground(Color.CYAN);
		
		btnButton_e = new JButton("e");
		btnButton_e.setBackground(Color.CYAN);
		
		btnButton_f = new JButton("f");
		btnButton_f.setBackground(Color.CYAN);
		
		btnButton_g = new JButton("g");
		btnButton_g.setBackground(Color.CYAN);
		
		btnButton_h = new JButton("h");
		btnButton_h.setBackground(Color.CYAN);
		
		btnButton_b = new JButton("b");
		btnButton_b.setBackground(Color.CYAN);
		
		btnButton_i = new JButton("i");
		btnButton_i.setBackground(Color.CYAN);
		
		btnButton_j = new JButton("j");
		btnButton_j.setBackground(Color.CYAN);
		
		btnButton_k = new JButton("k");
		btnButton_k.setBackground(Color.CYAN);		
		
		btnButton_l = new JButton("l");
		btnButton_l.setBackground(Color.CYAN);		
		
		btnButton_m = new JButton("m");
		btnButton_m.setBackground(Color.CYAN);
		
		btnButton_n = new JButton("n");
		btnButton_n.setBackground(Color.CYAN);
		
		btnButton_o = new JButton("o");
		btnButton_o.setBackground(Color.CYAN);
		
		btnButton_ñ = new JButton("\u00F1");
		btnButton_ñ.setBackground(Color.CYAN);
		
		btnButton_p = new JButton("p");
		btnButton_p.setBackground(Color.CYAN);
		
		btnButton_q = new JButton("q");
		btnButton_q.setBackground(Color.CYAN);
		
		btnButton_r = new JButton("r");
		btnButton_r.setBackground(Color.CYAN);
		
		btnButton_s = new JButton("s");
		btnButton_s.setBackground(Color.CYAN);
		
		btnButton_t = new JButton("t");
		btnButton_t.setBackground(Color.CYAN);
		
		btnButton_u = new JButton("u");
		btnButton_u.setBackground(Color.CYAN);
		
		btnButton_v = new JButton("v");
		btnButton_v.setBackground(Color.CYAN);
		
		btnButton_w = new JButton("w");
		btnButton_w.setBackground(Color.CYAN);
		
		btnButton_x = new JButton("x");
		btnButton_x.setBackground(Color.CYAN);
		
		btnButton_y = new JButton("y");
		btnButton_y.setBackground(Color.CYAN);
		
		btnButton_z = new JButton("z");
		btnButton_z.setBackground(Color.CYAN);		
		
		final JButton btnButton_Ayuda = new JButton("Ayuda");
		
		btnButton_Ayuda.setBackground(Color.LIGHT_GRAY);
		
		final JButton btnButton_Aceptar = new JButton("Aceptar");
		btnButton_Aceptar.setBackground(Color.LIGHT_GRAY);
		
		final JButton btnButton_Cancelar = new JButton("Cancelar");
		btnButton_Cancelar.setBackground(Color.LIGHT_GRAY);
		
		JButton btnButtonListaAceptar = new JButton("Aceptar");
		
		JButton btnButton_Play = new JButton("Play");
		btnButton_Play.setBackground(Color.LIGHT_GRAY);  
		
		btnButtonAhocado = new JButton("");
		btnButtonAhocado.setBackground(Color.GREEN); 
		
		//Construcción de JComboBox
		final JComboBox comboBox_Nivel = new JComboBox();
		
		comboBox_Nivel.setForeground(Color.BLUE);
		comboBox_Nivel.setToolTipText("Nivel");
		comboBox_Nivel.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		
		JLabel lblLabel_Titulo_Puntos = new JLabel("Puntos acumulados:"); 
		
		lblLabel_Puntos_Acumulados = new JLabel("---");
		
		lblLabel_Puntos_Acumulados.setBackground(Color.GREEN);
		lblLabel_Puntos_Acumulados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblLabel_Puntos_Acumulados.setForeground(Color.BLACK);
		
		list = new JList(values);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setBorder(new LineBorder(Color.RED, 2, true));
		list.setBackground(Color.YELLOW);
		list.setForeground(Color.DARK_GRAY); 
		list.setModel(new AbstractListModel() { 
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {	 				
				return values[index]; 
			}  
		});  
		
		
		
		panel_Norte1_2.add(lblLabel_Titulo_Letra);
		panel_Norte1_2.add(textFieldLetra);
		panel_Norte2.add(lblAyuda);
		panel_Norte2.add(lblAyudaText);		
		
		panel_Centro_Teclado.add(btnButton_a);
		panel_Centro_Teclado.add(btnButton_b);		
		panel_Centro_Teclado.add(btnButton_c);		
		panel_Centro_Teclado.add(btnButton_d);		
		panel_Centro_Teclado.add(btnButton_e);
		panel_Centro_Teclado.add(btnButton_f);
		panel_Centro_Teclado.add(btnButton_g);
		panel_Centro_Teclado.add(btnButton_h);
		panel_Centro_Teclado.add(btnButton_i);
		panel_Centro_Teclado.add(btnButton_j);
		panel_Centro_Teclado.add(btnButton_k);
		panel_Centro_Teclado.add(btnButton_l);
		panel_Centro_Teclado.add(btnButton_m);
		panel_Centro_Teclado.add(btnButton_n);
		panel_Centro_Teclado.add(btnButton_ñ);
		panel_Centro_Teclado.add(btnButton_o);
		panel_Centro_Teclado.add(btnButton_p);
		panel_Centro_Teclado.add(btnButton_q);
		panel_Centro_Teclado.add(btnButton_r);
		panel_Centro_Teclado.add(btnButton_s);
		panel_Centro_Teclado.add(btnButton_t);
		panel_Centro_Teclado.add(btnButton_u);
		panel_Centro_Teclado.add(btnButton_v);
		panel_Centro_Teclado.add(btnButton_w);
		panel_Centro_Teclado.add(btnButton_x);
		panel_Centro_Teclado.add(btnButton_y);
		panel_Centro_Teclado.add(btnButton_z);			
		panel_Centro_Teclado.add(btnButton_Ayuda);
		panel_Centro_Teclado.add(btnButton_Aceptar);
		panel_Centro_Teclado.add(btnButton_Cancelar); 
		
		panel_Centro_Tema_1.add(lblLabel_Titulo_Lista_Tema, BorderLayout.NORTH); 
		panel_Centro_Tema_1.add(list); 	
		panel_Centro_Tema_2.add(lblLabel_tema);	 
		panel_Centro_Tema_2.add(btnButtonListaAceptar);		
		
 //   	panel_Centro1_Ahorcado.add(lblLabelAhorcado);
 //		panel_Centro1_Ahorcado.add(btnButtonAhocado);
		
		panel_Sur1.add(btnButton_Nombre);
		panel_Sur1.add(btnCargar);		
		panel_Sur1.add(lblLabel_Titulo_Nivel);
		panel_Sur1.add(comboBox_Nivel);
		panel_Sur1.add(lblLabel_Titulo_Puntos);
		panel_Sur1.add(lblLabel_Puntos_Acumulados);
		
		panel_Sur2.add(lblNewLabel_Titulo_Nombre_Judagor);
		panel_Sur2.add(textFieldNombre);
		panel_Sur2.add(btnButton_OK); 
		panel_Sur2.add(lblTemaSeleccionado);
		panel_Sur2.add(textField_tema);
		
		panel_Oeste1.add(btnButton_Play); 
		panel_Oeste1.add(btnButton_Reiniciar);
		panel_Oeste1.add(btnButton_Salir);
		
		//------------------------------------------------------------------------------------------------------------------------------------------
		//Construccion de Oyentes para para boton
		
		btnButton_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNombre.setEditable(false);
				btnButton_OK.setVisible(false);
		 		
				if(textFieldNombre.getText().equals(ADMINISTRADOR))
				{
					//habilita menu administrador
					JOptionPane.showMessageDialog(null, "La opción Administrador no esta disponible en esta versión");	
					textFieldNombre.setText("");
				} 
				else
				{
				//	juego.crearJugador(textFieldNombre.getText(),0,0);
				//   listaJugadores.add(juego.crearJugador(textFieldNombre.getText(),0,0));   //para un futuro, en esta ocacion solo lo guarda
				
					jugador = juego.buscarJugador(textFieldNombre.getText());
					if(jugador==null)
					{
						juego.listaJugadores.add(juego.crearJugador(textFieldNombre.getText(),0,0));   
						jugador=juego.buscarJugador(textFieldNombre.getText());
						lblLabel_Puntos_Acumulados.setText("---");
					}
					else
					{
						lblLabel_Puntos_Acumulados.setText(Integer.toString(jugador.puntaje)+" ");
					}		 	
				} 
 			}
		}); 
		
		btnButton_Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//verifica que haya ingresado nivel y tema
				//  si falta alguno de estos datos, habilitar panel de mensajes y dar aviso y no deja continuar
				//  else llama al tema.elegirPalabra, prepara tabla y muestra algunas letras segun nivel elegido.
				//   elegirPalabra(char complejidad, String tema)    
				
				juego.verificaGanador.inicializar();    //inicializa el juego, pero mantiene los puntos
				
				if(textField_tema.getText().equals("")||textField_tema.getText().equals(null))
				{
					JOptionPane.showMessageDialog(null, "Debe seleccionar un tema para poder jugar");	
				}
				else
				{
			        nivel = (String) comboBox_Nivel.getSelectedItem();
					char complejidad;
					switch (nivel)
					{
					case "1": complejidad = 'B'; break;
					case "2": complejidad = 'M'; break;
					case "3": complejidad = 'A'; break;
					default:  complejidad = ' '; break; 
					}
	    		 	Object palabra = juego.temas.elegirPalabra(complejidad,lblLabel_tema.getText());    		    
	    		 	String nombreP= obtenerDatosPalabra(palabra); 
					
	    		 	panel_Centro1_Ahorcado.add(btnButtonAhocado);
					pEnJuego= juego.mostrarAyudaLetras(nombreP, Integer.parseInt(nivel));
			        lblPalabra.setText(pEnJuego);  
			        btnButtonAhocado.setSize( panel_Centro1_Ahorcado.getSize());  
			        imagen = juego.verificaGanador.getImagenParteCuerpo(0); 
		   	        ImageIcon icono  = new ImageIcon(imagen.getImage().getScaledInstance(btnButtonAhocado.getWidth(),btnButtonAhocado.getHeight(), Image.SCALE_DEFAULT));
 		   	        btnButtonAhocado.setIcon(icono);	   
				} 
		        //cuando temina el juego colocar lblLabelAhorcado.setIcon(null);
			}
		});  
		
		btnButton_Ayuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//por cada ayuda que pida se resta 1,2,3 y 4 puntos respectivamente 
				if(pEnJuego != null)
				{
					switch(contadorAyuda)
					{
					case 1: lblAyudaText.setText(ayuda1); juego.restarPuntos(contadorAyuda,jugador);break;
					case 2: lblAyudaText.setText(ayuda1+"/"+ayuda2); juego.restarPuntos(contadorAyuda, jugador);break;
					case 3: lblAyudaText.setText(ayuda1+"/"+ayuda2+"/"+ayuda3); juego.restarPuntos(contadorAyuda, jugador);break;
					case 4: lblAyudaText.setText(ayuda1+"/"+ayuda2+"/"+ayuda3+"/"+ayuda4);juego.restarPuntos(contadorAyuda, jugador); break;	
					default: break;
					}
					contadorAyuda++;
					lblLabel_Puntos_Acumulados.setText(Integer.toString(jugador.puntaje));
				} 
			}
		});
		
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Centro_Teclado.setVisible(false);
		 		panel_Centro.remove(panel_Centro_Teclado);
		    	panel_Centro.add(panel_Centro_Tema_1);
				panel_Centro_Tema_1.setVisible(true);				
			}
		}); 
		
		btnButton_Nombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNombre.setEditable(true);
				btnButton_OK.setVisible(true);
			}
		});   
		
		btnButton_Reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				 
				juego.verificaGanador.inicializar(); 						
 		   	    limpiarTablero();
			}
		});  
		
		btnButton_Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hasta luego...");	
				System.exit(0); 
			}
		}); 
		
		btnButton_a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("a");  
				btnButton_a.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			} 
		}); 
		
		btnButton_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("b");
				btnButton_b.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("c");
				btnButton_c.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	   		    textFieldLetra.setText("d");
				btnButton_d.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		});  
		
		btnButton_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("e");
				btnButton_e.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("f");
				btnButton_f.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		     	textFieldLetra.setText("g");
				btnButton_g.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("h");
				btnButton_h.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		});		
		
	
		btnButton_i.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("i");
				btnButton_i.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("j");
				btnButton_j.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_k.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("k");
				btnButton_k.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("l");
				btnButton_l.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("m");
				btnButton_m.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource(); 
			}
		}); 
		
		btnButton_n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("n");
				btnButton_n.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();			 
			}
		}); 
		
		btnButton_o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		textFieldLetra.setText("o");
				btnButton_o.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();				
			}
		}); 
	
		btnButton_ñ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("\u00F1");  //ñ
				btnButton_ñ.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("p");
				btnButton_p.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("q");
				btnButton_q.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
	
		btnButton_r.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("r");
				btnButton_r.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("s");
				btnButton_s.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_t.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("t");
				btnButton_t.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_u.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("u");
				btnButton_u.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("v");
				btnButton_v.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_w.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("w");
				btnButton_w.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("x");
				btnButton_x.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("y");
				btnButton_y.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("z");
				btnButton_z.setBackground(Color.GREEN);    
				botonPulsado = (JButton) e.getSource();
			}
		}); 
		
		btnButton_Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				if(textFieldLetra.getText().equals(null) || textFieldLetra.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Debe seleccionar una letra");
				}
				else
				{
					 controlJuego();	   //controla el juego 
				} 
			}
		}); 
		
		btnButton_Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldLetra.setText("");  
				if(botonPulsado == btnButton_a)  btnButton_a.setBackground(Color.cyan);
				if(botonPulsado == btnButton_b)  btnButton_b.setBackground(Color.cyan);
				if(botonPulsado == btnButton_c)  btnButton_c.setBackground(Color.cyan);
				if(botonPulsado == btnButton_d)  btnButton_d.setBackground(Color.cyan);
				if(botonPulsado == btnButton_e)  btnButton_e.setBackground(Color.cyan);
				if(botonPulsado == btnButton_f)  btnButton_f.setBackground(Color.cyan);
				if(botonPulsado == btnButton_g)  btnButton_g.setBackground(Color.cyan);
				if(botonPulsado == btnButton_h)  btnButton_h.setBackground(Color.cyan);
				if(botonPulsado == btnButton_i)  btnButton_i.setBackground(Color.cyan);
				if(botonPulsado == btnButton_j)  btnButton_j.setBackground(Color.cyan);
				if(botonPulsado == btnButton_k)  btnButton_k.setBackground(Color.cyan);
				if(botonPulsado == btnButton_l)  btnButton_l.setBackground(Color.cyan);
				if(botonPulsado == btnButton_m)  btnButton_m.setBackground(Color.cyan);
				if(botonPulsado == btnButton_n)  btnButton_n.setBackground(Color.cyan);
				if(botonPulsado == btnButton_ñ)  btnButton_ñ.setBackground(Color.cyan);
				if(botonPulsado == btnButton_o)  btnButton_o.setBackground(Color.cyan);				
				if(botonPulsado == btnButton_p)  btnButton_p.setBackground(Color.cyan);
				if(botonPulsado == btnButton_q)  btnButton_q.setBackground(Color.cyan);
				if(botonPulsado == btnButton_r)  btnButton_r.setBackground(Color.cyan);
				if(botonPulsado == btnButton_s)  btnButton_s.setBackground(Color.cyan);
				if(botonPulsado == btnButton_t)  btnButton_t.setBackground(Color.cyan);
				if(botonPulsado == btnButton_u)  btnButton_u.setBackground(Color.cyan);
				if(botonPulsado == btnButton_w)  btnButton_w.setBackground(Color.cyan);
				if(botonPulsado == btnButton_v)  btnButton_v.setBackground(Color.cyan);
				if(botonPulsado == btnButton_x)  btnButton_x.setBackground(Color.cyan);
				if(botonPulsado == btnButton_y)  btnButton_y.setBackground(Color.cyan);
				if(botonPulsado == btnButton_z)  btnButton_z.setBackground(Color.cyan); 
			}
		}); 
		
		btnButtonListaAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				panel_Centro_Tema_1.setVisible(false);
		 		panel_Centro.remove(panel_Centro_Tema_1);
		 		panel_Centro.add(panel_Centro_Teclado);
				panel_Centro_Teclado.setVisible(true);
				String valor = values[list.getSelectedIndex()];
				lblLabel_tema.setText(valor);
				textField_tema.setText(valor);
			}
		}); 
		
		btnButtonAhocado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				for(int i=0; i<10; i++)
				{
					btnButtonAhocado.setBackground(Color.red);
					btnButtonAhocado.setBackground(Color.green); 
				}
			}
		}); 
		
		
	}  
	
	
	public String obtenerDatosPalabra(Object palabra)
	{
		nombrePalabra = " ";
		
		if(palabra instanceof Palabras)         
 		{
 			Palabras p = (Palabras) palabra;
 			nombrePalabra = p.palabra; 
 			//
 			// cargar en las variables de los panels de aayuda las variables de cada clase
 		    //
 			ayuda1 = p.getDescripcion();
 			ayuda2 = "no";
 			ayuda3 = "te voy";
 			ayuda4 = "a ayudar" + "ya te reste 10 puntos...";
 		}   
		
		if(palabra instanceof Entretenimiento)      
 		{
			Entretenimiento pEntretenimiento = (Entretenimiento) palabra;
 			nombrePalabra = pEntretenimiento.getPalabra(); 
 			//
 			ayuda1= pEntretenimiento.tipoEntretenimiento;
 		    ayuda2= "Preguntale a tu mamá";
 			ayuda3= "Busca en google";
 			ayuda4= "Preguntale a alguien";
	    }		
		
		
		if(palabra instanceof Ciencia)         
 		{
         	Ciencia pCiencia = (Ciencia) palabra;
 			nombrePalabra = pCiencia.getPalabra(); 
 			//
 			ayuda1= pCiencia.getEpoca();
 			ayuda2= pCiencia.getTipoCiencia();
 			ayuda3= "Preguntale a tu tío";
 			ayuda4= "No tengo mas ayudas...";
	    }		
		
		
		if(palabra instanceof Deportes)         
 		{
 			Deportes pDeportes = (Deportes) palabra;
 			nombrePalabra = pDeportes.getPalabra(); 
 			//
 			ayuda1= pDeportes.getTipoDeporte();
 			ayuda2= pDeportes.getDatos();
 			ayuda3= "Que te ayude tu abuela";
 			ayuda4= "o tu abuelo";
	    }		
		
		if(palabra instanceof Geografia)         
 		{
 			Geografia pGeografia = (Geografia) palabra;
 			nombrePalabra = pGeografia.getPalabra(); 
 			//
 			ayuda1= pGeografia.getContinente();
 			ayuda2= pGeografia.getTipoGeografia();
 			ayuda3= "Busca en internet";
 			ayuda4= "No tengo mas ayudas";
	    }		
		
		if(palabra instanceof Historia)         
 		{
 			Historia pHistoria = (Historia) palabra;
 			nombrePalabra = pHistoria.getPalabra(); 
 			//
 			ayuda1= pHistoria.getEpoca();
 			ayuda2= pHistoria.getLugar();
 			ayuda3= pHistoria.getPersonaje();
 			ayuda4= "ya no te puedo ayudar mas...";
	    }		
		
		if(palabra instanceof Idiomas)         
 		{
 			Idiomas pIdiomas = (Idiomas) palabra;
 			nombrePalabra = pIdiomas.getPalabra(); 
 			//
 			ayuda1= pIdiomas.getNombreIdioma();
 			ayuda2= pIdiomas.getPais();
 			ayuda3= "Busca en un diccionario";
 			ayuda4= "no se me ocurre ninguna ayuda...";
	    }	 
		return nombrePalabra;
	} 
  
	public void controlJuego()
	{
		juego.verificaGanador.estado(nombrePalabra, pEnJuego, textFieldLetra.getText().charAt(0)); 
		if(!juego.verificaGanador.gameOver)
		{					
			if(juego.verificaGanador.acierto)
			{ 
				lblPalabra.setText(juego.verificaGanador.palabraEnJuego);
				pEnJuego = juego.verificaGanador.palabraEnJuego;	
				
				if(juego.verificaGanador.ganador)
				{ 
					juego.acumularPuntos(Integer.parseInt(nivel), jugador);
					lblLabel_Puntos_Acumulados.setText(jugador.puntaje+" ");
					JOptionPane.showMessageDialog(null, "Ha acertado la palabra. Felicitaciones " + jugador.nombre.toUpperCase());	
					juego.verificaGanador.inicializar();			 
				    limpiarTablero(); 
				}
			}
			else
			{ 
				 btnButtonAhocado.setSize( panel_Centro1_Ahorcado.getSize());  
			     imagen = juego.verificaGanador.getImagenParteCuerpo(juego.verificaGanador.contadorPartes);  
		   	     ImageIcon icono  = new ImageIcon(imagen.getImage().getScaledInstance(btnButtonAhocado.getWidth(),btnButtonAhocado.getHeight(), Image.SCALE_DEFAULT));
 		   	     btnButtonAhocado.setIcon(icono);	 
			}					
		}
		else
		{
			 btnButtonAhocado.setSize( panel_Centro1_Ahorcado.getSize());  
		     imagen = juego.verificaGanador.getImagenParteCuerpo(juego.verificaGanador.contadorPartes);  
	   	     ImageIcon icono  = new ImageIcon(imagen.getImage().getScaledInstance(btnButtonAhocado.getWidth(),btnButtonAhocado.getHeight(), Image.SCALE_DEFAULT));
		   	 btnButtonAhocado.setIcon(icono);				
			
			//mostrar mensaje
			for(int i=0; i<10000; i++)
			{
				btnButtonAhocado.setBackground(Color.red);
				btnButtonAhocado.setBackground(Color.green); 
			} 
			JOptionPane.showMessageDialog(null, "Perdió...");				
			juego.verificaGanador.inicializar(); 
			limpiarTablero();
		}  
	} 
	
	public void limpiarTablero()
	{
		textFieldLetra.setText("");
		lblAyudaText.setText("");
		textField_tema.setText("");
		lblPalabra.setText("");
		nivel ="";
		ayuda1="";
		ayuda2="";
		ayuda3="";
		ayuda4="";
		contadorAyuda=1;
		pEnJuego =null;
		
		btnButton_a.setBackground(Color.CYAN);	 
		btnButton_b.setBackground(Color.CYAN);	
		btnButton_c.setBackground(Color.CYAN);	
		btnButton_d.setBackground(Color.CYAN);	
		btnButton_e.setBackground(Color.CYAN);	
		btnButton_f.setBackground(Color.CYAN);	
		btnButton_g.setBackground(Color.CYAN);	
		btnButton_h.setBackground(Color.CYAN);	
		btnButton_i.setBackground(Color.CYAN);	
		btnButton_j.setBackground(Color.CYAN);	
		btnButton_k.setBackground(Color.CYAN);	
		btnButton_l.setBackground(Color.CYAN);	
		btnButton_m.setBackground(Color.CYAN);	
		btnButton_n.setBackground(Color.CYAN);	
		btnButton_ñ.setBackground(Color.CYAN);	
		btnButton_o.setBackground(Color.CYAN);	
		btnButton_p.setBackground(Color.CYAN);	
		btnButton_q.setBackground(Color.CYAN);	
		btnButton_r.setBackground(Color.CYAN);	
		btnButton_s.setBackground(Color.CYAN);	
		btnButton_t.setBackground(Color.CYAN);	
		btnButton_u.setBackground(Color.CYAN);	
		btnButton_v.setBackground(Color.CYAN);	
		btnButton_w.setBackground(Color.CYAN);			
		btnButton_x.setBackground(Color.CYAN);	
		btnButton_y.setBackground(Color.CYAN);	
		btnButton_z.setBackground(Color.CYAN); 
		
		btnButtonAhocado.setSize( panel_Centro1_Ahorcado.getSize());
		imagen = juego.verificaGanador.getImagenParteCuerpo(7);  
   	    ImageIcon icono  = new ImageIcon(imagen.getImage().getScaledInstance(btnButtonAhocado.getWidth(),btnButtonAhocado.getHeight(), Image.SCALE_DEFAULT));
	   	btnButtonAhocado.setIcon(icono);
		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
					frame.setSize(990, 600);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
}
