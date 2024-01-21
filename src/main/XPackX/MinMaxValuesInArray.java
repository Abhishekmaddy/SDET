package XPackX;

public class MinMaxValuesInArray {

    public static void main(String[] args) {

       //int[] numbers ={ 23,1,3,5,12,7,2,9,10};
        int []a={1,2,55,6689,56,488,558};
        int max = a[0];
        int temp=0;
        for (int i=0; i<a.length-1;i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(temp);

        }





//        int min= numbers[0];
//        int max= numbers[0];
//
//        for (int i =1; i<numbers.length; i++){
//            if (numbers[i]> max){
//                max = numbers[i];
//            }
//            if (numbers[i]< min){
//                min = numbers[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);







    }
}
