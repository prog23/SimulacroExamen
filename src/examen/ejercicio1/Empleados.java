package examen.ejercicio1;

import java.util.Scanner;

public class Empleados implements Pago{
	
	

	public String nombre;
	public String apellidos;
	public String fecha_contr;
	public int num_cuenta;
	
	public Empleados (String nombre, String apellidos, String fecha_contr, int num_cuenta) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fecha_contr=fecha_contr;
		this.num_cuenta=num_cuenta;	
		
		}
	public boolean paga = false;
	public Empleados(boolean paga) {
		this.paga=paga;
	}
	
	public int getNum_cuenta() {		
		return num_cuenta;
	}	
	
	
	public void setNum_cuenta(int num_cuenta) {			
		this.num_cuenta = num_cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFecha_contr() {
		return fecha_contr;
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
