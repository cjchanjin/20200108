package co.cjpark.dao;						//DAO 기본 구성

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.cjpark.dto.JobDto;

public class EmployeeDao {
	private Connection conn;
//	private PreparedStatement psmt;
//	private ResultSet rs;					//select 구문에 결과값을 받기 위해 쓴다.
	
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
	
//	public void select () {
//		JobDto dto = new JobDto();
//		String sql = "select * from jobs";
//		try {
//			psmt = conn.prepareStatement(sql);				//통로 통해서 구문 전달
//			rs = psmt.executeQuery();								//결과값 들고있다 = ResultSet
//			while(rs.next()) {
//				dto.setJob_id(rs.getString("job_id"));					//칼럼명 대신 숫자(DB의 칼럼인덱스)써도 된다
//				dto.setJob_title(rs.getString("job_title"));				// rs.getString(1);   but 헷갈리기 쉬움.
//				dto.setMin_salary(rs.getInt("min_salary"));
//				dto.setMax_salary(rs.getInt("max_salary"));
//				dto.toString();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}	finally {										//connection full 할때는 연결 끊는 구문 필요 없다. (미리 여러 연결 땡겨 놓는것)
//			try {
//				if(rs != null) rs.close();
//				if(psmt != null) psmt.close();
//				if(conn != null) conn.close();
//			}	catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	
}
