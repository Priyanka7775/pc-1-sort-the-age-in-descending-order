package com.jap;

public class SortingAge {

    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int [] ageArray){

        for (int i = 0; i < ageArray.length; i++) {
            for (int j = i+1; j < ageArray.length; j++) {
                if(ageArray[i] < ageArray[j]){
                    int temp = ageArray[i];
                    ageArray[i] = ageArray[j];
                    ageArray[j] = temp;
                }
            }

        }
        return ageArray;

    }

    public static void main(String[] args) {
        int[] ageArray = {22,34,33,32,36,27,28};
        SortingAge sortingAge  = new SortingAge();
        int[] sortedArray = sortingAge.getSortedAge(ageArray);
        for (int i = 0; i < ageArray.length; i++) {
            System.out.print(ageArray[i] + ", ");
        }

    }
}
