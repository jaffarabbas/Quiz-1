import java.util.Scanner;
class Employes{
    private final String firstname;
    private final String lastname;
    private final String socialsecuritynumber;

    Employes(String firstname,String lastname,String socialsecuritynumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialsecuritynumber = socialsecuritynumber;
    }

    public String toString(){
        return firstname+"\n"+lastname+"\n"+socialsecuritynumber;
    }
}

     class HourlyEmployee extends Employes{

        private double hours;
        private double wages;

        HourlyEmployee(String firstname, String lastname, String socialsecuritynumber, double hours, double wages){
            super(firstname,lastname,socialsecuritynumber);
            Employes obj = new Employes(firstname,lastname,socialsecuritynumber);
            this.hours=hours;
            this.wages=wages;
            System.out.println(obj.toString());
            System.out.println(toString());
        }

        public double getHours() {
            return hours;
        }

        public void setHours(double hours) {
            if(hours>=0 || hours <= 168) {
                this.hours = hours;
            }
        }

        public double getWages() {
            return wages;
        }

        public void setWages(double wages) {
            if(wages>=0) {
                this.wages = wages;
            }
        }

        public double totalEarning(){
            if(this.getHours()<=40){
                return (this.getHours() * this.getWages());
            }else{
                double hour = this.getHours() - 40;
                double total = (40 * this.getWages()) + hour * (wages * 1.5);
                return total;
            }
        }

        @Override
        public String toString() {
            return " Hours Worked: "+ this.getHours() + "\n Wages per hour: " + this.getWages() + "\n Total wages: " + this.totalEarning();
        }
    }

    public class task2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String firtsname,lastname;
            String ssn;
            double hours;
            double wages;

            System.out.println("Enter FirstName: ");
            firtsname = sc.next();
            System.out.println("Enter LastName: ");
            lastname = sc.next();
            System.out.println("Enter SSN: ");
             ssn = sc.next();
            System.out.println("Enter Hours: ");
            hours = sc.nextDouble();
            System.out.println("Enter Wages: ");
            wages = sc.nextDouble();

            HourlyEmployee he = new HourlyEmployee(firtsname,lastname,ssn,hours,wages);


        }
    }
