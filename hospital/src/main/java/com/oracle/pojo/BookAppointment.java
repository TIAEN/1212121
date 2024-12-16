package com.oracle.pojo;

import java.io.Serializable;
import java.util.Date;

/*

+------------------+----------+------+-----+---------+-------+
| Field            | Type     | Null | Key | Default | Extra |
+------------------+----------+------+-----+---------+-------+
| appointment_date | datetime | YES  |     | NULL    |       |
| bookNumber       | int(11)  | YES  |     | NULL    |       |
+------------------+----------+------+-----+---------+-------+
 */
public class BookAppointment implements Serializable {
    private Date appointmentDate;
    private int bookNumber;

    public BookAppointment() {
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    @Override
    public String toString() {
        return "BookAppointment{" +
                "appointmentDate=" + appointmentDate +
                ", bookNumber=" + bookNumber +
                '}';
    }
}
