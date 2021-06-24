public class expression
{
  public static void main (String args[])
  {
    int a,b;
    double p;
    a= Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    p = (double)(a*a+b*b)/(a-b);
    System.out.println("The value of the expression= " +p);
  }
}
