package com.example.Mission2;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Data
@Builder
public class PatientDetails {
    @NonNull Integer id;
    @NonNull String name;
    @NonNull Integer number;

}
