import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int on=n;
        int count=0;
        while(n>0)
        {
            n=n/10;
            count=count+1;
        }
        n=on;
        if(count==3)
        {
            int sum=0;
            while(n>0)
            {
                sum=sum+n%10;
                n=n/10;
            }
            System.out.println(sum);
        }
        else if(count==2)
        {
            int product=1;
            while(n>0)
            {
                product=product *(n%10);
                n=n/10;
            }
            System.out.println(product);
        }
        else if(count==1){
            System.out.println(on);
        }
        
    }
}