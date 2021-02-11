package Constructores;

public class Empleado {
	

	int edad;
	String categoria;
	int antiguedad;
	String sexo;
	
	public Empleado(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}
	public String empleado2(int antiguedad, String sexo, String categoria) {
		if (sexo==null ||sexo.equals("")) {
			return "KO";
		}
		else{
			
			this.sexo= sexo;
			this.categoria=categoria;
			
		}
		if (antiguedad==0) {
			return "KO";
		}
		else{
			this.antiguedad= antiguedad;
	
		}
		if (categoria==null ||categoria.equals("")) {
			return "KO";
		}
		else{
			
			this.categoria=categoria;
		}
		return "OK";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
