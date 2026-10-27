class Student {
	int id;
	String name;
	
	void setStudent(int id ,String name ){ 	//parameters  
		 id = 10;
		this.id = id;           //this key instant variable //
		this.name = name;	
	}
	void getStudent(){
		System.out.println("ID:" + this.id);
		System.out.println("Name:"+ this.name);
	}
}