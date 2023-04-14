package com.streaminapp.corejava.others;

public class Duplicate {
    public static void main(String[] args) {
        int ar[] = new int[128];
        String str = "abcsa";
        int previous =-999;
        for (int i =0 ; i< str.length(); i++){
            if(previous == str.charAt(i)){
                ar[str.charAt(i)] += 1;
            }
            previous = str.charAt(i);
        }
        int duplicates =0;
        for (int i =0 ; i<ar.length;i++){
            if(ar[i]>0){
                duplicates+=1;
            }
        }
        System.out.println("Total duplicates "+duplicates);
    }
    //write a function for fibonacci number
}
