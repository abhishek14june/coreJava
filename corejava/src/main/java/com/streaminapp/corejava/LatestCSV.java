package com.streaminapp.corejava;

import java.io.File;

public class LatestCSV {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\abhsingh67\\Downloads");
        File[] listOfFiles = folder.listFiles();
        File latestFile = null;
        long latestModifiedTime = Long.MIN_VALUE;
 
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(".pdf")) {
                if (listOfFiles[i].lastModified() > latestModifiedTime) {
                    latestFile = listOfFiles[i];
                    latestModifiedTime = latestFile.lastModified();
                }
            }
        }
        System.out.println("Latest CSV file: " + latestFile.getName());
    }
}