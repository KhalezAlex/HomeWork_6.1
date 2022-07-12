public class Pyramid {

    public static int[][] generate(int length) {
        int min = 0;
        int max = 99;
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
        return array;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - 1 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < arr.length; j++) {
                if (j <= i) {
                    if (arr[i][j] < 10) {
                        System.out.print(" " + arr[i][j] + "  ");
                    }
                    else {
                        System.out.print(arr[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static int maxSum(int [][] array, int column, int row) {
        int result = array[row][column];
        if (row != array.length - 1) {
            int left = maxSum(array, column, row + 1);
            int right = maxSum(array, column + 1, row + 1);
            result += Math.max(left, right);
        }
        return result;
    }
}
