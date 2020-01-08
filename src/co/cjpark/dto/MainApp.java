package co.cjpark.dto;

import co.cjpark.dao.EmployeeDao;

public class MainApp {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao ();
//		dao.select();
		
		JobDisplay js = new JobDisplay();
		js.allSelectDisplay();
		
	}
}
