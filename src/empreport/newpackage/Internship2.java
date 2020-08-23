package empreport.newpackage;

import java.sql.*;
import javax.swing.*;

public class Internship2 extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;

    public Internship2() {
        super("Employee Form");
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
            String SQL = "SELECT * FROM EMPLOYEE";
            rs = stmt.executeQuery(SQL);
            rs.next();
            int id_col = rs.getInt("ID");
            String id = Integer.toString(id_col);
            String first = rs.getString("First_Name");
            String last = rs.getString("Last_Name");
            String job = rs.getString("Job_Title");

            ID.setText(id);
            FirstName.setText(first);
            LastName.setText(last);
            JobTitle.setText(job);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Internship2.this, err.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back1 = new javax.swing.JButton();
        cancel2 = new javax.swing.JButton();
        next2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        previous2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        JobTitle = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back2 = new javax.swing.JButton();

        back1.setText("⬅︎");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        cancel2.setText("X");
        cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next2.setText(">");
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });
        getContentPane().add(next2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 183, -1, -1));

        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, -1, -1));

        previous2.setText("<");
        previous2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous2ActionPerformed(evt);
            }
        });
        getContentPane().add(previous2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 183, -1, -1));

        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, -1, -1));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 35, 154, -1));
        getContentPane().add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 69, 154, -1));

        JobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobTitleActionPerformed(evt);
            }
        });
        getContentPane().add(JobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 139, 154, -1));

        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });
        getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 107, 154, -1));

        jLabel1.setText("Job Title:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 144, -1, -1));

        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, -1, -1));

        back2.setText("⬅︎");
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });
        getContentPane().add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        try {
            if (rs.next()) {
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("First_Name");
                String last = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");

                ID.setText(id);
                FirstName.setText(first);
                LastName.setText(last);
                JobTitle.setText(job);

            } else {
                rs.previous();
                JOptionPane.showMessageDialog(null, "End of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());

        }
    }//GEN-LAST:event_next2ActionPerformed

    private void previous2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous2ActionPerformed
        try {
            if (rs.previous()) {
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("First_Name");
                String last = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");

                ID.setText(id);
                FirstName.setText(first);
                LastName.setText(last);
                JobTitle.setText(job);

            } else {
                rs.next();
                JOptionPane.showMessageDialog(null, "Start of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());

        }
    }//GEN-LAST:event_previous2ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void JobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JobTitleActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new adminuser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancel2ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        new AllUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back2ActionPerformed

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
            java.util.logging.Logger.getLogger(Internship2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internship2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internship2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internship2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Internship2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField JobTitle;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JButton cancel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton next2;
    private javax.swing.JButton previous2;
    // End of variables declaration//GEN-END:variables
}
