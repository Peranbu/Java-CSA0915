import java.util.Scanner;

public class one{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        if(n%2== 0){
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    count+=i;
                }
            }
            System.out.println("The sum of the first " + n + " even numbers is: " + count);
          }
        }
    }

