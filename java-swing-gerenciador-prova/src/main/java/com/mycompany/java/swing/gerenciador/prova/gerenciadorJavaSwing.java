/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.swing.gerenciador.prova;

import java.util.Random;

/**
 *
 * @author Bolacha Nerd
 */
public class gerenciadorJavaSwing extends javax.swing.JFrame {

    /**
     * Creates new form gerenciadorJavaSwing
     */
    public gerenciadorJavaSwing() {
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

        lblCpu = new javax.swing.JLabel();
        lblMax1 = new javax.swing.JLabel();
        lblMed1 = new javax.swing.JLabel();
        lblMin1 = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        lblMax2 = new javax.swing.JLabel();
        lblMed2 = new javax.swing.JLabel();
        lblMin2 = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        lblMax3 = new javax.swing.JLabel();
        lblMed3 = new javax.swing.JLabel();
        lblMin3 = new javax.swing.JLabel();
        pbRam = new javax.swing.JProgressBar();
        pbCpu = new javax.swing.JProgressBar();
        pbDisco = new javax.swing.JProgressBar();
        btnAcao = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lblValor3 = new javax.swing.JLabel();
        lblValor4 = new javax.swing.JLabel();
        lblValor5 = new javax.swing.JLabel();
        lblValor6 = new javax.swing.JLabel();
        lblValor7 = new javax.swing.JLabel();
        lblValor8 = new javax.swing.JLabel();
        lblValor9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCpu.setText("CPU:");

        lblMax1.setText("Máximo:");

        lblMed1.setText("Média:");

        lblMin1.setText("Mínimo:");

        lblDisco.setText("Disco:");

        lblMax2.setText("Máximo:");

        lblMed2.setText("Média:");

        lblMin2.setText("Mínimo:");

        lblRam.setText("RAM:");

        lblMax3.setText("Máximo:");

        lblMed3.setText("Média:");

        lblMin3.setText("Mínimo:");

        pbRam.setStringPainted(true);

        pbCpu.setStringPainted(true);

        pbDisco.setStringPainted(true);

        btnAcao.setText("Fazer leitura dos dados");
        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        lblValor1.setText("0");

        lblValor2.setText("0");

        lblValor3.setText("0");

        lblValor4.setText("0");

        lblValor5.setText("0");

        lblValor6.setText("0");

        lblValor7.setText("0");

        lblValor8.setText("0");

        lblValor9.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisco)
                    .addComponent(lblRam)
                    .addComponent(pbRam, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpu))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMax3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMed3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMin3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMax2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addComponent(lblMed2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(13, 13, 13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMax1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValor7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(lblValor6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnAcao)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMax1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCpu)))
                        .addGap(18, 18, 18)
                        .addComponent(lblMed1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblMin1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(pbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor1)
                        .addGap(18, 18, 18)
                        .addComponent(lblValor2)
                        .addGap(18, 18, 18)
                        .addComponent(lblValor3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDisco)
                        .addComponent(lblMax2))
                    .addComponent(lblValor4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMed2)
                    .addComponent(lblValor5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAcao)
                                .addComponent(lblMin2)
                                .addComponent(lblValor6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(lblMin3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblRam)
                                    .addGap(44, 44, 44)
                                    .addComponent(pbRam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor7)
                            .addComponent(lblMax3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor8)
                            .addComponent(lblMed3))
                        .addGap(18, 18, 18)
                        .addComponent(lblValor9)
                        .addGap(8, 8, 8)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    // Declarando variável global para que as informações
    // possam ser usadas mais de uma vez dentro da Ação do botão
    Integer  plusCpu = 0, plusDisco = 0, plusRam = 0, click = 0, max1 = 0, max2 = 0, max3 = 0, min1 = 101, min2 = 101, min3 = 101; 
    Double mediaCpu , mediaDisco , mediaRam;
 
    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
        Random randomico = new Random();
        
        //Randomizando número para integrar logo em seguida em "plusCpu, plusDisco e plusRam"
        Integer cpuNumero = randomico.nextInt(101);
        Integer discoNumero = randomico.nextInt(101);
        Integer ramNumero = randomico.nextInt(101);
        click++;
        
        plusCpu += cpuNumero;
        plusDisco += discoNumero;  
        plusRam += ramNumero;
                
        //Tirando média com valor em double, por conta da divisão gerada que 
        //podem haver números com mais de uma casa decimal
        mediaCpu = Double.valueOf(plusCpu) / Double.valueOf(click);
        mediaDisco = Double.valueOf(plusDisco) / Double.valueOf(click);
        mediaRam = Double.valueOf(plusRam) / Double.valueOf(click);
        
        pbCpu.setValue(cpuNumero);
        pbDisco.setValue(discoNumero);
        pbRam.setValue(ramNumero);
        
        // CPU MÁX, MÍNIMO E MÉDIA RESPECTIVAMENTE
        if(cpuNumero > max1){
           max1 = cpuNumero;
           lblValor1.setText(String.format("%d %%",max1));
        }
        if(cpuNumero < min1){
           min1 = cpuNumero;
           lblValor3.setText(String.format("%d %%",min1));
        }
           lblValor2.setText(String.format("%.1f %%",mediaCpu));
        
        // DISCO MÁX, MÍNIMO E MÉDIA RESPECTIVAMENTE
        if(discoNumero > max2){
           max2 = discoNumero;
           lblValor4.setText(String.format("%d %%",max2));
        }
        if(discoNumero < min2){
           min2 = discoNumero;
           lblValor6.setText(String.format("%d %%",min2));
        }
           lblValor5.setText(String.format("%.1f %%",mediaDisco));

        // RAM MÁX, MÍNIMO E MÉDIA RESPECTIVAMENTE 
        if(ramNumero > max3){
           max3 = ramNumero;
           lblValor7.setText(String.format("%d %%",max3));
        }
        if(ramNumero < min3){
           min3 = ramNumero;
           lblValor9.setText(String.format("%d %%",min3));
        }
           lblValor8.setText(String.format("%.1f %%",mediaRam)); 
    }//GEN-LAST:event_btnAcaoActionPerformed

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
            java.util.logging.Logger.getLogger(gerenciadorJavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gerenciadorJavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gerenciadorJavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gerenciadorJavaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gerenciadorJavaSwing().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMax1;
    private javax.swing.JLabel lblMax2;
    private javax.swing.JLabel lblMax3;
    private javax.swing.JLabel lblMed1;
    private javax.swing.JLabel lblMed2;
    private javax.swing.JLabel lblMed3;
    private javax.swing.JLabel lblMin1;
    private javax.swing.JLabel lblMin2;
    private javax.swing.JLabel lblMin3;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JLabel lblValor3;
    private javax.swing.JLabel lblValor4;
    private javax.swing.JLabel lblValor5;
    private javax.swing.JLabel lblValor6;
    private javax.swing.JLabel lblValor7;
    private javax.swing.JLabel lblValor8;
    private javax.swing.JLabel lblValor9;
    private javax.swing.JProgressBar pbCpu;
    private javax.swing.JProgressBar pbDisco;
    private javax.swing.JProgressBar pbRam;
    // End of variables declaration//GEN-END:variables
}
