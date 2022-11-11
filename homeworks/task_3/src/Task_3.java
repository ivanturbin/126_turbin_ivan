public class Task_3 implements Task_3_base {
    public int subtask_1_for(int n1, int n2, int a, int b) {
        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        int x = 0;
        if(n1 < n2){
            for(;n1 <= n2; n1++){
                if(n1 % a == 0 && n1 % b !=0)
                    x++;
            }
        } else {
            for(;n2 <= n1; n2++){
                if(n2 % a == 0 && n2 % b != 0)
                    x++;
            }
        }
        return x;
    }

    public int subtask_2_for(int num) {
        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        int x = 0, y = 0, z = 1;
        while (y < num){
            y += z;
            x = z;
            z = z + 1;
        }
        return x;
    }

    public int subtask_3_for(int num, int d, int cnt) {
        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности
        int x = num, y = 0;
        for (int z = 0; z < cnt; z++){
            y += x;
            x = x * d + 1;
        }
        return y;
    }

    public int subtask_4_for(int n) {
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
        int x = 1, amount = 0;
        for(int y = 1; y <= n; y++) {
            x *= y;
            amount += x;
        }
        return amount;
    }
}