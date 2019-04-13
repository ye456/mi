import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.*;
public class SHA
{
public static String hashPassword(String password) throws NoSuchAlgorithmException
{
MessageDigest md = MessageDigest.getInstance("SHA-1");
md.update(password.getBytes());
byte[] b = md.digest();
StringBuffer sb = new StringBuffer();
for(byte b1 : b)
{
sb.append(Integer.toHexString(b1 & 0xff).toString());
}
return sb.toString();
}
public static void main(String[] args)throws IOException
{
	String password;
	DataInputStream din=new DataInputStream(System.in);
	System.out.print("\n\t Enter msg to be digest");
	password=din.readLine();

System.out.println(password);
try
{
System.out.println(hashPassword(password));
}
catch(NoSuchAlgorithmException e)
{

System.out.println(e);
}
}
}

