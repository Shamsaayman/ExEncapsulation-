//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
////ACCOUNT////
//Account acc1 = new Account("1","Shamsa",3000);
//System.out.println("Account ID: "+ acc1.getId());
//System.out.println("Account Name: "+ acc1.getName());
//System.out.println("Account Balance: "+ acc1.getBalance());
//Account acc2 = new Account("2","Noura");
//System.out.println("Account ID: "+ acc2.getId());
//System.out.println("Account Name: "+ acc2.getName());
//acc1.credit(100);
//System.out.println("Account Balance: "+ acc1.getBalance());
//acc1.debit(200);
//System.out.println("Account Balance: "+ acc1.getBalance());
//System.out.println("Transfer: "+ acc1.transferTo(acc2,200));
//System.out.println("New Account Balance: "+ acc1.getBalance());
////EMPLOYEE////
Employee em = new Employee("1","Shamsa", 2000);
System.out.println("Employee ID: "+ em.getId());
System.out.println("Employee Name: "+ em.getName());
System.out.println("Employee Salary: "+ em.getSalary());
System.out.println("Employee Raised Salary: " + em.raisedSalary(50));
System.out.println("Employee Annual Salary: "+ em.getAnnualSalary());

    }

}