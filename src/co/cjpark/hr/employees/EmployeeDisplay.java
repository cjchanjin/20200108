package co.cjpark.hr.employees;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDisplay {
//	private List<EmployeeDto> list;		메소드 안에 리스트 바로 정의 해버리고 여기는 삭제 가능.
	
	public void allSelectlist() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		List<EmployeeDto> list = new ArrayList<EmployeeDto> ();
		try {
			list = emp.allSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(EmployeeDto dto : list)
			dto.toString();
	}
	
	public void employeeInsert () {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		EmployeeDto dto = new EmployeeDto();
		Date date = Date.valueOf("2020-01-10");
		dto.setEmployee_id(222);
		dto.setFirst_name("승리");
		dto.setLast_name("박");
		dto.setEmail("park");
		dto.setPhone_number("011.555.5555");
		dto.setHire_date(date);
		dto.setJob_id("AD_PRES");
		dto.setSalary(150000);
		dto.setCommission_pct(0);
		dto.setManager_id(100);
		dto.setDepartment_id(60);
		
		try {
			int n = emp.insert(dto);
			if(n != 0)
				System.out.println("정상입력되었음");
			else
				System.out.println("입력이 실패하였음");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
