public class SolutionCollector {
    public static void homework4Task1() {
        System.out.println("Задача 1");
        int arraySize = ArrayCreator.getArraySize();
        byte method = ArrayCreator.getCreationMethod();
        int[] array = new int[0];

        if (method == -1) {
            System.out.println("Завершаем программу...");
        }
        if (method == 1) {
            array = ArrayCreator.randomArray(arraySize);
        }
        if (method == 2) {
            array = ArrayCreator.inputArray(arraySize);
        }
        ArrayCreator.printArray(array);

        Solution.task1(array);

        System.out.println("\n\n");
    }

    public static void homework4Task2() {
        System.out.println("Задача 2");
        int arraySize = ArrayCreator.getArraySize();
        byte method = ArrayCreator.getCreationMethod();
        int[] array = new int[0];

        if (method == -1) {
            System.out.println("Завершаем программу...");
        }
        if (method == 1) {
            array = ArrayCreator.randomArray(arraySize);
        }
        if (method == 2) {
            array = ArrayCreator.inputArray(arraySize);
        }
        ArrayCreator.printArray(array);

        Solution.task2(array);

        System.out.println("\n\n");
    }

    public static void homework4Task3() {
        System.out.println("Задача 3");
        int arraySize = ArrayCreator.getArraySize();
        byte method = ArrayCreator.getCreationMethod();
        int[] array = new int[0];

        if (method == -1) {
            System.out.println("Завершаем программу...");
        }
        if (method == 1) {
            array = ArrayCreator.randomArray(arraySize);
        }
        if (method == 2) {
            array = ArrayCreator.inputArray(arraySize);
        }
        ArrayCreator.printArray(array);

        Solution.task3(array);

        System.out.println("\n\n");
    }

    public static void homework4Task4() {
        System.out.println("Задача 4");
        int arraySize = ArrayCreator.getArraySize();
        byte method = ArrayCreator.getCreationMethod();
        int[] array = new int[0];

        if (method == -1) {
            System.out.println("Завершаем программу...");
        }
        if (method == 1) {
            array = ArrayCreator.randomArray(arraySize);
        }
        if (method == 2) {
            array = ArrayCreator.inputArray(arraySize);
        }
        ArrayCreator.printArray(array);

        Solution.task4(array);

        System.out.println("\n\n");
    }

    public static void homework4Task5() {
        System.out.println("Задача 5");
        int arraySize = ArrayCreator.getArraySize();
        byte method = ArrayCreator.getCreationMethod();
        int[] array = new int[0];

        if (method == -1) {
            System.out.println("Завершаем программу...");
        }
        if (method == 1) {
            array = ArrayCreator.randomArray(arraySize);
        }
        if (method == 2) {
            array = ArrayCreator.inputArray(arraySize);
        }
        ArrayCreator.printArray(array);

        Solution.task5(array);

        System.out.println("\n\n");
    }

    public static void homework4Task6() {
        System.out.println("Задача 6");
        int arraySize = ArrayCreator.getArraySize();
        byte method = ArrayCreator.getCreationMethod();
        int[] array = new int[0];

        if (method == -1) {
            System.out.println("Завершаем программу...");
        }
        if (method == 1) {
            array = ArrayCreator.randomArray(arraySize);
        }
        if (method == 2) {
            array = ArrayCreator.inputArray(arraySize);
        }
        ArrayCreator.printArray(array);

        Solution.task6(array);

        System.out.println("\n\n");
    }

    public static void homework4TaskStar() {
        System.out.println("Задача *");
        int arraySize = ArrayCreator.getArraySize();
        byte method = ArrayCreator.getCreationMethod();
        int[] array = new int[0];

        if (method == -1) {
            System.out.println("Завершаем программу...");
        }
        if (method == 1) {
            array = ArrayCreator.randomNumberArray(arraySize);
        }
        if (method == 2) {
            array = ArrayCreator.inputArray(arraySize);
        }
        ArrayCreator.printArray(array);

        Solution.taskStar(array);

        System.out.println("\n\n");
    }
}
