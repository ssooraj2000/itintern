package empreport.newpackage;

import java.sql.*;
import javax.swing.JOptionPane;

public class Internship extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;

    public Internship() {
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
            JOptionPane.showMessageDialog(Internship.this, err.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        SaveNewRecord = new javax.swing.JButton();
        CancelNewRecord = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        JobTitle = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        UpdateRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NewRecord = new javax.swing.JButton();
        next2 = new javax.swing.JButton();
        previous2 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SaveNewRecord.setText("Save");
        SaveNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNewRecordActionPerformed(evt);
            }
        });

        CancelNewRecord.setText("Cancel");
        CancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelNewRecordActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("ID:");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        JobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobTitleActionPerformed(evt);
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

        jLabel1.setText("Job Title:");

        NewRecord.setText("New");
        NewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRecordActionPerformed(evt);
            }
        });

        next2.setText(">");
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NewRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveNewRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelNewRecord))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(JobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previous2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(next2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previous2)
                            .addComponent(next2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3))
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addComponent(JobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateRecord)
                    .addComponent(NewRecord)
                    .addComponent(SaveNewRecord)
                    .addComponent(CancelNewRecord))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewRecordActionPerformed
        String first = FirstName.getText();
        String last = LastName.getText();
        String job = JobTitle.getText();
        String id = ID.getText();

        int newID = Integer.parseInt(id);

        try {
            rs.moveToInsertRow();
            rs.updateInt("ID", newID);
            rs.updateString("First_Name", first);
            rs.updateString("Last_Name", last);
            rs.updateString("Job_Title", job);
            rs.insertRow();
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sql = "SELECT * FROM Employee";
            rs = stmt.executeQuery(sql);

            rs.next();
            int id_col = rs.getInt("ID");
            id = Integer.toString(id_col);
            String first2 = rs.getString("First_Name");
            String last2 = rs.getString("Last_Name");
            String job2 = rs.getString("Job_Title");

            ID.setText(id);
            FirstName.setText(first2);
            LastName.setText(last2);
            JobTitle.setText(job2);
            FirstName.setEnabled(true);
            LastName.setEnabled(true);
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);
            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
            JOptionPane.showMessageDialog(Internship.this, "New Record Successfully Saved");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_SaveNewRecordActionPerformed

    private void CancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelNewRecordActionPerformed
        try {
            rs.absolute(curRow);
            FirstName.setText(rs.getString("First_Name"));
            LastName.setText(rs.getString("Last_Name"));
            JobTitle.setText(rs.getString("Job_Title"));
            ID.setText(Integer.toString(rs.getInt("ID")));
            UpdateRecord.setEnabled(true);
            NewRecord.setEnabled(true);

            SaveNewRecord.setEnabled(false);
            CancelNewRecord.setEnabled(false);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Internship.this, err.getMessage());
        }
    }//GEN-LAST:event_CancelNewRecordActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void JobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JobTitleActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void UpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRecordActionPerformed
        String first = FirstName.getText();
        String last = LastName.getText();
        String job = JobTitle.getText();
        String id = ID.getText();

        int newID = Integer.parseInt(id);

        try {
            rs.updateInt("ID", newID);
            rs.updateString("First_Name", first);
            rs.updateString("last_Name", last);
            rs.updateString("Job_Title", job);
            rs.updateRow();
            JOptionPane.showMessageDialog(Internship.this, "Updated");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_UpdateRecordActionPerformed

    private void NewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRecordActionPerformed
        try {
            curRow = rs.getRow();
            FirstName.setText("");
            LastName.setText("");
            JobTitle.setText("");
            ID.setText("");

            UpdateRecord.setEnabled(false);
            NewRecord.setEnabled(false);
            SaveNewRecord.setEnabled(true);
            CancelNewRecord.setEnabled(true);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(Internship.this, err.getMessage());
        }
    }//GEN-LAST:event_NewRecordActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed

    }//GEN-LAST:event_previousActionPerformed

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

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new All().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1ActionPerformed
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
            java.util.logging.Logger.getLogger(Internship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Internship().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelNewRecord;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField JobTitle;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton NewRecord;
    private javax.swing.JButton SaveNewRecord;
    private javax.swing.JButton UpdateRecord;
    private javax.swing.JButton back1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton next;
    private javax.swing.JButton next2;
    private javax.swing.JButton previous;
    private javax.swing.JButton previous2;
    // End of variables declaration//GEN-END:variables
}