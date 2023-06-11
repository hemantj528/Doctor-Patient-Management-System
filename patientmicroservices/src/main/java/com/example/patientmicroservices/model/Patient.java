package com.example.patientmicroservices.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
public class Patient {

	@Size(min=2,message = "Name should not be Single Character")
	@NotBlank
	private String patientName;
	@Min(value = 1, message = "Age should be greater than 0")
	private int age;
	@NotNull
	private String gender;
	@Pattern(regexp = "[0-9]{10}$",message = "10 digits")
	private String contactNo;
	@NotNull(message = "Select doctor name")
	private String doctorId;
	@NotNull(message = "Select doctor specialization")
	private String specialization;
	private LocalDate dateOfAppointment;
	@Pattern(regexp = "[0-9]{2}[a-z]{2} to [0-9]{2}[a-z]{2}",message = "Correct Slot needed")
	private String timeSlot;
}
