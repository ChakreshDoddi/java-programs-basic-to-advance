package in.kgcoding.challenge82;

public class ArrayOperations {
    int[]arr;

    public ArrayOperations(int[]inputArr) {
        arr=inputArr;
    }

    public class Statistics{

        double mean(){
            double sum=0;
            for(int number:arr){
                sum+=number;
            }
            return sum/arr.length;
        }
        double median(){
            return 5;
        }
    }
}
