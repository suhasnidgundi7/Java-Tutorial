class Employee {
    int emp_id, emp_salary;
    String emp_name;

    Employee(int id, String name, int salary) {
        emp_id = id;
        emp_name = name;
        emp_salary = salary;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Employee Name : " + emp_name);
        System.out.println("Employee Salary : " + emp_salary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee MyObj[] = new Employee[5];
        MyObj[0] = new Employee(1, "Person 1", 10001);
        MyObj[1] = new Employee(2, "Person 2", 10002);
        MyObj[2] = new Employee(3, "Person 3", 10003);
        MyObj[3] = new Employee(4, "Person 4", 10004);
        MyObj[4] = new Employee(5, "Person 5", 10005);

        for (int i = 0; i < 5; i++) {
            MyObj[i].display();
        }
    }
}