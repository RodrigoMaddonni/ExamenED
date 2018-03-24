
import com.sun.glass.events.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class ConversorMonedas extends javax.swing.JFrame {

    /**
     * Creates new form ConversorMonedas
     */
    public ConversorMonedas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dError = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        bCerrarDialog = new javax.swing.JButton();
        lEuro = new javax.swing.JLabel();
        tEuro = new javax.swing.JTextField();
        lDolar = new javax.swing.JLabel();
        tDolar = new javax.swing.JTextField();
        lLibra = new javax.swing.JLabel();
        tLibra = new javax.swing.JTextField();
        bLimpiar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();

        dError.setTitle("ERROR");
        dError.setMinimumSize(new java.awt.Dimension(600, 300));
        dError.setModal(true);
        dError.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("TIPO DE DATO ERRONEO, introduce un numero");

        bCerrarDialog.setText("Continuar");
        bCerrarDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ControlBotonCerrarDialog(evt);
            }
        });

        javax.swing.GroupLayout dErrorLayout = new javax.swing.GroupLayout(dError.getContentPane());
        dError.getContentPane().setLayout(dErrorLayout);
        dErrorLayout.setHorizontalGroup(
            dErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dErrorLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(dErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dErrorLayout.createSequentialGroup()
                        .addComponent(bCerrarDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dErrorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89))))
        );
        dErrorLayout.setVerticalGroup(
            dErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dErrorLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bCerrarDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Monedas");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 300));
        setResizable(false);

        lEuro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lEuro.setText("€");

        tEuro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ControlEuro(evt);
            }
        });

        lDolar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lDolar.setText("$");

        tDolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ControlDolar(evt);
            }
        });

        lLibra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lLibra.setText("£");

        tLibra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ControlLibra(evt);
            }
        });

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlLimpiar(evt);
            }
        });

        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlCerrar(evt);
            }
        });

        lTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lTitulo.setText("Conversor Monedas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(bLimpiar)
                        .addGap(103, 103, 103)
                        .addComponent(bCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lDolar)
                        .addGap(18, 18, 18)
                        .addComponent(tDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lLibra)
                        .addGap(18, 18, 18)
                        .addComponent(tLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lTitulo)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lTitulo)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEuro)
                    .addComponent(tEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDolar)
                    .addComponent(tDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lLibra)
                    .addComponent(tLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLimpiar)
                    .addComponent(bCerrar))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ControlLimpiar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlLimpiar
        tDolar.setText(null);
        tEuro.setText(null);
        tLibra.setText(null);
        tEuro.requestFocus();
    }//GEN-LAST:event_ControlLimpiar

    private void ControlCerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlCerrar
        System.exit(0);
    }//GEN-LAST:event_ControlCerrar
  
    private void ControlEuro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ControlEuro
        try{
            double euro = Double.parseDouble(tEuro.getText());
            tDolar.setText(""+Math.round( (euro*1.23) * 100 ) / 100d);
            tLibra.setText(""+Math.round( (euro*0.88) * 100 ) / 100d);
        }catch(NumberFormatException e){
            switch(tEuro.getText()){
                case "":
                    tDolar.setText(null);
                    tEuro.setText(null);
                    tLibra.setText(null);
                    break;
                default:
                    dError.setVisible(true);
                    bCerrarDialog.requestFocus();
            }            
        }
            
    }//GEN-LAST:event_ControlEuro

    private void ControlDolar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ControlDolar
        try{
            double dolar = Double.parseDouble(tDolar.getText());
            tEuro.setText(""+Math.round( (dolar*0.81) * 100 ) / 100d);
            tLibra.setText(""+Math.round( (dolar*0.72) * 100 ) / 100d);
        }catch(NumberFormatException e){
            switch(tEuro.getText()){
                case "":
                    tDolar.setText(null);
                    tEuro.setText(null);
                    tLibra.setText(null);
                    break;
                default:
                    dError.setVisible(true);
                    bCerrarDialog.requestFocus();
            }
        }
    }//GEN-LAST:event_ControlDolar

    private void ControlLibra(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ControlLibra
        try{
            double libra = Double.parseDouble(tLibra.getText());
            tEuro.setText(""+Math.round( (libra*1.31) * 100 ) / 100d);
            tDolar.setText(""+Math.round( (libra*1.39) * 100 ) / 100d);
        }catch(NumberFormatException e){
            switch(tEuro.getText()){
                case "":
                    tDolar.setText(null);
                    tEuro.setText(null);
                    tLibra.setText(null);
                    break;
                default:
                    dError.setVisible(true);
                    bCerrarDialog.requestFocus();
            }
        }
    }//GEN-LAST:event_ControlLibra

    private void ControlBotonCerrarDialog(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ControlBotonCerrarDialog
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dError.setVisible(false);
        }
    }//GEN-LAST:event_ControlBotonCerrarDialog

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bCerrarDialog;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JDialog dError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lDolar;
    private javax.swing.JLabel lEuro;
    private javax.swing.JLabel lLibra;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tDolar;
    private javax.swing.JTextField tEuro;
    private javax.swing.JTextField tLibra;
    // End of variables declaration//GEN-END:variables
}
