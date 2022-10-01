package homework_28.entity;

import lombok.*;

/**
 * Entity class used in database table.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Human {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String lastName;
    @NonNull
    private String city;
    @NonNull
    private String numberPassport;

    public Human(@NonNull String name, @NonNull String lastName, @NonNull String city, @NonNull String numberPassport) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.numberPassport = numberPassport;
    }
}
