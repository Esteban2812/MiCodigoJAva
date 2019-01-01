package example.kafka.entities;

public class Producto {
	private int codigoProducto;
	private String descripcionProducto;
	
	
	
	public Producto(int codigoProducto, String descripcionProducto) {
		super();
		this.codigoProducto = codigoProducto;
		this.descripcionProducto = descripcionProducto;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	
	
	
}
