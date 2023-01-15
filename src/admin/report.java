
package admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import koneksi.input;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Muhammad Hairil
 */
public final class report extends javax.swing.JFrame {
     public datagaji fAB = null;
DefaultTableModel tabelModel;
    /**
     * Creates new form report
     */
    public report() {
        initComponents();
        tabelModel = new DefaultTableModel();
        tabeldata.setModel(tabelModel);
        
        tabelModel.addColumn("Nip");
        tabelModel.addColumn("Nama");
        tabelModel.addColumn("Jenis Kelamin");
        tabelModel.addColumn("Tempat");
        tabelModel.addColumn("Tanggal Lahir");
        tabelModel.addColumn("Pendidikan");
        tabelModel.addColumn("Pangkat/Gol");
        tabelModel.addColumn("Jabatan");
        tabelModel.addColumn("Masa Kerja");
        tabelModel.addColumn("Gaji");
        
        tampilTabel();
    
    }
    public void tampilTabel()
    {
        tabelModel.getDataVector().removeAllElements();
	tabelModel.fireTableDataChanged();
        try
        {
            Connection konek = input.getKoneksi();
            Statement state = konek.createStatement();
            String query = "SELECT * FROM laporan";
            
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next())
            {
                Object obj[] = new Object[10];
                obj[0] = rs.getString(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getString(4);
                obj[4] = rs.getString(5);
                obj[5] = rs.getString(6);
                obj[6] = rs.getString(7);
                obj[7] = rs.getString(8);
                obj[8] = rs.getString(9);
                obj[9] = rs.getString(10);
                
                
                tabelModel.addRow(obj);
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        jScrollPane1.setBounds(10, 80, 800, 360);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("cetak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 450, 110, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 450, 100, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("CETAK LAPORAN GAJI PEGAWAI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 20, 360, 24);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 510);

        setSize(new java.awt.Dimension(833, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
       int a = tabeldata.getSelectedRow();
       if(a == -1)
        {
        }
    }//GEN-LAST:event_tabeldataMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         menuutama a = new menuutama();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
           String file = "src/laporan/laporanarsip.jasper";
           JasperPrint jp = JasperFillManager.fillReport(file, null, input.getKoneksi());
           JasperViewer jv = new JasperViewer(jp, false);
           jv.setVisible(true);
        } catch (JRException e){
        }
           
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new report().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    // End of variables declaration//GEN-END:variables
}
