package empreport.newpackage;

import java.sql.*;
import javax.swing.JOptionPane;

public class Edit extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;

    public Edit() {
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
            String SQL = "SELECT * FROM ACCOUNTS";
            rs = stmt.executeQuery(SQL);
            rs.next();
            int id_col = rs.getInt("PASSWORD");
            String id = Integer.toString(id_col);
            String first = rs.getString("USERNAME");

            ID.setText(id);
            FirstName.setText(first);

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Edit.this, err.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateRecord = new javax.swing.JButton();
        SaveNewRecord = new javax.swing.JButton();
        NewRecord = new javax.swing.JButton();
        CancelNewRecord = new javax.swing.JButton();
        next2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        previous2 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        DeleteRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        NewRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewRecordMouseClicked(evt);
            }
        });
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

        next2.setText(">");
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Username:");

        previous2.setText("<");
        previous2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous2ActionPerformed(evt);
            }
        });

        back1.setText("⬅︎");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDMouseClicked(evt);
            }
        });
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        FirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNameMouseClicked(evt);
            }
        });

        DeleteRecord.setText("Delete");
        DeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NewRecord)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previous2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(next2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveNewRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelNewRecord))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteRecord)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(DeleteRecord)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previous2)
                    .addComponent(next2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateRecord)
                    .addComponent(NewRecord)
                    .addComponent(SaveNewRecord)
                    .addComponent(CancelNewRecord))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRecordActionPerformed
        String first = FirstName.getText();
        String id = ID.getText();

        int newID = Integer.parseInt(id);

        try {
            rs.updateInt("PASSWORD", newID);
            rs.updateString("USERNAME", first);
            rs.updateRow();
            JOptionPane.showMessageDialog(Edit.this, "Updated");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Edit.this, err.getMessage());
        }
    }//GEN-LAST:event_UpdateRecordActionPerformed

    private void SaveNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewRecordActionPerformed
        String first = FirstName.getText();
        String id = ID.getText();

        int newID = Integer.parseInt(id);

        try {
            rs.moveToInsertRow();
            rs.updateInt("PASSWORD", newID);
            rs.updateString("USERNAME", first);

            rs.insertRow();
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sql = "SELECT * FROM ACCOUNTS";
            rs = stmt.executeQuery(sql);

            rs.next();
            int id_col = rs.getInt("PASSWORD");
            id = Integer.toString(id_col);
            String first2 = rs.getString("USERNAME");

            ID.setText(id);
            FirstName.setText(first2);
            FirstName.setEnabled(true);
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);
            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
            JOptionPane.showMessageDialog(Edit.this, "New Record Successfully Saved");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Edit.this, err.getMessage());
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Edit.this, e.getMessage());        }
    }//GEN-LAST:event_SaveNewRecordActionPerformed

    private void NewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRecordActionPerformed
        try {
            curRow = rs.getRow();
            FirstName.setText("");
            ID.setText("");

            UpdateRecord.setEnabled(false);
            NewRecord.setEnabled(false);
            SaveNewRecord.setEnabled(true);
            CancelNewRecord.setEnabled(true);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Edit.this, err.getMessage());
        }
    }//GEN-LAST:event_NewRecordActionPerformed

    private void CancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelNewRecordActionPerformed
        try {
            rs.absolute(curRow);
            FirstName.setText(rs.getString("USERNAME"));
            ID.setText(Integer.toString(rs.getInt("PASSWORD")));
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);

            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Edit.this, err.getMessage());
        }
    }//GEN-LAST:event_CancelNewRecordActionPerformed

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        try {
            if (rs.next()) {
                int id_col = rs.getInt("PASSWORD");
                String id = Integer.toString(id_col);
                String first = rs.getString("USERNAME");

                ID.setText(id);
                FirstName.setText(first);

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
                int id_col = rs.getInt("PASSWORD");
                String id = Integer.toString(id_col);
                String first = rs.getString("USERNAME");

                ID.setText(id);
                FirstName.setText(first);

            } else {
                rs.next();
                JOptionPane.showMessageDialog(null, "Start of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());

        }
    }//GEN-LAST:event_previous2ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new MainReport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void DeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRecordActionPerformed
try{
           rs.deleteRow( );
    stmt.close();
    rs.close();
    stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
String sql="SELECT* FROM ACCOUNTS";

rs=stmt.executeQuery(sql);
rs.next( );
        int id_col = rs.getInt("PASSWORD");
       String id=Integer.toString(id_col);
       String first= rs.getString("USERNAME");
       
       ID.setText(id);
       FirstName.setText(first);
       
        JOptionPane.showMessageDialog(Edit.this, "Record Deleted");
       }
       catch(SQLException err)
       {
           JOptionPane.showMessageDialog(Edit.this, err.getMessage());
       }
    }//GEN-LAST:event_DeleteRecordActionPerformed

    private void NewRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRecordMouseClicked
FirstName.setText("Only Words");
ID.setText("Only Numbers");
    }//GEN-LAST:event_NewRecordMouseClicked

    private void FirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameMouseClicked
FirstName.setText(null);
    }//GEN-LAST:event_FirstNameMouseClicked

    private void IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseClicked
ID.setText(null);
    }//GEN-LAST:event_IDMouseClicked

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelNewRecord;
    private javax.swing.JButton DeleteRecord;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField ID;
    private javax.swing.JButton NewRecord;
    private javax.swing.JButton SaveNewRecord;
    private javax.swing.JButton UpdateRecord;
    private javax.swing.JButton back1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton next2;
    private javax.swing.JButton previous2;
    // End of variables declaration//GEN-END:variables
}
