package arrays.medium_prob;
import java.util.*;

public class PrintMatrixInSpiralManner {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> l = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // left → right
            for(int i = left; i <= right; i++){
                l.add(matrix[top][i]);
            }
            top++;

            // top → bottom
            for(int i = top; i <= bottom; i++){
                l.add(matrix[i][right]);
            }
            right--;

            // right → left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom → top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{9,5,6,8}};

        PrintMatrixInSpiralManner obj = new PrintMatrixInSpiralManner();
        List<Integer> result = obj.spiralOrder(matrix);

        System.out.println(result);
    }
}