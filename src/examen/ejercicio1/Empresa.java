package examen.ejercicio1;

public class Empresa extends Empleados{	

	public String nombre_empresa; 
	public int num_cun;
	
	public Empresa(String nombre_empresa, int num_cun, boolean paga) {
		super(paga);	
		this.nombre_empresa=nombre_empresa;
		this.num_cun=num_cun;
	}
	

}
