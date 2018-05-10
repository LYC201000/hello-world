import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample2 {
	 public static void main(String args[]) {
	    	//1단계 :DB 연결을 위한 커넥션 인터페이스
	        Connection conn = null;
	        
	        //Statement 인터페이스 sql을 실행
	        Statement stmt=null;
	        
	        //ResultSet 인터페이스  sql 결과를 저장
	        ResultSet rs=null;
	        
	        //try ~catch 문에서 DB연결중에 예외가 발생하는지를 검사
	        try {
	        	String jumincd=null;
	        	String pname=null;
	        	String gender=null;
	        	int age=0;
	        	
	        	
	        	//2단계: JDBC드라이버를 로드한다
	            Class.forName("com.mysql.jdbc.Driver");
	            //3단계: 드라이버매니져 클레스는 getConnection메소드로 DB를 연결한다
	            conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/mysql", "root", "12345");
	            System.out.println("데이터베이스에 접속했습니다.");
	            
	            //Connection객체가 Statement객체를 생성
	            stmt=conn.createStatement();
	            //DML sql쿼리 실행후 결과를 저장
	           rs=stmt.executeQuery("SELECT jumincd,	pname,	gender,	age FROM person WHERE gender='f'");
	            	
	            System.out.println("주민번호             이름   성별  나이 ");
	            //
	            while (rs.next()) {
	            
	             jumincd	=rs.getString(1);//rs.getString("jumincd");
	             pname		=rs.getString(2);//rs.getString("pname");
	             gender		=rs.getString(3);//rs.getString("gender");
	             age		=rs.getInt(4);//rs.getInt("age");
	            
	            System.out.println(jumincd+"---"+pname+"---"+gender+"---"+age);
	            }	            
	            //4단계: DB연결을 종료한다
	            conn.close();
	            System.out.println(jumincd+"---"+pname+"---"+gender+"---"+age);
	        }
	        catch (ClassNotFoundException cnfe) {
	            System.out.println("해당 클래스를 찾을 수 없습니다." + 
	                               cnfe.getMessage());
	        }
	        catch (SQLException se) {
	            System.out.println(se.getMessage());
	        }
	    }

}
