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

    private String lastName;

    private String patronymic;

    private String city;

    private String numberPassport;
}
