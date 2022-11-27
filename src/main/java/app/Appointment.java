package app;

import washing.DayEnum;

/*
Randevuyla ilgili bilgileri tutar
 */
public class Appointment {
    Customer customer;
    private DayEnum day;

    public Appointment(Customer customer,DayEnum day) {
        this.customer = customer;
        this.day = day;


    }



    public DayEnum getDay() {
        return day;
    }

    public void setDay(DayEnum day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "customer=" + customer.getName() +
                ", day=" + day +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }
}
