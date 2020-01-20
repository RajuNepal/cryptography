//  Alternative method for (  Assignment  CaesarDecryption Cipher)
class CaesarDecryption2
{

public static StringBuffer decrypt(String text, int s)
{
StringBuffer result=new StringBuffer();
char ch;
for( int i=0; i<text.length(); i++)
{
if (Character.isUpperCase(text.charAt(i)))
ch= (char)(((int)text.charAt(i) - s - 65) % 26+65);
else
ch=(char)(((int)text.charAt(i)- s - 97)  % 26 + 97);
result.append(ch);
}
return result;
}
//main method
public static void main(String args[])
{
// String text = text obtained from Encryption Of text (RAJU) 
String text= "UDMX";
// implementation of second method
int s = 3;
System.out.println("Decryption using Caesar Chiper: ");
System.out.println("chipertext : " +text);
System.out.println("shift : " +s);
System.out.println("obtained plain text : " + decrypt(text,s));
}
}

