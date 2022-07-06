package Assignment1;
public class BaseCalc {
	
	String table = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	/**
	 * This method decimal number to any base
	 * @param num Decimal number to which base needed
	 * @param base Base in which the decimal needs to be converted
	 * @return String base converted number
	 */
	public String decimalToBase(int num, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		if (num == 0)
		{
			return "0";
		}
		String baseNum = "";
		while (num > 0)
		{
			int remainder = num % base;
			if(remainder > 9)
			{
				baseNum = table.charAt(remainder) + baseNum;
			}
			else
			{
				baseNum = remainder + baseNum;
			}
			num = num / base;
		}
		return baseNum;
	}
	
	/**
	 * This method return decimal number from any base
	 * @param str Base String to which decimal conversion is needed
	 * @param base Base of the String number
	 * @return Decimal number converted
	 */
	public int baseToDecimal(String str, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int decimal = 0;
		int power = 0;
		int n = 0;
		if (str.charAt(1) == 'x')
		{
			n = 2;
		}
		for(int i=str.length()-1; i >= n; i--)
		{
			decimal += table.indexOf(str.charAt(i)) * Math.pow(base, power);
			power += 1;
		}
		return decimal;
	}

	/**
	 * This method return the base number after adding two numbers in any base
	 * @param str1 The first number in any base
	 * @param str2 The second number in any base
	 * @param base The base in which the input strings are
	 * @return String after adding the numbers in base
	 */
	public String add(String str1, String str2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		return decimalToBase(num1 + num2, base);
	}
	
	/**
	 * This method return the base number after subtracting two numbers in any base
	 * @param str1 The first number in any base
	 * @param str2 The second number in any base
	 * @param base The base in which the input strings are
	 * @return String after subtracting the numbers in base
	 */
	public String subtract(String str1, String str2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		return decimalToBase(num1 - num2, base);
	}
	
	/**
	 * This method return the base number after multiplying two numbers in any base
	 * @param str1 The first number in any base
	 * @param str2 The second number in any base
	 * @param base The base in which the input strings are
	 * @return String after multiplying the numbers in base
	 */
	public String multiply(String str1, String str2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		return decimalToBase(num1 * num2, base);
	}
	
	/**
	 * This method return the base number after dividing two numbers in any base
	 * @param str1 The first number in any base
	 * @param str2 The second number in any base
	 * @param base The base in which the input strings are
	 * @return String after dividing the numbers in base
	 */
	public String divide(String str1, String str2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		if (num2 == 0)
			throw new AssertionError("Denominator cannot be zero");
		return decimalToBase(num1 / num2, base);
	}
	
	/**
	 * This method return the boolean after comparing the numbers for equal in bases
	 * @param str1 The first number in any base
	 * @param str2 The second number in any base
	 * @return boolean after comparing the numbers in base
	 */
	public boolean compareForEqual(String str1, String str2)
	{
		if ((str1.length() == str2.length()) && (str1.compareTo(str2) == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * This method return the boolean after comparing the numbers for lesser in bases
	 * @param str1 The first number in any base
	 * @param str2 The second number in any base
	 * @return boolean after comparing for lesser the numbers in base
	 */
	public boolean compareForLessThan(String str1, String str2)
	{                                                           
		if ((str1.length() <= str2.length()) && (str1.compareTo(str2) < 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * This method return boolean if the number 1 is greater than number 2
	 * @param str1 The first number in any base
	 * @param str2 The second number in any base
	 * @return boolean if number 1 is greater than number 2
	 */
	public boolean compareForGreaterThan(String str1, String str2)  
	{
		if ((str1.length() >= str2.length()) && (str1.compareTo(str2) > 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
