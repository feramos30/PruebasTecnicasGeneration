
public class Empleado {

	public String nombre;
	public String apellido;
	public double salarioMensual;
	
	
	//Constructor
	public Empleado(String nombre, String apellido, double salarioMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
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


	public double getSalarioMensual() {
		return salarioMensual;
	}


	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	//Metodo para multiplicar el salario mensual por 12 y obtener el salario anual
	public double getSalarioAnual() {
	    double salarioAnual = this.salarioMensual * 12;
	    
	    return salarioAnual;
	}

	//Metodo para calcular el aumento salarial por porcentaje y aumentarlo al salario mensual
	public void getAumentoSalarial() {
	    double AumentoSalarial = this.salarioMensual * (10);
	    this.salarioMensual = this.salarioMensual + AumentoSalarial;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", salarioMensual=" + salarioMensual + "]";
	}
	
}
	

