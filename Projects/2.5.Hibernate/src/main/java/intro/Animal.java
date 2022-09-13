package intro;
//POJO - Plain Old Java Object
//1. Сам класс не должен быть конечным
//2. Поля класса, так же не должны быть финальными
//3. Обязательно должен быть пустой конструктор
//4. Геттеры и сеттеры

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//5. Для того, что бы класс подходил orm требования, у него должны быть
// ОБЯЗАТЕЛЬНО две аннотации - @Entity и аннотация @Id. Поле (или поля)
//должны имплементировать интерфейс Serializable
@Entity
@Table(name = "home_animals")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int countLegs;
    private boolean tail;
    private String type;

}


