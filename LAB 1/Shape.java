class Shape{
	 public void drawShape(){

	 }
	 public void eraseShape(){
	 	
	 }
}
class Square extends Shape{
	public void drawShape(){
		System.out.println("Draw Square");
	}

	public void eraseShape(){
		System.out.println("Erase Square");
	}
}

class Triangle extends Shape{
	public void drawShape(){
		System.out.println("Draw Trianagle");
	}

	public void eraseShape(){
		System.out.println("Erase Triangle");
	}
}
class Main
{
	public static void main(String[] args) {
		Triangle st=new Triangle();
		st.drawShape();
		st.eraseShape();

	}
}