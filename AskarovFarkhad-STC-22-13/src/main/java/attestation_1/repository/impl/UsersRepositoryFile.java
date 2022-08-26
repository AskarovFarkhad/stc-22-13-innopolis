package attestation_1.repository.impl;

import attestation_1.entity.User;
import attestation_1.exception.NotFoundUserException;

public interface UsersRepositoryFile {

    User select(int id) throws NotFoundUserException;

    void create(User user);

    void update(Integer id) throws NotFoundUserException;

    void delete(int id) throws NotFoundUserException;
}
