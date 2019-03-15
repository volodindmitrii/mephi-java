import java.util.Scanner;

public class Module_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        String b;
        System.out.print("input string: ");
        a = in.next();
        int j;
        int len=a.length();
        for(int i=0; i<len-1;){
            if (a.charAt(i)==a.charAt(i+1)){//compare two near elements
                j=i+1;
                if (j+1==len){
                    j=j; //None
                }
                else{
                    while (a.charAt(i)==a.charAt(j+1)){//compare with next
                        if (j==len-1){
                            break;
                        }
                        j+=1;
                    }
                }
                //cut part of string
                if (i==0){
                    b=a.substring(j+1, len);
                }
                else if (j==len-1){
                    b=a.substring(0, i);
                }
                else {
                    b=a.substring(0, i);
                    b+=a.substring(j+1, len);
                }
                a=b;
                len=a.length();
            }
            else {
                i++;
            }

        }
        System.out.println(a);
    }
}
