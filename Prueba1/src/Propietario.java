
public class Propietario{
	
	
	//Encapsulamiento de los atributos de la clase propietario
	    private String nombre;
	    private String cpf;
	    private String rg;
	    private int fechaNacimiento;
	    private String calle;
	    private String vecindario;
	    private String ciudad;
	    private String expresar;
	    private int codigopostal;
	    private String complementar;
	    
	    
	    
	    //Constructor con los parametros obligatorios nombre, cpf y rg
		public Propietario(String nombre, String cpf, String rg) {
			this.nombre = nombre;
			this.cpf = cpf;
			this.rg = rg;	
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public String getRg() {
			return rg;
		}
		
		public void setRg(String rg) {
			this.rg = rg;
		}

		public int getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(int fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public String getVecindario() {
			return vecindario;
		}

		public void setVecindario(String vecindario) {
			this.vecindario = vecindario;
		}

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public String getExpresar() {
			return expresar;
		}

		public void setExpresar(String expresar) {
			this.expresar = expresar;
		}

		public int getCodigopostal() {
			return codigopostal;
		}

		public void setCodigopostal(int codigopostal) {
			this.codigopostal = codigopostal;
		}

		public String getComplementar() {
			return complementar;
		}

		public void setComplementar(String complementar) {
			this.complementar = complementar;
		}
	}
