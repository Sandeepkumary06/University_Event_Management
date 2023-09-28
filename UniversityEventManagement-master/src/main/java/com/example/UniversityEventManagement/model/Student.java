package com.example.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;
    @Pattern(regexp =  "^[A-Z].*$")
    private String studentFirstName;
    private String studentLastName;
    @NotNull
    @Min(value = 18)
    @Max(value = 25)
    private String  StudentAge;
    @Enumerated(value = EnumType.STRING)
    private StudentDepartment studentDepartment;
}
