package contenedor;

import java.util.ArrayList;

import javax.swing.JOptionPane;


import models.Coche;

public class contenedorCoches {

	private static contenedorCoches ContCoches;
	ArrayList<Coche> coches = new ArrayList<Coche>();
	
	
	public static contenedorCoches getContenedorCoches() {
		if (ContCoches == null) {
			ContCoches = new contenedorCoches();
		}
		return ContCoches;
	}
	
	/**
	 * devuelve la lista de los coches
	 * @return coches
	 */
	public ArrayList<Coche> getListaCoches(){
		return coches;
	}
	
	
	/**
	 * añade un coche a la lista
	 * @param c
	 */
	public void aniadirCoche(Coche c){
		if(!coches.contains(c)){
			coches.add(c);
			JOptionPane.showMessageDialog(null, "Añadido", "Añadido", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null, "Ya está en el sistema", "Ya está en el sistema", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	/**
	 * Elimina un coche de la lista
	 * @param c
	 */
	public void eliminarCoche(Coche c){
		if(coches.contains(c)){
			coches.remove(c);
		}
		else{
			JOptionPane.showMessageDialog(null, "No está en el sistema", "No está en el sistema", JOptionPane.ERROR_MESSAGE);
		}
	}
}
