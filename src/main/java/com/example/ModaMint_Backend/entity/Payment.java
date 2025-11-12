package com.example.ModaMint_Backend.entity;

import com.example.ModaMint_Backend.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {
    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    PaymentMethod paymentMethod;

    @Column(name = "payment_amount")
    Double paymentAmount;
    
    @Column(name = "payment_status")
    String paymentStatus;

    @Column(name = "transaction_code")
    String transactionCode;

    String payload;

    LocalDateTime timestamp;
}
