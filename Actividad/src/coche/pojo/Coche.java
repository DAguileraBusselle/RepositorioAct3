package coche.pojo;

import motor.pojo.Motor;

public class Coche {

	private String id;
	private String matricula;	
	private String modelo;
	private String marca;
	private int km;
	private Motor motor;
	
	public Coche(String id, String matricula, String modelo, String marca, int km) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.km = km;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", km=" + km
				+ ", motor=" + motor + "]";
	}
	
	
	
}
