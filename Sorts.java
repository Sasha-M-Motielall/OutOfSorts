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

  public static void selectionSort(int[] data){
    int tempValue=218984276;
    int tempIndex=0;
    for(int i=0;i<data.length;i++){
      for(int j=i;j<data.length;j++){
        if(data[j]<tempValue){tempValue=data[j]; tempIndex=j;}
      }
      data[tempIndex]=data[i];
      data[i]=tempValue;
      tempValue=218984276;
    }
  }

  public static void insertionSort(int[] data){
    int tempV=0;
    int temppV=0;
    boolean notdone=true;
    for(int i=1;i<data.length;i++){
      tempV=data[i];
      for(int j=i-1;j-1>=-1&&notdone;j--){
        if(data[j]>tempV){temppV=data[j]; data[j]=tempV; data[j+1]=temppV;}else{notdone=false;}
      }
      notdone=true;
    }
  }
}
