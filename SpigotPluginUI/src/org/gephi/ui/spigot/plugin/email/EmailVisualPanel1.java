/*
Copyright 2008-2010 Gephi
Authors : Yi Du <duyi001@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2011 Gephi Consortium. All rights reserved.

The contents of this file are subject to the terms of either the GNU
General Public License Version 3 only ("GPL") or the Common
Development and Distribution License("CDDL") (collectively, the
"License"). You may not use this file except in compliance with the
License. You can obtain a copy of the License at
http://gephi.org/about/legal/license-notice/
or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
specific language governing permissions and limitations under the
License.  When distributing the software, include this License Header
Notice in each file and include the License files at
/cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
License Header, with the fields enclosed by brackets [] replaced by
your own identifying information:
"Portions Copyrighted [year] [name of copyright owner]"

If you wish your version of this file to be governed by only the CDDL
or only the GPL Version 3, indicate your decision by adding
"[Contributor] elects to include this software in this distribution
under the [CDDL or GPL Version 3] license." If you do not indicate a
single choice of license, a recipient has the option to distribute
your version of this file under either the CDDL, the GPL Version 3 or
to extend the choice of license to its licensees as provided above.
However, if you add GPL Version 3 code and therefore, elected the GPL
Version 3 license, then the option applies only if the new code is
made subject to such option by the copyright holder.

Contributor(s):

Portions Copyrighted 2011 Gephi Consortium.
 */
package org.gephi.ui.spigot.plugin.email;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.filechooser.FileFilter;
import org.gephi.io.importer.spi.SpigotImporter;
import org.gephi.io.spigot.plugin.email.EmailDataType;
import org.gephi.io.spigot.plugin.EmailImporter;
import org.gephi.io.spigot.plugin.email.spi.EmailFilesFilter;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.Lookup;
import org.openide.util.NbPreferences;

public final class EmailVisualPanel1 extends JPanel implements ChangeListener {
    private EmailWizardPanel1 wizardPanel;
    private int port = 110;
    private boolean useSSL = false;
    private static final String LAST_PATH = "EmailVisualPanel1_lastpath";
//    private java.util.List<String> filePath;
    java.io.File[] parsedFiles = null;


    EmailVisualPanel1(EmailWizardPanel1 aThis) {
        wizardPanel = aThis;
        wizardPanel.addChangeListener(this);
        initComponents();
        //set the init condition
        setDisable(jPanelReceiveFromServer);
    }

