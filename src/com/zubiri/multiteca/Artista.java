import java.util.Scanner;

package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private String apellido;
	private int añoNacimiento;
	private String campoTrabajo;

	public Artista(String nombre, String apellido, int añoNacimiento, String campoTrabajo) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.añoNacimiento = añoNacimiento;
		this.campotrabajo = campoTrabajo;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	public String getApellido() {
		
		return apellido;
	}
	public void setApellido(String apellido) {
		
		this.apellido = apellido;
	}
	public int getAñoNacimiento() {
		
		return añoNacimiento;
	}
	public void setAñoNacimiento(int añoNacimiento) {
		
		this.añoNacimiento = añoNacimiento;
	}
	public String getCampoTrabajo() {
		
		return campoTrabajo
	}
	public void setCampoTrabajo(String campoTrabajo) {
		
		this.campoTrabajo = campoTrabajo;
	}
	
	public String guardarArtista() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del artista: ");
		sc.next() = this.nombre;
		System.out.println("Introduce el apellido del artista: ");
		sc.next() = this.apellido;
		System.out.println("Introduce el año de nacimiento del artista: ");
		sc.next() = this.añoNacimiento;
		System.out.println("Introduce el campo en el que está especializado dicho artista: ");
		sc.next() = this.campoTrabajo;
		
		
	}
	
	public String formattedArtista() {
		
		String formattedArtista = 
				"DATOS DEL ARTISTA : \n"
				+"\tNombre: " +this.nombre +this.apellido +"\n"
				+"\tAño de nacimiento: " +this.añoNacimiento +"\n"
				+"\tCampo de trabajo: " +this.campoTrabajo;
		
		return formattedArtista;
	}
	
	
}
