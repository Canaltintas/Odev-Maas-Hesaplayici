import java.util.SortedMap;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name,double salary,double workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    void run(){
        tString();
        raiseSalary();
        if (this.workHours >40){
            bonus();
        }else {
            System.out.println("Vergi Kesintisi : "+ 0 + " TL");
        }
        if (this.salary > 1000){
            tax();
        }else {
            System.out.println("Maaş vergi limitlerinin altında olduğundan ,vergi kesintisi yapılmamıştır. ");
        }


        System.out.println("Net Maaş : " +this.salary);
    }
    void tax(){
        System.out.println("Vergi Kesintisi : "+ (this.salary*3.0)/100.0+ " TL");
        this.salary -= (this.salary*3.0)/100.0;
    }
    void bonus(){
        System.out.println("Bonus Ücretler : "+ (this.workHours - 40.0)*30.0+ " TL");
        this.salary += (this.workHours - 40.0)*30.0;
    }
    void raiseSalary(){
        if (2021 - this.hireYear < 10){
            System.out.println("Maaş Artışı : " + (this.salary*5.0)/100.0 + " TL");
            this.salary+= (this.salary*5.0)/100.0;
        }else if (2021-this.hireYear > 9 &&2021-this.hireYear < 20){
            System.out.println("Maaş Artışı : " + (this.salary*10.0)/100.0 + " TL");
            this.salary+= (this.salary*10.0)/100.0;
        }else if(2021-this.hireYear > 19) {
            System.out.println("Maaş Artışı : " + (this.salary*15.0)/100.0 + " TL");
            this.salary+= (this.salary*15.0)/100.0;
        }else {
            System.out.println("Çalışma süreniz zam almak için yeterli değildir.");
        }
    }

    void tString(){
        System.out.println("Çalışanın Adı : "+ this.name);
        System.out.println("Çalışma Saati : "+ this.workHours);
        System.out.println("İşe Başlama Tarihi : "+ this.hireYear);

    }


}
