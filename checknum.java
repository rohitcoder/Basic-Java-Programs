class checknum
{
static String checknums(int a)
{
String d = Integer.toString(a);
String c=null;
if(d>=0)
{
c = "Provide content is a number";
}else{
c = "Provide content is not a number";
}
return c;
}
public static void main(String[] args)
{
String b = checknums(b);
System.out.print(b);
}
}