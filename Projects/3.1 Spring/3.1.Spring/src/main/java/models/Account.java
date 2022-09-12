package models;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;
    private String email;
    private String password;
}
