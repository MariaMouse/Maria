import java.util.Arrays;

public class fillDiagonal {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
