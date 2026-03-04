package atu.ie.oop_inclass_07;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Booking {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private long id;
    @NotBlank(message = "Book Name is required")
    private String bookName;
    @Positive(message = "Price must be greater than 0")
    private double price;
}
