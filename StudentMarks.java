public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks={
            {75,80,90},
            {65,70,85},
            {88,92,81}
        };
        //nested for loop to print array
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            //print new line after each row
            System.out.println();
        }
        //calculate sum of third student
        int sum=0;
        for(int j=0;j<marks[2].length; j++) {
            sum+=marks[2][j];

        }
        //calculate average of third student
        double average=(double)sum/marks[2].length;
        System.out.println("Average of the third student: " + average);
    }
}