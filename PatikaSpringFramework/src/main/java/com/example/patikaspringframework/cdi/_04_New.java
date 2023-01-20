package com.example.patikaspringframework.cdi;

import com.example.patikaspringframework.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {
    @Produces
    public String producedData(@New StudentDto studentDto){
        studentDto = StudentDto.builder().studentId(0L)
                                         .studentName("Coşkun")
                                         .studentLastName("Altınsoy").build();

        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String consumedData;
}
