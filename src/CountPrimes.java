import java.util.Scanner;

public class CountPrimes {
    static void count(int n){
        if(n<2){
            System.out.println("0");
            return;
        }
        boolean[] isPrime = new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int i=p*p;i<=n;i+=p){
                    isPrime[i]=false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        count(n);
    }

}
