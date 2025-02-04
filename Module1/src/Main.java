public class Main {
    public static void main(String[] args){
        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        /// bubble sort
        System.out.print("Before bubble sort: ");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.print("\n\nAfter bubble sort: ");
        printArrayElements(numbers);

        /// selection sort

/*        System.out.print("Before selection sort: ");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.print("\n\nAfter selection sort: ");
        printArrayElements(numbers);*/
    }

    private static void bubbleSort(int[] nums) {
        for(int unsortedPartitionIndex = nums.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            for(int i = 0; i < unsortedPartitionIndex; i++){
                if(nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] nums){
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;
            for (int i = smallest + 1; i <= lastUnsortedIndex; i++) {
                if (nums[i] < nums[smallest]) {
                    smallest = i;
                }
            }
            if(smallest != lastUnsortedIndex){
                int temp = nums[smallest];
                nums[smallest] = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] nums){
        for(int num: nums){
            System.out.print(num +  " ");
        }
    }
}
