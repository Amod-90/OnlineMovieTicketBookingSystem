package com.ticketBookingApp;

public class Seats {
    String seatId;
    int row;
    SeatType seatType;
    SeatStatus seatStatus;
    Double price;

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

enum SeatType{
    VIP, PLATINUM, GOLD, SILVER;
}
enum SeatStatus{
    AVAILABLE, RESERVED, BOOKED, NOT_AVAILABLE;
}
