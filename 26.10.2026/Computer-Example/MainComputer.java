class MainComputer{
	public static void main (String args[]){
		Computer c;
		c = new Computer();
		c.ram = 4;
		c.color = "black";
		c.price = 50000;
		c.os = "liunx";
		c.display = 30.14;
		
		System.out.println(c.color);
		System.out.println(c.ram);
		System.out.println(c.price);
		System.out.println(c.os);
		System.out.println(c.display);
		
		c.use(); //call methods
		c.watch();
		c.help();
		
		
	}
}
//class file//

//output 
/*
C:\Users\Sabesan\OneDrive\Documents\Yarl_IT\Java_Basic\computer_java>java MainComputer
black
4.0
0
liunx
30.14
using for write code
watching movies
hepling to people
/*