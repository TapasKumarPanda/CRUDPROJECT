import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Services s=new Services();
        System.out.println("Prouduct manaements System");
        Scanner ac=new Scanner(System.in);
        System.out.println("Enter your 1database...!!!");
        int size= ac.nextInt();
        s.createDatabase(size);
        while (true){
            System.out.println("Menu");
            System.out.println("1.Add prouduct :  \n2.Find by Id  : ");
            System.out.println("3.Find By Company : \n4.Update by id : ");
            System.out.println("5.All the details : \nExit");
            System.out.println("Enter the Option:-");
            int op=ac.nextInt();
            switch (op){
                case 1:
                    s.AddProducts();break;
                case 2:
                    s.findbyId();break;
                case 3:
                    s.findByCompany();break;
                case 4:
                    s.Updatebyid();break;
                case 5:
                    s.Allthedetails();break;
                case 6:
                    System.out.println("thank you ashad ");
                    System.exit(0);
                default:
                    System.out.println("invalid option");
            }
        }
    }
}

