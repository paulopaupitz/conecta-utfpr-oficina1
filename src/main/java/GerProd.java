//Luiz Henrique Galhardo Farias
// RA: 2211190


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerProd extends ControllerArquivo implements java.io.Serializable{

    private Produto prod;
    private List<Produto> bdProd = new ArrayList<Produto>();
    private static GerProd gerProdUnico;
    private ObjectInputStream leitor = null;
    private ObjectOutputStream escritor = null;

    GerProd() {

    }

        public List<Produto> getBdProd() {
        return bdProd;
    }

    public void setBdProd(List<Produto> bdProd) {
        this.bdProd = bdProd;
    }
        
	public Produto cadProd(Produto prod){

		if(consProd(prod)== null){
			bdProd.add(prod);
			return prod;
		}
		else{
			return null;
		}

	}//fim cadPesCliente

	public Produto consProd(Produto prod){
		for(int i = 0; i < bdProd.size(); i++){
			if(prod.getCodProd() == bdProd.get(i).getCodProd()){
				return bdProd.get(i);
			}
		}
		return null;
	}//fim consPesCodCliente

	public Produto removeProd(Produto prod){
                Produto prod1 = (Produto) consProd(prod);
            	if(prod1 != null){
                    bdProd.remove(prod1);
                    return null;
		}
		else{
                    return prod;
		}
		
	}//fim removePesCodCliente

	public Produto atualizaProd(Produto prod){
		for(int i = 0; i < bdProd.size(); i++){
			if(prod.getCodProd() == bdProd.get(i).getCodProd()){
                                String desc = JOptionPane.showInputDialog(null, "INFORME NOVA DESCRIÇÃO:", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                prod.setDescProd(desc);
				bdProd.set(i, prod);  
                                return bdProd.get(i);
                                //Chamar CadCliente / Salvar no banco de dados e manter o retorno
			}
		}
                return null;
	}//fim atualizaPesCodCliente       
        
        
// =======================================================================================================================//
        
         public void escrever() {
        
        if (arquivo != null) {
            try {
                escritor = new ObjectOutputStream(new FileOutputStream(arquivo));
                escritor.writeObject(getBdProd());
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
            setBdProd((List<Produto>) leitor.readObject());
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
    

}//fim da classe
