import java.sql.*;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) throws Exception{

            Scanner sn = new Scanner(System.in);
//        Driver myDriver = new oracle.jdbc.driver.OracleDriver();
//        DriverManager.registerDriver( myDriver );

        Class.forName("oracle.jdbc.driver.OracleDriver");


        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
//       
//        Statement st = con.createStatement();
////        ResultSet rs = st.executeQuery("select * from empl");
//        ResultSet rs = st.executeQuery("select * from empl where salary >= 500000");
//
//        PreparedStatement st = con.prepareStatement("select * from empl where salary >= ?");
//        st.setInt(1, 500000);
//        ResultSet rs = st.executeQuery();
        
        PreparedStatement st = con.prepareStatement("select * from empl where salary >= ?");
        System.out.print("Enter minimum Salry amount :");
        st.setInt(1, sn.nextInt());
        ResultSet rs = st.executeQuery();


        while(rs.next()){
 
            System.out.println(rs.getInt(1)+ "    " + rs.getString(3) + "   " + rs.getInt(8));
        }

        st.close();
        rs.close();
    }
}