public class Customer {
    private String name;
    private String address;
    private int age;
    private double salary;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age<100){
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return address;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

}
