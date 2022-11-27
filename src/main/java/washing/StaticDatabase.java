package washing;

import app.App;
import app.Appointment;
import app.Customer;

import java.util.*;
import java.util.function.BiConsumer;

/*
Bu sınıf haftanın günlerini tutacak haftada 7 gün tutar hergün için bir
randevu alınabilir

 */
public class StaticDatabase {
    static HashMap<DayEnum, Customer> days = new HashMap<>();


    public StaticDatabase() {
        days.put(DayEnum.MONDAY, null);
        days.put(DayEnum.TUESDAY, null);
        days.put(DayEnum.WEDNESDAY, null);
        days.put(DayEnum.THRUSDAY, null);
        days.put(DayEnum.FRIDAY, null);
        days.put(DayEnum.SATURDAY, null);
        days.put(DayEnum.SUNDAY, null);


    }

    //return suitable days
    public static List<DayEnum> getSuitableDays() {
        List<DayEnum> list = new ArrayList<>();
        for (Map.Entry<DayEnum, Customer> entry : days.entrySet()) {
            if (entry.getValue() == null) {
                list.add(entry.getKey());

            }
        }

        return list;
    }


    public static void satDayFull(Appointment appointment) {
        for (Map.Entry<DayEnum, Customer> entry : days.entrySet()) {
            if (entry.getKey().equals(appointment.getDay())) {
                if ((entry.getValue() == null)) {
                    entry.setValue(appointment.getCustomer());
                } else {
                    System.out.println("This day is full");
                }
            }
        }
    }

    public static void setDayEmpty(Appointment appointment) {
        DayEnum day = appointment.getDay();
        for (Map.Entry<DayEnum, Customer> entry : days.entrySet()) {
            if (entry.getKey().equals(day)) {
                if ((entry.getValue() != null)) {
                    entry.setValue(null);
                } else {
                    System.out.println("This day is full");
                }
            }
        }
    }

    public static List<Appointment> getALlAppointment() {
        List<Appointment> appointments = new ArrayList<>();
        for (Map.Entry<DayEnum, Customer> entry : days.entrySet()) {
            if ((entry.getValue() != null)) {
                appointments.add(new Appointment(entry.getValue(), entry.getKey()));
            }
        }
        return appointments;
    }

    public static boolean plaqueControl(int plaqueId) {
        for (Map.Entry<DayEnum, Customer> entry : days.entrySet()) {
            if ((entry.getValue() != null && entry.getValue().getCarPlaque() == plaqueId)) {
                return true;
            }
        }
            return false;
    }



}




