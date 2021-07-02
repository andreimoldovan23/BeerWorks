package sfmc.brewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
    @Null private UUID id;
    @Null private Integer version;

    @Null private OffsetDateTime createdDate;
    @Null private OffsetDateTime lastModifiedDate;

    @NotBlank private String beerName;
    @NotNull private BeerStyle beerType;

    @NotNull @Positive private Long upc;
    @NotNull @Positive private BigDecimal price;
    @Null private Integer quantityOnHand;
}
