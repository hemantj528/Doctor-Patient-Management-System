package com.example.appointmentmicroservices.model;


import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

	private String patientName;
	private int age;
	private String gender;
	private long contactNo;
	private String doctorId;
	private String specialization;
	private LocalDate dateOfAppointment;
	private String timeSlot;
	

}

