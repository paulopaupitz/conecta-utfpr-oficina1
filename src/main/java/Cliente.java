
import java.util.List;

//Luiz Henrique Galhardo Farias RA: 2211190
//ADS 2022.2

public class Cliente extends Pessoa implements java.io.Serializable{
	
        private static long serialVersionUID = 1L;
        
        
	private int cpfCnpjCliente = 0;
	private int rgInsEstCliente = 0;
	private String razaoCliente = "";
        private static Cliente clienteUnico;

	public int getCpfCnpjCliente(){
		return cpfCnpjCliente;
	}

	public int getRgInsEstCliente(){
		return rgInsEstCliente;
	}

	public String getRazaoCliente(){
		return razaoCliente; 
	}

	
	public void setCpfCnpjCliente(int cpfCnpjCliente){
                this.cpfCnpjCliente = cpfCnpjCliente;
        }

	public void setRgInsEstCliente(int rgInsEstCliente){
		this.rgInsEstCliente = rgInsEstCliente;
	}

	public void setRazaoCliente(String razaoCliente){
		this.razaoCliente = razaoCliente;
	}

    // Inicio Singleton//
    public static Cliente getCliente() {
        return clienteUnico;
    }

    public void setCCliente(Cliente cliente) {
        Cliente.clienteUnico = cliente;
    }
    // Fim Singleton//

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    


}// fim classe