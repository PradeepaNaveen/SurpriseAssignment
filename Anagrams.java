package SurpriseAssignment;

import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        Anagrams a = new Anagrams();
        a.anagramString();
    }
    void anagramString()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the strings");
        String str1 = input.next();
        String str2 = input.next();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String obj1 = new String(s1);
        String obj2 = new String(s2);
        // System.out.println(obj1 + " " + obj2);
        if(obj1.equals(obj2))
            System.out.println("Strings are anagram");
        else
            System.out.println("Strings are not anagram");
    }
}

