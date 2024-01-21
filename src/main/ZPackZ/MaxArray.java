package ZPackZ;

import org.bson.io.BsonOutput;

public class MaxArray {

    public static void main(String[] args) {

        int[] arr ={1,2,43,5,7,2,7,8,99,2,22};
        int max= arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }

        System.out.println(max);
    }
}
