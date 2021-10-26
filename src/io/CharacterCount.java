package io;

import java.io.*;
import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {

        Map<Character, Integer> hmap = new HashMap<>();
        FileInputStream fin;
        BufferedInputStream bin;
        FileOutputStream fout;
        BufferedOutputStream bout;


        try{

            fin = new FileInputStream("F:\\work\\zemosotraining\\javapractice\\src\\io\\file.txt");
            bin = new BufferedInputStream(fin);

            int i=0;
            while((i=bin.read())!=-1){
                hmap.put((char)i, (hmap.getOrDefault((char)i, 0))+1);
            }
            fin.close(); bin.close();

            fout = new FileOutputStream("F:\\work\\zemosotraining\\javapractice\\src\\io\\output.txt");
            bout = new BufferedOutputStream(fout);
            for(Map.Entry<Character, Integer> e : hmap.entrySet()){
                String str = e.getKey()+" "+e.getValue()+"\n";
                bout.write(str.getBytes());
                bout.flush();
            }
            fout.close(); bout.close();

        }catch(Exception e){System.out.println(e);}

    }
}


