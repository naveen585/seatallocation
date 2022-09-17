package com.cs.seatallocation.controller;

import com.cs.seatallocation.dao.EmployeeDao;
import com.cs.seatallocation.model.Employee;
import com.cs.seatallocation.service.SeatAllocationService;

@RestController
public class SeatAllocationController {
    private final SeatAllocationService seatAllocationService;
    private final EmployeeDao employeeDao;

    @Autowired
    public SeatAllocationController(SeatAllocationService seatAllocationService, EmployeeDao employeeDao) {
        this.seatAllocationService = seatAllocationService;
        this.employeeDao = employeeDao;
    }


    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        return employeeDao.save(employee)+" Employee(s) saved successfully";;
    }
}
