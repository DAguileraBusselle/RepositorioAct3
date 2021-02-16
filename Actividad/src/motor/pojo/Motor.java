package motor.pojo;

public class Motor {
	
	private String id;
	private String tipoMotor;
	private String potencia;
	
	public Motor(String id, String tipoMotor, String potencia) {
		super();
		this.id = id;
		this.tipoMotor = tipoMotor;
		this.potencia = potencia;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	
	
}
