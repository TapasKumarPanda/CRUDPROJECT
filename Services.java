import java.util.Scanner;

public class Services {
    Product[] arr;
    int k=0;
    Scanner as=new Scanner(System.in);
    void createDatabase(int size){
        arr=new Product[size];
        System.out.println(size);
    }
    // Method to add products to the database
    void  AddProducts() {
        System.out.println("++++++++++++Adding  Into Database");
        if (k == arr.length) {
            System.out.println("Database is full");
        }
        else{
            System.out.println("Enter the Product id :   ");
            int pid=as.nextInt();
            System.out.println("Enter Product name  :  ");
            String pname = as.next();
            System.out.println("Enter product price  : ");
            double price=as.nextDouble();
            System.out.println("Enter product company   : ");
            String company=as.next();
            System.out.println("Enter the quantity : ");
            int qut=as.nextInt();
            Product p =new Product(pid,pname,price,company,qut);
            arr[k]=p;
            k++;
            System.out.println("Product had been added database........!");
        }
        System.out.println("W===========================================");
    }

    /**
     *
     */
    void findbyId(){
        System.out.println("=================");
        System.out.println("Enter  the Id:-");
        int c=0;
        int pid=as.nextInt();
        for (Product ele:arr){
            if(ele.getPid()==pid){
                System.out.println("Pid : "+ele.getPid());
                System.out.println("pname : "+ele.getPname());
                System.out.println("price : "+ele.getPrice());
                System.out.println("company : "+ele.getCompany());
                System.out.println("Quantity : "+ele.getQut());
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("ID NOT FOUND");
        }
        System.out.println("===================");
    }

    public void findByCompany() {
        System.out.println("Enter the company name :");
        String company = as.next();

//        for(int i = 0; i <= arr.length-1; i++) {
//            if(arr[i] != null) {
//                System.out.println("Product found : " + arr[i]);
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("No found for company: " + company);
//        }
        int c=0;
        for(Product ele:arr){
            if(ele.getCompany().equals(company)){
                System.out.println("Pid"+ele.getPid());
                System.out.println("pname"+ele.getPname());
                System.out.println("price"+ele.getPrice());
                System.out.println("company"+ele.getCompany());
                System.out.println("Quantity"+ele.getQut());
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Company not found");}
    }
    public void Updatebyid(){
        System.out.println("Enter Id to update");
        for (Product ele : arr) {
            if (ele.getPid() == as.nextInt()) {
                System.out.println("Enter new id");
                int newid = as.nextInt();
                ele.setPid(newid);
//                    System.out.println("pname"+ele.getPname());
//                    System.out.println("price"+ele.getPrice());
//                    System.out.println("company"+ele.getCompany());
//                    System.out.println("Quantity"+ele.getQut());
                break;
            }
        }


    }
    public void Allthedetails(){
        for (Product ele:arr) {
            System.out.println("Pid"+ele.getPid());
            System.out.println("pname"+ele.getPname());
            System.out.println("price"+ele.getPrice());
            System.out.println("company"+ele.getCompany());
            System.out.println("Quantity"+ele.getQut());
        }
    }

}
