
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Member_Registration_Form extends javax.swing.JFrame {

    /**
     * Creates new form Member_Registration_Form
     */
    public Member_Registration_Form() {
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

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        lb15 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf11 = new javax.swing.JTextField();
        tf13 = new javax.swing.JTextField();
        tf14 = new javax.swing.JTextField();
        tf15 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        tf12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tf3 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setText("Name");
        getContentPane().add(lb1);
        lb1.setBounds(110, 270, 95, 23);

        lb2.setText("Father's Name");
        getContentPane().add(lb2);
        lb2.setBounds(600, 270, 95, 23);

        lb5.setText("Mobile");
        getContentPane().add(lb5);
        lb5.setBounds(110, 350, 95, 23);

        lb3.setText("DOB");
        getContentPane().add(lb3);
        lb3.setBounds(110, 310, 95, 23);

        lb7.setText("Aadhar");
        getContentPane().add(lb7);
        lb7.setBounds(110, 390, 95, 23);

        lb4.setText("Gender");
        getContentPane().add(lb4);
        lb4.setBounds(600, 310, 95, 23);

        lb6.setText("DOJ");
        getContentPane().add(lb6);
        lb6.setBounds(600, 350, 95, 23);

        lb8.setText("ID Proof");
        getContentPane().add(lb8);
        lb8.setBounds(600, 390, 95, 23);

        lb9.setText("ID Proof Number");
        getContentPane().add(lb9);
        lb9.setBounds(100, 430, 95, 23);

        lb10.setText("Card Number");
        getContentPane().add(lb10);
        lb10.setBounds(600, 430, 95, 20);

        lb11.setText("RF Number");
        getContentPane().add(lb11);
        lb11.setBounds(100, 470, 95, 23);

        lb13.setText("First Use");
        getContentPane().add(lb13);
        lb13.setBounds(100, 510, 95, 23);

        lb15.setText("OutStatus");
        getContentPane().add(lb15);
        lb15.setBounds(100, 550, 95, 23);

        lb14.setText("Last use");
        getContentPane().add(lb14);
        lb14.setBounds(600, 510, 95, 23);

        lb12.setText("Member Type");
        getContentPane().add(lb12);
        lb12.setBounds(600, 470, 95, 23);
        getContentPane().add(tf1);
        tf1.setBounds(240, 270, 83, 23);
        getContentPane().add(tf7);
        tf7.setBounds(240, 390, 83, 23);
        getContentPane().add(tf5);
        tf5.setBounds(240, 350, 83, 23);

        tf9.setText("0");
        getContentPane().add(tf9);
        tf9.setBounds(240, 430, 83, 23);
        getContentPane().add(tf11);
        tf11.setBounds(240, 470, 83, 23);
        getContentPane().add(tf13);
        tf13.setBounds(240, 510, 83, 23);
        getContentPane().add(tf14);
        tf14.setBounds(740, 510, 83, 23);

        tf15.setText("false");
        getContentPane().add(tf15);
        tf15.setBounds(240, 550, 83, 23);
        getContentPane().add(tf2);
        tf2.setBounds(740, 270, 83, 23);
        getContentPane().add(tf4);
        tf4.setBounds(740, 310, 83, 23);
        getContentPane().add(tf6);
        tf6.setBounds(740, 350, 83, 23);

        tf8.setText("0");
        getContentPane().add(tf8);
        tf8.setBounds(740, 390, 83, 23);
        getContentPane().add(tf10);
        tf10.setBounds(740, 430, 83, 23);
        getContentPane().add(tf12);
        tf12.setBounds(740, 470, 83, 23);

        jButton1.setText("Add Record");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 560, 100, 42);

        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(650, 560, 90, 42);
        getContentPane().add(tf3);
        tf3.setBounds(240, 310, 80, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CYMERA_20170707_173221.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 930);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 110, 590, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         home_page hp=new home_page();
        
       
          PreparedStatement stmt=null;
        Connection conn=null;
        
         final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
         final String DB_URL="jdbc:mysql://localhost/sanjhi_cycle";
         final String USER_NAME="root";
         final String PASS="";
         String sql1="insert into member_registration_form values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
         try{
             Class.forName(JDBC_DRIVER);
             conn=(Connection)DriverManager.getConnection(DB_URL,USER_NAME,PASS);
             stmt=conn.prepareStatement(sql1);
             
             long mobile=Long.parseLong(tf5.getText());
             long adhar=Long.parseLong(tf7.getText());
             int idProofNo=Integer.parseInt(tf9.getText());
             int cardNo=Integer.parseInt(tf10.getText());
             int rfNo=Integer.parseInt(tf11.getText());
             
             
             stmt.setString(1,tf1.getText());
             stmt.setString(2,tf2.getText());
             stmt.setString(3,tf3.getText());
             stmt.setString(4,tf4.getText());
             stmt.setLong(5,mobile);
             stmt.setString(6,tf6.getText());
             if(adhar!=0)
             {
             stmt.setLong(7,adhar);
             stmt.setString(8,"0");
             stmt.setString(9,"0");
             }
             else
             {
             stmt.setInt(7,0);
             stmt.setString(8,tf8.getText());
             stmt.setInt(9,idProofNo);
             }
             stmt.setInt(10,cardNo);
             stmt.setInt(11,rfNo);
             stmt.setString(12,tf12.getText());
             stmt.setString(13,tf13.getText());
             stmt.setString(14,tf14.getText());
             stmt.setString(15,tf15.getText());
             
             stmt.execute();
             JOptionPane.showMessageDialog(this,"Record Inserted Successfully");
         }
         catch(Exception er)
         {
             JOptionPane.showMessageDialog(null,er.getMessage());
         }
       hp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         Member_Registration_Form mrf=new Member_Registration_Form();
         final String JDBC_DRIVER ="com.mysql.jdbc.Driver";;
         final String DB_URL="jdbc:mysql://localhost/sanjhi_cycle";
         final String USER_NAME="root";
         final String PASS="";
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
         if(p==0){
           
            try{
                
                String value1=tf1.getText();
                String value2=tf2.getText();
                String value3=tf3.getText();
                String value4=tf4.getText();
               // String value5=tf5.getText();
                String value6=tf6.getText();
                String value7=tf7.getText();
                String value8=tf8.getText();
                String value9=tf9.getText();
                String value10=tf10.getText();
                String value11=tf11.getText();
                String value12=tf12.getText();
                String value13=tf13.getText();
                String value14=tf14.getText();
                String value15=tf15.getText();
                
                 long mobile=Long.parseLong(tf5.getText());
                 long adhar=Long.parseLong(tf7.getText());
                 int idProofNo=Integer.parseInt(tf9.getText());
                 int cardNo=Integer.parseInt(tf10.getText());
                 int rfNo=Integer.parseInt(tf11.getText());
               // String temp="ABCD";
             
             
            /*   String sql= "update entries"
                        + "set Aadhar='"+adhar+"',Name='"+value1+"',Father_Name='"+value2+"', DOB='"+value3+"', "
                        + "Gender='"+value4+"',Mobile='"+mobile+"',DOJ='"+value6+"',ID_Proof='"+value8+"',ID_Proof_Number= '"+value9+"', "
                        + "Card_Number='"+value10+"',RF_Number ='"+value11+"',Member_Type='"+value12+"',First_Use='"+value13+"',Last_Use='"+value14+"',Out_Status='"+value15+"' "
                        + "where Card_Number='"+cardNo+"' ";*/
              
               String sql= "update member_registration_form set Name='"+value1+"',Father_Name='"+value2+"',"
                       + "DOB='"+value3+"',Gender='"+value4+"',Mobile='"+mobile+"',DOJ='"+value6+"',ID_Proof='"+value8+"',"
                       + "ID_Proof_Number='"+idProofNo+"',Card_Number='"+value10+"',RF_Number='"+rfNo+"',Member_Type='"+value12+"',"
                       + "First_Use='"+value13+"',Last_Use='"+value14+"',Out_Status='"+value15+"' where Card_Number='"+cardNo+"' ";
                        
                
               PreparedStatement stmt=null;
                Connection conn=null;
                conn=(Connection)DriverManager.getConnection(DB_URL,USER_NAME,PASS);
                stmt=conn.prepareStatement(sql);
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

            }
            
            catch(Exception er)
            {
                JOptionPane.showMessageDialog(null,er);
            }
             mrf.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(Member_Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Registration_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf2;
    private java.awt.TextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
}
