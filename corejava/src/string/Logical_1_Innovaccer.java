package string;

public class Logical_1_Innovaccer {

	public static void main(String[] args) throws Exception {

		try {
		StringChange.changecase(null);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}

class StringChange
{
	public  static String  changecase(String str) throws Exception
	{
		if(str==null)
		{
			throw new Exception("String can't be null");
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			StringBuffer sb2 = new StringBuffer();
			if (str.charAt(i) == 'O' || str.charAt(i) == 'E' || str.charAt(i) == 'A' || str.charAt(i) == 'U'
					|| str.charAt(i) == 'I') {
				String str3 = sb2.append(str.charAt(i)).toString().toLowerCase();
				sb.append(str3);
				/**
				 * i am changing the case and appending.
				 */

			} else {
				sb.append(str.charAt(i));
				/**
				 * here I am directly appending.
				 */
			}
		}
		System.out.println(sb);
		return sb.toString();
	}
} 