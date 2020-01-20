//  Assignment CaesarDecryption Cipher
// first method
class CaesarDecryption
{

public static StringBuffer decrypt(String text, int s)
{
StringBuffer result=new StringBuffer();
char ch;
for( int i=0; i<text.length(); i++)
{
if (Character.isUpperCase(text.charAt(i)))
ch= (char)(((int)text.charAt(i) + s - 65) % 26+65);
else
ch=(char)(((int)text.charAt(i)+ s - 97)  % 26 + 97);
result.append(ch);
}
return result;
}
//Decryption implemented by using (s= 26-s)
public static void main(String args[])
{
// String text obtained from Encryption Of text (RAJU)
String text= "UDMX";
// in encryption it was sifted by 3 so here for decryption (s=26-3)
int s = 26-3;
System.out.println("Decryption using Caesar Chiper: ");
System.out.println("cipher text: " +text);
System.out.println("shift (26-3): " +s);
System.out.println("obtained plain text : " + decrypt(text,s));
}
}


