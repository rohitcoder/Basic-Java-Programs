class foreach_print
{
public static void main(String args[])
{
int rohit[] = {121,231,231,3111};
int b;
int a;
int count = 0;
for(int i=0;i<rohit.length;i++){
a = rohit[i];
while(a>0)
{
b = a%10;
if(b==1)
{
count++;
}
a = a/10;
}
}
System.out.println(count);
}
}