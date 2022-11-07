package sample;

public class encap {
	private int a,b;

	public encap(int a) {
		super();
		this.a=a;
		
	}
	

	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap en =new encap(19);
		en.setB(10);
		System.out.println(en.a);
		System.out.println(en.getB());
	}
}
