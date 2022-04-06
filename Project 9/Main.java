import java.util.*;

class Employee
{
    int emp_id;
    int emp_salary;
    
    Employee(int id, int salary)
    {
        id = emp_id;
        salary = emp_salary;
    }
    
    void display()
    {
        System.out.println("Employee ID : "+emp_id);
        System.out.println("Employee Salary : "+emp_salary);
        System.out.println("\n");        
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        emp_id = sc.nextInt();
        System.out.println("Enter Employee Salary : ");
        emp_salary = sc.nextInt();
        System.out.println("\n");
    }
}

class Main
{
    public static void main (String[] args) {
        Employee emp[] = new Employee[5];
        int sal[] = new int[5];
        
        emp[0] = new Employee(0, 0);
        emp[1] = new Employee(0, 0);
        emp[2] = new Employee(0, 0);
        emp[3] = new Employee(0, 0);
        emp[4] = new Employee(0, 0);
        
        for (int i = 0; i<5; i++)
        {
            emp[i].input();
            sal[i] = emp[i].emp_salary;
        }
        
        for (int i = 0; i<5; i++)
        {
            emp[i].display();
        }
        
        int max = sal[0];
        int arr[] = new int[5];
        int j = 0;

        for (int i = 0; i < 5; i++) {
            if (max < sal[i]) {
                max = sal[i];
                arr[j] = max;
                j = i;
            }
        }
        
        System.out.println("\n");
        System.out.println("***********Employee Having Maximum Salary************");
        emp[j].display();
        
    }
}
