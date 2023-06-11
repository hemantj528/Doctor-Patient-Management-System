package com.example.doctormicroservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity
public class Doctor {

	@Id
	private String doctorName;
	private String doctorQualification;
	private String doctorSpecialist;
	private String doctorEmail;
	private String doctorContactNo;
	

	
}
