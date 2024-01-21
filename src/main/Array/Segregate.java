package Array;

import java.util.ArrayList;

public class Segregate {
    public static void main(String[] args) {
        int [] arr ={1,1,0,0,1,1,0,};
        int  temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer e : arr){
            list.add(e);
        }
        System.out.println(list);
    }
}
