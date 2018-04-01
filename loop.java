class loop_printer
{
public static void main(String args[])
{
int a = 3425;
int b = 10;
int c;
while(a>0)
{
c = a%b;
System.out.println(c);
a=a/10;
}
}
}