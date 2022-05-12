package com.capgemini.in.SampleProject;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static List<String>funWithAnagrams(List<String>text) {
        Vector<String> vlist =new Vector<String> ();
        HashSet<String> hlist =new HashSet<String>();
        //List<String> list = new ArrayList<>();
        for(int i =0; i <text.size(); i++) {
            String s =text.get(i);
            s =Stream.of(s.split("")).sorted().collect(Collectors.joining());
            //list.add(word);
            if(!hlist.contains(s)) {
                vlist.add(text.get(i));
                hlist.add(s);
            }
            Collections.sort(vlist);
            //text.forEach((n) -> System.out.println(n));
        }
        return vlist;
        //return hlist;
  	}
 
}
