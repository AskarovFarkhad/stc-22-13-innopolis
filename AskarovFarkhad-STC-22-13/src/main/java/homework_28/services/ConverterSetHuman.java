package homework_28.services;

import homework_28.entity.Human;
import lombok.NoArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ConverterSetHuman {

    public static List<Human> covertSetToList(ResultSet resultSet) throws SQLException {
        List<Human> humans = new ArrayList<>();

        while (resultSet.next()) {
            humans.add(new Human(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("lastname"),
                    resultSet.getString("city"),
                    resultSet.getString("numberpassport")
            ));
        }
        return humans;
    }

}
