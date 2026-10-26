class MainPen{
	public static void main (String []args) {
		pen p;
		p = new pen();
		System.out.println(p.color);
		p.color = "Red";
		p.height = 10.5;
		p.weight = 5.3;
		p.brand = "Ten";
		p.price = 85.00;
		p.madein = "srilanka";
		
		p.write();
	}
}