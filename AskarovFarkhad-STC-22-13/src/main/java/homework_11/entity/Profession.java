package homework_11.entity;

public enum Profession {
    BACKDEV("Бэкенд разработчик"),
    FRONTDEV("Фронт разработчик"),
    SOFTTEST("Тестировщик"),
    SYSADMIN("Сисадмин");

    private final String title;

    Profession(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
