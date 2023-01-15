
package admin;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.input;


/**
 *
 * @author Muhammad Hairil
 */
public final class inputdata extends javax.swing.JFrame {
    DefaultTableModel tabelModel;
     public static int statusSearching = 0;
    
    
    /**
     * Creates new form inputdata
     */
    public inputdata() {
        initComponents();
        tabelModel = new DefaultTableModel();
        tabeldata.setModel(tabelModel);
        
        tabelModel.addColumn("Nip");
        tabelModel.addColumn("Nama");
        tabelModel.addColumn("Jenis Kelamin");
        tabelModel.addColumn("Tempat Lahir");
        tabelModel.addColumn("Tanggal Lahir");
        tabelModel.addColumn("Pendidikan");
        calendar.setDateFormat(new SimpleDateFormat("yyyy-MM-dd")); //yyyy-MM-dd
        
        tampilTabel();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlahir = new javax.swing.JTextField();
        jnama = new javax.swing.JTextField();
        jnip = new javax.swing.JTextField();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        cmbkel = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bbaru = new javax.swing.JButton();
        bcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        kembali = new javax.swing.JButton();
        jpendidikan = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        calendar = new org.freixas.jcalendar.JCalendarCombo();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tempat, Tanggal Lahir");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 160, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Pendidikan Terakhir");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 220, 150, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 110, 40);

        jlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlahirActionPerformed(evt);
            }
        });
        getContentPane().add(jlahir);
        jlahir.setBounds(220, 190, 120, 30);
        getContentPane().add(jnama);
        jnama.setBounds(220, 110, 270, 30);

        jnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnipActionPerformed(evt);
            }
        });
        getContentPane().add(jnip);
        jnip.setBounds(220, 70, 270, 30);

        bedit.setBackground(new java.awt.Color(153, 255, 255));
        bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit.png"))); // NOI18N
        bedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        getContentPane().add(bedit);
        bedit.setBounds(120, 270, 100, 50);

        bhapus.setBackground(new java.awt.Color(153, 255, 255));
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-photo.png"))); // NOI18N
        bhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        getContentPane().add(bhapus);
        bhapus.setBounds(220, 270, 110, 50);

        bsimpan.setBackground(new java.awt.Color(153, 255, 255));
        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save (1).png"))); // NOI18N
        bsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(bsimpan);
        bsimpan.setBounds(20, 270, 100, 50);

        cmbkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        getContentPane().add(cmbkel);
        cmbkel.setBounds(220, 150, 120, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Nama Pegawai");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 100, 110, 40);

        bbaru.setBackground(new java.awt.Color(153, 255, 255));
        bbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh-page-option.png"))); // NOI18N
        bbaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbaruActionPerformed(evt);
            }
        });
        getContentPane().add(bbaru);
        bbaru.setBounds(330, 270, 110, 50);

        bcari.setBackground(new java.awt.Color(255, 255, 255));
        bcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bcari.png"))); // NOI18N
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });
        getContentPane().add(bcari);
        bcari.setBounds(600, 280, 40, 40);

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 810, 130);

        kembali.setBackground(new java.awt.Color(153, 255, 255));
        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back-arrow.png"))); // NOI18N
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali);
        kembali.setBounds(440, 270, 110, 50);
        getContentPane().add(jpendidikan);
        jpendidikan.setBounds(220, 230, 220, 30);

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        getContentPane().add(txtcari);
        txtcari.setBounds(640, 280, 180, 40);
        getContentPane().add(calendar);
        calendar.setBounds(340, 190, 220, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("INPUT DATA PEGAWAI");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 20, 250, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("NIP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 60, 110, 40);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 470);

        setSize(new java.awt.Dimension(826, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void jnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnipActionPerformed

    private void bbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbaruActionPerformed
        jnip.setText("");
        jnama.setText("");
        cmbkel.setSelectedItem("Laki-laki");
        jlahir.setText("");
        jpendidikan.setText("");
        
        jnip.requestFocus();
      
     
    }//GEN-LAST:event_bbaruActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        try
        {
        Connection konek = input.getKoneksi();
        String query = "INSERT INTO dpegawai VALUES(?,?,?,?,?,?)";
            try (PreparedStatement prepare = konek.prepareStatement(query)) {
                prepare.setString(1, jnip.getText());
                prepare.setString(2, jnama.getText());
                prepare.setString(3, (String) cmbkel.getSelectedItem());
                prepare.setString(4, jlahir.getText());
                prepare.setString(5, (String) calendar.getSelectedItem());
                prepare.setString(6, jpendidikan.getText());
                
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        }
        
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Data Sudah Ada");
            System.out.println(ex);
        }
        finally
        {

            tampilTabel();
            refresh();
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
    try
        {
        Connection konek = input.getKoneksi();
        String query = "UPDATE dpegawai SET nama = ?, jekel = ?, tempat = ?, tenggal = ?, pendidikan = ? WHERE nip = ?";
        try (PreparedStatement prepare = konek.prepareStatement(query)) {
            prepare.setString(1, jnama.getText());
            prepare.setString(2, (String) cmbkel.getSelectedItem());
            prepare.setString(3, jlahir.getText());
            prepare.setString(4, (String) calendar.getSelectedItem());
            prepare.setString(5, jpendidikan.getText());
            prepare.setString(6, jnip.getText());
            
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        }
        }
        
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Data gagal diubah");
            System.out.println(ex);
        }
        finally
        {
            tampilTabel();
        }
          
    }//GEN-LAST:event_beditActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
       try
        {
            Connection konek = input.getKoneksi();
            String query = "DELETE FROM dpegawai WHERE nip = ?";
           try (PreparedStatement prepare = konek.prepareStatement(query)) {
               prepare.setString(1, jnip.getText());
               prepare.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
           }
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            System.out.println(ex);
        }
        finally
        {
            tampilTabel();
            refresh();
        }
       
    }//GEN-LAST:event_bhapusActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
       menuutama a = new menuutama();
        a.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_kembaliActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
       int a = tabeldata.getSelectedRow();
        
        if(a == -1)
        {
            return;
        }
        
        String nip = (String) tabelModel.getValueAt(a, 0);
        jnip.setText(nip);
        String nama = (String) tabelModel.getValueAt(a, 1);
        jnama.setText(nama);
        String jekel = (String) tabelModel.getValueAt(a, 2);
        cmbkel.setSelectedItem(jekel);
        String tempat = (String) tabelModel.getValueAt(a, 3);
        jlahir.setText(tempat);
        String tglLahir = (String) tabelModel.getValueAt(a, 4);
        calendar.setSelectedItem(tglLahir);
        String pendidikan = (String) tabelModel.getValueAt(a, 5);
        jpendidikan.setText(pendidikan);
        
    }//GEN-LAST:event_tabeldataMouseClicked

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        tabelModel.getDataVector().removeAllElements();
	tabelModel.fireTableDataChanged();
        try
        {
            tabelModel.getDataVector().removeAllElements();
            Connection konek = input.getKoneksi();
            String query = "select * from dpegawai where nip LIKE '%"+txtcari.getText()+"%'"+ "OR nama LIKE '%"+txtcari.getText()+"%'"+ "ORDER BY nip";
            Statement state = konek.createStatement();
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next())
            {
                Object obj[] = new Object[6];
                obj[0] = rs.getString(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getString(4);
                obj[4] = rs.getString(5);
                obj[5] = rs.getString(6);
                
                
                tabelModel.addRow(obj);
            }
            
        
        } catch(SQLException ex)
        {
        }
        finally
        {
        }
    }//GEN-LAST:event_bcariActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
       
        
    }//GEN-LAST:event_txtcariActionPerformed

    private void jlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlahirActionPerformed
 public void tampilTabel()
    {
        tabelModel.getDataVector().removeAllElements();
	tabelModel.fireTableDataChanged();
        try
        {
            Connection konek = input.getKoneksi();
            Statement state = konek.createStatement();
            String query = "SELECT * FROM dpegawai";
            
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next())
            {
                Object obj[] = new Object[6];
                obj[0] = rs.getString(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getString(4);
                obj[4] = rs.getString(5);
                obj[5] = rs.getString(6);
                
                
                tabelModel.addRow(obj);
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    }
 public void refresh()
    {
        jnip.setText("");
        jnama.setText("");
        cmbkel.setSelectedIndex(0);
        jlahir.setText("");
        jpendidikan.setText("");
        jnip.requestFocus();
        
    }

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
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inputdata().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbaru;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private org.freixas.jcalendar.JCalendarCombo calendar;
    private javax.swing.JComboBox<String> cmbkel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jlahir;
    private javax.swing.JTextField jnama;
    private javax.swing.JTextField jnip;
    private javax.swing.JTextField jpendidikan;
    private javax.swing.JButton kembali;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
