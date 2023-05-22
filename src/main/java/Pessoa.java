//Luiz Henrique Galhardo Farias RA: 2211190
//ADS 2022.2

public abstract class Pessoa implements java.io.Serializable{

	private String nome = "";
        private String telCel = "";
	private String telFixo = "";
	private String email = "";
        private String estado = "";
	private String cidade = "";
	private String bairro = "";
	private String rua = "";
	private String cep = "";
	private String compl = "";

	public String getNome(){
		return nome;
	}
	

	public void setNome(String nome){
		this.nome = nome;
	}
	
        
        public String getTelCel(){
		return telCel;
	}

	public String getTelFixo(){
		return telFixo;
	}

	public String getEmail(){
		return email;
	}

	public void setTelCel(String telCel){
		this.telCel = telCel;
	}
	
	public void setTelFixo(String telFixo){
		this.telFixo = telFixo;
	}

	public void setEmail(String email){
		this.email = email;
	}
        
        public String getEstado(){
		return estado;
	}

	public String getCidade(){
		return cidade;
	}

	public String getBairro(){
		return bairro;
	}

	public String getRua(){
		return rua;
	}

	
	public String getCep(){
		return cep;
	}

	public String getCompl(){
		return compl;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public void setRua(String rua){
		this.rua = rua;
	}
	

	public void setCep(String cep){
		this.cep = cep;
	}

	public void setCompl(String compl){
		this.compl = compl;
	}

 


}//fim classe
