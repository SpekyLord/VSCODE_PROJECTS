import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] list1 = new int[6];
        int[] list2 = new int[6];
        
            System.out.println("Enter 6 numbers to compare");
        for (int a = 0; a < list1.length; a++){
            
            list1[a] = scn.nextInt();
        }
        System.out.println("Enter 6 numbers to compare to the first list");
         for (int b = 0; b < list2.length; b++){
            
            list2[b] = scn.nextInt();
        }
        System.out.println();
        boolean nosame = true;
        for (int d = 0; d < list1.length; d++){
            for (int e = 0; e < list2.length; e++){
            if (list1[d] == list2[e]){
                nosame = false;
                System.out.print("Same value: " + list1[d] + " ");
            }
            }
        }
        if (nosame == false){
            System.out.println("Theres same number");
            System.out.println("FRANCIS GABRIEL P. AUSTRIA");            
        }
        else{
            System.out.println("Theres no the same number");
            System.out.println("FRANCIS GABRIEL P. AUSTRIA");            

        }
        }
    }

   

