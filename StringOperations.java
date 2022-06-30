//import java.util.Scanner;
//
//public class StringOperations {
//	
//	public int compareStrings(char[] str1, char[] str2)
//	{
//		if (str1.length != str2.length)
//		{
//			return 0;
//		}
//		else
//		{
//			for(int i=0; i < str1.length; i++)
//			{
//				if(str1[i] != str2[i])
//				{
//					return 0;
//				}
//			}
//			return 1;
//		}
//	}
//	
//	
//	public char[] reverseString(char[] str)
//	{
//		int str_length = str.length;
//		char[] reverse_str = new char[str.length];
//		for(int i=str_length-1; i>= 0; i++)
//		{
//			reverse_str[str_length - i] = str[i];
//		}
//		return reverse_str;
//	}
//	
//	
//	
//	public char[] replaceCharacters(char[] str)
//	{
//		for(int i=0; i<str.length; i++)
//		{
//			if (96 < (int)str[i] && (int)str[i] < 123)
//			{
//				str[i] = (char) ((int) str[i] - 32);
//			}
//			else if (64 < (int)str[i] && (int)str[i] < 91)
//			{
//				str[i] = (char) ((int) str[i] + 32);
//			}
//		}
//		return str;
//	}
//	
//	
//	public void largestWord(char[] str)
//	{
//		 char[] largestword= new char[30];
//	        int initalPos=0, maxLen=0, tempLen=0, tempPos=0; 
//	        for (int i = 0; i < str.length; i++) {
//	            if(str[i]==' '){
//	                tempPos = i+1;
//	                tempLen=0;
//	            }
//	            else{
//	                tempLen++;
//	                if(maxLen<=tempLen){
//	                    maxLen=tempLen;
//	                    initalPos = tempPos;
//	                }
//	            }
//	        }
//	        for (int i = initalPos; i <=maxLen+initalPos ; i++) {
//	            largestword[i-initalPos] = str[i];
//	        }
//	        System.out.println("Largest word is: " );
//	        for(int i=0; i<largestword.length; i++)
//	        	System.out.print(largestword[i]);
//	        System.out.print("\n");
////	        return largestword;
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		StringOperations obj = new StringOperations();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter two strings for comparison: ");
//		char[] str1 = scanner.nextLine().toCharArray();
//		char[] str2 = scanner.nextLine().toCharArray();
//		System.out.println(obj.compareStrings(str1, str2));
//		System.out.println("Enter a string for largestWord: ");
//		obj.largestWord(scanner.nextLine().toCharArray());
//		System.out.println("Enter a string for replaceCharacter operation: ");
//		System.out.println("After replacing the characters string is: " + obj.replaceCharacters(scanner.nextLine().toCharArray()));
//		System.out.println("Enter a string for replaceCharacter operation: ");
//		System.out.println("After reversing the string: " + obj.reverseString(scanner.nextLine().toCharArray()));
//	}
//}


public class StringOperations {
    char[] text = new char[30];
    StringOperations(char[] str){
        text = str;
    }
    void display(){
        System.out.println(text);
    }
    int compare(char[]text1, char[] text2){
        if(text1.length == text2.length){
            for (int i = 0; i < text2.length; i++) {
                if(text1[i] != text2[i]){
                    return 0;
                }
            }
            return 1;
        }
        else{
            return 0;
        }
    }
    char[] reverse(){
        char[] rev = new char[30];
        for (int i = 0; i < text.length; i++) {
            rev[i] = text[text.length-i-1];
        }
        return rev;
    }

    char[] changeCase(){
        char[] changed = new char[30];
        changed = text;
        for (int i = 0; i < text.length; i++) {
            if(changed[i]>='a'&&changed[i]<='z'){
                changed[i] -= 32;
            }
            else if(text[i]>='A'&&changed[i]<='Z'){
                changed[i] += 32;
            }
            else{
                continue;
            }
        }
        return changed;
    }

    char[] largestLastWord(){
        char[] largestWord= new char[30];
        int initalPos=0, maxLen=0,tempLen=0,tempPos=0; 
        for (int i = 0; i < text.length; i++) {
            if(text[i]==' '){
                tempPos = i+1;
                tempLen=0;
            }
            else{
                tempLen++;
                if(maxLen<=tempLen){
                    maxLen=tempLen;
                    initalPos = tempPos;
                }
            }
        }
        for (int i = initalPos; i <=maxLen+initalPos ; i++) {
            largestWord[i-initalPos] = text[i];
        }
        return largestWord;
    }
    public static void main(String[] args) {
        char[] text1 = {'a',' ','a','n',' ','a','n','u','a','a','n','u','r',' ','a',' ','a','n','u',' ','a','n','y','r',' ','a'};
        char[] text2 = {'a','b','c','d'};
        // char[] text1 = {'a','B','C','d','e'};
        StringOperations a = new StringOperations(text1);

        a.display();
        System.out.println(a.compare(text1, text2));
        System.out.println(a.reverse());
        System.out.println(a.changeCase());
        System.out.println(a.largestLastWord());
    }
}
