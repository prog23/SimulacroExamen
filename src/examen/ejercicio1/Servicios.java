package examen.ejercicio1;

public class Servicios extends Empresa implements Pago{
	
	
	public TiposServicios servicio;		
	public Servicios(String nombre_empresa, int num_cun, boolean paga, TiposServicios servicio) {
		super(nombre_empresa, num_cun, paga);
		this.servicio=servicio;
	}

	@Override
	public void ingreso() {
		
		if(paga == true) {		
		System.out.println("Has realizado con éxito el ingreso");
		}		
		
	}

	@Override
	public void devuelto() {
		
		if(paga==false) {
		System.out.println("No has realizado el ingreso con éxito y se te ha devuelto");
		}
		
	}	
	
	@Override
	public String toString() {
		return super.toString() + " Pago =" + paga + "]";
	}
	
	
	
}
