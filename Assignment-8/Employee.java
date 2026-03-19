class Employee1{ 
    int id; 
    String name; 
    double salary; 

    void calculateBonus(){ 
        System.out.println("Employee Bonus : " + salary*5/100); 
    } 
} 

class Manager extends Employee1{ 
    void calculateBonus(){ 
        System.out.println("Manager Bonus : " + salary*25/100); 
    } 
} 

class Developer extends Employee1{ 
    void calculateBonus(){ 
        System.out.println("Developer Bonus : " + salary*15/100); 
    } 
} 

class Intern extends Employee1{ 
    void calculateBonus(){ 
        System.out.println("Intern Bonus : " + salary*10/100); 
    } 
} 

class Employee { 
    public static void main(String[] args) { 

        Employee1 e = new Employee1(); 
        Manager m = new Manager(); 
        Developer d = new Developer(); 
        Intern i = new Intern(); 

        e.salary = 10000; 
        m.salary = 500000; 
        d.salary = 250000; 
        i.salary = 150000; 

        e.calculateBonus(); 
        m.calculateBonus(); 
        d.calculateBonus(); 
        i.calculateBonus(); 
    } 
}