package examen.ejercicio1;

public class Contratistas extends Empleados {
	
	private String soc_a;
	
	public Contratistas(String nombre, String apellidos, String fecha_contr, int num_cuenta, String soc_a) {
		super(nombre, apellidos, fecha_contr, num_cuenta);
		this.soc_a=soc_a;
	}

	public String getSoc_a() {
		return soc_a;
	}
	

}
