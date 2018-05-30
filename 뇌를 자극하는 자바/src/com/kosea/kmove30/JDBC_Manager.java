package com.kosea.kmove30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Manager {

	////////////// 속성(필드)
	Connection conn = null; // 1단계 :DB 연결을 위한 거넥션 인터페이스
	Statement stmt = null; // Statement 인터페이스 sql을 실행
	ResultSet rs = null; // ResultSet 인터페이스 sql 결과를 저장
	// 생성자 호출

	public JDBC_Manager(Connection conn, Statement stmt, ResultSet rs) {
		super();
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}

	public JDBC_Manager() {
		System.out.println("JDBC_Manager() 기본생성자 호출");

	}

	////////////// 기능메소드(메소드)
	// DB연결
	public Connection DBConnection(String driver, String url, String user, String pass) throws Exception {

		Class.forName(driver);// 해당하는 JDBC드라이버를 로드한다
		conn = DriverManager.getConnection(url, user, pass);
		// System.out.println("데이터베이스에 ㅁㅁ접속했습니다.");
		return conn;
	}

	// query-
	public ResultSet selectTable(String query) throws Exception {
		stmt = conn.createStatement();// malldb 접속정보->show processlist;
		rs = stmt.executeQuery(query);// DML sql쿼리 실행후 결과를 저장
		// DB연결해제
		return rs;
	}

	// query INSERT INTO Person(pname,age,gender)VALUES('홍길동',13,'m');

	public void insertTable(String[] arr) throws Exception {

		String name = arr[0];
		String age = arr[1];
		String gender = arr[2];

		String query = "INSERT INTO Person(pname,age,gender)VALUES"
				+ "('" + name + "'," + age + ",'" + gender + "'"+");";
		stmt = conn.createStatement();
		System.out.println("query-"+query);
		int insertCount = stmt.executeUpdate(query);

		if (insertCount > 0)
			System.out.println(insertCount + "건이추가되었습니다");

	}
	
	// query - "delete from person where pname='홍길동'
	public void updateTable(String name, String age) throws Exception {
		String query = "update person set age=" + age + " where pname = '" + name + "'";
		stmt = conn.createStatement();
		System.out.println("query" +query);
		int updateCount = stmt.executeUpdate(query);
		
		if (updateCount > 0)
			System.out.println(updateCount + "건이수정되었습니다");
	}
	

	
	
	// query - "delete from person where pname='홍길동'
	public void deleteTable(String deleteName) throws Exception {
		String query = "delete from person where pname='" + deleteName + "'";
		stmt = conn.createStatement();
		System.out.println("query-"+query);
		int deleteCount = stmt.executeUpdate(query);

		System.out.println(deleteCount + "건이삭제되었습니다");
	}

	public void DBClose() throws Exception {
		conn.close(); // try문 마지막에

	}

	// DB종료

}
