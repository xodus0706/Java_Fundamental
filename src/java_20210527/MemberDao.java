package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	// 1. MemberDao 변수인 single을 static 변수로 설정
	private static MemberDao single;

	// 2. 생성자의 접근한정자를 private으로 설정
	// 이유: 외부에서 객체생성을 못하게 하기 위함
	private MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버로드 실패 : " + e.getMessage());
		}
	}

	// MemberDao의 객체는 getInstance() 메서드로만 생성
	// getInstance() 메서드의 구현은 MemberDao 객체를 한개만 생성할 수 있도록 만들어야함
	// static 메서드로 구현한 이유는 MemberDao 객체를 외부에서 생성할 수 없기 때문
	public static MemberDao getInstance() {
		if (single == null) {
			single = new MemberDao();
		}
		return single;
	}

	public boolean insert(MemberDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", // url //port번호의 경우 mariadbd의 default
																					// 포트를 썼다면 굳이 쓰지 않아도 된다.
					"kpc12", // user
					"kpc1212");// password


			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, NAME, addr)");
			sql.append("VALUES(?,?,?)"); // 나머지를 변수처리 하겠다.

			pstmt = con.prepareStatement(sql.toString()); // StringBuilder class -> String class 여기에는 String만 들어갈 수 있으므로

			int index = 1;
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index, dto.getAddr());

			pstmt.executeUpdate();
			success = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return success;
	}

	public boolean update(MemberDto dto) {
			boolean success = false;	
				Connection con= null;
				PreparedStatement pstmt = null;
				
				try {
					con = DriverManager.getConnection(
							"jdbc:mysql://localhost/kpc",
							"kpc12",
							"kpc1212");
					
					StringBuilder sql = new StringBuilder();
					sql.append("UPDATE member "); //sql은 마지막에 모두 스페이스바를 눌러준다. 연결된 것으로 인식하기 때문에
					sql.append("SET NAME = ?, addr = ? ");
					sql.append("WHERE num = ? ");
					pstmt = con.prepareStatement(sql.toString());
					
					int index = 1;
					pstmt.setString(index++, dto.getName()); //대입후 증가 1 -> 2
					pstmt.setString(index++, dto.getAddr());  //2 -> 3
					pstmt.setInt(index++, dto.getNum());          //3
					
					pstmt.executeUpdate();
					success = true;
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
						try {
							if (con != null) con.close();
							if (pstmt != null) pstmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			
				}
		return success;
	}

	public boolean delete(int num) {
		boolean success = false;
		Connection con = null; 
		PreparedStatement pstmt= null;
		
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost/kpc",
						"kpc12",
						"kpc1212");
				StringBuilder sql = new StringBuilder();
				sql.append("DELETE FROM member ");
				sql.append("WHERE num = ? ");
				pstmt = con.prepareStatement(sql.toString());
				
				int index = 1 ;
				pstmt.setInt(index, num); 
				
				pstmt.executeUpdate();
				success = true;


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
					try {
						if(con != null) con.close();
						if(pstmt != null) pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		
		return success;
	}

	public ArrayList<MemberDto> select(int start, int len) {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc",
					"kpc12",
					"kpc1212");
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY num DESC ");
			sql.append("LIMIT ?,? ");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				index = 1;
				int num = rs.getInt(index++); 
				String name = rs.getString(index++); 
				String addr = rs.getString(index); 
				MemberDto dto = new MemberDto(num, name, addr);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if (con != null) con.close();
					if (pstmt != null) pstmt.close();
					if(rs != null) rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return list;

	}

}
