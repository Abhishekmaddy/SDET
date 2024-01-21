package ApiTesting;

public class Duplicate {


    public static void main(String[] args) {

        int temp=0;
        int [] arr = {1, 2, 2, 3, 3, 4, 5};

        for (int i = 0; i <= arr.length - 1; i++){
            int count=0;
            for(int j=i+1; j<=arr.length -1; j++){
                if (arr[i]==arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;

                }
            }
            if (count>1){
                System.out.println(arr[i]);
            }
        }
    }
}
