enum ApprovalMatrix{
	
	APPROVE(1,"approve"),
	REJECT(2,"reject"),
	PENDING(0,"pending");
	
	int statusCode;
	String desc;
	
	ApprovalMatrix(int statusCode,String desc){
		this.statusCode =statusCode;
		this.desc =desc;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getDesc() {
		return desc;
	}
	
}

public class ApprovalStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApprovalMatrix data = ApprovalMatrix.APPROVE;
		System.out.print(data.APPROVE.getDesc());
		System.out.print("  --->  ");
		System.out.println(data.APPROVE.getStatusCode());
		
		ApprovalMatrix data1 = ApprovalMatrix.REJECT;
		System.out.print(data1.REJECT.getDesc());
		System.out.print("  --->  ");
		System.out.println(data1.REJECT.getStatusCode());
		
		ApprovalMatrix data2 = ApprovalMatrix.PENDING;
		System.out.print(data2.PENDING.getDesc());
		System.out.print("  --->  ");
		System.out.print(data2.PENDING.getStatusCode());

	}

}
