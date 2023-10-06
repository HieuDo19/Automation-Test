package Lab_03;

import java.util.Arrays;

public class Lab03_3 {

   /** Nhap mot day cac chu so bat ky
    * Gan chu so dau tien index = 0
    * Gan chu so thu hai index = 1
    * So sanh "index = 0" va "index = 1" voi nhau, so nao nho hon dung truoc
    * Tien hanh so sanh cac chu so con lai voi "index = 0" va "index = 1"
    * Neu chu so duoc so sanh lon hon "index = 0" va "index = 1" thi se xep sau
    * Neu chu so duoc so sanh nho hon "index = 0" va "index = 1" thi se xep truoc
    * Truong hop con lai thi xep giua "index = 0" va "index = 1"
    * So sanh cac chu so lan luot voi nhau, den khi day so duoc sap xep theo dung logic: min to max
    */
   public static void main(String[] args) {
       int[] myArr = {0, 34, 100, 50, 28};
       int myArrLen = myArr.length;

       for (int unsortedIndex = myArr.length - 1; unsortedIndex >= 0; unsortedIndex--) {
           for (int innerIndex = 0; innerIndex < unsortedIndex; innerIndex++) {
               if (myArr[innerIndex] > myArr[innerIndex + 1]){

                   int temp = myArr[innerIndex];
                   myArr[innerIndex] = myArr[innerIndex +1];
                   myArr[innerIndex +1] = temp;
               }

           }

       }
       System.out.println(Arrays.toString(myArr));
   }
}
