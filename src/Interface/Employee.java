package Interface;

                                // Compare to accept the only the employeee object in the compare to method
public class Employee implements CompareTo<Employee>{

    int empId = 0;

    public Employee(int empId) {
        this.empId = empId;
    }

    @Override
    public boolean compareTo(Employee other){
        return this == other;
    }
}
