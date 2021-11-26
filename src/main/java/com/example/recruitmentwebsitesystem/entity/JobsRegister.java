package com.example.recruitmentwebsitesystem.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "jobs_register")
public class JobsRegister implements Serializable {
    @EmbeddedId
    CompositeJobsReg compositeJobsReg;

    @ManyToOne(targetEntity = ProfileStatus.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_status_id", nullable = false)
    ProfileStatus profileStatus;

    @Column(name = "date_register", nullable = false)
    Date dateRegister;

    @Column(name = "date_interview", nullable = false)
    Date dateInterview;

    @Column(name = "method_interview", nullable = false)
    String methodInterview;

    @Column(name = "cv_file", nullable = false)
    String cvFile;

    @Column(name = "is_delete", nullable = false)
    boolean isDelete;
}
