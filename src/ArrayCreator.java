import java.util.Scanner;

public class ArrayCreator {
    public static int getArraySize(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static byte getCreationMethod(){
        Scanner scanner = new Scanner(System.in);
        byte method = 0;
        byte counter = 0;

        while (true){
            System.out.println();
            System.out.println("Чтобы создать случайный массив введите 1");
            System.out.println("Чтобы ввести массив введите 2");
            while (!scanner.hasNextByte()) {
                System.out.println("Ошибка! Введите целое число:");
                scanner.next();
            }
            method = scanner.nextByte();

            if(method == 1 || method == 2) {
                System.out.println();
                return method;
            }
            if (counter == 7){
                return -1;
            }
            counter++;
        }
    }

    public static int[] randomArray(int n){
        int[] taskArray = new int[n];
        for (int i = 0; i < n; i++) {
            taskArray[i] = (int) (Math.random() * 90) + 10;
        }
        return taskArray;
    }

    public static int[] randomNumberArray(int n){
        int[] taskArray = new int[n];
        for (int i = 0; i < n; i++) {
            taskArray[i] = (int) (Math.random() * 10);
            if(taskArray[0] == 0){
                break;
            }
        }
        return taskArray;
    }

    public static int[] inputArray(int n){
        int[] taskArray = new int[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                scanner.next();
            }
            taskArray[i] = scanner.nextInt();
        }

        return taskArray;
    }

    public static void printArray(int[] array){
        System.out.println("Массив:");
        for (int el: array) {
            System.out.print(el + " ");
        }
        System.out.println("\n");
    }
}
