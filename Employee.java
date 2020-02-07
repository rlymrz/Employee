public class Employee {
    private String first_name;
    private String last_name;
    private String address;
    private int contact;
    private String email;
    private String job_position;
    private double rate;

    public Employee(String first_name, String last_name, String address, int contact, String email, String job_position, double rate) {
        this.first_name = ucfirst(first_name);
        this.last_name = ucfirst(last_name);
        this.address = ucfirst(address);
        this.contact = contact;
        this.email = ucfirst(email);
        this.job_position = ucfirst(job_position);
        this.rate = rate;
    }

    public String getFullName() {
        return this.last_name + ", " + this.first_name;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getContact() {
        return this.contact;
    } 

    public String getEmail() {
        return this.email;
    }

    public String getJob_Position() {
        return this.job_position;
    }

    public double getRate() {
        return this.rate;
    }


    private String ucfirst(String str) {
        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1, str.length());
    }
}