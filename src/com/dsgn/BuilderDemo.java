package com.dsgn;

//Builder Design Pattern

class Employee{
	private int id;
	
	private String name;
	
	private String empType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empType=" + empType + "]";
	}
	
	
}

interface EmpBuilder{
	void employeeDetails();
	void employeeType();
}

class ImplBuilder implements EmpBuilder{
	private Employee emp = new Employee();
	
	@Override
	public void employeeDetails() {
		emp.setId(1);
		emp.setName("Abishek");
		
	}

	@Override
	public void employeeType() {
		emp.setEmpType("Part-Time");
	}
	
	public Employee employeeData() {
		return emp;
	}
}

class BuilderTest
{
	public void employeeInfo(EmpBuilder builder) {
		builder.employeeDetails();
		builder.employeeType();
//		builder.employeeData();
	}
}

public class BuilderDemo {

	public static void main(String[] args) {
		ImplBuilder obj = new ImplBuilder();
		
		BuilderTest test = new BuilderTest();
		
		test.employeeInfo(obj);
		
		System.out.println(obj.employeeData());
	}

}
