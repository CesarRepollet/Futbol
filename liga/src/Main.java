public class Main {
    public static void main(String[] args) {
        Liga liga1 = new Liga("Liga BBVA");
        Equipo equipo1 = new Equipo(0, "FC Barcelona");
        Equipo equipo2 = new Equipo(0,"Real Madrid");
        liga1.getEquipos().add(equipo1);
        liga1.getEquipos().add(equipo2);
        Jugador jugador1 = new Jugador("Lionel Andres Messi", 10, 30, );
        equipo1.getJugadores().add(jugador1);
        System.out.println(liga1);
    }
}
