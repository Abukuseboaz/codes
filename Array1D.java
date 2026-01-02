public class Array1D {
    public static void main(String[] args) {
        //declare and initialize 1D array
        int[] num={5, 10, 15, 20, 25};
        int sum=0;
        //loop through the array to calculate sum
        for(int i=0; i<num.length; i++){
            sum=sum+num[i];
            //print each element and sum
            System.out.println("Elements of array:"+ num[i]);
            System.out.println("Sum of array elements: "+ sum);
        }
    }
}