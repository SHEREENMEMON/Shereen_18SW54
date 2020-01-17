class Task7{
  public static void main(String args[]){
  int length=0;
  int array[]={20,20,30,40,50,50,50};
  for(int i=0; i<array.length; i++){
  for(int j=i+1; j<array.length; j++) 
  if(array[i]==array[j]){
   length++;
  }
  }
   System.out.println("New Length of Array after removing the duplicate elements:"+length);
 }  

}