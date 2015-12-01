package GUI;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * 
 * @author Mauricio Nishida y  Pilar Cuevas
 *
 */
public class Imagenes extends JPanel
{ 
	int nroPanel;
	String nombreImagen;	
	String path;
	ImageIcon Imagen;
	
	/**
	 * Constructor de la clase
	 */	
	public Imagenes(int nroPanel)
	{
		this.setSize(400,300);
		path = "./picture/";
//		nombreImagen = path;
		
		switch(nroPanel)
		{
		case 1: 
//			   nombreImagen = "EscudoPoli.jpg";
			   nombreImagen = "logoPoli2.jpg";
//			   nombreImagen += "EscudoPoli.jpg";
			   Imagen = new ImageIcon(getClass().getResource( nombreImagen ));
			   break;
		case 2: 
			   nombreImagen = "Ahorcado.png";
			   Imagen = new ImageIcon(getClass().getResource( nombreImagen ));
			   break;	   
		case 3: 
			   nombreImagen = "caritaFeliz.jpg";
			   break;	   
		default:  
			   break;	    
		} 
	} 
	/**
	 * Metodo que recibe un grafico como parametro 
	 * Realiza modificaciones al grafico y lo convierte en icono.
	 */
	public void paintComponent (Graphics g)
	{
		Dimension tamaño = getSize();
	   
		g.drawImage(Imagen.getImage(), 0, 0, tamaño.width, tamaño.height, null);
		setOpaque(false);
		super.paintComponent(g); 
	}
	
	public void setIcon(ImageIcon imagen)
	{
		 Imagen = imagen;
	} 
}

 
