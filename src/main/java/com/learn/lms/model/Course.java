package com.learn.lms.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    // Many courses are taught by one teacher
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;
}
