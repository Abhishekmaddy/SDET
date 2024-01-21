package ZPackZ;

import java.util.ArrayList;

public class SortArray {
    public static void main(String[] args) {

        int [] arr = {-20,-9,1,12,4,5,2,6,78,2};
        int temp=0;
        for (int i=0;i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            //System.out.print(arr[i]+" ");

        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer num :arr ){
            list.add(num);
        }
        System.out.println(list);

    }

}
