package empreport.newpackage;

import java.sql.*;
import javax.swing.JOptionPane;

public class InternshipDepartment extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;

    public InternshipDepartment() {
        super("Department Form");
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
            String SQL = "SELECT * FROM DEPARTMENT";
            rs = stmt.executeQuery(SQL);
            rs.next();
            int id_col = rs.getInt("DEPTID");
            String dpid = Integer.toString(id_col);
            String dpname = rs.getString("DEPTNAME");

            deptid.setText(dpid);
            deptname.setText(dpname);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(InternshipDepartment.this, err.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back1 = new javax.swing.JButton();
        cancel2 = new javax.swing.JButton();
        CancelNewRecord = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deptid = new javax.swing.JTextField();
        deptname = new javax.swing.JTextField();
        UpdateRecord = new javax.swing.JButton();
        NewRecord = new javax.swing.JButton();
        SaveNewRecord = new javax.swing.JButton();
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

        CancelNewRecord.setText("Cancel");
        CancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelNewRecordActionPerformed(evt);
            }
        });

        jLabel3.setText("DEPARTMENT ID:");

        jLabel2.setText("DEPARTMENT NAME:");

        deptid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptidActionPerformed(evt);
            }
        });

        UpdateRecord.setText("Update");
        UpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateRecordActionPerformed(evt);
            }
        });

        NewRecord.setText("New");
        NewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRecordActionPerformed(evt);
            }
        });

        SaveNewRecord.setText("Save");
        SaveNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNewRecordActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deptname)
                    .addComponent(deptid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(NewRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveNewRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelNewRecord))
            .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deptid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(deptname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previous)
                            .addComponent(next))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewRecord)
                    .addComponent(UpdateRecord)
                    .addComponent(SaveNewRecord)
                    .addComponent(CancelNewRecord))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelNewRecordActionPerformed
        try {
            rs.absolute(curRow);
            deptname.setText(rs.getString("DEPTNAME"));
            deptid.setText(Integer.toString(rs.getInt("DEPTID")));
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);
            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(InternshipDepartment.this, err.getMessage());
        }
    }//GEN-LAST:event_CancelNewRecordActionPerformed

    private void deptidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptidActionPerformed

    private void UpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRecordActionPerformed
        String dpname = deptname.getText();
        String dpid = deptid.getText();

        int newID = Integer.parseInt(dpid);

        try {
            rs.updateInt("DEPTID", newID);
            rs.updateString("DEPTNAME", dpname);

            rs.updateRow();
            JOptionPane.showMessageDialog(InternshipDepartment.this, "Updated");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_UpdateRecordActionPerformed

    private void NewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRecordActionPerformed
        try {
            curRow = rs.getRow();
            deptname.setText("");
            deptid.setText("");

            UpdateRecord.setEnabled(false);
            NewRecord.setEnabled(false);
            SaveNewRecord.setEnabled(true);
            CancelNewRecord.setEnabled(true);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(InternshipDepartment.this, err.getMessage());
        }
    }//GEN-LAST:event_NewRecordActionPerformed

    private void SaveNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewRecordActionPerformed
        String dpname = deptname.getText();
        String dpid = deptid.getText();

        int newID = Integer.parseInt(dpid);

        try {
            rs.moveToInsertRow();
            rs.updateInt("DEPTID", newID);
            rs.updateString("DEPTNAME", dpname);
            rs.insertRow();
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM Department";
            rs = stmt.executeQuery(sql);
            rs.next();
            int id_col = rs.getInt("DEPTID");
            dpid = Integer.toString(id_col);
            String first2 = rs.getString("DEPTNAME");

            deptid.setText(dpid);
            deptname.setText(first2);

            deptname.setEnabled(true);
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);
            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
            JOptionPane.showMessageDialog(InternshipDepartment.this, "New Record Successfully Saved");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_SaveNewRecordActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {
            if (rs.next()) {
                int id_col = rs.getInt("DEPTID");
                String id = Integer.toString(id_col);
                String last = rs.getString("DEPTNAME");

                deptid.setText(id);

                deptname.setText(last);

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
                int id_col = rs.getInt("DEPTID");
                String id = Integer.toString(id_col);
                String last = rs.getString("DEPTNAME");

                deptid.setText(id);

                deptname.setText(last);
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
            java.util.logging.Logger.getLogger(InternshipDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InternshipDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InternshipDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InternshipDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InternshipDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelNewRecord;
    private javax.swing.JButton NewRecord;
    private javax.swing.JButton SaveNewRecord;
    private javax.swing.JButton UpdateRecord;
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JButton cancel2;
    private javax.swing.JTextField deptid;
    private javax.swing.JTextField deptname;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
