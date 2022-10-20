package HotelManagement;

import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rehan Ali
 */
public class ManageRooms extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    ROOMS room = new ROOMS();
    
    public ManageRooms() {
        initComponents();
        room.fillRoomsTYPEJCombobox(jComboBoxType);
        
        room.fillRoomsJTable(jTable1);
        
        jTable1.setRowHeight(35);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(jRadioButtonYes);
        bg.add(jRadioButtonNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRoomNumber = new javax.swing.JTextField();
        jButtonAddRoom = new javax.swing.JButton();
        jButtonEditRoom = new javax.swing.JButton();
        jButtonRemoveRoom = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButtonRefreshJTable = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonShowTypes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonNo = new javax.swing.JRadioButton();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(236, 248, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel7.setBackground(new java.awt.Color(0, 94, 149));
        jLabel7.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 94, 149));
        jLabel7.setText("Hotel   Management   System");

        jSeparator1.setBackground(new java.awt.Color(0, 94, 149));
        jSeparator1.setForeground(new java.awt.Color(0, 94, 149));
        jSeparator1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 53, 88));
        jLabel2.setText("Manage Rooms");

        jPanel3.setBackground(new java.awt.Color(188, 230, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(420, 440));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel4.setText("Room No :");

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel5.setText("Room Type :");

        jTextFieldRoomNumber.setFont(new java.awt.Font("Candara Light", 0, 14)); // NOI18N
        jTextFieldRoomNumber.setText("\n");
        jTextFieldRoomNumber.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldRoomNumberInputMethodTextChanged(evt);
            }
        });

        jButtonAddRoom.setBackground(new java.awt.Color(21, 137, 195));
        jButtonAddRoom.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        jButtonAddRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddRoom.setText("Add New Room");
        jButtonAddRoom.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonAddRoom.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonAddRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRoomActionPerformed(evt);
            }
        });

        jButtonEditRoom.setBackground(new java.awt.Color(21, 137, 195));
        jButtonEditRoom.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        jButtonEditRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditRoom.setText("Edit");
        jButtonEditRoom.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonEditRoom.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonEditRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEditRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditRoomActionPerformed(evt);
            }
        });

        jButtonRemoveRoom.setBackground(new java.awt.Color(21, 137, 195));
        jButtonRemoveRoom.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        jButtonRemoveRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveRoom.setText("Remove");
        jButtonRemoveRoom.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonRemoveRoom.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonRemoveRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRemoveRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveRoomActionPerformed(evt);
            }
        });

        jButtonClearFields.setBackground(new java.awt.Color(21, 137, 195));
        jButtonClearFields.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        jButtonClearFields.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClearFields.setText("Clear Fields");
        jButtonClearFields.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonClearFields.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonClearFields.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldsActionPerformed(evt);
            }
        });

        jButtonRefreshJTable.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jButtonRefreshJTable.setText("Refresh");
        jButtonRefreshJTable.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonRefreshJTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshJTableActionPerformed(evt);
            }
        });

        jComboBoxType.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeActionPerformed(evt);
            }
        });

        jButtonShowTypes.setBackground(new java.awt.Color(21, 137, 195));
        jButtonShowTypes.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        jButtonShowTypes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowTypes.setText("Show Types");
        jButtonShowTypes.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonShowTypes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonShowTypes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonShowTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowTypesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel6.setText("Reserved :");

        jPanel4.setBackground(new java.awt.Color(21, 155, 222));
        jPanel4.setPreferredSize(new java.awt.Dimension(160, 30));

        jRadioButtonNo.setBackground(new java.awt.Color(21, 155, 222));
        jRadioButtonNo.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        jRadioButtonNo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNo.setText("No");
        jRadioButtonNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButtonNo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jRadioButtonNo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jRadioButtonYes.setBackground(new java.awt.Color(21, 155, 222));
        jRadioButtonYes.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        jRadioButtonYes.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonYes.setText("Yes");
        jRadioButtonYes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButtonYes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jRadioButtonYes.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jRadioButtonYes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jRadioButtonNo)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButtonYes, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jRadioButtonNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonShowTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldRoomNumber))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAddRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemoveRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEditRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClearFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButtonRefreshJTable, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonShowTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEditRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemoveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonRefreshJTable)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Room Type", "Reserved"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manage");

        jMenuItem2.setText("Guests");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Rooms");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1292, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRoomActionPerformed
        
        try
        {
            double roomNumber =Double.parseDouble(jTextFieldRoomNumber.getText());
            int rnumber = (int)roomNumber;
            int roomType = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
            
            
            if(room.addRoom(rnumber, roomType))
            {
                JOptionPane.showMessageDialog(rootPane, "New Room Added Succesfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Room Not Added", "Add Room Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(HeadlessException | NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter Room Number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonAddRoomActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rIndex= jTable1.getSelectedRow();
        jTextFieldRoomNumber.setText(model.getValueAt(rIndex, 0).toString());
        jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
        String isReserved = (model.getValueAt(rIndex, 2).toString());
        if(isReserved.equals("Yes"))
        {
            jRadioButtonYes.setSelected(true); 
        }
        else if(isReserved.equals("No"))
        {
            jRadioButtonNo.setSelected(true);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditRoomActionPerformed
        
        int roomNumber = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String isReserved= "No";
        
        if(jRadioButtonYes.isSelected())
        {
            isReserved = "Yes";            
        }
        
        
            try
            {
                roomNumber= Integer.valueOf(jTextFieldRoomNumber.getText());
                if(room.editRoom(roomNumber, type, isReserved))
                {
                    JOptionPane.showMessageDialog(rootPane, "Room Data Updated Succesfully", "Edit Room", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Room Data Not Updated", "Edit Room Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter Room Number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
            }
        
    
    }//GEN-LAST:event_jButtonEditRoomActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed

        jTextFieldRoomNumber.setText("");
       
       
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonRefreshJTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshJTableActionPerformed
        
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Number", "Type", "Reserved"}));
        room.fillRoomsJTable(jTable1);
    }//GEN-LAST:event_jButtonRefreshJTableActionPerformed

    private void jButtonRemoveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveRoomActionPerformed

        try
        {
            int roomNumber= Integer.valueOf(jTextFieldRoomNumber.getText());
            if(room.removeRoom(roomNumber))
            {
                JOptionPane.showMessageDialog(rootPane, "Room Deleted Succesfully", "Remove Room", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Room Not Deleted", "Remove Room Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter Room Number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoveRoomActionPerformed

    private void jButtonShowTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowTypesActionPerformed

        ALL_ROOM_TYPE roomTypes = new ALL_ROOM_TYPE();
        roomTypes.setVisible(true);
        roomTypes.pack();
        roomTypes.setLocationRelativeTo(null);
        roomTypes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonShowTypesActionPerformed

    private void jComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTypeActionPerformed

    private void jTextFieldRoomNumberInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldRoomNumberInputMethodTextChanged

    }//GEN-LAST:event_jTextFieldRoomNumberInputMethodTextChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        home homePage = new home();
        homePage.setVisible(true);
        homePage.setExtendedState(homePage.getExtendedState() | javax.swing.JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        ManageClients client = new ManageClients();
        client.setVisible(true);
        client.setExtendedState(client.getExtendedState() | javax.swing.JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setVisible(false);
        ManageRooms rooms = new ManageRooms();
        rooms.setVisible(true);
        rooms.setExtendedState(rooms.getExtendedState() | javax.swing.JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddRoom;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditRoom;
    private javax.swing.JButton jButtonRefreshJTable;
    private javax.swing.JButton jButtonRemoveRoom;
    private javax.swing.JButton jButtonShowTypes;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldRoomNumber;
    // End of variables declaration//GEN-END:variables
}