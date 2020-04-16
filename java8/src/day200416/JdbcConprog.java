package day200416;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConprog {
	public static void main(String[] args) {
		String jdbc_url = "jdbc:mysql://localhost:3306/my_database?useUnicode=true"
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			System.out.println("데이터베이스에 접속했습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
