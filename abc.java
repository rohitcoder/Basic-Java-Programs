class abc
{
String reverse(String s)
{
String s1="";
String rev="";
s=s+" ";
for(int i=0;i<s.length();i++)
{
s1=s1+s.charAt(i);

if((s.charAt(i)==' '))
{
for(int j=s1.length()-1;j>=0;j--)
{
rev=rev+s1.charAt(j);
}

s1="";
}
}
return rev.trim()+" ";
}

public static void main(String args[])
{
//abc a1=new abc();
System.out.println(new abc().reverse("hello world kumar"));
}
}