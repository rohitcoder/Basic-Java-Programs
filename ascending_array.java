class ascending_array
{
public static void main(String args[])
{
int swap;
int defined_array[] = {8,5,3,9,28,10,15};
for(int i=0;i<defined_array.length-1;i++)
{
for(int j=i+1;j<defined_array.length;j++){
if(defined_array[i]>defined_array[j])
{
swap = defined_array[j];
defined_array[j] = defined_array[i];
defined_array[i] = swap;
}
}
}
for(int k:defined_array){
System.out.println(k);
}
}
}