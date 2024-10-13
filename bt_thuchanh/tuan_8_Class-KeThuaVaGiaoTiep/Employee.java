public class Employee
{
    private int hour;
    private int salary;
    private int VacationDays;
    private String form = "yellow"; // Tượng trưng "biểu mẫu màu vàng" :L

    public Employee(int hour, int salary, int VacationDays) // Khởi tạo có giá trị
    {
        this.hour = hour;
        this.salary = salary;
        this.VacationDays = VacationDays;
    }

    public Employee()   // Khởi tạo mặc định
    {
        this(0, 0, 0);
    }

    public int getHours() { return this.hour; }
    public int getSalary() { return this.salary; }
    public int getVacationDays() { return this.VacationDays; }
    public String getVacationForm() { return this.form; } 
}

// Bài Tập Số 1.
