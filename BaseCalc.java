package Assignment1;
public class BaseCalc {
	
	String table = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	/**
	 * This method converts decimal number to any base
	 * @param num : integer type, Decimal number to which base needed
	 * @param base : base in which the decimal needs to be converted
	 * @return String : string type base converted number
	 */
	public String convertDecimalToBaseValue(int numberInDecimal, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		if (numberInDecimal == 0)
		{
			return "0";
		}
		String decimalToBaseValue = "";
		while (numberInDecimal > 0)
		{
			int remainder = numberInDecimal % base;
			if(remainder > 9)
			{
				decimalToBaseValue = table.charAt(remainder) + decimalToBaseValue;
			}
			else
			{
				decimalToBaseValue = remainder + decimalToBaseValue;
			}
			numberInDecimal = numberInDecimal / base;
		}
		return decimalToBaseValue;
	}
	
	/**
	 * This method return decimal number from any base
	 * @param str : string value to which decimal conversion is needed
	 * @param base : integer value of base in which he number is
	 * @return integer type base string converted to decimal value
	 */
	public int convertBaseToDecimalValue(String baseNumber, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int decimal = 0;
		int power = 0;
		int n = 0;
		if (baseNumber.charAt(1) == 'x')
		{
			n = 2;
		}
		for(int i=baseNumber.length()-1; i >= n; i--)
		{
			decimal += table.indexOf(baseNumber.charAt(i)) * Math.pow(base, power);
			power += 1;
		}
		return decimal;
	}

	/**
	 * This method return the base number after adding two numbers in any base
	 * @param str1 : string value of the first number in any base that is added
	 * @param str2 : string value of the second number in any base that is added
	 * @param base : integer value of the base in which the input strings are
	 * @return String value after adding the numbers in base
	 */
	public String addTwoNumbersInAnyBase(String baseNumber1, String baseNumber2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = convertBaseToDecimalValue(baseNumber1, base);
		int num2 = convertBaseToDecimalValue(baseNumber2, base);
		return convertDecimalToBaseValue(num1 + num2, base);
	}
	
	/**
	 * This method return the base number after subtracting two numbers in any base
	 * @param str1 : string value of the first number in any base that is compared
	 * @param str2 : string value of the second number in any base that is compared
	 * @param base : integer value of the base in which the input strings are
	 * @return String value after subtracting the numbers in base
	 */
	public String subtractTwoNumbersInAnyBase(String baseNumber1, String baseNumber2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = convertBaseToDecimalValue(baseNumber1, base);
		int num2 = convertBaseToDecimalValue(baseNumber2, base);
		return convertDecimalToBaseValue(num1 - num2, base);
	}
	
	/**
	 * This method return the base number after multiplying two numbers in any base
	 * @param str1 : string value of the first number in any base that is compared
	 * @param str2 : string value of the second number in any base that is compared
	 * @param base : integer value of the base in which the input strings are
	 * @return String value after multiplying the numbers in base
	 */
	public String multiplyTwoNumbersInAnyBase(String baseNumber1, String baseNumber2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = convertBaseToDecimalValue(baseNumber1, base);
		int num2 = convertBaseToDecimalValue(baseNumber2, base);
		return convertDecimalToBaseValue(num1 * num2, base);
	}
	
	/**
	 * This method return the base number after dividing two numbers in any base
	 * @param str1 : string value of the first number in any base that is compared
	 * @param str2 : string value of the second number in any base that is compared
	 * @param base : integer value of the base in which the input strings are
	 * @return String value after dividing the numbers in base
	 */
	public String divideTwoNumbersInAnyBase(String baseNumber1, String baseNumber2, int base)
	{
		if (base > 36)
			throw new AssertionError("The base cannot be greater than 36");
		int num1 = convertBaseToDecimalValue(baseNumber1, base);
		int num2 = convertBaseToDecimalValue(baseNumber2, base);
		if (num2 == 0)
			throw new AssertionError("Denominator cannot be zero");
		return convertDecimalToBaseValue(num1 / num2, base);
	}
	
	/**
	 * This method return the boolean after comparing the numbers for equal in bases
	 * @param str1 : string value of the first number in any base that is compared
	 * @param str2 : string value of the second number in any base that is compared
	 * @return boolean value after comparing the numbers in base
	 */
	public boolean compareTwoNumbersInAnyBaseForEqual(String baseNumber1, String baseNumber2)
	{
		if ((baseNumber1.length() == baseNumber2.length()) && (baseNumber1.compareTo(baseNumber2) == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * This method return the boolean value after comparing the numbers for lesser in bases
	 * @param str1 : string value of first number that has to be compared 
	 * @param str2 : string value of second number that has to be compared 
	 * @return boolean value after comparing for lesser the numbers in base
	 */
	public boolean compareTwoNumbersInAnyBaseForLessThan(String baseNumber1, String baseNumber2)
	{                                                           
		if(baseNumber2.length() > baseNumber2.length() || (baseNumber1.length() == baseNumber2.length() && baseNumber1.compareTo(baseNumber2) == 1))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	/**
	 * This method return boolean if the number 1 is greater than number 2
	 * @param str1 : string value of the first number in any base that is compared
 	 * @param str2 : string value of the second number in any base that is compared
	 * @return boolean value if number 1 is greater than number 2
	 */
	public boolean compareTwoNumbersInAnyBaseForGreaterThan(String baseNumber1, String baseNumber2)  
	{
		if(baseNumber1.length() < baseNumber2.length() || (baseNumber1.length() == baseNumber2.length() && baseNumber1.compareTo(baseNumber2) == -1))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
