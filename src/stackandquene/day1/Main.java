package stackandquene.day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            //获取矩阵和核的大小
            String[] s1 = s.split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            int a = Integer.parseInt(s1[2]);
            int b = Integer.parseInt(s1[3]);
            //生成输入矩阵
            int[][] arrInput = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m ; j++) {
                    arrInput[i][j] = (i+1)*(j+1)%10;
                }
            }
            //计算输出矩阵的元素和
            int sum = 0;
            for (int i = 0; i < n-a+1; i++) {
                for (int j = 0; j < m-b+1; j++) {
                    sum += max(arrInput,a,b,i,j);
                }
            }
            System.out.println(sum);
        }
    }
    public static int max(int[][] arr,int a,int b,int i,int j){
        int temp = 0;
        for (int k = i; k < a + i ; k++) {
            for (int l = j; l < b + j; l++) {
                if (arr[k][l] >= temp){
                    temp = arr[k][l];
                }
            }
        }
        return temp;
    }
}
