public class Solution {
    public static void task1(int[] array) {
        System.out.println("Прямой порядок:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Обратный порядок:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void task2(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    public static void task3(int[] array) {
        int minInd = 0;
        int maxInd = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minInd]) {
                minInd = i;
            }

            if (array[i] > array[maxInd]) {
                maxInd = i;
            }
        }

        System.out.println("Индекс минимальнго элемента: " + minInd);
        System.out.println("Индекс максимальный элемента: " + maxInd);
    }

    public static void task4(int[] array) {
        int counter = 0;

        for (int el : array) {
            if (el == 0) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("В массиве нет нулевых элементов.");
        } else {
            System.out.println("Количество нулевых элемаентов -> " + counter);
        }
    }

    public static void task5(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }

        System.out.print("Новый ");
        ArrayCreator.printArray(array);

    }

    public static void task6(int[] array) {
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не возрастающая последовательность");
        }
    }

    public static void taskStar(int[] array) {
        System.out.print("Новый ");
        if (array[array.length - 1] < 9) {
            array[array.length - 1] = array[array.length - 1] + 1;
            ArrayCreator.printArray(array);
            return;
        }

        boolean flag = true;
        for (int el : array) {
            if (el != 9) {
                flag = false;
                break;
            }
        }
        if (flag) {
            int[] newArray = new int[array.length + 1];
            newArray[0] = 1;
            ArrayCreator.printArray(newArray);
            return;
        }

        array[array.length - 1] = 0;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] == 9) {
                array[i] = 0;
            } else {
                array[i] = array[i] + 1;
                break;
            }
        }
        ArrayCreator.printArray(array);
    }
}
