package kz.java.clientcoreapi.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientModel {
    private String clientId;
    @NotNull(message = "")
    @Size(min = 2, max = 32)
    private String clientLogin;
    @NotNull(message = "Password can not be empty")
    @Size(min = 2, max = 32)
    private String clientPassword;
    @Email
    private String clientEmail;

}
