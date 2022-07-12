public class Matrix {
    private int[][] matrix;
    private int length;


    public int[][] getMatrix() {
        return matrix;
    }

    public int getLength() {
        return length;
    }


    public Matrix(int length, boolean isNormId) {
        this.length = length;
        this.matrix = new int[length][length];
        if (isNormId) {
            for (int i = 0; i < this.length; i++) {
                for (int j = 0; j < this.length; j++) {
                    if (i == j) {
                        matrix[i][j] = 1;
                    }
                }
            }
        }
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.length = matrix.length;
    }

    public Matrix(int length) {
        this.length = length;
        this.matrix = randArr(length);
    }

    private static int[][] randArr(int length) {
        int min = -5;
        int max = 5;
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = min + (int) (Math.random() * ((max - min) + 1));
            }
        }
        return arr;
    }

    public void sum(Matrix m) {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length; j++) {
                this.matrix[i][j] = (this.matrix[i][j] + m.matrix[i][j]);
            }
        }
    }

    public void multScal(int k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] *= k;
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        int sumTmp;
        int[][] matrix3 = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                sumTmp = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    sumTmp += matrix1.matrix[i][k] * matrix2.getMatrix()[k][j];
                }
                matrix3[i][j] = sumTmp;
            }
        }
        return new Matrix(matrix3);
    }

    private static Matrix algComp(Matrix matrix, int indexI, int indexJ) {
        int[][] algComp = new int[matrix.getLength() - 1][matrix.getLength() - 1];
        int indI = 0;
        int indJ;

        for (int i = 0; i < matrix.getLength(); i++) {
            indJ = 0;
            if (i != indexI) {
                for (int j = 0; j < matrix.getLength(); j++) {
                    if (j != indexJ) {
                        algComp[indI][indJ] = matrix.getMatrix()[i][j];
                        indJ++;
                    }
                }
                indI++;
            }
        }
        return new Matrix(algComp);
    }

    public int determinant() {
        int determinant = 0;
        if (this.length == 1) {
            return this.matrix[0][0];
        }
        for (int i = 0; i < this.length; i++) {
            determinant += Math.pow(-1, i) * matrix[0][i] * algComp(this,0 , i).determinant();
        }
        return determinant;
    }
}