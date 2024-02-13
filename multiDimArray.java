public class multiDimArray {
    public static void main(String[] args) {
        int[][] arr1=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               arr1[i][j]=(int)(Math.random()*10);
            }

           
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               System.out.print( arr1[i][j]+ " ");
               
            }
            System.out.println();
            
           
        }
        //Enhanced loop

        for(int n[]:arr1){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        

    }
   

}
