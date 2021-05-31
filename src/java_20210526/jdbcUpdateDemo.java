package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {
	public static void main(String[] args) {

		//1. 드라이브 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con= null;
		PreparedStatement pstmt = null;
		
		//2. 데이터베이스어ㅏ 연결할 수 있는 Connection 객체를 생성
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1212");
			
		//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member "); //sql은 마지막에 모두 스페이스바를 눌러준다. 연결된 것으로 인식하기 때문에
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
		//4. 바인딩 변수를 설정한다.
			int index = 1;
			pstmt.setString(index++, "두테르테2"); //대입후 증가 1 -> 2
			pstmt.setString(index++, "필리핀2");  //2 -> 3
			pstmt.setInt(index++, 11);          //3
			
		//5. SQL문을 전송한다.
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " +resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					//6. 모든 자원은 반납한다.
					if (con != null) con.close();
					if (pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
		}
		
	}

}
