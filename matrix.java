import java.util.Scanner;

class Matrix {
    int row, col;
    int boxx[][];

    Matrix(int r, int c) {
        row = r;
        col = c;
        boxx = new int[r][c];
    }

    void insert() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                boxx[i][j] = sc.nextInt();
            }
        }
        sc.close();

    }

    Matrix multi(Matrix a, Matrix b) {
        int sum = 0;
        Matrix c = new Matrix(a.row, b.col);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.col; j++) {
                sum = 0;
                for (int k = 0; k < a.col; k++) {
                    sum += a.boxx[i][k] * b.boxx[k][j];
                }
                c.boxx[i][j] = sum;
            }
        }
        return c;
    }

    Matrix transpose() {
        Matrix m = new Matrix(row, col);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++)
                m.boxx[i][j] = boxx[j][i];
        }
        return m;
    }

    void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(boxx[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Matrix c = new Matrix(3, 3);
        Matrix z = new Matrix(3, 3);
        Matrix j = new Matrix(3, 3);
        System.out.println("Enter the 1st matrix");
        c.insert();
        System.out.println("Enter the Second matrix");
        z.insert();
        j = j.multi(c, z);
        j.display();
        j = j.transpose();
        j.display();
    }
}