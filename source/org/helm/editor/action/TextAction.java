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
package org.helm.editor.action;

import chemaxon.struc.Molecule;
import org.helm.editor.editor.MacromoleculeEditor;
import org.helm.editor.editor.TextViewer;
import org.helm.editor.utility.ClipBoardProcessor;
import org.helm.editor.utility.ExceptionHandler;
import org.helm.editor.worker.PDBFileGenerator;
import org.helm.notation.tools.ComplexNotationParser;
import org.helm.notation.tools.StructureParser;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/**
 * treat everything in the drawing pane as one structure
 * @author zhangtianhong
 */
@Deprecated
public class TextAction extends AbstractAction {

    public static final int COPY_ACTION_TYPE = 1;
    public static final int SHOW_ACTION_TYPE = 2;
    private int actionType;
    public static final String NOTATION_TEXT_TYPE = "HELM Notation";
    public static final String MOLFILE_TEXT_TYPE = "MDL Molfile";
    public static final String SMILES_TEXT_TYPE = "SMILES";
    public static final String PDB_TEXT_TYPE = "PDB Format";
    private String textType;
    private TextViewer viewer;
    private MacromoleculeEditor editor;

    public TextAction(MacromoleculeEditor editor, String textType, int actionType) {
        super(textType);
        this.editor = editor;
        this.textType = textType;
        this.actionType = actionType;
        viewer = TextViewer.getInstance(editor.getFrame());
    }

    public void actionPerformed(ActionEvent e) {
        String title = textType;
        if (actionType == COPY_ACTION_TYPE) {
            title = "Copy " + textType;
        } else if (actionType == SHOW_ACTION_TYPE) {
            title = "Show " + textType;
        }
        String notation = editor.getNotation();
        if (null == notation || notation.trim().length() == 0) {
            JOptionPane.showMessageDialog(editor.getFrame(), "Structure is empty!", title, JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            editor.getFrame().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));


            String text = "";
            if (textType.equals(NOTATION_TEXT_TYPE)) {
                text = notation;
            } else if (textType.equals(SMILES_TEXT_TYPE)) {
                String smiles = ComplexNotationParser.getComplexPolymerSMILES(notation);
                Molecule mol = StructureParser.getMolecule(smiles);
                mol.dearomatize();
                mol.clean(2, null);
                text = mol.exportToFormat("smiles");
            } else if (textType.equals(PDB_TEXT_TYPE)) {
                String smiles = ComplexNotationParser.getComplexPolymerSMILES(notation);
                text = PDBFileGenerator.SMILES2OpenBabelPDB(smiles);
            } else if (textType.equals(MOLFILE_TEXT_TYPE)) {
                String smiles = ComplexNotationParser.getComplexPolymerSMILES(notation);
                Molecule mol = StructureParser.getMolecule(smiles);
                mol.dearomatize();
                mol.clean(2, null);
                text = mol.exportToFormat("mol");
            } else {
                throw new UnsupportedOperationException("Unsupported operation type :" + textType);
            }

            switch (actionType) {
                case SHOW_ACTION_TYPE:
                    viewer.setTitle(textType);
                    viewer.setText(text);
                    break;
                case COPY_ACTION_TYPE:
                    ClipBoardProcessor.copy(text);
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {
            Logger.getLogger(TextAction.class.getName()).log(Level.WARNING, TextAction.class.getName(), ex);
            ExceptionHandler.handleException(ex);
        } finally {
            editor.getFrame().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }
}
