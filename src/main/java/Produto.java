//Luiz Henrique Galhardo Farias RA: 2211190
//ADS 2022.2

public class Produto implements java.io.Serializable{

	private String codProd = "";
	private String descProd = "";
	private double custoProd = 0;
	private double custoRealProd = 0;
	private double precoProd = 0;

	public String getCodProd(){
		return codProd;
	}

	public String getDescProd(){
		return descProd;
	}

	public double getCustoProd(){
		return custoProd;
	}

	public double getCustoRealProd(){
		return custoRealProd;
	}
	
	public double getPrecoProd(){
		return precoProd;
	}
        
        
        

	public void setCodProd(String codProd){
		this.codProd = codProd;
	}

	public void setDescProd (String descProd){
		this.descProd = descProd;
	}

	public void setCustoProd(double custoProd){
		this.custoProd = custoProd;
	}

	public void setCustoRealProd(double custoRealProd){
		this.custoRealProd = custoRealProd;
	}
	
	public void setPrecoProd(double precoProd){
		this.precoProd = precoProd;
	}


}// fim classe