import java.util.Scanner;
public class one{
    public static void main(String args[]) {
        Scanner input1=new Scanner(System.in);
        String s1=input1.nextLine();
        Scanner input2=new Scanner(System.in);
        String s2=input2.nextLine();
        String matchedLetters=match(s1, s2);
        System.out.println("Matched letters: "+matchedLetters);
    }
    public static String match(String s1,String s2){
        StringBuilder matchedLetters=new StringBuilder();
        for (int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(Character.toLowerCase(s1.charAt(i))==Character.toLowerCase(s2.charAt(i))){
                matchedLetters.append(s1.charAt(i));
            }
        }
        return matchedLetters.toString();
    }
}
