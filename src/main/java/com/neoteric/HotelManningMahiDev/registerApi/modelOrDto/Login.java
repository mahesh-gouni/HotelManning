package com.neoteric.HotelManningMahiDev.registerApi.modelOrDto;


//import com.neoteric.HotelManningMahiDev.customValidation.UserNameValid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
   // @UserNameValid
    private String email;
    @NotBlank
    private String password;


}
