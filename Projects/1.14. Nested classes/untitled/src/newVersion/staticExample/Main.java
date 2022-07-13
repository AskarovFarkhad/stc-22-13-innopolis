package newVersion.staticExample;

public class Main {

    public static void main(String[] args) {
        Home.Wall[] walls = new Home.Wall[8];
        Home.Door[] doors = new Home.Door[4];
        Home.Window[] windows = new Home.Window[10];

        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Home.Wall("White");
        }

        for (int i = 0; i < windows.length; i++) {
            windows[i] = new Home.Window("Vitek", "Wood");
        }

        for (int i = 0; i < doors.length; i++) {
            if (i % 2 == 0) {
                doors[i] = new Home.Door("Dimon", true);
            } else {
                doors[i] = new Home.Door("Dimon", false);
            }
        }

        Home home = new Home(doors, windows, walls);

        int i = 0;
    }
}
