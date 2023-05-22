//Luiz Henrique Galhardo Farias
// RA: 2211190


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lbltitulo = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        cadCliente = new javax.swing.JMenuItem();
        cadForn = new javax.swing.JMenuItem();
        cadProd = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setText("Usuario: Padrao");

        menuCadastros.setText("Cadastrar");

        cadCliente.setText("Cadastro Cliente");
        cadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(cadCliente);

        cadForn.setText("Cadastro Fornecedor");
        cadForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFornActionPerformed(evt);
            }
        });
        menuCadastros.add(cadForn);

        cadProd.setText("Cadastro Produto");
        cadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProdActionPerformed(evt);
            }
        });
        menuCadastros.add(cadProd);

        menuPrincipal.add(menuCadastros);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 378, Short.MAX_VALUE)
                .addComponent(lbltitulo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFornActionPerformed
        abreCadForn();
    }//GEN-LAST:event_cadFornActionPerformed

    private void cadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClienteActionPerformed
         abreCadCliente();
    }//GEN-LAST:event_cadClienteActionPerformed

    private void cadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProdActionPerformed
        abreCadProd();
    }//GEN-LAST:event_cadProdActionPerformed

    
    
    
    public void abreCadCliente(){
        CadCliente.getCadCliente().setVisible(true);
    }
    public void abreCadForn(){
        CadForn.getCadForn().setVisible(true);
    }
    
     public void abreCadProd(){
        CadProd.getCadProd().setVisible(true);
    }
 
    //==== MAIN ====//
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    //==== FIM MAIN ====//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadCliente;
    private javax.swing.JMenuItem cadForn;
    private javax.swing.JMenuItem cadProd;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
