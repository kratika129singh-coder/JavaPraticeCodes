class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        int current =matrix[i][j];

        boolean isrowmin=true;
        for(int col=0;col<n;col++){
            if(matrix[i][col]<current){
                isrowmin=false;
                break;
            }
        }
        
        boolean iscolmax=true;
        for(int row=0;row<m;row++){
            if(matrix[row][j]>current){
                iscolmax=false;
                break;
    }
  }
   if( isrowmin && iscolmax ){
    result.add(current);
     }
   }
}
  return result;
    }
}