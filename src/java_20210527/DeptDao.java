package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDao {
	//singleton
	private static DeptDao single;
	private DeptDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브로드 실패");
		}
	}
	
	public static DeptDao getInstance() {
		if (single == null) {
			single = new DeptDao();
		}
		return single;
	}
	
	public boolean insert(DeptDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc",
				          "kpc12",
				          "kpc1212");
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO dept(deptno, dname, loc)" );
		sql.append("VALUES (?, ?, ?)" );
		
		pstmt = con.prepareStatement(sql.toString());
		
		int index =1;
		pstmt.setInt(index++, dto.getNo());
		pstmt.setString(index++, dto.getName());
		pstmt.setString(index++, dto.getLoc());
		
		pstmt.executeUpdate();
		success = true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}finally {
				try {
					if(con != null) con.close();
					if (pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return success;
	}
	
	public boolean update(DeptDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc",
					"kpc12",
					"kpc1212");
		
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE dept ");
		sql.append("SET dname = ?, loc = ? ");
		sql.append("WHERE deptno = ? ");
		pstmt = con.prepareStatement(sql.toString());
		
		int index = 1;
		pstmt.setString( index++, dto.getName());
		pstmt.setString( index++, dto.getLoc());
		pstmt.setInt( index++, dto.getNo());
		
		pstmt.executeUpdate();
		success = true;
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(con != null) con.close();
					if (pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return success;
	}
	
	public boolean delete(int )
		
	
	}


