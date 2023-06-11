package com.example.patientmicroservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	private String doctorName;
	private String doctorQualification;
	private String doctorSpecialist;
	private String doctorEmail;
	private String doctorContactNo;
}
