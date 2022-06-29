
public class BaseCalc {
	
	String table = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String decimalToBase(int num, int base)
	{
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
	
	public int baseToDecimal(String str, int base)
	{
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

	public String add(String str1, String str2, int base)
	{
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		return decimalToBase(num1 + num2, base);
	}
	
	public String subtract(String str1, String str2, int base)
	{
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		return decimalToBase(num1 - num2, base);
	}
	
	public String multiply(String str1, String str2, int base)
	{
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		return decimalToBase(num1 * num2, base);
	}
	
	public String divide(String str1, String str2, int base)
	{
		int num1 = baseToDecimal(str1, base);
		int num2 = baseToDecimal(str2, base);
		return decimalToBase(num1 / num2, base);
	}
	
	
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
	
	public boolean compareForLessThan(String str1, String str2)
	{
		if ((str1.length() < str2.length()) || (str1.compareTo(str2) < 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean compareForGreaterThan(String str1, String str2)
	{
		if ((str1.length() > str2.length()) || (str1.compareTo(str2) > 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		BaseCalc obj = new BaseCalc();
		System.out.println("0x" + obj.decimalToBase(0,16));
		System.out.println("0x" + obj.decimalToBase(5,16));
		System.out.println(obj.baseToDecimal("0x1F",16));
		System.out.println(obj.baseToDecimal("0xA5D",18));
		System.out.println(obj.baseToDecimal("0x637",8));
		System.out.println(obj.baseToDecimal("0xB59C",25));
		System.out.println(obj.baseToDecimal("0x0",16));
		System.out.println(obj.add("01C","378",16));
		System.out.println(obj.add("1B","AD",16));
		System.out.println(obj.subtract("4A6","1B3",16));
		System.out.println(obj.subtract("4F6","1C3",16));
		System.out.println(obj.divide("4A6","1B3",16));
		System.out.println(obj.multiply("4A6","1B3",16));
		System.out.println(obj.compareForGreaterThan("1", "A"));
	}
	
}
