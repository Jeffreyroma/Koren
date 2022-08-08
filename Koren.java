import java.util.Scanner;
 class Koren {
    public static void main(String[] args) {



        Scanner console = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = console.nextDouble();
        System.out.print("Enter b: ");
        double b = console.nextDouble();
        System.out.print("Enter c: ");
        double c = console.nextDouble();

        double dis,x1,x2;


        dis = b*b - 4*a*c;
        if (dis==0){
            x1= -b/(2*a);

            System.out.printf("One koren x1=%s ",x1);
        } else if (dis>0) {
            x1= (-b+ Math.sqrt(dis))/(2*a);
            x2= (-b- Math.sqrt(dis))/(2*a);
            System.out.printf("Koren x1=%s; Koren x2=%s ",x1,x2);



        }
        else {
            System.out.println("No koren");
        }


    }
}
