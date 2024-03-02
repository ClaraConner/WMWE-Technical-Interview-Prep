public class SecondSmallest {

    static void findSecondSmallestValue(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        System.out.print(secondSmallest);
    }

    public static void main(String []args)
    {
        int arr[] = {4, 6, 3, 8, 1, 4, 2, 3};
        findSecondSmallestValue(arr);
    }
}
