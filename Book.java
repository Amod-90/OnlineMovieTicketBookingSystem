package com.ticketBookingApp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Book {
    String bookingId;
    User user;
    Screen screen;
    Shows shows;
    Payment payment;
    BookingStatus bookingStatus;
    List<Seats> seats;
    Double totalAmount;

    synchronized public void  bookTickets(Shows shows, String city, Theatre theatre, LocalDateTime time, String seat)
    {
      Map<Theatre,List<Shows>> theatreListMap =  theatre.getTheatreShowsMap();
      List<Shows> showsList = theatreListMap.get(theatre);
      for(Shows show : showsList)
      {
          if(show.getShowsId() == shows.getShowsId() && show.getStartTime()==time)
          {
            List<Seats> bookedSeats =   show.screen.getSeats();
             for(Seats seats : bookedSeats)
             {
                 if(seats.getSeatId() == seat)
                 {
                     System.out.println("Choosen seat is already booked, try with other available seats ");
                     return;
                 }
                 else
                 {
                     //reduce available seat counts by requested seat count
                    show.screen.setTotalSeatCapacity(show.screen.getTotalSeatCapacity() - Integer.valueOf(seat));
                    System.out.println("Your ticket has been booked successfully ");
                 }

             }

          }
      }
    }
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Shows getShows() {
        return shows;
    }

    public void setShows(Shows shows) {
        this.shows = shows;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public List<Seats> getSeats() {
        return seats;
    }

    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

enum BookingStatus{
REQUESTED, PENDING, CONFIRMED, CANCELLED;
}
