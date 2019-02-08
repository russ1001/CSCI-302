import java.util.Scanner;
 
public class TESTCipher
{
    static int start;
	static int end;
	static int total;
	public static final String alphaString = "abcdefghijklmnopqrstuvwxyz";
 
    
    public static void main(String[] args)
    {
    	start = (int)System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = input.nextLine();
        
        end = (int)System.currentTimeMillis();
        total = end - start;
        
        long shiftKey1 = (Math.round(total * .001));
        int shiftKey2 = (int)shiftKey1;
        System.out.println(shiftKey1);
        System.out.println(encrypt(message, shiftKey2));
        System.out.println(decrypt(encrypt(message, 3), 3));
        input.close();
    }
    
    
  
    
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = alphaString.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alphaString.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
 
      
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = alphaString.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = alphaString.length() + keyVal;
            }
            char replaceVal = alphaString.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
 
    
}
