import java.io.*;
public class present
{
  public static void main(String args[]) throws IOException
  {
    int g,b,ga,ba;
    float pg,pb;
    InputStreamReader read= new InputStreamReader(System.in);
    BufferedReader in= new BufferedReader(read);
    System.out.println("Enter the number of boys and girls of the class");
    g = Integer.parseInt(in.readLine());
    b = Integer.parseInt(in.readLine());
    System.out.println("Enter the number of students absent in the class");
    ga = Integer.parseInt(in.readLine());
    ba = Integer.parseInt(in.readLine());
    pg = (float)(g-ga)/(g+b)*100;
    pb = (float)(b-ba)/(g+b)*100;
    System.out.println("Percentage of girls present in the class = " +pg);
    System.out.println("Percentage of boys present in the class = " +pb);
  }
}
