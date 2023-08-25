package alistamento;

public class AltPeso extends PaginaDeInscricao{
	
	private double altura[] = new double[3];
	private double pesos[] = new double[3];
	

	public double[] getPesos() {
		return pesos;
	}

	public void setPesos(double pesos[]) {
		this.pesos = pesos;
	}

	public double[] getAltura() {
		return altura;
	}

	public void setAltura(double altura[]) {
		this.altura = altura;
	} 

}
