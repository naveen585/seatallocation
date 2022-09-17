package com.cs.seatallocation.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FloorPlan {

    private Long floor;
    private Long totalSeats;
    private Long availableSeats;
    private String zone;
}
