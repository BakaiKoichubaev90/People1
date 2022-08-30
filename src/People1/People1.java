package People1;

public abstract class People1 {
    private String id;
    private String fistName;
    private String lastName;
    private int age;
    private String email;
    private String city;
    private int[] timeTable;

    public abstract void work(String fistName);

    public abstract void ToRelax();

    public abstract void communications();

    public abstract void grafik();

    public abstract void timetable();

    public People1(String id, String fistName, String lastName, int age, String email, String city, int[] timeTable) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.city = city;
        this.timeTable = timeTable;
    }


    public String getId() {
        return id;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public int[] getTimeTable() {
        return timeTable;
    }
}



