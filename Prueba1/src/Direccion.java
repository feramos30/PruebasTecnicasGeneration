
public class Direccion {
	
	//Encapsulamiento de los atributos de la clase auto
	private String ciudad;
    private String estado;
    private int cp;

    public Direccion(String ciudad, String estado, int cp) {
        this.ciudad = ciudad;
        this.estado = estado;
        this.cp = cp;
    }
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
}

    
