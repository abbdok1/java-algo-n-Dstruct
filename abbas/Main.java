package src.abbas;
public class Main{
    public static void main(String[] args){
        int[][] matrix={{1,1,1,0}, 
        {0,5,0,1}, 
        {2,1,3,10}};
        System.out.println(solution(matrix));
    }
     static int   solution(int[][] matrix){
       int  answer=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if (i==0){
                    answer+=matrix[i][j];
                }
                if(i!=0){
                    if(j-i!=-1&&matrix[j-i][j]!=0 ) answer+=matrix[i][j];
                }
            }
    }
      return answer;
    }
    
}