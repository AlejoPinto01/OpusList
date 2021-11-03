package spdvi;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

/**
 *
 * @author Alejo
 */
public class UpdateDialog extends javax.swing.JDialog {

    MainFrame mf = new MainFrame();
    JFileChooser fileChooser;
    boolean hasImage = false;
    private final String IMAGE_DIR = System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\";
    private String imageName;

    /**
     * Creates new form InsertDialog
     */
    public UpdateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        loadDefaultImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegisterNum = new javax.swing.JLabel();
        txtRegisterNum = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        lblFormat = new javax.swing.JLabel();
        txtFormat = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnSelectImage = new javax.swing.JButton();
        btnClearImage = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update opus");
        setAlwaysOnTop(true);
        setModal(true);

        lblRegisterNum.setText("Register number: ");

        txtTitle.setEnabled(false);

        lblTitle.setText("Title: ");

        lblAuthor.setText("Author: ");

        txtAuthor.setEnabled(false);

        txtYear.setEnabled(false);

        lblFormat.setText("Format: ");

        txtFormat.setEnabled(false);

        lblYear.setText("Year: ");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSelectImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/gallery.png"))); // NOI18N
        btnSelectImage.setText("Select image");
        btnSelectImage.setEnabled(false);
        btnSelectImage.setFocusable(false);
        btnSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImageActionPerformed(evt);
            }
        });

        btnClearImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/close.png"))); // NOI18N
        btnClearImage.setText("Clear image");
        btnClearImage.setEnabled(false);
        btnClearImage.setFocusable(false);
        btnClearImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearImageActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setFocusable(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegisterNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegisterNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAuthor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYear)
                        .addGap(19, 19, 19)
                        .addComponent(lblFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSelectImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClearImage, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegisterNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegisterNum)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormat)
                    .addComponent(txtFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelectImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnCancel)))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchOpus();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImageActionPerformed
        selectImage();
    }//GEN-LAST:event_btnSelectImageActionPerformed

    private void btnClearImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearImageActionPerformed
        loadDefaultImage();
    }//GEN-LAST:event_btnClearImageActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateDialog dialog = new UpdateDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClearImage;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectImage;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblRegisterNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtFormat;
    private javax.swing.JTextField txtRegisterNum;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void searchOpus() {
        String opusRegister = txtRegisterNum.getText();
        for (Opus o : mf.getObras()) {
            if (opusRegister.equals(o.getRegistre())) {
                enableUpdate(true);
                txtAuthor.setText(o.getAutor());
                txtFormat.setText(o.getFormat());
                txtTitle.setText(o.getTitol());
                txtYear.setText(String.valueOf(o.getAny()));
                if (o.getImagePath().equals("noImage")) {
                    loadDefaultImage();
                } else {
                    loadImage(IMAGE_DIR + o.getImagePath());
                }
                break;
            } else {
                enableUpdate(false);
            }
        }
    }
    
    private void enableUpdate(boolean state) {
        txtAuthor.setEnabled(state);
        txtFormat.setEnabled(state);
        txtTitle.setEnabled(state);
        txtYear.setEnabled(state);
        btnClearImage.setEnabled(state);
        btnUpdate.setEnabled(state);
        btnSelectImage.setEnabled(state);
    }

    private void update() {
        
    }

    private void selectImage() {
        fileChooser = new JFileChooser();
        int returnOption = fileChooser.showOpenDialog(this);
        if (returnOption == JFileChooser.APPROVE_OPTION) {
            loadImage(fileChooser.getSelectedFile().getAbsolutePath());
            hasImage = true;
        }
    }

    private void loadImage(String path) {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(path));
            ImageIcon icon = resizeImageIcon(bufferedImage, lblImage.getWidth(), lblImage.getHeight());
            lblImage.setIcon(icon);
        } catch (IOException ex) {
        }
    }

    private ImageIcon resizeImageIcon(BufferedImage originalImage, int desiredWidth, int desiredHeight) {
        int newHeight = 0;
        int newWidth = 0;
        float aspectRatio = (float) originalImage.getWidth() / originalImage.getHeight();
        if (originalImage.getWidth() > originalImage.getHeight()) {
            newWidth = desiredWidth;
            newHeight = Math.round(desiredWidth / aspectRatio);
        } else {
            newHeight = desiredHeight;
            newWidth = Math.round(desiredHeight * aspectRatio);
        }
        Image resultingImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        ImageIcon imageIcon = new ImageIcon(outputImage);
        return imageIcon;
    }

    private void loadDefaultImage() {
        loadImage("src/spdvi/icons/noimage.png");
        hasImage = false;
    }

    private void copyImage() {
        try {
            if (fileChooser.getSelectedFile() != null) {
                hasImage = true;
                BufferedImage bufferedImage = ImageIO.read(new File(fileChooser.getSelectedFile().getAbsolutePath()));
                String outputImageAbsolutePath = IMAGE_DIR + imageName;
                File outputImage = new File(outputImageAbsolutePath);
                ImageIO.write(bufferedImage, "jpg", outputImage);
            } else {
                hasImage = false;
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
