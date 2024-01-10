import java.util.Scanner;
public class one{
    public static void main(String args[]){
        Scanner input1=new Scanner(System.in);
        String n=input1.nextLine();
        Scanner input2=new Scanner(System.in);
        String n1=input2.nextLine();
        int count=match(n,n1);
        System.out.println("Total number of matches: "+count);
    }
    public static int match(String n,String n1){
        int count=0;
        for (int i=0;i<Math.min(n.length(),n1.length());i++){
            if(Character.toLowerCase(n.charAt(i))==Character.toLowerCase(n1.charAt(i))){
                count++;
            }
        }
        return count;
    }
}