
enum Month{
	JAN(31),FEB(28),March(31),April(30),May(31),Jun(30),July(29),Aug(31),Sept,Oct,Nov,Dec;
	
	int days;
	
	Month(int days){
		this.days =days;
	}
	
	Month(){
		this.days =35;
	}
	
	public int getDay() {
		return days;
	}
}

public class MonthData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Month.JAN);
		Month[] data = Month.values();
		
		for(Month d : data ) {
			System.out.println(d +"==> "+d.getDay());
			
		}
	}

}
