import java.util.Arrays;
public class Sorts{
  public static void bubbleSort(int[] data){
    int temp=0;
    int swaps=1;
    int limit=data.length;
    while(swaps>0){
      swaps=0;
      for(int i=0;i+1<limit;i++){
        if(data[i]>data[i+1]){
          temp=data[i];
          data[i]=data[i+1];
          data[i+1]=temp;
          swaps++;
          if(i+2==limit){limit--;}
        }
      }
    }
  }
}
