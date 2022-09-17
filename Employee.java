package com.cs.seatallocation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String pid;
    private String name;
    private String role;
    private String managerPid;
    private String upperManagers;
    private Long reporterCount;
}
