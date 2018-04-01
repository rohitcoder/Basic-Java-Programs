class table_printer
{
public static void main(String args[])
{
int c;
for(int a =1; a<=1000;a++)
{
for(int b=1; b<=10;b++)
{
c = a*b;
System.out.println(a+" * "+b+" = "+c);
}
System.out.println("");
}
}
}