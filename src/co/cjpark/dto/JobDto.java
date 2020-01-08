package co.cjpark.dto;				// DTO 기본 구성 

public class JobDto {		//DTO는 기본적으로 table 과 1:1    //jobs table에 대한 DTO - table 칼럼명, 타입 맞춰줘야 함
	private String job_id;
	private String job_title;
	private int min_salary;
	private int max_salary;
	
	public JobDto() {
	}

	public final String getJob_id() {
		return job_id;
	}

	public final void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public final String getJob_title() {
		return job_title;
	}

	public final void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public final int getMin_salary() {
		return min_salary;
	}

	public final void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}

	public final int getMax_salary() {
		return max_salary;
	}

	public final void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}
	
	public String toString () {				// 일반적인 DTO Class는 이 메소드를 생성하지 않음 , 실습 출력 위해 씀
		System.out.print(job_id + " " );
		System.out.print(job_title + " " );
		System.out.print(min_salary + " " );
		System.out.println(max_salary);
		
		return null;
	}
	
}
