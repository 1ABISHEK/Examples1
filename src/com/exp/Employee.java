package com.exp;

class Employee{

	int id;
	String name;
	String cmp;

	public Employee(){
		System.out.println("default constructor");
}

	public Employee(int id,String name){
//		this.id = id;
//		this.name = name;
		System.out.println("parameterized constructor  "+id+"  "+name);
}	

	public Employee(int id,String name,String cmp){
		System.out.println("overloaded constructor  "+id+"  "+name+" "+cmp);
}
	public Employee(Employee obj){	
		System.out.println("object parameterized constructor");
}	
	public static void main(String args[]){
	Employee obj = new Employee();	
	Employee obj1 = new Employee(0,"Abishek");
	Employee obj2 = new Employee(1,"Adhav","Kaar");	
	Employee obj3 = new Employee(obj1);
}

}
