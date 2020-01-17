import java.util.Scanner;
class Area{
	double length;
	double breadth;
	Area(double length,double breadth){
		this.breadth=breadth;
		this.length=length;
									}

	public double returnArea(){
		double area=length*breadth;
		return area;
					}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length : ");
		double a=sc.nextDouble();
		System.out.print("Enter breadth : ");
		double b=sc.nextDouble();
		Area ar=new Area(a,b);
		System.out.println("Area is: "+ar.returnArea());
	}
}