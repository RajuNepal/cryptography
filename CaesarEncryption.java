//  Assignment on  Caesar Cipher
// Encryption
class CaesarEncryption
{
// Encrypts text using a shift od s 
public static StringBuffer encrypt(String text, int s)
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
 // Driver code
public static void main(String args[])
{
// for encryption i entered text RAJU
String text= "RAJU";
int s =3;
System.out.println("Encryption using Caesar Cipher : ");
System.out.println("text : " +text);
System.out.println("shift : " +s);
System.out.println("cipher : " + encrypt(text,s));
}
}


