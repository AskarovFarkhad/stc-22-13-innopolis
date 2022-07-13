package newVersion.staticExample;

public class Home {

    private Door[] doors;
    private Window[] windows;
    private Wall[] walls;

    public Home(Door[] doors, Window[] windows, Wall[] walls) {
        this.doors = doors;
        this.windows = windows;
        this.walls = walls;
    }

    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public Window[] getWindows() {
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    public static class Door {

        private String brand;
        private boolean isMain;

        public Door(String brand, boolean isMain) {
            this.brand = brand;
            this.isMain = isMain;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public boolean isMain() {
            return isMain;
        }

        public void setMain(boolean main) {
            isMain = main;
        }
    }

    public static class Wall {

        private String color;

        public Wall(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static class Window {

        private String brand;
        private String material;

        public Window(String brand, String material) {
            this.brand = brand;
            this.material = material;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }
}
