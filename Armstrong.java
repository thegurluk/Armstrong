import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number= input.nextInt();
        //how many digits is the number
        int a=1;
        int b=0;
        int digits=0;
        int tempnumber=number;
        int total=1;
        while (tempnumber!=0){
            tempnumber/=10;
            digits++;
        }
        tempnumber=number;
        System.out.println("tempnumber="+tempnumber);
        System.out.println("digits="+digits);
        for(int i=1;i<=digits;i++){
          a=  tempnumber%10;
          for (int j=1;j<=digits;j++){
              total=a*total;
          }
          b=b+total;
          total=1;
          tempnumber=tempnumber/10;

        }
        System.out.println(b);
        if(number==b){
            System.out.println("This number is Armstrong.");
        }else {
            System.out.println("is not armstrong.");
        }
    }
}
