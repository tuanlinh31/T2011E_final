import java.util.Scanner;

public class Employee {
    String empName;
    String empAdr;
    int empTel;
    int empBirthYear;
    int empJoinYear;
    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName1){
        empName = empName1;
    }


    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        empName = s.nextLine();

        System.out.println("Nhap dia chi nhan vien: ");
        empAdr = s.nextLine();

        System.out.println("Nhap so dien thoai nhan vien: ");
        empTel = s.nextInt();

        System.out.println("Nhap nam sinh nhan vien: ");
        empBirthYear = s.nextInt();

        System.out.println("Nhap nam nhap hoc nhan vien: ");
        empJoinYear =s.nextInt();
    }

    void displayEmpInformation(){
        System.out.println("Ten: " + empName);
        System.out.println("Adr: " + empAdr);
        System.out.println("So dien thoai: " + empTel);
        System.out.println("Nam sinh: " + empBirthYear);
        System.out.println("Nam nhap hoc: " + empJoinYear);
    }

    void changeEmpAdr(String newAdr){
        empAdr = newAdr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index =0;
        Employee emp1= new Employee();
        while(index <10) {
            System.out.println("Looping...");
            System.out.println("==== MENU ====");
            System.out.println("**** 1. ADD Employee");
            System.out.println("**** 2. Display Employee information");
            System.out.println("**** 3. Change Employee Adr");
            System.out.println("**** 4. Thoat khoi chuong trinh");
            System.out.println("****    ****");

            System.out.println("Enter your choice: ");
            int choice = s.nextInt();


            switch (choice) {
                case 1:
                    emp1.input();
                    break;
                case 2:
                    emp1.displayEmpInformation();
                    break;
                case 3:
                    Scanner t = new Scanner(System.in);
                    System.out.println("Nhap vao dia chi moi: ");
                    String td = t.nextLine();
                    emp1.changeEmpAdr(td);
                    emp1.displayEmpInformation();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

index++;
        }

    }



}
