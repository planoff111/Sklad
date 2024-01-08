package org.example.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sklad")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double quinty;
    private double price;

}
