package empreport.newpackage;

import java.sql.*;
import javax.swing.*;

public class EmployeeDetails extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;

    public EmployeeDetails() {
        super("Employee Details");
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
            String SQL = "SELECT * FROM EMPLOYEE1";
            rs = stmt.executeQuery(SQL);
            rs.next();
            int id_col = rs.getInt("EMPID");
            String id = Integer.toString(id_col);
            String first = rs.getString("EMPNAME");
            String last = rs.getString("DEPTNAME");

            ID.setText(id);
            FirstName.setText(first);
            LastName.setText(last);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(EmployeeDetails.this, err.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back1 = new javax.swing.JButton();
        cancel2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        UpdateRecord = new javax.swing.JButton();
        SaveNewRecord = new javax.swing.JButton();
        NewRecord = new javax.swing.JButton();
        CancelNewRecord = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
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

        jLabel2.setText("Name:");

        jLabel3.setText("Department:");

        jLabel4.setText("Employee ID:");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        UpdateRecord.setText("Update");
        UpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateRecordActionPerformed(evt);
            }
        });

        SaveNewRecord.setText("Save");
        SaveNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNewRecordActionPerformed(evt);
            }
        });

        NewRecord.setText("New");
        NewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRecordActionPerformed(evt);
            }
        });

        CancelNewRecord.setText("Cancel");
        CancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelNewRecordActionPerformed(evt);
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

        back2.setText("⬅︎");
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(NewRecord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateRecord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveNewRecord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CancelNewRecord))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel2))
                                            .addComponent(jLabel3))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)))))
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(previous))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(next)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewRecord)
                    .addComponent(UpdateRecord)
                    .addComponent(SaveNewRecord)
                    .addComponent(CancelNewRecord))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void UpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRecordActionPerformed
        String first = FirstName.getText();
        String last = LastName.getText();
        String id = ID.getText();

        int newID = Integer.parseInt(id);

        try {
            rs.updateInt("EMPID", newID);
            rs.updateString("EMPNAME", first);
            rs.updateString("DEPTNAME", last);
            rs.updateRow();
            JOptionPane.showMessageDialog(EmployeeDetails.this, "Updated");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_UpdateRecordActionPerformed

    private void SaveNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewRecordActionPerformed
        String first = FirstName.getText();
        String last = LastName.getText();
        String id = ID.getText();

        int newID = Integer.parseInt(id);

        try {
            rs.moveToInsertRow();
            rs.updateInt("EMPID", newID);
            rs.updateString("EMPNAME", first);
            rs.updateString("DEPTNAME", last);

            rs.insertRow();
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sql = "SELECT * FROM EMPLOYEE1";
            rs = stmt.executeQuery(sql);

            rs.next();
            int id_col = rs.getInt("EMPID");
            id = Integer.toString(id_col);
            String first2 = rs.getString("EMPNAME");
            String last2 = rs.getString("DEPTNAME");

            ID.setText(id);
            FirstName.setText(first2);
            LastName.setText(last2);
            FirstName.setEnabled(true);
            LastName.setEnabled(true);
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);
            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
            JOptionPane.showMessageDialog(EmployeeDetails.this, "New Record Successfully Saved");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_SaveNewRecordActionPerformed

    private void NewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRecordActionPerformed
        try {
            curRow = rs.getRow();
            FirstName.setText("");
            LastName.setText("");
            ID.setText("");

            UpdateRecord.setEnabled(false);
            NewRecord.setEnabled(false);
            SaveNewRecord.setEnabled(true);
            CancelNewRecord.setEnabled(true);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(EmployeeDetails.this, err.getMessage());
        }
    }//GEN-LAST:event_NewRecordActionPerformed

    private void CancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelNewRecordActionPerformed
        try {
            rs.absolute(curRow);
            FirstName.setText(rs.getString("EMPNAME"));
            LastName.setText(rs.getString("DEPTNAME"));
            ID.setText(Integer.toString(rs.getInt("EMPID")));
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);

            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(EmployeeDetails.this, err.getMessage());
        }
    }//GEN-LAST:event_CancelNewRecordActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {
            if (rs.next()) {
                int id_col = rs.getInt("EMPID");
                String id = Integer.toString(id_col);
                String first = rs.getString("EMPNAME");
                String last = rs.getString("DEPTNAME");

                ID.setText(id);
                FirstName.setText(first);
                LastName.setText(last);

            } else {
                rs.previous();
                JOptionPane.showMessageDialog(null, "End of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());

        }
    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        try {
            if (rs.previous()) {
                int id_col = rs.getInt("EMPID");
                String id = Integer.toString(id_col);
                String first = rs.getString("EMPNAME");
                String last = rs.getString("DEPTNAME");

                ID.setText(id);
                FirstName.setText(first);
                LastName.setText(last);
            } else {
                rs.next();
                JOptionPane.showMessageDialog(null, "Start of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());

        }
    }//GEN-LAST:event_previousActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new adminuser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancel2ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        new All().setVisible(true);
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
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelNewRecord;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton NewRecord;
    private javax.swing.JButton SaveNewRecord;
    private javax.swing.JButton UpdateRecord;
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JButton cancel2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
