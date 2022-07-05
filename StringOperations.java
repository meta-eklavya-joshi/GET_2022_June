package Assignment2;
public class StringOperation {
    char[] text = new char[30];
    StringOperation(char[] str){
        text = str;
    }
    
    /**
     * This method displays the text
     */
    void display()
    {
        System.out.println(text);
    }
    
    /**
     * This method compares the two strings
     * @param text1
     * @param text2
     * @return 1 if the string 1 is equal to the string 2 and 0 if they are not
     */
    int compare(char[]text1, char[] text2)
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
     * @return reverse of the string
     */
    char[] reverse()
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
     * @return string with the case changed
     */
    char[] changeCase()
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
     * @return largest word in the string
     */
    char[] largestLastWord()
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
