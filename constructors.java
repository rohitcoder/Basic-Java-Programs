class xyznew
{
String word;
xyznew(String word)
{
this.word=word;
}
void reverseit()
{
String s = word;





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
System.out.print(rev.trim()+" ");




}
}


class reverse_cons
{
public static void main(String[] args)
{
xyznew a1 = new xyznew("rohit mohit");
a1.reverseit();
}
}