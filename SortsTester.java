import java.util.Arrays;
public class SortsTester{
  public static void main(String[] args){
    int[] a = new int[]{-7,420,16,73,720,-218,623,803,14,1221,67,89,3,-2562,-382,718,843,145};
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
  }
}
