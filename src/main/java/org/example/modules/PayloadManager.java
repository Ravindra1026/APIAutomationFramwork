package org.example.modules;


import com.google.gson.Gson;
import org.example.pojos.Booking;
import org.example.pojos.BookingDates;
import org.example.pojos.BookingResponse;

public class PayloadManager {
   //Convert the java object to String
    //GSON
   Gson gson;
    public String createPayloadBookingAsString(){

        Booking booking = new Booking();
        booking.setFirstname("Ravi");
        booking.setLastname("Singh");
        booking.setTotalprice(113);
        booking.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2024-03-02");
        bookingDates.setCheckout("2024-03-04");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        gson = new Gson();
        String jsonStringPayload = gson.toJson(booking);
        System.out.println(jsonStringPayload);
        return  jsonStringPayload;

    }
    public BookingResponse bookingResponseJava(String responseString){
        gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
        return bookingResponse;

    }




    }