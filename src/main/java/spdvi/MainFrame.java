package spdvi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Alejo
 */
public class MainFrame extends javax.swing.JFrame {

    private static final java.lang.reflect.Type LIST_OF_OPUS_TYPE = new TypeToken<List<Opus>>() {
    }.getType();
    private final String OPUS_FILE = "obres.json";
    private final String OPUS_DIR = System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\";
    private final String IMAGE_DIR = System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\";
    private static ArrayList<Opus> obras;
    private JList<Opus> lstOpusList;
    public boolean changesMade = false;
    public boolean doubleClicked = false;
    public ArrayList<String> imagesToDelete = new ArrayList<>();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initiation();
    }

    public ArrayList<Opus> getObras() {
        return obras;
    }

    public JList<Opus> getLstOpusList() {
        return lstOpusList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrListPanel = new javax.swing.JScrollPane();
        mnuMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniSave = new javax.swing.JMenuItem();
        mniSaveAs = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniCreate = new javax.swing.JMenuItem();
        mniUpdate = new javax.swing.JMenuItem();
        mniDelete = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Opus List");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu1.setText("File");

        mniSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/diskette.png"))); // NOI18N
        mniSave.setText("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mniSave);

        mniSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/edit.png"))); // NOI18N
        mniSaveAs.setText("Save as...");
        jMenu1.add(mniSaveAs);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/folder.png"))); // NOI18N
        jMenuItem1.setText("Open data folder");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnuMenu.add(jMenu1);

        jMenu2.setText("Edit");

        mniCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/plus-button.png"))); // NOI18N
        mniCreate.setText("Insert new opus");
        mniCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCreateActionPerformed(evt);
            }
        });
        jMenu2.add(mniCreate);

        mniUpdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/edit.png"))); // NOI18N
        mniUpdate.setText("Update opus");
        mniUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUpdateActionPerformed(evt);
            }
        });
        jMenu2.add(mniUpdate);

        mniDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spdvi/icons/iloveimg-resized/trash-bin.png"))); // NOI18N
        mniDelete.setText("Delete opus");
        mniDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDeleteActionPerformed(evt);
            }
        });
        jMenu2.add(mniDelete);

        mnuMenu.add(jMenu2);

        setJMenuBar(mnuMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCreateActionPerformed
        create();
    }//GEN-LAST:event_mniCreateActionPerformed

    private void mniUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUpdateActionPerformed
        update();
    }//GEN-LAST:event_mniUpdateActionPerformed

    private void mniDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDeleteActionPerformed
        delete();
    }//GEN-LAST:event_mniDeleteActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
        save();
    }//GEN-LAST:event_mniSaveActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Desktop.getDesktop().open(new File(OPUS_DIR));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (changesMade) {
            Object[] options = {"Yes",
                "No", "Cancel"};
            int n = JOptionPane.showOptionDialog(this,
                    "Changes were made." + " Do you want to save?",
                    "Warning",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            switch (n) {
                case 0 -> {
                    saveExit();
                    this.dispose();
                }
                case 1 ->
                    this.dispose();
            }
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mniCreate;
    private javax.swing.JMenuItem mniDelete;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JMenuItem mniSaveAs;
    private javax.swing.JMenuItem mniUpdate;
    private javax.swing.JMenuBar mnuMenu;
    private javax.swing.JScrollPane scrListPanel;
    // End of variables declaration//GEN-END:variables

    private void initiation() {
        setLocationRelativeTo(null);
        lstOpusList = new JList<>();
        scrListPanel.setViewportView(lstOpusList);
        checkDirectory();
        loadOpusFile();
        lstOpusList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    doubleClick();
                }
            }
        });
    }

    private void create() {
        InsertDialog id = new InsertDialog(this, true);
        id.setVisible(true);
        loadOpusList();
    }

    private void update() {
        UpdateDialog ud = new UpdateDialog(this, true);
        ud.setVisible(true);
        loadOpusList();
    }

    private void doubleClick() {
        doubleClicked = true;
        UpdateDialog ud = new UpdateDialog(this, true);
        ud.setVisible(true);
        doubleClicked = false;
        loadOpusList();
    }

    private void delete() {
        DeleteDialog dd = new DeleteDialog(this, true);
        dd.setVisible(true);
        loadOpusList();
    }

    private void checkDirectory() {
        File opusDir = new File(OPUS_DIR);
        if (!opusDir.exists()) {
            opusDir.mkdirs();
        }

        File imageDir = new File(IMAGE_DIR);
        if (!imageDir.exists()) {
            imageDir.mkdirs();
        }

        File file = new File(OPUS_DIR + OPUS_FILE);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void loadOpusFile() {
        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(OPUS_DIR + OPUS_FILE));
            obras = gson.fromJson(reader, LIST_OF_OPUS_TYPE);
            loadOpusList();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public void loadOpusList() {
        DefaultListModel dlm = new DefaultListModel();
        if (obras != null) {
            for (Opus o : obras) {
                dlm.addElement(o);
            }
        }
        lstOpusList.setModel(dlm);
    }

    private void save() {
        if (confirmation("Are you sure you want to save?")) {
            Gson gson = new Gson();
            try (FileWriter fw = new FileWriter(new File(OPUS_DIR + OPUS_FILE))) {
                fw.write(gson.toJson(obras));
                deleteImages();
                changesMade = false;
                JOptionPane.showMessageDialog(this, "Saved opus to " + OPUS_FILE);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void saveExit() {
        Gson gson = new Gson();
        try (FileWriter fw = new FileWriter(new File(OPUS_DIR + OPUS_FILE))) {
            fw.write(gson.toJson(obras));
            deleteImages();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void deleteImages() {
        for(String image : imagesToDelete) {
            File file = new File(image);
            file.delete();
        }
    }

    private boolean confirmation(String msg) {
        Object[] options = {"Yes",
            "No, cancel"};
        int n = JOptionPane.showOptionDialog(null,
                msg,
                "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        return n == 0;
    }

    private void errorDialog(String message) {
        JOptionPane.showMessageDialog(null,
                message,
                "Something went wrong...",
                JOptionPane.ERROR_MESSAGE);
    }
}
