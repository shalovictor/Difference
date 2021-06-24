public class employee_salary
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the employee's name and basic salary");
    double basic,da,hra,pf,gp=0,np=0;
    String empn;
    empn=in.nextLine();
    basic=in.nextLine();
    da = basic*25.0/100.0;
    hra = basic*15.0/100.0;
    pf = basic * 8.33/100.0;
    gp = basic + da + hra;
    np = gp-pf;
    System.out.println("Name of the employee = " +empn);
    System.out.println ("Gross pay = Rs. "+gp);
    System.out.println("Net Pay =Rs. "+np);
  }
}
