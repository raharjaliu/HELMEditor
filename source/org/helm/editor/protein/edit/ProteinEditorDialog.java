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
 * ProteinEditorDialog.java
 *
 * Created on Dec 9, 2010, 8:03:37 PM
 */
package org.helm.editor.protein.edit;

import org.helm.editor.protein.view.ProteinViewerDialog;
import org.helm.editor.utility.ExceptionHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ZHANGTIANHONG
 */
public class ProteinEditorDialog extends javax.swing.JDialog {

    /** Creates new form ProteinEditorDialog */
    public ProteinEditorDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        customInit();
    }

    private void customInit() {
        proteinEditor = new ProteinEditor();
        contentPanel.add(proteinEditor);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        showButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Protein Sequence Editor");
        setMinimumSize(new java.awt.Dimension(700, 500));

        contentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contentPanel.setLayout(new java.awt.BorderLayout());

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        showButton.setText("Show Structure");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(showButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 520, Short.MAX_VALUE)
                .add(closeButton)
                .addContainerGap())
            .add(contentPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(contentPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(closeButton)
                    .add(showButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                try {
                    if (null == viewerDialog) {
                        viewerDialog = new ProteinViewerDialog(parent, false);
                        viewerDialog.setLocationRelativeTo(parent);
                    }

                    if (!viewerDialog.isVisible()) {
                        viewerDialog.setVisible(true);
                    }
                    String notation = proteinEditor.getNotation();
                    viewerDialog.getViewer().setNotation(notation);
                } catch (Exception ex) {
                    Logger.getLogger(ProteinEditorDialog.class.getName()).log(Level.SEVERE, "Show Structure", ex);
                    ExceptionHandler.handleException(ex);
                }
            }
        });
    }//GEN-LAST:event_showButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables
    private JFrame parent;
    private ProteinEditor proteinEditor;
    private ProteinViewerDialog viewerDialog;
}
