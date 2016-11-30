
public final class ArrayUtils {

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма массива = " + sum);
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }
        System.out.println("Минимальное значение заданого массива = " + min);
        return min;
    }

    public static int maxI(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }
        }
        System.out.println("Максимальное значение заданого массива = " + max);
        return max;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        if (max > 0) {
            System.out.println("Максимально-положительное значение заданого массива = " + max);
        } else {
            System.out.println("Нет максимально-положительного числа, т.к. массив состоит только из отрицательных чисел");
        }

        return max;
    }

    public static long multI(int[] array) {
        long mult = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                mult = mult * array[i];
            } else {
                System.out.println("Ошибка! В массиве есть нули, результат умножения - 0");
                mult = 0;
                return mult;
            }
        }
        System.out.println("Результат умножения = " + mult);

        return mult;
    }

    public static int mod(int[] array) {
        int d = array[0];
        int e = array[array.length - 1];
        int f = d % e;
        System.out.println("Результат вычислений " + f);
        return f;
    }

    public static int maxSec(int[] array) {
        int max = array[0];
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;
            }
        }
        int maxSec = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max && i != imax) {
                maxSec = array[i];
            } else if (array[i] != max & maxSec < array[i]) {
                maxSec = array[i];
            }
        }
        System.out.println("Максимальное значение заданого массива = " + max);
        System.out.println("Максимальное второе значение заданого массива = " + maxSec);
        return maxSec;

    }

   public static int[] reverse(int[] array) {
        int a = array.length;
        int b = 0;
        int[] rev = new int[a];
        for (int i = a-1; i >= 0; i--) {
            rev[b] = array[i];
            b++;
        }
        return rev;
    }

    public static int[] findEvenElements(int[] array){
        int [] elements= new int[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                int [] same = new int[elements.length+1];
                System.arraycopy(elements,0,same,0,elements.length);
                elements=same;
                elements[elements.length-1]=array[i];
            }
        }
        return elements;
    }



}
