public class Task4{
static double returnAverage(double[] arr){
		double sum = 0.0;
		for(int x=0; x<arr.length; x++){
			sum+=arr[x];
		}
		return sum/arr.length;
	}
	public static void main(String[] args) {
		double[] floatArray = {2.3, 1.4, 10.6};
		System.out.println("Average: " + Task4.returnAverage(floatArray));
		}
}