package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc",
					"kpc12","kpc1212");
			//트랜잭션 시작
			con.setAutoCommit(false); //commit할때가지 들어가지 않음
			StringBuilder sql = new StringBuilder();
			sql.append("insert into member values(200, 'kim1', 'kim2')");
			
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();
			
			//sql 초기화
			sql.setLength(0);
			sql.append("insert into member values(201, 'kim3', 'kim4')");
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();
			
			success  = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
	
				try {
					//트랜잭션 끝
					if(success) {
						con.commit();
					}else {
						con.rollback();
					}
					//Connection Pool 사용할때는 반드시 해주어야 함
					con.setAutoCommit(true);
					if(con != null)	con.close();
					if(pstmt1 != null)	pstmt1.close();
					if(pstmt2 != null)	pstmt2.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
