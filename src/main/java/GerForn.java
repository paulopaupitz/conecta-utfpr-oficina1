//Luiz Henrique Galhardo Farias
// RA: 2211190
//ADS 2022.2

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerForn extends ControllerArquivo implements java.io.Serializable {

    private Fornecedor forn;
    private List<Fornecedor> bdForn = new ArrayList<Fornecedor>();
    private ObjectInputStream leitor = null;
    private ObjectOutputStream escritor = null;
    public CadCliente cad;
        
//================== Gatters and Setters =========
        
     public List<Fornecedor> getBdForn() {
        return bdForn;
    }

    public void setBdForn(List<Fornecedor> bdForn) {
        this.bdForn = bdForn;
    }
        
//================== Getters and Setters =========      
       
	public Fornecedor cadForn(Fornecedor forn){

		if(consPesCodForn(forn)== null){
			bdForn.add(forn);
                        
			return forn;
		}
		else{
			return null;
		}

	}//fim cadPesCliente

	public Fornecedor consPesCodForn(Fornecedor forn){
		for(int i = 0; i < bdForn.size(); i++){
			if(forn.getCnpjForn() == bdForn.get(i).getCnpjForn()){
				return bdForn.get(i);
			}
		}
		return null;
	}//fim consPesCodCliente

	public Fornecedor removePesCodForn(Fornecedor forn){
                Fornecedor forn1 = (Fornecedor) consPesCodForn(forn);
            	if(forn1 != null){
                    bdForn.remove(forn1);
                    return null;
		}
		else{
                    return forn;
		}
		
	}//fim removePesCodCliente

	public Fornecedor atualizaPesCodForn(Fornecedor forn){
		for(int i = 0; i < bdForn.size(); i++){
			if(forn.getCnpjForn() == bdForn.get(i).getCnpjForn()){
                                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                forn.setNome(nome);
				bdForn.set(i, forn);  
                                return bdForn.get(i);
			}
		}
                return null;
	}//fim atualizaPesCodCliente     
        
    public void escrever() {

        if (arquivo != null) {
            try {
                escritor = new ObjectOutputStream(new FileOutputStream(arquivo));
                escritor.writeObject(getBdForn());
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
            setBdForn((List<Fornecedor>) leitor.readObject());
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


        
        
        
// ============================ Implementacoes automaticas ==========================//
    
        

}//fim da classe
