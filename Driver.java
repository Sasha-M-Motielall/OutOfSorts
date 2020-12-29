import java.util.*;
public class Driver{
  public static void main(String[]args){
    if(args.length < 2){
      System.out.println("usage: java Driver SIZE ALGO [STYLE]");
      System.out.println("supported ALGO: bubble,selection,insertion,test");
      System.out.println("supported STYLE: random,equal,sorted,reversed");
    }else{

      int[] ranData = new int[Integer.parseInt(args[0])];

      if(args.length < 3 || args[2].equals("random")){
	      for(int i=0;i<ranData.length;i++){
          ranData[i]=(int)(Math.random() * 10000.0);
        }
      }else if(args[2].equals("equal")){
	      for(int i=0;i<ranData.length;i++){
          ranData[i]=0;
        }
      }else if(args[2].equals("sorted")){
	      for(int i=0;i<ranData.length;i++){
          ranData[i]=i;
        }
      }else if(args[2].equals("reversed")){
	      for(int i=0;i<ranData.length;i++){
          ranData[i]=(ranData.length-i);
        }
      }

     if(args[1].equals("bubble")){
       Sorts.bubbleSort(ranData);
     }
     else if(args[1].equals("selection")){
       Sorts.selectionSort(ranData);
     }
     else if(args[1].equals("insertion")){
       Sorts.insertionSort(ranData);
     }

      else if(args[1].equals("test")){
        int[] ranDataBubble = Arrays.copyOf(ranData,ranData.length);
        int[] ranDataSelection = Arrays.copyOf(ranData,ranData.length);
        int[] ranDataInsertion = Arrays.copyOf(ranData,ranData.length);
        Arrays.sort(ranData);
        Sorts.bubbleSort(ranDataBubble);
        Sorts.selectionSort(ranDataSelection);
        Sorts.insertionSort(ranDataInsertion);

        if( Arrays.equals(ranData,ranDataBubble)){
         System.out.println("Bubble Correct!");
       }else{
        System.out.println("Bubble Not Correct!!!!!!!!!11oneeleven");
       }

       if( Arrays.equals(ranData,ranDataSelection)){
         System.out.println("Selection Correct!");
       }else{
        System.out.println("Selection Not Correct!!!!!!!!!11oneeleven");
       }

       if( Arrays.equals(ranData,ranDataInsertion)){
         System.out.println("Insertion Correct!");
       }else{
        System.out.println("Insertion Not Correct!!!!!!!!!11oneeleven");
       }
     }
   }
 }
}
