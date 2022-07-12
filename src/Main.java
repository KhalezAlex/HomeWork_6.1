import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Task1 (протестировать методы работы с квадратными матрицами)

//        -диагональная матрица:
//        Matrix matrix = new Matrix(3, true);
//        matrix.print();

//        -нулевая матрица:
//          Matrix matrix = new Matrix(4, false);
//          matrix.print();

//        -сложение матриц
//        Matrix matrix1 = new Matrix(4);
//        matrix1.print();
//        System.out.println();
//        Matrix matrix2 = new Matrix(4);
//        matrix2.print();
//        System.out.println();
//        matrix1.sum(matrix2);
//        matrix1.print();

//        -умножение матриц:
//        Matrix matrix1 = new Matrix(3);
//        matrix1.print();
//        System.out.println();
//        Matrix matrix2 = new Matrix(3);
//        matrix2.print();
//        System.out.println();
//        Matrix.multiply(matrix1, matrix2).print();

//        -умножение матрицы на скаляр:
//        Matrix matrix = new Matrix(3);
//        matrix.print();
//        matrix.multScal(5);
//        System.out.println();
//        matrix.print();
//        System.out.println();
//        matrix.multScal(0);
//        matrix.print();

//        -определение детерминанта матрицы:
//        Matrix matrix = new Matrix(3);
//        matrix.print();
//        System.out.println(matrix.determinant());

//        -вывод матрицы на консоль:
//        Matrix matrix = new Matrix(5);
//        matrix.print();



//        Task2 протестировать перегруженный метод, выводящий на экран различные массивы

//        -одномерный массив int
//        int[] array = {1, 2, 3, 4, 5};
//        Print.print(array);

//        -одномерный массив String
//        String[] array = {"Hello", "everyone", "what's", "up"};
//        Print.print(array);

//        -двумерный массив int
//        int[][] array = {{1, 2, 3},{4, 5, 6}};
//        Print.print(array);

//        -двумерный массив float
//        float[][] array = {{1.7f, 2.5f, 3.3f},{4.4f, 5.2f, 6.9f}};
//        Print.print(array);



//        Task3 Задание с методами для массива строк

//        -генерация случайных строк длиной не более 40 символов:
//        int maxLength = 40;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество элементов в массиве: ");
//        int amount = Integer.parseInt(scanner.next());
//        String[] strArray = new String[amount];
//        for (int i = 0; i < amount; i++) {
//            strArray[i] = Strings.genString(maxLength);
//            System.out.println(strArray[i]);
//        }

//        -сортировка в обратном порядке без учета регистра
//        int maxLength = 40;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество элементов в массиве: ");
//        int amount = Integer.parseInt(scanner.next());
//        String[] strArray = new String[amount];
//        for (int i = 0; i < amount; i++) {
//            strArray[i] = Strings.genString(maxLength);
//            System.out.println(strArray[i]);
//        }
//        System.out.println();
//        Strings.revSort(strArray);
//        for (int i = 0; i < amount; i++) {
//            System.out.println(strArray[i]);
//        }

//        -сортировка массива по количеству слов в строке
//        int maxLength = 40;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество элементов в массиве: ");
//        int amount = Integer.parseInt(scanner.next());
//        String[] strArray = new String[amount];
//        for (int i = 0; i < amount; i++) {
//            strArray[i] = Strings.genString(maxLength);
//            System.out.println(strArray[i]);
//        }
//        System.out.println();
//        Strings.amountWordSort(strArray);
//        for (int i = 0; i < amount; i++) {
//            System.out.println(strArray[i]);
//        }



//        Task4 пирамида из чисел

//        --вывод пирамиды на экран
//        int[][] array = {{7, 0, 0, 0, 0},
//                         {3, 8, 0, 0, 0},
//                         {8, 1, 0, 0, 0},
//                         {2, 7, 4, 4, 0},
//                         {4, 5, 2, 6, 5}};
//        Pyramid.print(array);

//        --вычисление наибольшей суммы чисел
//        int[][] array = {{7, 0, 0, 0, 0},
//                         {3, 8, 0, 0, 0},
//                         {8, 1, 0, 0, 0},
//                         {2, 7, 4, 4, 0},
//                         {4, 5, 2, 6, 5}};
//        Pyramid.print(array);
//        System.out.println(Pyramid.maxSum(array, 0, 0));

//        --вычисление суммы для рандомной пирамиды высоты 30 строк
//        int length = 30;
//        int[][] array = Pyramid.generate(length);
//        Pyramid.print(array);
//        System.out.println(Pyramid.maxSum(array,0, 0));



//        Task5 Король-дракон-копейщики

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите Dragon hp: ");
//        int drHp = scanner.nextInt();
//        System.out.print("Введите Dragon attack: ");
//        int drAtt = scanner.nextInt();
//        System.out.print("Введите Spearman hp: ");
//        int spHp = scanner.nextInt();
//        System.out.print("Введите Spearman attack: ");
//        int spAtt = scanner.nextInt();
//
//        System.out.println(Dragon.spAmount(spHp, spAtt, drAtt, 1, drHp));



//        Task6 правильность расстановки скобок
//        String str1 = "([a)b]";
//        String str2 = "(a[b](f[(g)(g)]))";
//
//        System.out.println(str1 + "\n" + Braces.isValid(str1));
//        System.out.println(str2 + "\n" + Braces.isValid(str2));
    }
}
