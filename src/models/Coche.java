package models;

public class Coche {

	private String matricula;
	private String fechaInicio;
	
	/**
	 * devuelve la matricula del coche
	 * @return la matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * devuelve la hora de inicio del contador
	 * @return la hora de inciio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}
	
	/**
	 * crea un objeto Coche
	 * @param matricula la matricula del coche
	 * @param fechaInicio la hora de inicio del contador
	 */
	public Coche(String matricula, String fechaInicio) {
		this.matricula = matricula;
		this.fechaInicio = fechaInicio;
	}
	
	
	
	
}
