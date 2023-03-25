class MatrixExercise{
    int row;
    int coloumn;
    int mat[][];
    int mat1[][];

    MatrixExercise(int ro, int comn)
    {
     mat=new int[ro][comn];
     mat1=new int[ro][comn];
     this.row=ro;
     this.coloumn=comn;
    }

    public void setMatrix()
    {
        System.out.println("Enter elements of matrix according this column*row");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
               mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrixfor 2 according this column*row");
        java.util.Scanner sc1=new java.util.Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                mat1[i][j]=sc1.nextInt();
            }
        }
    }

    public void getMatrix()
    {
        System.out.println("all elements of matrix are");
      //  java.util.Scanner sc=new java.util.Scanner(System.in);
        for(int i=0;i<row;i++)
        {

            for(int j=0;j<coloumn;j++)
            {
                System.out.print(mat[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("all elements of matrix 2 are");

        for(int i=0;i<row;i++)
        {

            for(int j=0;j<coloumn;j++)
            {
                System.out.print(mat1[i][j]+" ");

            }
            System.out.println();
        }

    }

void additionOfTwoMatrix()
{
    int sum=0;
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<coloumn;j++)
        {
            int temp=mat[i][j];
            mat[i][j]=temp+mat1[i][j];
        }
    }

}

void displayOfSumOfTwoMatrix()
{
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<coloumn;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}


}


public class Matrix {
    public static void main(String[] args) {
        System.out.println("in this program we are goving to print matrix");
        System.out.println("Enter  row you want to enter in column");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter  coloumn you want to enter in column");
        int column=sc.nextInt();
        MatrixExercise m1=new MatrixExercise(row,column);
        m1.setMatrix();
        m1.getMatrix();
        m1.additionOfTwoMatrix();
        m1.displayOfSumOfTwoMatrix();





    }
}
