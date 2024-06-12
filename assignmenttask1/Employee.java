package assignmenttask1;

class Employee {
    private double hours;
    private double wageRate;

    public Employee(double hours, double wageRate) {
        this.hours = hours;
        this.wageRate = wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public double getWage() {
        return hours * wageRate;
    }
}
