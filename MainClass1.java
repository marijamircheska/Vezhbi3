package zad01;

public class MainClass1 {
	
	public static void main(String[] args) {
		Avtomobil av = new Avtomobil("Toyota", "Corolla", "Bela", 12400, 2013, "BT-000-AA" );
		
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
