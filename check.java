class result
{
public static void main (String args[]){
int a = 55;
if(a>=90 && a<100){
System.out.print("Your grade is A");
}
else if(a>=80 && a<90){
System.out.print("Your grade is B");
}
else if(a>=70 && a<80){
System.out.print("Your grade is C");
}
else if(a>=60 && a<70){
System.out.print("Your grade is D");
}
else if(a>=50 && a<60){
System.out.print("Your grade is E");
}
else if(a>100){
System.out.print("Invalid marks");
}
else{
System.out.print("Sorry you are fail");
}
}
}