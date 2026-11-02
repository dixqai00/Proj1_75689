import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CarWithLombok {
    @ToString.Include
    private String model;
    @ToString.Include
    @EqualsAndHashCode.Include
    private String brand;
    @ToString.Include
    private int year;
    @ToString.Include
    private int price;
    @ToString.Include
    private String color;
    private int quantity;
}