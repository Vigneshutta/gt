import java.util.*;
public class Anc { 

public static void main(String[] args) { 
String text= "I MISS MY@ FAMILY123*" ; 

int wordCount = 0; 
int alphabetCount =0; 
String repeatedAlphabets = ""; 
int spaceCount = 0; 
int specialCharCount = 0; 
int numberCount = 0; 

for(int i=0;i<text.length();i++){ 
String textArray[] = text.split(" "); 
wordCount =textArray.length; 
char c1 = text.charAt(i); 

if(Character.isAlphabetic(c1)) { 
alphabetCount++; 

for(int j =i+1 ;j<text.length() ;j++){ 
char c2 = text.charAt(j); 

if(c1==c2 ) { 
String s =String.valueOf(c1); 
if(repeatedAlphabets.contains(s)){ 
continue; 
} 
repeatedAlphabets = repeatedAlphabets +" "+c1;; 
} 
} 
}else if(Character.isSpaceChar(c1)){ 
spaceCount++; 
}else if(Character.isDigit(c1)) { 
numberCount++; 
}else { 
specialCharCount++; 
} 


} 
System.out.println(wordCount); 
System.out.println(specialCharCount); 
System.out.println(numberCount); 

} 

} 
