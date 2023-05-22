//Luiz Henrique Galhardo Farias RA: 2211190
//ADS 2022.2

public class Fornecedor extends Pessoa{

	private String razaoForn = "";
	private int cnpjForn = 0;
	private int insEstForn = 0;

	public String getRazaoForn(){
		return razaoForn;
	}

	public int getCnpjForn(){
		return cnpjForn;
	}

	public int getInsEstForn(){
		return insEstForn;
	}

	public void setRazaoForn(String razaoForn){
		this.razaoForn = razaoForn;
	}

	public void setCnpjForn(int cnpjForn){
		this.cnpjForn = cnpjForn;
	}

	public void setInsEstForn(int insEstForn){
		this.insEstForn = insEstForn;
	}

}// fim classe