package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		//1. 드라이브를 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null; 
		PreparedStatement pstmt= null;
		
			//2. 데이터베이스를 연결할 수 있는 Connection 객체를 생성
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/kpc",
						"kpc12",
						"kpc1212");
				//3. SQL을 전송할 수 있는 PreparedStatement 객체를 생성
				StringBuilder sql = new StringBuilder();
				sql.append("DELETE FROM member ");
				sql.append("WHERE num = ? ");
				pstmt = con.prepareStatement(sql.toString());
				//4. 바인딩 변수를 설정
				int index = 1 ;
				pstmt.setString(index, String.valueOf(11)); //String.valueOf: 모든 것을 문자로 바꿔줌
				//5. SQL문을 전송한다.
				int resultCount = pstmt.executeUpdate();
				System.out.println("갱신된 행의 수 : " +resultCount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
					try {
						//6. 모든 자원을 반납
						if(con != null) con.close();
						if(pstmt != null) pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
	}

}
