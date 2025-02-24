
enum Color{
	BLUE,RED{
		public void info() {
			System.out.println("Dengerous color....");
		}
	},Green;
	
	public void info() {
		System.out.println("universal color....");
	}
}

public class ColorRGB {

	public static void main(String[] args) {
		Color[] c = Color.values();
		
		for(Color cin : c) {
			System.out.println(cin);
			cin.info();
		}
	}
}
