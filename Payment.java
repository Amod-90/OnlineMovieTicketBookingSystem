package com.ticketBookingApp;

import java.util.Date;

public class Payment {
    String paymentId;
    int transactionId;
    Date paymentDate;
    PaymentStatus paymentStatus;
}

enum PaymentStatus{
    REQUESTED, PENDING, UPAID, DECILNED, PAID, CANCELLED,REFUNDED;
}
