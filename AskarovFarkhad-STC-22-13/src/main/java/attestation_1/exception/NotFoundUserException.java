package attestation_1.exception;

/**
 * Ошибка - пользователь по указанному ID не найден.
 */
public class NotFoundUserException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Пользователь с указанным ID не найден.\n";
    }
}
