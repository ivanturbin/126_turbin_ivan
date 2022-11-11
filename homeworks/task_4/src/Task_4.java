public class Task_4 implements Task_4_base {
    public int[] subtask_1_arrays(int size, int a0, int d) {
        // сгенерировать и вернуть массив размера size, содержащий элементы
        // арифметической прогрессии с первым членом a0 и разностью d
        int[] array_1 = new int[size];
        array_1[0] = a0;
        for (int y = 1; y < size; y++) {
            array_1[y] = array_1[y - 1] + d;
        }
        return array_1;
    }

    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        int array_2[] = new int[size];
        int amount = 2;
        for(int y = 0; y < size; y++)
        {
            if (y <= 1) {
                array_2[y] = 1;
            }
            else {
                array_2[y] = amount;
                amount += array_2[y];
            }
        }
        return array_2;


    }

    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности фибоначчи.
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
        int[] array_3 = new int[size];
        for (int y = 0; y < size; y++) {
            if (y == 0) array_3[y] = 0;
            if (y == 1 || y == 2) array_3[y] = 1;
            if (y > 2) array_3[y] = array_3[y - 2] + array_3[y - 1];
        }
        return array_3;

    }

    public int subtask_4_arrays(int[] data) {
        // Для данного массива вычислить максимальный элемент
        int max = data[0];
        for (int y = 0; y < data.length; y++) {
            if (data[y] > max){
                max = data[y];
            }
        }
        return max;
    }

    public int subtask_5_arrays(int[] data, int k) {
        // Для данного массива вычислить максимальный элемент
        // кратный k. Гарантируется, что как минумум один такой элемент
        // в массиве есть
        int max = data[1];
        for (int y = 0; y < data.length; y++) {
            if (data[y] > max && data[y] % k == 0)
                max = data[y];
        }
        return max;
    }

    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // Даны два массива arr1, arr2.
        // Произвести слияние данных массивов в один отсортированный
        // по возрастанию массив.
        return null;
    }

    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}