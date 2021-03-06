/*******************************************************************************
 * Copyright C 2012, The Pistoia Alliance
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/
/*
 * HELMAboutBox.java
 *
 * Created on Dec 1, 2008, 3:39:00 PM
 */

package org.helm.editor.editor;

import java.util.ResourceBundle;

/**
 *
 * @author dubes01
 */
public class HELMAboutBox extends javax.swing.JDialog {

    /** Creates new form HELMAboutBox */
    public HELMAboutBox(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        customInit();
        setLocationRelativeTo(parent);
    }   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        appLabelMain = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        homepageLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JTextArea();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About HELM Editor");
        setAlwaysOnTop(true);
        setResizable(false);

        imagePanel.setLayout(new java.awt.BorderLayout());

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/helm/editor/editor/resource/pistoia.gif"))); // NOI18N
        imagePanel.add(imageLabel, java.awt.BorderLayout.CENTER);

        infoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        appLabelMain.setFont(new java.awt.Font("Tahoma", 1, 15));
        appLabelMain.setText("HELM Editor ");

        jLabel2.setText("HELM Editor GUI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Product Version:");

        versionLabel.setText("versionLabel");        

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Homepage:");

        homepageLabel.setText("");
        
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Description:");
        
        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 11));
        descriptionLabel.setBackground(jLabel7.getBackground());
        descriptionLabel.setEditable(false);
        descriptionLabel.setText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("Copyright:");

        copyrightLabel.setFont(new java.awt.Font("Tahoma", 0, 11));
        copyrightLabel.setBackground(jLabel8.getBackground());
        copyrightLabel.setEditable(false);
        copyrightLabel.setText("");

        org.jdesktop.layout.GroupLayout infoPanelLayout = new org.jdesktop.layout.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(appLabelMain)
                    .add(jLabel2)
                    .add(infoPanelLayout.createSequentialGroup()
                        .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel6)
                            .add(jLabel7)
                            .add(jLabel8))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(homepageLabel)
                            .add(versionLabel)
                            .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(descriptionLabel))
                            .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(copyrightLabel)) )))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(appLabelMain)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(versionLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)                
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(homepageLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(descriptionLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(infoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(copyrightLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)               
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(imagePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .add(infoPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, closeButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(imagePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(infoPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(closeButton)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void customInit() {
        initComponents();
        String title = GUIBase.generateApplicationTitle();

        ResourceBundle resourceBundle = ResourceBundle.getBundle("org.helm.editor.editor.resource.GUIBase");
        setTitle("About " + resourceBundle.getString("Application.name"));
        appLabelMain.setText(title);
        versionLabel.setText(resourceBundle.getString("Application.version"));
        homepageLabel.setText(resourceBundle.getString("Application.homepage"));
        descriptionLabel.setText(resourceBundle.getString("Application.description"));
        copyrightLabel.setText(resourceBundle.getString("Application.copyright"));
        pack();
        getRootPane().setDefaultButton(closeButton);        
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HELMAboutBox dialog = new HELMAboutBox(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel appLabelMain;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JTextArea descriptionLabel;
    private javax.swing.JTextArea copyrightLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables

}
