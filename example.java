class example{
int i1=5;
double d1=6.7;
char ch='a';
long[] la={8,9};
String s1="Aditya";
}
class Test07_class1{
    public static void main(String[] args){
    example e1=new example();
    System.out.println(e1.i1);
    System.out.println(e1.d1);
    System.out.println(e1.ch);
    System.out.println(e1.la[0]);
    System.out.println(e1.la[1]);
    System.out.println(e1.s1);
}
}