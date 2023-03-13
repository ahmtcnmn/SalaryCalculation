import static java.lang.System.*;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;


    }

    double tax(){
        if (this.salary >=1000){
            return this.salary*1.03;
        }
        else return this.salary;
    }

    int bonus(){
        if (this.workHours >= 40){
            return (this.workHours-40)*30;
        }
        else return 0;
    }


    double raiseSalary(){
        int a=2021-this.hireYear;
        if (a<=9){
            return (this.salary*1.05)-this.salary;
        }if (a>=10&&a<=19){
            return (this.salary*1.1)-this.salary;
        }if (a>=20){
            return (this.salary*1.15)-this.salary;
        }
        return 0;
    }
    void toSTring(){
        out.println("Adi : "+ this.name);
        out.println("Maas : "+ this.salary+" TL");
        out.println("Calisma saati : "+this.workHours);
        out.println("Vergi : "+(tax()-this.salary)+" TL");
        out.println("Bonus : "+bonus()+" TL");
        out.println("Vergi ve Bonuslar ile birlikte maas : "+ raiseSalary()+" TL");
        out.println("Toplam Maas : "+(tax()+bonus()+raiseSalary())+" TL");



    }


}
