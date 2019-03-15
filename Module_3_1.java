import java.util.Scanner;

public class Module_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;// length of array is amount of numbers
        System.out.print("input amount of numbers: ");
        a = in.nextInt();
        int[] counter= new int[a];//counter array
        int[] mas= new int[a];
        for (int i=0; i<a; i++){
            System.out.print("input number: ");
            mas[i] = in.nextInt();//place numbers in mas
            counter[i]=0;//if counter[i]==0, we didn't use it, if counter =-1, the number mas[i] was earlier,
                         // else counter[i] is amount of numbers which equals to mas[i]
        }
        for(int i=0; i<a; i++){
            if (counter[i]==0){
                counter[i]+=1;
                for (int j=i+1; j<a; j++){
                    if(counter[j]==0 && mas[j]==mas[i]){
                        counter[i]+=1;
                        counter[i]=-1;
                    }
                }
            }
        }
        int summ=0;
        for(int i=0; i<a; i++){
            if (counter[i]>0){
                summ+=counter[i];
            }

        }
        System.out.println("result: " + summ);
    }
}
