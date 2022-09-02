package homework_28.entity;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Human {

    private int id;

    private String name;

    private String lastMame;

    private String patronymic;

    private String city;

    private String street;

    private String house;

    private String flat;

    private String numberPassport;
}
