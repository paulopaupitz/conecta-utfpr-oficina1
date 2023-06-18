import java.io.File;
import javax.swing.JFileChooser;


public abstract class ControllerArquivo {

    protected File arquivo = null;

    public abstract boolean ler();
    public abstract void escrever();

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(String TextoBotao) {
        arquivo = null;
        String pastainicial = System.getProperty("user.bin");
        JFileChooser chooser = new JFileChooser(pastainicial);
        if (chooser.showDialog(null, TextoBotao) == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
        }
    }
}

