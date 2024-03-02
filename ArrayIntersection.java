class ArrayIntersection
{

    //for loop method
    static void forLoopMethod(int arr1[], int arr2[]){
        int indexes[] = new int[10];
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] == arr2[i]){
                indexes[count] = i;
                count++;
            }
        }

        for (int i = 0; i < count; i++){
            System.out.println(indexes[i]);
        }
    }

    public static void main(String []args)
    {
        int arr1[] = {1, 3, 8, 9, 4};
        int arr2[] = {8, 9, 8, 7, 4};

        //for loop method
        forLoopMethod(arr1, arr2);
    }
};