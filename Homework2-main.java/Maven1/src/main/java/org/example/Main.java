package org.example;

public class Main {

    public  static String[] getResult(String array[]){
        int arr[] = new int[3];
        for(int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i], 2);
        }

        String a;
        int b;
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[j+1]){
                    b = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = b;
                    a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        String array[] = {"11001000","100101", "100"};
        getResult(array);
    }
}