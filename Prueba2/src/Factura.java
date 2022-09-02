
public class Factura {

	public String numero;
	public String descripcion;
	public int cantidadCompradaArticulo;
	public double precio;
	
	
	
	//Constructor de la factura
	
	public Factura(String numero, String descripcion, int cantidadCompradaArticulo, double precio) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidadCompradaArticulo = cantidadCompradaArticulo;
		this.precio = precio;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getCantidadCompradaArticulo() {
		return cantidadCompradaArticulo;
	}



	public void setCantidadCompradaArticulo(int cantidadCompradaArticulo) {
		this.cantidadCompradaArticulo = cantidadCompradaArticulo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	//Metodo getTotalFactura
	
	public double getTotalFactura() {
		double Total = this.cantidadCompradaArticulo * this.precio;
        if(this.precio < 0) {
            this.precio = (int) 0.0;
        }
        
        if(Total < 0) {
            Total = 0;
        }
      
        return Total;
        }



	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", descripcion=" + descripcion + ", cantidadCompradaArticulo="
				+ cantidadCompradaArticulo + ", precio=" + precio + "]";
	}
	
	
}


	
	

