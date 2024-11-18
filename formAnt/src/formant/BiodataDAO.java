/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formant;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.sql.Connection;
/**
 *
 * @author Broody
 */
public class BiodataDAO {
    private final Connection conn;
    private final String curr_time = null;
    
    public BiodataDAO() {
        conn = ClassKoneksi.getConnection();
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(currentDateTime);
        this.curr_time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(timestamp);
    }
    
}
