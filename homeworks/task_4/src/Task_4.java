public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
            int newArray[] = new int[size];
            newArray[0]=a0;
            for (int i = 1; i < size; i++){
                newArray[i]=newArray[i-1]+d;
            }
            return newArray;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        int newArray[] = new int[size];
        int sum = 2;
        for(int i = 0; i < size; i++)
        {
            if (i <= 1) {
                newArray[i] = 1;
            }
            else {
                newArray[i] = sum;
                sum = sum + newArray[i];
            }
        }
        return newArray;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        int newArray[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            if (i == 0) {
                newArray[i] = 0;
            }
            else {
                if (i == 1){
                    newArray[i] = 1;
                }
                else {
                    newArray[i] = newArray[i - 1] + newArray[i - 2];
                }
            }
        }
        return newArray;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        int max = data[0];
        for(int i = 0; i < data.length; i++) {
            if (data[i]>max){
                max=data[i];
            }
        }
        return max;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < data.length; i++) {
            if ((data[i]>max) && (data[i] % k == 0)){
                max=data[i];
            }
        }
        return max;
    }

    public static void Sort(int[] a){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for(int i = arr1.length; i < arr3.length; i++) {
            arr3[i]=arr2[i-arr1.length];
        }
        Sort(arr3);
        return arr3;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        return null;
    }
}