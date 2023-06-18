//Luiz Henrique Galhardo Farias
// RA: 2211190


import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class GerCliente extends ControllerArquivo implements java.io.Serializable {

    private Cliente cliente;
    private List<Cliente> bdCliente = new ArrayList<Cliente>();
    private ObjectInputStream leitor = null;
    private ObjectOutputStream escritor = null;
    public CadCliente cad;
     
    public List<Cliente> getBdCliente() {
        return bdCliente;
    }
    
    public void setBdCliente(List<Cliente> bdCliente){
	this.bdCliente = bdCliente;
    }
    // ================== ADICIONA CLIENTE ========================= //

    public Cliente cadCliente(Cliente cliente) {

        if (consPesCodCliente(cliente) == null) {
            getBdCliente().add(cliente);
            return cliente;
        } else {
            return null;
        }

    } 
    //==================== fim cadPesCliente ====================//

    // =========== CONSULTA CLIENTE ==================//
    public Cliente consPesCodCliente(Cliente cliente) {

        for (int i = 0; i < getBdCliente().size(); i++) {
            if (cliente.getCpfCnpjCliente() == getBdCliente().get(i).getCpfCnpjCliente()) {
                return cliente; 
            }
        }
        return null;
    }
    
    // =================== fim consPesCodCliente ==================//

    // ================== REMOVE CLIENTE ==========================//
    public Cliente removePesCodCliente(Cliente cliente) {
        Cliente cliente1 = (Cliente) consPesCodCliente(cliente);
        if (cliente1 != null) {
            getBdCliente().remove(cliente1);
            return null;
        } else {
            return cliente;
        }

    }// ======================= fim removePesCodCliente ================//

    // ========================= ATUALIZA CLIENTE ==================//
    public Cliente atualizaPesCodCliente(Cliente cliente) {
        for (int i = 0; i < getBdCliente().size(); i++) {
            if (cliente.getCpfCnpjCliente() == getBdCliente().get(i).getCpfCnpjCliente()) {
                return cliente;
                
            }
        }
        return null;
    }// ========================== fim atualizaPesCodCliente =============================//      
    
  
    public void escrever() {
        
        if (arquivo != null) {
            try {
                escritor = new ObjectOutputStream(new FileOutputStream(arquivo));
                escritor.writeObject(getBdCliente());
                escritor.close();
                               
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "ERRO AO INSERIR ARQUIVO.");
               
            }
        } 
    } 
    
    @Override
    public boolean ler() {

        try {

            leitor = new ObjectInputStream(new FileInputStream(arquivo));
            setBdCliente((List<Cliente>) leitor.readObject());
            leitor.close();
            return true;
            
        } catch (ClassNotFoundException erro) {
            System.err.println(erro.getMessage() + "CLASSE NÃO ENCONTRADA.");
            return false;
        } catch (IOException erro) {
            System.err.println(erro.getMessage() + "ERRO AO LER ARQUIVO.");
            return false;
        }
    }
    
    

 // ================================= // ===============================//
   
} //fim da classe
