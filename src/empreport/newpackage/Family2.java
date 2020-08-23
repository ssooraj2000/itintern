package empreport.newpackage;

import java.sql.*;
import javax.swing.JOptionPane;

public class Family2 extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;

    public Family2() {
        super("Family Details");
        initComponents();
        DoConnect();
        this.setLocationRelativeTo(null);

    }

    public void DoConnect() {
        try {
            String host = "jdbc:derby://localhost:1527/Department";
            String uName = "sooraj";
            String uPass = "sooraj";
            con = DriverManager.getConnection(host, uName, uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM FAMILY2";
            rs = stmt.executeQuery(SQL);
            rs.next();
            int id_col = rs.getInt("ID_EMPLOYEE");
            String iD = Integer.toString(id_col);
            int id_family = rs.getInt("FAMILY_ID");
            String idf = Integer.toString(id_family);

            id.setText(iD);
            familyid.setText(idf);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Family2.this, err.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        familyid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        last = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        first = new javax.swing.JButton();
        back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Employee:");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel3.setText("Family ID:");

        last.setText("Last");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        previous.setText("<");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        first.setText("First");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        back1.setText("⬅︎");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(last))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(familyid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first)
                    .addComponent(previous)
                    .addComponent(next)
                    .addComponent(last))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        try {
            rs.last();
            int id_col = rs.getInt("ID_EMPLOYEE");
            String iD = Integer.toString(id_col);
            int id_family = rs.getInt("FAMILY_ID");
            String idf = Integer.toString(id_family);

            id.setText(iD);
            familyid.setText(idf);

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Family2.this, err.getMessage());

        }
    }//GEN-LAST:event_lastActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {
            if (rs.next()) {
                int id_col = rs.getInt("ID_EMPLOYEE");
                String iD = Integer.toString(id_col);
                int id_family = rs.getInt("FAMILY_ID");
                String idf = Integer.toString(id_family);

                id.setText(iD);
                familyid.setText(idf);
            } else {
                rs.previous();
                JOptionPane.showMessageDialog(Family2.this, "End of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Family2.this, err.getMessage());

        }
    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        try {
            if (rs.previous()) {
                int id_col = rs.getInt("ID_EMPLOYEE");
                String iD = Integer.toString(id_col);
                int id_family = rs.getInt("FAMILY_ID");
                String idf = Integer.toString(id_family);

                id.setText(iD);
                familyid.setText(idf);

            } else {
                rs.next();
                JOptionPane.showMessageDialog(Family2.this, "Start of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Family2.this, err.getMessage());

        }
    }//GEN-LAST:event_previousActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        try {
            rs.first();
            int id_col = rs.getInt("ID_EMPLOYEE");
            String iD = Integer.toString(id_col);
            int id_family = rs.getInt("FAMILY_ID");
            String idf = Integer.toString(id_family);

            id.setText(iD);
            familyid.setText(idf);

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Family2.this, err.getMessage());

        }
    }//GEN-LAST:event_firstActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new AllUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(Family2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Family2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Family2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Family2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Family2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JTextField familyid;
    private javax.swing.JButton first;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton last;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
