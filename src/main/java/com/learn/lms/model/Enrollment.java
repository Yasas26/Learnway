package com.learn.lms.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "enrollments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many enrollments to one student
    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    // Many enrollments to one course
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}

