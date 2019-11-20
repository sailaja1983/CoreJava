package coreJava;

class Def {
//static blocks will be executed first then static method.
	//then static members are executed.
	 static int staticVariable;
	 
     static
     {
          System.out.println("StaticComponents SIB");
          staticVariable = 10;
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}
 
public class StaticDefinition extends Def
{
     static
     {
          System.out.println("MainClass SIB");
     }
 
     public static void main(String[] args)
     {
         //Static Members directly accessed with Class Name
          Def.staticVariable = 20;
          Def.staticMethod();
     }
}


