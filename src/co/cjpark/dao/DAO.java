package co.cjpark.dao;						//DAO 기본 구성

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.cjpark.dto.JobDto;

public class DAO {
	public Connection conn;		//private는 상속이 안되기때문에 public로 바꿔줌
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	
	public DAO() {			//DAO가 생성될때 driver load 와 연결 해 준다.
		try {																			//try 아래 내가 작업할 내용 삽입
			Class.forName(driver);															//driver 잡아줌
			conn = DriverManager.getConnection(url, user, password);			//통로 연결
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}
