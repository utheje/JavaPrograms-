package Strings;

import java.util.Scanner;

// This Consists of Reversing the given string in different formats
public class reverseWordsOfString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String original = scan.nextLine();
        reverseWordsOfString rev = new reverseWordsOfString();
        //Reverse the words of the string
        rev.revWordOfString(original);
        System.out.println("");
        //Reverse the Word of the string retaining the first character
        rev.revWordOfStringExpectFirstCharOfWord(original);
        System.out.println("");
        //Reverse the entire String
        rev.revString(original);
    }

    public void revWordOfString(String original){
    String [] str = original.split("\\s");
    char[] ch;
    for(int i =0 ;i< str.length;i++){
        ch = str[i].toCharArray();
        for(int j = ch.length-1;j >=0 ;j--){
            System.out.print(ch[j]);
        }
        System.out.print(" ");
    }
    }

    public void revWordOfStringExpectFirstCharOfWord(String original){
        String [] str = original.split(" ");
        char[] ch;
        for(int i =0 ;i< str.length;i++){
            ch = str[i].toCharArray();
            if(ch.length == 1)
                System.out.print(ch[0]);
            for(int j = ch.length-1;j >0 ;j--){
                if(j == ch.length-1)
                    System.out.print(ch[0]+""+ch[ch.length-1]);
                else
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
    }

    public void revString(String original){
        char[] ch = original.toCharArray();
            for(int j = ch.length-1;j >=0 ;j--){
                System.out.print(ch[j]);
            }
        }
    }