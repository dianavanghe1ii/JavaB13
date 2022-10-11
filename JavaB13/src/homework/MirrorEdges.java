package homework;
import java.util.Scanner;
public class MirrorEdges {
    public static void main(String[] args) {
        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();
        String mirrorEdges = "";
        for(int i = 0,j = str.length()-1; i<str.length() ; i++,j--){
            if(str.charAt(i)==str.charAt(j)){
                mirrorEdges += str.charAt(i);
            }else{
                break;
            }
        }
        System.out.print(mirrorEdges);
    }
}

