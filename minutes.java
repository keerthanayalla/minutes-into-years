import java.util.Scanner;
public class minutestoyears{
public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  System.out.println{"enter the number of minutes:"};
  int NumMin = in.nextInt();
  int NumYr  = NumMin/525600;
  int NumDay = (NumMin%525600)/1440;
  System.out.println{NumMin+ "minutes is approximately" +NumYr+ "years and" +NumDay+ "days"};
  }
}  











