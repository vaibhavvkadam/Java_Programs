//you have two seperate array. you need to add indivisible elements in sequance on the third array else you can add them any one array which you already have

class AdditionOfTwoArray{
    int arr1[];
    int arr2[];
    java.util.Scanner sc=new java.util.Scanner(System.in);

    AdditionOfTwoArray()
    {
        arr1=new int[5];
        arr2=new int[5];
    }
    public void setArray()
    {
        System.out.println("enter elements of array 1");
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("enter elements of array 2");
        for(int i=0;i<5;i++)
        {
            arr2[i]=sc.nextInt();
        }

    }
    public void getArray()
    {
        System.out.println("elements of array1");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr1[i]+" ");

        }
        System.out.println();

        System.out.println("elements of array2");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr2[i]+" ");

        }
        System.out.println();
    }
    public void addThemInThird()
    {
        for(int i=0;i<arr1.length;i++)
        {
            int temp=arr1[i];
            arr1[i]=arr2[i]+temp;
        }

    }
//time complexity
    //0(n+n+n+n+n)
    //0(5*n)
    //in case of equations or big notation constant do ignore

    public void sumOfTwoArray()
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}


public class Java_25 {
    public static void main(String[] args) {
        System.out.println("we are prepering addition of two array");
        AdditionOfTwoArray obj=new AdditionOfTwoArray();
        obj.setArray();
        obj.getArray();
        obj.addThemInThird();
        obj.sumOfTwoArray();


    }



}
