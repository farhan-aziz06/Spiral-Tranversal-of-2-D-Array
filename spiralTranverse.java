import java.util.Scanner;

public class spiralTranverse{
    public static void main(String[]args) {

        Scanner console = new Scanner(System.in);
        try{
            System.out.println("Enter Rows and Columns: ");
            int row = console.nextInt();
            int col = console.nextInt();

            int [][] array = new int[row][col];
            System.out.println("Please Enter Array Elements: ");
            for (int i=0; i< row; i++){
                for(int j =0; j<col;j++){
                    array[i][j]=console.nextInt();
                }
            }
            int minr=0, minc=0, maxr=array.length-1,maxc=array[0].length-1;

            int totalElement=row*col;
            int count =0;
            System.out.println("Here is your array by Spiral Traversal");
            while (count<totalElement) {

                //*Left Wall */
                for(int i=minr,j=minc;i<=maxr&&count<totalElement;i++ ){
                    System.out.println(array[i][j]);
                    count++;
                }
                minc++;

                //*Bottom Wall */
                for(int i=maxr,j=minc;j<= maxc&&count<totalElement;j++ ){
                    System.out.println(array[i][j]);
                    count++;
                }
                maxr--;

                //*Right Wall */
                for(int i=maxr,j=maxc;i>=minr&&count<totalElement;i-- ){
                    System.out.println(array[i][j]);
                    count++;
                }
                maxc--;

                //*Top Wall */

                for(int i=minr,j=maxc; j>= minc&&count<totalElement;j-- ){
                    System.out.println(array[i][j]);
                    count++;
                }
                minr++;
                
            }
        }catch( Exception e){
            System.out.println("Exception: "+ e);
        }finally{
            console.close();
        }
        
        
    }
}