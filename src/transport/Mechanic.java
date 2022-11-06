package transport;

import transport.Transport;

public class Mechanic<T extends Transport>{
    private final String nameSurname;
    private final String company;


    public Mechanic(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;
    }
    public String getNameSurname() {
        return nameSurname;
    }

    public String getCompany() {
        return company;
    }

    public void service(T t) {
        t.service();
    }
    public void repair(T t) {
        t.repair();
    }

    @Override
    public String toString() {
        return "Механик: " +
                "ФИО: '" + nameSurname +
                "компания- спонсор: " + company;
    }
}
