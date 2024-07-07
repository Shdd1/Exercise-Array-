import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //***************Q1*******************
        /*int num[] = new int[6];
            num[0]=50;
            num[1]=-20;
            num[2]=30;
            num[3]=40;
            num[4]=60;
            num[5]=10;

               if(num[0]==num[num.length-1]){
                   System.out.println("yes");
               }else {
                   System.out.println("false");
               }
          */

        //**************Q2*****************


        /*int sum=0;
        int[] number = {1, 4,17, 7, 25, 3, 100};
        for(int i=0;i<number.length;i++){
           sum+=number[i];
        }
        int average =sum/(number.length);
        System.out.println("The average of the said array is: "+average);

        System.out.print("The numbers in the said array that are greater than the average are: ");
        for (int j=0;j<number.length;j++) {
            if (number[j] > average) {
                System.out.print(number[j] + " ");
            }
        }*/


//*********************Q3******************


        /*int[] num= {100, 30, 50,88,0,101};
        if(num[0]>num[num.length-1]){
            System.out.println("Larger value between first and last element: "+num[0]);
        }else {
            System.out.println("Larger value between first and last element: "+num[num.length-1]);
        }*/


    //******************Q4***********************

        /*ArrayList<Integer> Original_Array =new ArrayList<>();
        ArrayList<Integer>after_swapping =new ArrayList<>();

       Original_Array.add(20);
       Original_Array.add(30);
       Original_Array.add(40);

        int first_index = 0;
        int last_index = Original_Array.size() - 1;

         //مرحلة التبديل بين القيمه الاولى والاخيره
        // عشان يعين قيمه مكان اندكس معين  Set
        //يسترجع القيمه المخزنه في الاندكس get
        // متغير مؤقت temp
        int temp = Original_Array.get(first_index);
        Original_Array.set(first_index, Original_Array.get(last_index));
        Original_Array.set(last_index, temp);

        after_swapping.addAll(Original_Array);
            System.out.print("New array after swapping the first and last elements :"+after_swapping+ " ");*/


        //********************Q5*************************

        /*int array[]={2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> number_even =new ArrayList();
        ArrayList<Integer> number_odd =new ArrayList();
        ArrayList<Integer> odd_even =new ArrayList();

        for (int i:array) {
            if (i % 2 != 0) {
               number_odd.add(i) ;
            } else {
                number_even.add(i);
            }
        }
        odd_even.addAll(number_odd);
        odd_even.addAll(number_even);
        System.out.println(odd_even);*/



      //**********************Q6*************************
      /*  int arrya1[]={2,3,6,6,4};
        int array2[]={2,3,6,6,4};
        if(arrya1.length!=array2.length){
            System.out.println("false");
            return;
        }
        boolean areEqual = true;
        for (int i=0;i<arrya1.length;i++) {
            if (arrya1[i] != array2[i]) {
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/





}  }