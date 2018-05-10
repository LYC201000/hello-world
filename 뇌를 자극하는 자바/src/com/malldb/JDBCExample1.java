package com.malldb;
// db접속
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;
class JDBCExample1 {
    public static void main(String args[]) {
    	//1단계 :DB 연결을 위한 거넥션 인터페이스
        Connection conn = null;
        //Statement 인터페이스 sql을 실행
        Statement stmt=null;        
        //ResultSet 인터페이스  sql 결과를 저장
        ResultSet rs=null;
        
        
        //try ~catch 문에서 DB연결중에 예외가 발생하는지를 검사
        try {
        	String now = null;
        	//2단계: 해당하는 JDBC드라이버를 로드한다
            Class.forName("com.mysql.jdbc.Driver");
            //3단계: 드라이버매니져 클레스는 getConnection메소드로 DB를 연결한다
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/malldb", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
                  
            //malldb 접속정보->show processlist; 
            stmt=conn.createStatement();
            
            //DML sql쿼리 실행후 결과를 저장
            rs=stmt.executeQuery("SELECT now();");	// 실행할 sql입력    	
            System.out.println("날짜          시간 ");
            
            while (rs.next()) {
            	now=rs.getString(1);
            System.out.println(now);
            }	         
            //4단계: DB연결을 종료한다
            conn.close(); // try문 마지막에
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
