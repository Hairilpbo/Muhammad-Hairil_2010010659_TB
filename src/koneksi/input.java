
package koneksi;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class input {
   private static Connection koneksi;
	
	public static Connection getKoneksi()
	{
		if(koneksi == null)
		{
			try
			{
				String url = "jdbc:mysql://localhost/gajipegawai";
				String username = "root";
				String password = "";
				
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				koneksi = DriverManager.getConnection(url,username,password);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		return koneksi;
	}
        
        

}

    