    @Override
    public String getName() {
        return "Select Datasource";
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelReceiveFromServer = new javax.swing.JPanel();
        jLabelEmailAddr = new javax.swing.JLabel();
        jLabelServerType = new javax.swing.JLabel();
        jTextFieldServerAddr = new javax.swing.JTextField();
        jLabelServerAddr = new javax.swing.JLabel();
        jLabelPsw = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBoxServerType = new javax.swing.JComboBox();
        jTextFieldEmailAddr = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonFromLocalFile = new javax.swing.JRadioButton();
        jRadioButtonFromServer = new javax.swing.JRadioButton();
        jComboBoxFileFilters = new javax.swing.JComboBox();
        jButtonFromLocalFile = new javax.swing.JButton();
        jCheckBoxUseCcLine = new javax.swing.JCheckBox();
        jCheckBoxUseBccLine = new javax.swing.JCheckBox();
        jCheckBoxDisplayNameSameLabel = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 360));
        setMinimumSize(new java.awt.Dimension(500, 360));
        setPreferredSize(new java.awt.Dimension(500, 360));

        jPanelReceiveFromServer.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelReceiveFromServer.setMaximumSize(new java.awt.Dimension(600, 32767));
        jPanelReceiveFromServer.setPreferredSize(new java.awt.Dimension(400, 87));

        jLabelEmailAddr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabelEmailAddr, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabelEmailAddr.text")); // NOI18N

        jLabelServerType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabelServerType, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabelServerType.text")); // NOI18N

        jTextFieldServerAddr.setText(org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jTextFieldServerAddr.text")); // NOI18N
        jTextFieldServerAddr.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldServerAddrCaretUpdate(evt);
            }
        });

        jLabelServerAddr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabelServerAddr, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabelServerAddr.text")); // NOI18N

        jLabelPsw.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabelPsw, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabelPsw.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton3, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBoxServerType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { EmailDataType.SERVER_TYPE_POP3,EmailDataType.SERVER_TYPE_IMAP }));
        jComboBoxServerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServerTypeActionPerformed(evt);
            }
        });

        javax.swing.event.DocumentListener docListener = new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jTextFieldDocInsertUpdatePerformed(e);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                jTextFieldDocRemoveUpdatePerformed(e);
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                jTextFieldDocChangedUpdatePerformed(e);
            }
        };
        jTextFieldEmailAddr.setText(org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jTextFieldEmailAddr.text")); // NOI18N
        jTextFieldEmailAddr.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldEmailAddrCaretUpdate(evt);
            }
        });

        jPasswordField1.setText(org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jPasswordField1.text")); // NOI18N
        jPasswordField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jPasswordField1CaretUpdate(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabel7.text")); // NOI18N

        javax.swing.GroupLayout jPanelReceiveFromServerLayout = new javax.swing.GroupLayout(jPanelReceiveFromServer);
        jPanelReceiveFromServer.setLayout(jPanelReceiveFromServerLayout);
        jPanelReceiveFromServerLayout.setHorizontalGroup(
            jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReceiveFromServerLayout.createSequentialGroup()
                .addGroup(jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReceiveFromServerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelPsw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelServerType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelServerAddr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReceiveFromServerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelEmailAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelReceiveFromServerLayout.createSequentialGroup()
                        .addComponent(jTextFieldEmailAddr, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanelReceiveFromServerLayout.createSequentialGroup()
                        .addComponent(jComboBoxServerType, 0, 248, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanelReceiveFromServerLayout.createSequentialGroup()
                        .addComponent(jTextFieldServerAddr, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelReceiveFromServerLayout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))))
        );
        jPanelReceiveFromServerLayout.setVerticalGroup(
            jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReceiveFromServerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailAddr)
                    .addComponent(jTextFieldEmailAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPsw)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServerType)
                    .addComponent(jButton3)
                    .addComponent(jComboBoxServerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReceiveFromServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServerAddr)
                    .addComponent(jTextFieldServerAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButtonFromLocalFile);
        jRadioButtonFromLocalFile.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButtonFromLocalFile, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jRadioButtonFromLocalFile.text")); // NOI18N
        jRadioButtonFromLocalFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFromLocalFileActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonFromServer);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButtonFromServer, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jRadioButtonFromServer.text")); // NOI18N
        jRadioButtonFromServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFromServerActionPerformed(evt);
            }
        });

        EmailFilesFilter[] filters =
        Lookup.getDefault().lookupAll(EmailFilesFilter.class).toArray(new EmailFilesFilter[0]);
        String[] fileFilterString = new String[filters.length+1];
        int index = 0;
        fileFilterString[0] = "--Select file type";
        for(EmailFilesFilter f: filters){
            index ++;
            fileFilterString[index] = f.getDisplayName();
        }
        jComboBoxFileFilters.setModel(new javax.swing.DefaultComboBoxModel(fileFilterString));
        jComboBoxFileFilters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFileFiltersActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButtonFromLocalFile, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jButtonFromLocalFile.text")); // NOI18N
        jButtonFromLocalFile.setEnabled(false);
        jButtonFromLocalFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFromLocalFileActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxUseCcLine, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jCheckBoxUseCcLine.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxUseBccLine, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jCheckBoxUseBccLine.text")); // NOI18N
        jCheckBoxUseBccLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUseBccLineActionPerformed(evt);
            }
        });

        jCheckBoxDisplayNameSameLabel.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxDisplayNameSameLabel, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jCheckBoxDisplayNameSameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(EmailVisualPanel1.class, "EmailVisualPanel1.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelReceiveFromServer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(jCheckBoxDisplayNameSameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxUseBccLine, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxUseCcLine, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonFromLocalFile, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonFromServer, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFileFilters, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonFromLocalFile, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonFromLocalFile)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFileFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFromLocalFile)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonFromServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelReceiveFromServer, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxUseCcLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxUseBccLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDisplayNameSameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EmailImportAdvancedOptPanel panel = new EmailImportAdvancedOptPanel(jComboBoxServerType.getSelectedItem().toString(), this);
        //TODO internalize
        DialogDescriptor dd = new DialogDescriptor(panel, "Advanced Options");
        if (!DialogDisplayer.getDefault().notify(dd).equals(NotifyDescriptor.OK_OPTION)) {
            panel = null;
            return;
        } else {
            panel.save();
            panel = null;
            return;
        }
}//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxServerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServerTypeActionPerformed
        wizardPanel.fireChangeEvent();
        if (jComboBoxServerType.getSelectedItem().toString().equals(EmailDataType.SERVER_TYPE_POP3)) {
            port = 110;
        } else if (jComboBoxServerType.getSelectedItem().toString().equals(EmailDataType.SERVER_TYPE_IMAP)) {
            port = 143;
        }
        updateJTextFieldServer();
}//GEN-LAST:event_jComboBoxServerTypeActionPerformed

    private void jRadioButtonFromLocalFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFromLocalFileActionPerformed
        wizardPanel.fireChangeEvent();
        // TODO add your handling code here:
        if (jRadioButtonFromLocalFile.isSelected()) {
            setDisable(jPanelReceiveFromServer);
            jComboBoxFileFilters.setEnabled(true);
        } else {
            setDisable(jPanelReceiveFromServer);
            jComboBoxFileFilters.setEnabled(false);
        }
        if (jComboBoxFileFilters.getSelectedItem().toString().equals("select file type")) {
            jButtonFromLocalFile.setEnabled(false);
        } else {
            jButtonFromLocalFile.setEnabled(true);
        }
}//GEN-LAST:event_jRadioButtonFromLocalFileActionPerformed

    private void jRadioButtonFromServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFromServerActionPerformed
        wizardPanel.fireChangeEvent();
        // TODO add your handling code here:
        setEnable(jPanelReceiveFromServer);
        jComboBoxFileFilters.setEnabled(false);
        jButtonFromLocalFile.setEnabled(false);
}//GEN-LAST:event_jRadioButtonFromServerActionPerformed

    private void jComboBoxFileFiltersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFileFiltersActionPerformed
        wizardPanel.fireChangeEvent();
        if (!jComboBoxFileFilters.getSelectedItem().equals("select file type")) {
            jButtonFromLocalFile.setEnabled(true);
        } else {
            jButtonFromLocalFile.setEnabled(false);
        }
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBoxFileFiltersActionPerformed

    private void jButtonFromLocalFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFromLocalFileActionPerformed
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileFilter filter = new FileFilter() {

            @Override
            public boolean accept(File f) {
                String extension = "";
                EmailFilesFilter[] filters =
                        Lookup.getDefault().lookupAll(EmailFilesFilter.class).toArray(new EmailFilesFilter[0]);
                for (EmailFilesFilter filter : filters) {
                    if (filter.getDisplayName().equals(jComboBoxFileFilters.getSelectedItem().toString())) {
                        extension = filter.getSupportedFileExtension();
                    }
                }
                if (f.isDirectory()) {
                    return true;
                } else if (f.getAbsolutePath().matches(".*" + extension)) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public String getDescription() {
                EmailFilesFilter[] filters =
                        Lookup.getDefault().lookupAll(EmailFilesFilter.class).toArray(new EmailFilesFilter[0]);
                for (EmailFilesFilter f : filters) {
                    if (f.getDisplayName().equals(jComboBoxFileFilters.getSelectedItem().toString())) {
                        return f.getSupportedFileExtension();
                    }
                }
                return "";
            }
        };
        fileChooser.setFileFilter(filter);
        String lastPath = NbPreferences.forModule(EmailVisualPanel1.class).get(LAST_PATH, ".");
        fileChooser.setCurrentDirectory(new File(lastPath));
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == javax.swing.JFileChooser.APPROVE_OPTION) {
            parsedFiles = fileChooser.getSelectedFiles();
            NbPreferences.forModule(EmailVisualPanel1.class).put(LAST_PATH, fileChooser.getCurrentDirectory().getAbsolutePath());
        }
}//GEN-LAST:event_jButtonFromLocalFileActionPerformed

    private void jCheckBoxUseBccLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUseBccLineActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jCheckBoxUseBccLineActionPerformed

    private void jTextFieldEmailAddrCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldEmailAddrCaretUpdate
        wizardPanel.fireChangeEvent();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailAddrCaretUpdate

    private void jPasswordField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jPasswordField1CaretUpdate
        wizardPanel.fireChangeEvent();
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1CaretUpdate

    private void jTextFieldServerAddrCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldServerAddrCaretUpdate
        wizardPanel.fireChangeEvent();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServerAddrCaretUpdate
    /**
     * set all the component enable
     * @param component
     */
    public void setEnable(javax.swing.JComponent component) {
        for (java.awt.Component c : component.getComponents()) {
            if (c instanceof javax.swing.JComponent) {
                c.setEnabled(true);
                setEnable((javax.swing.JComponent) c);
            } else {
                c.getParent().setEnabled(true);
            }
        }
    }

    /**
     * set all the component disable
     * @param component
     */
    public void setDisable(javax.swing.JComponent component) {
        for (java.awt.Component c : component.getComponents()) {
            if (c instanceof javax.swing.JComponent) {
                c.setEnabled(false);
                setDisable((javax.swing.JComponent) c);
            } else {
                c.getParent().setEnabled(false);
            }
        }
    }

    private void jTextFieldDocInsertUpdatePerformed(DocumentEvent evt) {
        updateJTextFieldServer();
    }

    private void jTextFieldDocRemoveUpdatePerformed(DocumentEvent evt) {
        updateJTextFieldServer();
    }

    private void jTextFieldDocChangedUpdatePerformed(DocumentEvent evt) {
        updateJTextFieldServer();
    }

    private void updateJTextFieldServer() {
        String text = jTextFieldEmailAddr.getText();
        if (text.contains("@")) {
            jTextFieldServerAddr.setText(
                    jComboBoxServerType.getSelectedItem().toString().toLowerCase()
                    + "." + text.substring(text.indexOf("@") + 1));
        }
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUseSSL(boolean flag) {
        this.useSSL = flag;
    }

    public int getPort() {
        return port;
    }

    public boolean useSSL() {
        return useSSL;
    }

    public String getServerType() {
        return jComboBoxServerType.getSelectedItem().toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonFromLocalFile;
    private javax.swing.JCheckBox jCheckBoxDisplayNameSameLabel;
    private javax.swing.JCheckBox jCheckBoxUseBccLine;
    private javax.swing.JCheckBox jCheckBoxUseCcLine;
    private javax.swing.JComboBox jComboBoxFileFilters;
    private javax.swing.JComboBox jComboBoxServerType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelEmailAddr;
    private javax.swing.JLabel jLabelPsw;
    private javax.swing.JLabel jLabelServerAddr;
    private javax.swing.JLabel jLabelServerType;
    private javax.swing.JPanel jPanelReceiveFromServer;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButtonFromLocalFile;
    private javax.swing.JRadioButton jRadioButtonFromServer;
    private javax.swing.JTextField jTextFieldEmailAddr;
    private javax.swing.JTextField jTextFieldServerAddr;
    // End of variables declaration//GEN-END:variables

//    void setupImporter(EmailImporter current) {
//        if (current == null) {
//            return;
//        }
//        if (current.isFromLocalFile()) {
//            jRadioButtonFromLocalFile.setSelected(true);
//            if (current.getFileFilterType() != null) {
//                jComboBoxFileFilters.setSelectedItem(current.getFileFilterType());
//            }
//        } else {
//            jComboBoxFileFilters.setEnabled(false);
//            jRadioButtonFromServer.setSelected(true);
//            setEnable(jPanelReceiveFromServer);
//            jTextFieldEmailAddr.setText(current.getUserName());
//            jPasswordField1.setText(current.getUserPsw());
//            if (current.getServerType() != null) {
//                jComboBoxServerType.setSelectedItem(current.getServerType());
//            }
//            port = current.getPort();
//            useSSL = current.isUseSSL();
//            jTextFieldServerAddr.setText(current.getServerURL());
//        }
//    }

    public void unsetup(SpigotImporter importer) {
        EmailImporter currentImporter = (EmailImporter) importer;

        boolean isFromLocalFile = jRadioButtonFromLocalFile.isSelected();
        currentImporter.setFromLocalFile(isFromLocalFile);
        if (!isFromLocalFile) {
            currentImporter.setFromLocalFile(false);
            currentImporter.setUserName(jTextFieldEmailAddr.getText().trim());
            currentImporter.setUserPsw(String.copyValueOf(jPasswordField1.getPassword()));
            currentImporter.setServerType(jComboBoxServerType.getSelectedItem().toString());
            currentImporter.setPort(port);
            currentImporter.setUseSSL(useSSL);
            currentImporter.setServerURL(jTextFieldServerAddr.getText().trim());
        } else {
            currentImporter.setFromLocalFile(true);
            EmailFilesFilter[] filters =
                    Lookup.getDefault().lookupAll(EmailFilesFilter.class).toArray(new EmailFilesFilter[0]);
            for (EmailFilesFilter filter : filters) {
                if (filter.getDisplayName().equals(jComboBoxFileFilters.getSelectedItem().toString())) {
                    currentImporter.setFileFilterType(filter.getDisplayName());
                    break;
                }
            }
            currentImporter.setFiles(parsedFiles);
        }
        //set cc line
        currentImporter.setCcAsWeight(jCheckBoxUseCcLine.isSelected());
        //set bcc line
        currentImporter.setBccAsWeight(jCheckBoxUseBccLine.isSelected());
        //set display name as the same node
        currentImporter.setUseOneNodeIfSameDisplayName(jCheckBoxDisplayNameSameLabel.isSelected());

    }

    public void setup(SpigotImporter importer) {
        EmailImporter current = (EmailImporter) importer;
        if (current == null) {
            return;
        }
        if (current.isFromLocalFile()) {
            jRadioButtonFromLocalFile.setSelected(true);
            if (current.getFileFilterType() != null) {
                jComboBoxFileFilters.setSelectedItem(current.getFileFilterType());
            }
        } else {
            jComboBoxFileFilters.setEnabled(false);
            jRadioButtonFromServer.setSelected(true);
            setEnable(jPanelReceiveFromServer);
            jTextFieldEmailAddr.setText(current.getUserName());
            jPasswordField1.setText(current.getUserPsw());
            if (current.getServerType() != null) {
                jComboBoxServerType.setSelectedItem(current.getServerType());
            }
            port = current.getPort();
            useSSL = current.isUseSSL();
            jTextFieldServerAddr.setText(current.getServerURL());
        }
        //cc line
        boolean flag = current.hasCcAsWeight();
        if (flag) {
            jCheckBoxUseCcLine.setSelected(true);
        }
        //bcc line
        flag = current.hasBccAsWeight();
        if (flag) {
            jCheckBoxUseBccLine.setSelected(true);
        }
        //
        flag = current.isUseOneNodeIfSameDisplayName();
        if (flag) {
            jCheckBoxDisplayNameSameLabel.setSelected(true);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    boolean isValidPanel() {
        if(jRadioButtonFromLocalFile.isSelected() &&
                jComboBoxFileFilters.getSelectedIndex() != 0){
                return true;
        }
        if(jRadioButtonFromServer.isSelected() &&
                !jTextFieldEmailAddr.getText().isEmpty() &&
                jPasswordField1.getPassword().length != 0 &&
                !jTextFieldServerAddr.getText().isEmpty() &&
                jComboBoxServerType.getSelectedIndex() >= 0){
            return true;
        }
        return false;
    }
    // End of variables declaration
    
}
