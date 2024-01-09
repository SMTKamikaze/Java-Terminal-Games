import java.util.Scanner;
class abc{
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int gm,ac;
        ac=1000;
        while(true){
            System.out.println("Balance: "+ac);
            System.out.println("Enter Gamble ammount: ");
            gm = sc.nextInt();
            if(gm>250){
            System.out.println("You can't gamble more than 250");
            gm=250;
        }
            if(random2dice())
                ac=ac+gm;
            else
                ac=ac-gm;
            if(ac<=0)
            {
                System.out.println("You Loose");
                break;
            }
            if(ac>=2000)
            {
                System.out.println("You Win");
                break;
            }
        }
    }

    static boolean random2dice(){
        double a = Math.random()*10;
        if(a>4.5)
        return true;
        else
        return false;
    }
}
