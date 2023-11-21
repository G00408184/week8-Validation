package ie.atu.week8validation;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Email(message = "invalid email address")
    private String email;

    @NotBlank(message = "Id cannot be blank")
    private String employeeId;

    @Min(18)
    private int age;

    @NotBlank(message = "position cannot be blank")
    private String position;

    @NotBlank(message = "department cannot be blank")
    private String department;
}
