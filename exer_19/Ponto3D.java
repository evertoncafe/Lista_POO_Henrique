package com.everton.exer_19;

public class Ponto3D extends Ponto {
	private double z;

	// === CONSTRUCTOR'S === //
	public Ponto3D() throws Exception {
		super(0,0);
		this.setZ(0);
	}
	public Ponto3D(double _x, double _y, double _z) throws Exception {
		super(_x, _y);
		this.setZ(_z);
	}
	public Ponto3D(Ponto a, double _z) throws Exception {
		super(a.getX(), a.getY());
		this.setZ(_z);
	}
	// === GET'S and SET'S === //
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	// === GET'S and SET'S STATIC'S=== //
	// === METHODO'S STATIC'S === //
	static public double distancia(double x1, double y1, double z1, double x2, double y2, double z2){
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2));
	}
	// === METHODO'S === //
	public Ponto clonar() throws Exception{
		return new Ponto3D(super.clonar(), this.getZ());
	}
	public Ponto criaSwap() throws Exception{
		return new Ponto3D(super.criaSwap(), this.getZ());
	}
	public boolean temEixoComum(Ponto3D _ponto3D) {
		return super.temEixoComum(_ponto3D) || this.getZ() == _ponto3D.getZ();
	}
	public double distancia(Ponto3D _ponto3D){
		return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),_ponto3D.getX(),_ponto3D.getY(), _ponto3D.getZ());
	}
	public double distancia(double _x, double _y, double _z){
		return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),_x,_y,_z);
	}
	public double distanciaDaOrigem(){
		return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),0,0,0);
	}
	public int compareTo(Ponto3D _ponto3D) {
		if (this.distanciaDaOrigem() > _ponto3D.distanciaDaOrigem())
			return 1;
		else if(this.distanciaDaOrigem() < _ponto3D.distanciaDaOrigem())
			return -1;
		else
			return 0;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Ponto3D other = (Ponto3D) obj;
		if (Double.doubleToLongBits(this.getX()) != Double.doubleToLongBits(other.getX()))
			return false;
		if (Double.doubleToLongBits(this.getY()) != Double.doubleToLongBits(other.getY()))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;	
		return true;

	}
	public String toString(){
		StringBuilder coord = new StringBuilder();
		coord.append("(");
		coord.append(this.getX());
		coord.append(",");
		coord.append(+this.getY());
		coord.append(",");
		coord.append(+this.getZ());
		coord.append(")");
		return coord.toString();
	}
}
