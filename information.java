class informationstore
{
String roll_no;
String name;
String cl;
}


class loadinformation
{
static String savedata(String name, String roll, String cls)
{
informationstore x1 = new informationstore();
x1.name = name;
x1.roll_no = roll;
x1.cl = cls;
return "data="+x1.name+" "+x1.roll_no+"  "+x1.cl + "\n";
}
}



class printinfo
{
public static void main(String[] args)
{
System.out.print(loadinformation.savedata("rohit", "26", "10"));
System.out.print(loadinformation.savedata("mohit", "12", "11"));
}
}
