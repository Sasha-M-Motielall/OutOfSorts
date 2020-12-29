import java.util.Arrays;
public class SortsTester{
  public static void main(String[] args){
    int[] a = new int[]{-7,420,16,720,-218,623,803,3,-2,-382,843,145};
    int[] b = new int[]{9,8,7,6,5,4,3,2,1,0};
    System.out.println(Arrays.toString(b));
    Sorts.bubbleSort(b);
    System.out.println(Arrays.toString(b));
    System.out.println();
    int[] c = new int[1001];
    for(int i=0;i<c.length;i++){
      c[i]=1000-i;
    }
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(c));
    int[] d =new int[0];
    Sorts.bubbleSort(d);
    System.out.println(Arrays.toString(d));

    int[] e = new int[]{6,3,7,23,2,37,79,57,9,5,46,78};
    Sorts.selectionSort(e);
    System.out.println(Arrays.toString(e));

    int[] f = new int[]{1,-3,5,-7,9,-11,13,15,17,-19,21};
    Sorts.selectionSort(f);
    System.out.println(Arrays.toString(f));
    Sorts.selectionSort(d);
    System.out.println(Arrays.toString(d));

    int[] g = new int[]{22,-33,44,-55,66,-77,88,-99,111,-122};
    System.out.println(Arrays.toString(g));
    Sorts.insertionSort(g);
    System.out.println(Arrays.toString(g));

  }
}
