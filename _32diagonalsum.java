public class _32diagonalsum {
    public static int digadd(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+= matrix[i][i];
            if(i!=matrix.length-1-i)//for odd array like 3x3 or 5x5
                sum+=matrix[i][matrix.length-1-i];
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        digadd(matrix);
    }
}
