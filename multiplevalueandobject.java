class Test07_combination_VAC{
   public static void main(String[] args)
    {
     int x=50;
     example e1=new example();
     System.out.println("  "+e1.i1);
     System.out.println("  "+e1.d1);
     System.out.println("  "+e1.ch);
     System.out.println("  "+e1.la[0]);
     System.out.println("  "+e1.la[1]);
     System.out.println("  "+e1.s1);
 
 int[] ia={5,6,7};
 example[] ea={new example(),new example()};
      System.out.println(ia);
     System.out.println("  "+ia[0]);     
     System.out.println("  "+ia[1]);
     System.out.println("  "+ia[2]);

      System.out.println("  "+ea[0]);
      System.out.println("  "+ea[0].i1);
      System.out.println("  "+ea[0].d1);
      System.out.println("  "+ea[0].ch);
      System.out.println("  "+ea[0].la);
      System.out.println("  "+ea[0].la[0]);
      System.out.println("  "+ea[0].la[1]);
      System.out.println("  "+ea[0].s1);

      System.out.println("  "+ea[1]);
      System.out.println("  "+ea[1].i1);
      System.out.println("  "+ea[1].d1);
      System.out.println("  "+ea[1].ch);
      System.out.println("  "+ea[1].la);
      System.out.println("  "+ea[1].la[0]);
      System.out.println("  "+ea[1].la[1]);
      System.out.println("  "+ea[1].s1);
}
}


output:



D:\Adii FSJD\CORE JAVA\JAVA BASIC>javac multiplevalueandobject.java

D:\Adii FSJD\CORE JAVA\JAVA BASIC>java Test07_combination_VAC
  5
  6.7
  a
  8
  9
  Aditya
[I@e9e54c2
  5
  6
  7
  example@65ab7765
  5
  6.7
  a
  [J@1b28cdfa
  8
  9
  Aditya
  example@eed1f14
  5
  6.7
  a
  [J@7229724f
  8
  9
  Aditya


