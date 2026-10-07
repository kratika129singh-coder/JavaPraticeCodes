public class GenericMethodSelectionSort
{
    public static void main(String[] args)
 {
    Integer[] arr1={1,6,3,9,1};
    Float[] arr2={4.0f,3.0f,2.3f,4.4f};
    String[] arr3={"Kratika","Ates","Wamika","Baran","Yumna","Megha"};
    selectionsort(arr1);
    selectionsort(arr2);
    selectionsort(arr3);
    System.out.println("Sorted Intergers " + java.util.Arrays.toString(arr1));
    System.out.println("Sorted Float " + java.util.Arrays.toString(arr2));
    System.out.println("Sorted String " +java.util.Arrays.toString(arr3));
  }

 public static <T extends Comparable<T>>void selectionsort(T[] Array)
  {
    int n=Array.length;
    for(int i=0;i<n-1;i++)
      {
        int min=i;
        for(int j=i+1;j<n;j++)
          { 
              {
                if(Array[j].compareTo(Array[min])<0)
                {
                   min=j;

                }
                T temp =Array[i];
                Array[i]=Array[min];
                Array[min]=temp;
              }
          }
      }
    
  }
}


