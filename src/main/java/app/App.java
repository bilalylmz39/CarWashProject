package app;

import washing.StaticDatabase;
import washing.DayEnum;

import java.util.List;

public class App {



    public App(){
        initializeData();

        openApp();
        getUsableDay();


        Customer customer = new Customer(144232,"ilber","ortaylı");
        getAppointment(customer,DayEnum.SATURDAY);

        getUsableDay();


    }

    private void initializeData(){
        System.out.println("------this data initialize default-----");

        Customer c1 = new Customer(123,"oğuzhan","aaa");
        Customer c2 = new Customer(1234,"tuna","bbb");
        Customer c3 = new Customer(12355,"bilal","ccc");


        getAppointment(c1,DayEnum.FRIDAY);
        getAppointment(c2,DayEnum.MONDAY);
        getAppointment(c3,DayEnum.SUNDAY);

        System.out.println("-------------");



    }

    public void openApp() {
        System.out.println("App is opened");
        System.out.println(" ");

    }


    public void appClose() {
        System.out.println("App is closed");
        System.out.println(" ");
    }

    //düzenlenmeli
    public void getUsableDay() {
        List<DayEnum> list = StaticDatabase.getSuitableDays();
        for (DayEnum dayEnum : list){
            System.out.println(dayEnum.name()+ " is suitable for appointment");
        }
        System.out.println(" ");
        System.out.println("-------------------");
    }

    //geting appoitment via static database
    public void getAppointment(Customer customer,DayEnum day) {
        Appointment appointment = new Appointment(customer,day);
        System.out.println(appointment.toString());
        System.out.println("Appoinment is made");
        StaticDatabase.satDayFull(appointment);

    }

    public void cancelAppointment(Appointment appointment) {
        StaticDatabase.setDayEmpty(appointment);
    }


}
