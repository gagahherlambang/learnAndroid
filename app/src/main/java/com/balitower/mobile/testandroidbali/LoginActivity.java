package com.balitower.mobile.testandroidbali;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IT on 11/9/2017.
 */

public class LoginActivity extends AppCompatActivity {



    public void binary(int val){
        int maxVal = val;
        String result= "100010000";
        for (int i=result.length(); i>0; i--) {

        }

        Double  a = 0.10;
        a.intValue();

    }

    List<Integer> input = new ArrayList<>();

    public boolean isu(int[] A){
        int max = A[0];
        int upperBound = 0;

        //Look for the number of element
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > max)
            {
                max = A[i];
                upperBound = i;
            }
        }
        //Conditional operation to check
        for (int j = 0; j < upperBound ; j++)
        {
            if (A[j] > max)
                return false;
        }
        for (int j = upperBound + 1; j < A.length - 1; j++)
        {
            if (!(max > A[j] && A[j + 1] < A[j]))
                return false;
        }
        return true;
    }

    public String abc(String S){
        Map<String, Integer> files = new HashMap<>();
        files.put("music", 0);
        files.put("images", 0);
        files.put("movies", 0);
        files.put("other", 0);

        String[] lines = S.split("\n");
        for (String s : lines) {
            String[] line = s.split(" ");
            String size = line[1].substring(0, line[1].length() - 1);
            String[] filename = line[0].split("\\.");
            String ext = filename[filename.length - 1];;
            if (ext.equals("mp3") || ext.equals("aac") || ext.equals("flac")) {
                files.put("music", files.get("music") + Integer.parseInt(size));
            } else if (ext.equals("jpg") || ext.equals("bmp") || ext.equals("gif")) {
                files.put("images", files.get("images") + Integer.parseInt(size));
            } else if (ext.equals("mp4") || ext.equals("avi") || ext.equals("mkv")) {
                files.put("movies", files.get("movies") + Integer.parseInt(size));
            } else {
                files.put("other", files.get("other") + Integer.parseInt(size));
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append("music " + files.get("music") + "b\n");
        sb.append("images " + files.get("images") + "b\n");
        sb.append("movies " + files.get("movies") + "b\n");
        sb.append("other " + files.get("other") + "b\n");

        String details = "music " + files.get("music") + "b\n" + "images " + files.get("images") + "b\n" + "movies " + files.get("movies") + "b\n" +"other " + files.get("other");


        String abc = "\"" + details +"\"";
        return abc;
    }

    public String abcs(String S) {

//        StringBuilder

        String[] mType = {".mp3", ".flac", ".aac"};
        String[] iType = {".jpg", ".bmp", ".gif"};
        String[] oType = {".7z", ".txt", ".zip"};
        String[] moType = {".mp4", ".avi", ".mkv"};
        String[] words = S.split("b");

        String[] musicDetails = new String[words.length];
        String[] music2Details = new String[words.length];
        String[] music3Details = new String[words.length];
        String[] music4Details  = new String[words.length];

        String musicD;
        String musicS;

        for(String aWords : words) {
            boolean isFound = false;
            for(int i = 0; i< mType.length; i++) {
                if(aWords.contains(mType[i])) {
                    musicDetails[i] = aWords;
                }
            }
            for(int i = 0; i< iType.length; i++) {
                if(aWords.contains(iType[i])) {
                    music2Details[i] = aWords;
                }
            }
            for(int i = 0; i< oType.length; i++) {
                if(aWords.contains(oType[i])) {
                    music3Details [i] = aWords;
                }
            }
            for(int i = 0; i< moType.length; i++) {
                if(aWords.contains(moType[i])) {
                    music4Details[i] = aWords;
                }
            }
        }



//        System.out.println(musicDetails + music2Details + music3Details + music4Details);
//        return musicDetails + music2Details + music3Details + music4Details;

        return "";
    }

    public int data(String[] val){
        int valus =0;
        for(String abc : val){
            String[] file = abc.split(" ");
            valus = valus + Integer.parseInt(file[1]);
        }
        return valus;
    }

    public String datar(String[] val){
        int valus =0;
        String type ="";
        String[] mType = {".mp3", ".flac", ".aac"};
        String[] iType = {".jpg", ".bmp", ".gif"};
        String[] oType = {".7z", ".txt", ".zip"};
        String[] moType = {".mp4", ".avi", ".mkv"};

        for(String abc : val){
            String[] file = abc.split(" ");
            boolean isFound = false;
            for(int i = 0; i< mType.length; i++) {
                if(file[0].contains(mType[i])) {
                    type ="music";
                    isFound = true;
                }
            }
            for(int i = 0; i< iType.length; i++) {
                if(file[0].contains(iType[i])) {
                    type ="image";
                    isFound = true;
                }
            }
            for(int i = 0; i< oType.length; i++) {
                if(file[0].contains(oType[i])) {
                    type ="other";
                    isFound = true;
                }
            }
            for(int i = 0; i< moType.length; i++) {
                if(file[0].contains(oType[i])) {
                    type ="other";
                    isFound = true;
                }
            }
            if(isFound){
                break;
            }
        }
        return type;
    }
}
