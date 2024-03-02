public class AscendDescend {

    static void sorting(int arr1[], int k){
        //boolean to keep track of if its sorted
        boolean sorted = false;

        //sort Ascending Half first
        while(!sorted){
            sorted = true;
            for(int i = 0; i <= k; i++){
                for(int j = i + 1; j <= k; j++){
                    //System.out.print("(" + i + ", " + j + ") ");
                    if(arr1[i] > arr1[j]){
                        sorted = false;
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
        }

        sorted = false;

        //Sorting Descending after k
        while(!sorted){
            sorted = true;
            for(int i = k; i < arr1.length - 1; i++){
                for(int j = i + 1; j <= arr1.length - 1; j++){
                    //System.out.print("(" + i + ", " + j + ") ");
                    if(arr1[i] < arr1[j]){
                        sorted = false;
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
        }

        //Outputting Final Result
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String []args)
    {
        int arr1[] = {6, 3, 5, 9, 7, 3, 5, 2, 4, 6, 1};
        int k = 4;
        //for loop method
        sorting(arr1, k);
    }
}
