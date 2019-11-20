package coreJava;
public class ClassDefinition
{
     public static void main(String[] args)
     {
          ClassTwo.methodOfClassTwo();
     }
}
 
class ClassTwo
{
     static void methodOfClassTwo()
     {
          System.out.println("From Class Two");
     }
}