SUM OF NUMBERS
import java.util.Scanner;
class one{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            count+=i;
        }
    System.out.println("The output is"+ count);
    }
}
