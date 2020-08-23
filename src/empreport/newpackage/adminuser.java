package empreport.newpackage;

import java.awt.Color;

public class adminuser extends javax.swing.JFrame {

    public adminuser() {
        super("Welcome");
        this.getContentPane().setBackground(Color.WHITE);

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        register = new javax.swing.JButton();
        main = new javax.swing.JButton();

        cancel2.setText("X");
        cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Welcome to Sooraj HR");

        user.setBackground(new java.awt.Color(255, 255, 51));
        user.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        user.setText("User");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        admin.setBackground(new java.awt.Color(255, 0, 0));
        admin.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        register.setBackground(new java.awt.Color(0, 204, 51));
        register.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        main.setBackground(new java.awt.Color(204, 0, 255));
        main.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        main.setText("Main");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(admin)
                .addGap(57, 57, 57)
                .addComponent(user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(register)
                .addGap(55, 55, 55)
                .addComponent(main)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin)
                    .addComponent(user)
                    .addComponent(register)
                    .addComponent(main))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        new LoginInternship2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminActionPerformed
    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        new AllUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userActionPerformed
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        new Register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed
    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mainActionPerformed
    private void cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel2ActionPerformed
        new adminuser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancel2ActionPerformed
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminuser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton cancel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton main;
    private javax.swing.JButton register;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}