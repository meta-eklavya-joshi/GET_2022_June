package Assignment2;
public class StringOperation {
    
    /**
     * This method displays the text
     */
    void displayTheText(char[] text)
    {
        System.out.println(text);
    }
    
    /**
     * This method compares the two strings and returns integer value
     * @param text1 : string value of the first string on which the comparison is done
     * @param text2 : string value of the second string on which the comparison is done
     * @return integer value 1 if the string 1 is equal to the string 2 and 0 if they are not
     */
    int compareTwoStrings(char[]text1, char[] text2)
    { 
    	if (text1.length == 0 || text2.length == 0)
    		throw new AssertionError("String can't be empty");
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
    
    
    /**
     * This method gives the reverse of the input string
     * @return string value the reverse of the string
     */
    char[] reverseOfTheString(char[] text)
    {
    	if (text.length == 0)
    		throw new AssertionError("String can't be empty");
        char[] rev = new char[30];
        for (int i = 0; i < text.length; i++) {
            rev[i] = text[text.length-i-1];
        }
        return rev;
    }

    
    /**
     * This method changes the case of the letter
     * @return string value with the case changed
     */
    char[] changeCaseOfTheString(char[] text)
    {
    	if (text.length == 0)
    		throw new AssertionError("String can't be empty");
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

    
    /**
     * This method return the largest word of the string
     * @return string value the largest word in the string
     */
    char[] largestLastWordInTheString(char[] text)
    {
    	if (text.length == 0)
    		throw new AssertionError("String can't be empty");
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
        for (int i = initalPos; i <=maxLen+initalPos && i < text.length; i++) {
            largestWord[i-initalPos] = text[i];
        }
        return largestWord;
    }
}
