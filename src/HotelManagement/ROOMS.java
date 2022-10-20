package HotelManagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rehan Ali
 */
public class ROOMS {

    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    public void fillRoomsTYPEJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
            try {
                
                ps = my_connection.createConnection().prepareStatement(selectQuery);
                rs=ps.executeQuery();
                DefaultTableModel tableModel= (DefaultTableModel)table.getModel();
                Object[] row;
                while(rs.next())
                {
                    row = new Object[3];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    
                    tableModel.addRow(row);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void fillRoomsJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `rooms`";
            try {
                
                ps = my_connection.createConnection().prepareStatement(selectQuery);
                rs=ps.executeQuery();
                DefaultTableModel tableModel= (DefaultTableModel)table.getModel();
                Object[] row;
                while(rs.next())
                {
                    row = new Object[3];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getInt(2);
                    row[2] = rs.getString(3);
                    
                    tableModel.addRow(row);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void fillRoomsTYPEJCombobox(JComboBox combobox)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
            try {
                
                ps = my_connection.createConnection().prepareStatement(selectQuery);
                rs=ps.executeQuery();
                
                while(rs.next())
                {
                    combobox.addItem(rs.getInt(1));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            }
    }    

    public boolean addRoom(int roomNumber, int type)
    {
        PreparedStatement st;
        String addQuery = "INSERT INTO `rooms`(`r_number`, `type`, `reserved`) VALUES (?,?,?)";
            try {
                st = my_connection.createConnection().prepareStatement(addQuery);
                
                st.setInt(1, roomNumber);
                st.setInt(2, type);
                st.setString(3, "No");
                
                return (st.executeUpdate() > 0);
    
            } catch (SQLException ex) {
                Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    } 

    public boolean editRoom(int number, int type, String isReserved)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `rooms` SET `type`=?,`reserved`=? WHERE `r_number`=?";
            try {
                st = my_connection.createConnection().prepareStatement(editQuery);
                
                st.setInt(1, type);
                st.setString(2, isReserved);
                st.setInt(3, number);
                return (st.executeUpdate() > 0);
               
            } catch (SQLException ex) {
                Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
    
    public boolean removeRoom(int roomNumber)
    {
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `rooms` WHERE `r_number`=?";
            try {
                st = my_connection.createConnection().prepareStatement(deleteQuery);
                st.setInt(1, roomNumber);
                return (st.executeUpdate() > 0);
               
            } catch (SQLException ex) {
                Logger.getLogger(CLIENT.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
}