package forLombok.newVersion;

import lombok.*;

@Getter
@ToString
@Builder
public class Car {

    private String brand;
    private String model;
    private int power;

}
