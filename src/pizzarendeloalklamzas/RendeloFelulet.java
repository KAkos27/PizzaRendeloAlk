/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzarendeloalklamzas;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Kakimatyi03
 */
public class RendeloFelulet extends javax.swing.JFrame {

    private static SpinnerNumberModel jSpinner1(int i, int i0, int MAX_VALUE, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form RendeloFelulet
     */
    public RendeloFelulet() {
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

        BTGTesztatipus = new javax.swing.ButtonGroup();
        BTGPizzameret = new javax.swing.ButtonGroup();
        PPizzak = new javax.swing.JPanel();
        CMBPizzaValaszto = new javax.swing.JComboBox<>();
        PTesztatipus = new javax.swing.JPanel();
        RBNewYork = new javax.swing.JRadioButton();
        RBNeapolitan = new javax.swing.JRadioButton();
        CBTeljeskiorlesu = new javax.swing.JCheckBox();
        PPizzameret = new javax.swing.JPanel();
        RB24 = new javax.swing.JRadioButton();
        RB32 = new javax.swing.JRadioButton();
        RB40 = new javax.swing.JRadioButton();
        PExtrak = new javax.swing.JPanel();
        CBOlivaolaj = new javax.swing.JCheckBox();
        CBMozzarella = new javax.swing.JCheckBox();
        CBChili = new javax.swing.JCheckBox();
        CBBacon = new javax.swing.JCheckBox();
        POsszegzes = new javax.swing.JPanel();
        LBFizetendo = new javax.swing.JLabel();
        BTRendeles = new javax.swing.JButton();
        TFFizetendo = new javax.swing.JTextField();
        LBMennyiseg = new javax.swing.JLabel();
        SPMennyiseg = new javax.swing.JSpinner();
        BTKiszamol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Rendelés");
        setMinimumSize(new java.awt.Dimension(425, 425));

        PPizzak.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizzák:"));

        CMBPizzaValaszto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--->Válassz<---", "Margherita (1780 Ft)", "Quattro Formaggi (1990 Ft)", "Magyaros (2190 Ft)", "Napoli (1890 Ft)" }));
        CMBPizzaValaszto.setToolTipText("");
        CMBPizzaValaszto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CMBPizzaValaszto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBPizzaValasztoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PPizzakLayout = new javax.swing.GroupLayout(PPizzak);
        PPizzak.setLayout(PPizzakLayout);
        PPizzakLayout.setHorizontalGroup(
            PPizzakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPizzakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CMBPizzaValaszto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PPizzakLayout.setVerticalGroup(
            PPizzakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPizzakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CMBPizzaValaszto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PTesztatipus.setBorder(javax.swing.BorderFactory.createTitledBorder("Tészta típus:"));

        BTGTesztatipus.add(RBNewYork);
        RBNewYork.setSelected(true);
        RBNewYork.setText("\"New York\" stílus");
        RBNewYork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BTGTesztatipus.add(RBNeapolitan);
        RBNeapolitan.setText("Neapolitan");
        RBNeapolitan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CBTeljeskiorlesu.setText("Teljeskiörlésű (+150 Ft)");
        CBTeljeskiorlesu.setToolTipText("");
        CBTeljeskiorlesu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PTesztatipusLayout = new javax.swing.GroupLayout(PTesztatipus);
        PTesztatipus.setLayout(PTesztatipusLayout);
        PTesztatipusLayout.setHorizontalGroup(
            PTesztatipusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTesztatipusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PTesztatipusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PTesztatipusLayout.createSequentialGroup()
                        .addComponent(RBNewYork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(PTesztatipusLayout.createSequentialGroup()
                        .addComponent(RBNeapolitan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62))
                    .addComponent(CBTeljeskiorlesu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        PTesztatipusLayout.setVerticalGroup(
            PTesztatipusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTesztatipusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RBNewYork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBNeapolitan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBTeljeskiorlesu)
                .addContainerGap())
        );

        PPizzameret.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizza méret:"));

        BTGPizzameret.add(RB24);
        RB24.setText("24 cm");
        RB24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BTGPizzameret.add(RB32);
        RB32.setSelected(true);
        RB32.setText("32 cm");
        RB32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BTGPizzameret.add(RB40);
        RB40.setText("40 cm");
        RB40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PPizzameretLayout = new javax.swing.GroupLayout(PPizzameret);
        PPizzameret.setLayout(PPizzameretLayout);
        PPizzameretLayout.setHorizontalGroup(
            PPizzameretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPizzameretLayout.createSequentialGroup()
                .addGroup(PPizzameretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RB32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RB40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        PPizzameretLayout.setVerticalGroup(
            PPizzameretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPizzameretLayout.createSequentialGroup()
                .addComponent(RB24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RB32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RB40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PExtrak.setBorder(javax.swing.BorderFactory.createTitledBorder("Extrák:"));

        CBOlivaolaj.setText("Olívaolaj (+50 Ft)");
        CBOlivaolaj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CBMozzarella.setText("Mozzarella (+100 Ft)");
        CBMozzarella.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CBChili.setText("Chili (+75 Ft)");
        CBChili.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CBBacon.setText("Bacon (+100 Ft)");
        CBBacon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PExtrakLayout = new javax.swing.GroupLayout(PExtrak);
        PExtrak.setLayout(PExtrakLayout);
        PExtrakLayout.setHorizontalGroup(
            PExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBMozzarella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PExtrakLayout.createSequentialGroup()
                        .addComponent(CBChili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(PExtrakLayout.createSequentialGroup()
                        .addComponent(CBBacon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(PExtrakLayout.createSequentialGroup()
                        .addComponent(CBOlivaolaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        PExtrakLayout.setVerticalGroup(
            PExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CBMozzarella)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBChili)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBBacon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBOlivaolaj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        POsszegzes.setBorder(javax.swing.BorderFactory.createTitledBorder("Összegzés:"));

        LBFizetendo.setText("Fizetendő:");

        BTRendeles.setText("Rendelés leadása");
        BTRendeles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTRendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRendelesActionPerformed(evt);
            }
        });

        TFFizetendo.setEnabled(false);

        LBMennyiseg.setText("Mennyiség:");

        SPMennyiseg.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        SPMennyiseg.setBorder(null);
        SPMennyiseg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SPMennyiseg.setName(""); // NOI18N

        BTKiszamol.setText("Kiszámol");
        BTKiszamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTKiszamolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout POsszegzesLayout = new javax.swing.GroupLayout(POsszegzes);
        POsszegzes.setLayout(POsszegzesLayout);
        POsszegzesLayout.setHorizontalGroup(
            POsszegzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POsszegzesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POsszegzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTKiszamol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTRendeles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(POsszegzesLayout.createSequentialGroup()
                        .addComponent(LBMennyiseg, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SPMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(POsszegzesLayout.createSequentialGroup()
                        .addComponent(LBFizetendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        POsszegzesLayout.setVerticalGroup(
            POsszegzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POsszegzesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POsszegzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBMennyiseg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTKiszamol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(POsszegzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBFizetendo)
                    .addComponent(TFFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTRendeles)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PTesztatipus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PPizzameret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PExtrak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POsszegzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PPizzak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PPizzak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PTesztatipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PPizzameret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(POsszegzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PExtrak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CMBPizzaValasztoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBPizzaValasztoActionPerformed
        // TODO add your handling code here:
        String pizza = (String)CMBPizzaValaszto.getSelectedItem();
        int index = CMBPizzaValaszto.getSelectedIndex();
        if(index == 1){
            JOptionPane.showMessageDialog(rootPane,"Választott: " + pizza + "\nHozzávalók: Paradicsomszósz, Mozzarella", "Pizza típus", JOptionPane.PLAIN_MESSAGE);
        }else if(index == 2){
            JOptionPane.showMessageDialog(rootPane, "Választott: " + pizza + "\nHozzávalók: Paradicsomszósz, Mozzarella, Parmezán, Brie, Gorgonzola","Pizza típus", JOptionPane.PLAIN_MESSAGE);
        }else if(index == 3){
            JOptionPane.showMessageDialog(rootPane, "Választott: " + pizza + "\nHozzávalók: Paradicsomszósz, Mozzarella, Kolbász, Szalonna","Pizza típus", JOptionPane.PLAIN_MESSAGE);
        }else if(index == 4){
            JOptionPane.showMessageDialog(rootPane, "Választott: " + pizza + "\nHozzávalók: Paradicsomszósz, Szardella, Olívaolaj","Pizza típus", JOptionPane.PLAIN_MESSAGE);        
        }else{
             
        }
        
    }//GEN-LAST:event_CMBPizzaValasztoActionPerformed

    private void BTRendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRendelesActionPerformed
        int index = CMBPizzaValaszto.getSelectedIndex();
        if(index ==0){
            TFFizetendo.setText("");
            JOptionPane.showMessageDialog(rootPane, "Hiba!\nNem választottál pizzát!", "Hiba!", JOptionPane.ERROR_MESSAGE);
         }else{
            JOptionPane.showMessageDialog(rootPane, "Köszönjük a rendelést!","Rendelés visszaigazolás", JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_BTRendelesActionPerformed

    private void BTKiszamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTKiszamolActionPerformed
        int index = CMBPizzaValaszto.getSelectedIndex();
        int osszeg = 0;
        int mennyiseg = (int) SPMennyiseg.getValue();
        
        if(index ==0){
            TFFizetendo.setText("");
            JOptionPane.showMessageDialog(rootPane, "Hiba!\nNem választottál pizzát!", "Hiba!", JOptionPane.ERROR_MESSAGE);
        }
        if (index == 1){
            osszeg += 1780;
        }
        if (index == 2){
            osszeg += 1990;
        }
        if (index == 3){
            osszeg += 2190;
        }
        if (index == 4){
            osszeg += 1890;
        }
        if (CBTeljeskiorlesu.isSelected()){
            osszeg += 150;
        }
        if (RB24.isSelected()){
            osszeg -= 125;
        }
        if (RB40.isSelected()){
            osszeg += 125;
        }
        if (CBMozzarella.isSelected()){
            osszeg += 100;
        }
        if (CBChili.isSelected()){
            osszeg += 75;
        }
        if (CBBacon.isSelected()){
            osszeg += 100;
        }
        if (CBOlivaolaj.isSelected()){
            osszeg += 50;
        }
        
        osszeg = osszeg * mennyiseg;
        
        if(index > 0){ 
            TFFizetendo.setText(osszeg + " Ft");
        }
    }//GEN-LAST:event_BTKiszamolActionPerformed

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
            java.util.logging.Logger.getLogger(RendeloFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RendeloFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RendeloFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RendeloFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RendeloFelulet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTGPizzameret;
    private javax.swing.ButtonGroup BTGTesztatipus;
    private javax.swing.JButton BTKiszamol;
    private javax.swing.JButton BTRendeles;
    private javax.swing.JCheckBox CBBacon;
    private javax.swing.JCheckBox CBChili;
    private javax.swing.JCheckBox CBMozzarella;
    private javax.swing.JCheckBox CBOlivaolaj;
    private javax.swing.JCheckBox CBTeljeskiorlesu;
    private javax.swing.JComboBox<String> CMBPizzaValaszto;
    private javax.swing.JLabel LBFizetendo;
    private javax.swing.JLabel LBMennyiseg;
    private javax.swing.JPanel PExtrak;
    private javax.swing.JPanel POsszegzes;
    private javax.swing.JPanel PPizzak;
    private javax.swing.JPanel PPizzameret;
    private javax.swing.JPanel PTesztatipus;
    private javax.swing.JRadioButton RB24;
    private javax.swing.JRadioButton RB32;
    private javax.swing.JRadioButton RB40;
    private javax.swing.JRadioButton RBNeapolitan;
    private javax.swing.JRadioButton RBNewYork;
    private javax.swing.JSpinner SPMennyiseg;
    private javax.swing.JTextField TFFizetendo;
    // End of variables declaration//GEN-END:variables
}
