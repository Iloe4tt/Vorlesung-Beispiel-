/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

public class ArrayComparison {

    public static void main(String[] args) {
        int[] values  = {1, 2, 3, 4};
        int[] numbers = {1, 2, 3, 4};

        // values = numbers;
        
        if (values == numbers) {
            System.out.println("arrays are identical");
        }

        if (values.equals(numbers)) { // same as values == numbers 
            System.out.println("build in method: arrays are equal");
        }
        
        if (equalArrays(values, numbers)) { 
            System.out.println("own method: arrays are equal");
        }
        
        System.out.println("end of array comparison");
    }

    // see java.util.Arrays.equals() for a more general solution
    static boolean equalArrays(int[] arr1, int[] arr2){
        if (arr1 == arr2){
            return true;
        }
        if (arr1 == null || arr2 == null){  // at most one array is null 
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i = i + 1){
            if(arr1[i] != arr2[i]){
                return false; 
            }
        }
        return true;
    }
    
}
