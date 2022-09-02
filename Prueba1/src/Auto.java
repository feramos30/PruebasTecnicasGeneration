
public class Auto extends Propietario {

	//Encapsulamiento de los atributos de la clase auto
	private String modelo;
	private String color;
	private String año;
	private String marca;
	private String chasis;
	private String propietario;
	private int velocidadMaxima;
	private int velocidadActual;
	private int numeroPuertos;
	private String techoSolar;
	private int marchas;
	private int transmision;
	
	
	//Constructor para nuestro auto
	public Auto(String nombre, String cpf, String rg, String modelo, String color, String año, String marca,
			String chasis, String propietario, int velocidadMaxima, int velocidadActual, int numeroPuertos,
			String techoSolar, int marchas, int transmision) {
		super(nombre, cpf, rg);
		this.modelo = modelo;
		this.color = color;
		this.año = año;
		this.marca = marca;
		this.chasis = chasis;
		this.propietario = propietario;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
		this.numeroPuertos = numeroPuertos;
		this.techoSolar = techoSolar;
		this.marchas = marchas;
		this.transmision = transmision;
	}
	
	
	//Aceleracion
	 public void Aceleracion() {
	 this.velocidadActual = this.velocidadActual + 1;
	 }
	 
	//Frenado
	 public void Frenado() {
	 this.velocidadActual = 0;
	 }
	 //Aumentar marchas   
	 public void AumentarMarcha () {
	 this.marchas = this.marchas + 1;
	 }
	 //Reducir marchas
     public void ReducirMarcha () {
	 this.marchas = this.marchas - 1;
	 }

     //Agrego el toString si no no puedo ver la informacion de mi auto
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", color=" + color + ", año=" + año + ", marca=" + marca + ", chasis="
				+ chasis + ", propietario=" + propietario + ", velocidadMaxima=" + velocidadMaxima
				+ ", velocidadActual=" + velocidadActual + ", numeroPuertos=" + numeroPuertos + ", techoSolar="
				+ techoSolar + ", marchas=" + marchas + ", transmision=" + transmision + "]";
	} 
}
