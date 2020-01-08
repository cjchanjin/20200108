package co.cjpark.dao;						//DAO 기본 구성

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.cjpark.dto.JobDto;

public class EmployeeDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;					//select 구문에 결과값을 받기 위해 쓴다.
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	
	public EmployeeDao() {			//DAO가 생성될때 driver load 와 연결 해 준다.
		try {																			//try 아래 내가 작업할 내용 삽입
			Class.forName(driver);															//driver 잡아줌
			conn = DriverManager.getConnection(url, user, password);			//통로 연결
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select () {
		JobDto dto = new JobDto();
		String sql = "select * from jobs";
		try {
			psmt = conn.prepareStatement(sql);				//통로 통해서 구문 전달
			rs = psmt.executeQuery();								//결과값 들고있다 = rs
			while(rs.next()) {
				dto.setJob_id(rs.getString("job_id"));
				dto.setJob_title(rs.getString("job_title"));
				dto.setMin_salary(rs.getInt("min_salary"));
				dto.setMax_salary(rs.getInt("max_salary"));
				dto.toString();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			try {
				if(rs != null) rs.close();
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			}	catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
