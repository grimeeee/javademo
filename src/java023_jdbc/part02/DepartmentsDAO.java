package java023_jdbc.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 */

//DAO : Data Access Object(데이터 접근 객체)
public class DepartmentsDAO {
   private Connection conn;
   private Statement stmt;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   
   //싱글톤 패턴
   private static DepartmentsDAO dao = new DepartmentsDAO();
   
   private DepartmentsDAO(){}   
   
   //생성은못하지만 사용할수 있도록
   public static DepartmentsDAO getInstance() {
      return dao;
   }
   
   
   private Connection init() throws SQLException, ClassNotFoundException {
      Class.forName("oracle.jdbc.OracleDriver");
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
      String username = "hr";
      String password = "a1234";
      
      return DriverManager.getConnection(url,username,password);
   }//end init()
   
   private void exit() throws SQLException {
      if(rs!=null)
         rs.close();
      if(stmt != null)
         rs.close();
      if(pstmt!= null)
         pstmt.close();
      if(conn != null)
         conn.close();
   }
   
   public List<DepartmentsDTO> listDepartments(){
      List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
         try {
            conn=init();
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM departments ORDER BY department_id";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
               DepartmentsDTO dto = new DepartmentsDTO();
               dto.setDepartment_id(rs.getInt("department_id"));
               dto.setDepartment_name(rs.getString("department_name"));
               dto.setManager_id(rs.getInt("manager_id"));
               dto.setLocation_id(rs.getInt("location_id"));
               aList.add(dto);
            }
            conn.commit();
         }catch(ClassNotFoundException | SQLException e) {
            try {
               conn.rollback();
            } catch (SQLException e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
            }
            e.printStackTrace();
         }finally {
            try {
               conn.setAutoCommit(true);
               exit();
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      
      return aList;
   }
   
   public List<DepartmentsDTO> searchDepartments(String data){
	   	List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
	   	
	   	try {
			conn = init();
			conn.setAutoCommit(false);
			
			//stmt = conn.createStatement();
			//변수는 쌍따옴표에서 빼주기
			//String sql = "SELECT * FROM departments WHERE department_name LIKE '%" + data + "%' ORDER BY department_id";
			//rs = stmt.executeQuery(sql);
			
			String sql = "SELECT * FROM departments WHERE department_name LIKE ? ORDER BY department_id";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + data + "%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
					DepartmentsDTO dto = new DepartmentsDTO();
	               dto.setDepartment_id(rs.getInt("department_id"));
	               dto.setDepartment_name(rs.getString("department_name"));
	               dto.setManager_id(rs.getInt("manager_id"));
	               dto.setLocation_id(rs.getInt("location_id"));
	               aList.add(dto);
			}
			
			conn.commit();
			
	   	} catch (ClassNotFoundException | SQLException e) {
	   		try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return aList;
   }
}//end class