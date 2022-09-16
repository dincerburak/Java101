package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax() {
        if (this.salary < 1000) {
            return salary;
        }else {
            double tax = this.salary*0.03;
            return tax;
        }
    }
    public double bonus() {
        double bonus;
        if (this.workHours>40) {
            bonus=(this.workHours - 40)*30;
            return bonus;
        }else
            return 0;
    }
    public double raiseSalary() {
        double raise;
        if (hireYear <=0 || hireYear > 2021) {
            System.out.println("Gecersiz Baslangic Yili,Lutfen bilgilerinizi kontrol edip tekrar giriniz ! ");
        }else{
            int yearDiff = 2021 - this.hireYear;
            if(yearDiff>0 && yearDiff < 10){
                raise = this.salary*0.05;
                return raise;
            } else if (yearDiff > 9 && yearDiff <20) {
                raise=this.salary*0.10;
                return raise;
            }else if (yearDiff > 19){
                raise=this.salary*0.15;
                return raise;
            }else{
                raise=0;
            }
        }
        return 0;
    }
    public void printEmployee(){
        double taxableSalary = salary + bonus() - tax();
        double totalSalary = salary + bonus() + raiseSalary() - tax();
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Yili : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas Artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + taxableSalary);
        System.out.println("Toplam Maas : " + totalSalary);
    }
}