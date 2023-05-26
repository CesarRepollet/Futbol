import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fifa fifa = new Fifa("Zeferin", 20);
        Rfef rfef = new Rfef("Luis Manuel Rubiales", "LIGA BBVA, Copa del Rey", "Real Madrid", 1000000000);
        Liga liga1 = new Liga("Liga BBVA", "España", 1000000000);
        Europea Champions = new Europea("Champions League",200,"Real Madrid","Octavos, Quartos, Semis, Final");
        Europea Europa_League = new Europea("Europa League", 200,"Sevilla FC", "Octavos, Quartos, Semis, Final");
        Europea Conference_League = new Europea("Conference League", 5,"Villareal","Octavos, Quartos, Semis, Final");
        Internacional Eurocopa = new Internacional("Eurocopa", 600, "Italia","Octavos, Quartos, Semis, Final","Estadio Olimpiko");
        Internacional Mundial = new Internacional("Mundial", 700, "Argentina","Octavos, Quartos, Semis, Final","Estadio Qatar Fundation");
        System.out.println(liga1);


        //MOVIDOS LOS EQUIPOS A DATASOURCE. FALTA COMPLETARLO


        Jugador portero1 = new Jugador("Marc-André", "Ter Stegen", 1, 31, 1, 0, 0, 0, 0);
        Jugador portero2 = new Jugador("Thibaut", "Courtois", 2, 31, 1, 0, 0, 0, 0);
        Jugador portero3 = new Jugador("Jan", "Oblak", 3, 30, 1, 0, 0, 0, 0);
        Jugador portero4 = new Jugador("Yassine", "Bono", 4, 32, 1, 0, 0, 0, 0);
        Jugador portero5 = new Jugador("Claudio", "Bravo", 5, 40, 1, 0, 0, 0, 0);
        Jugador portero6 = new Jugador("Giorgi", "Mamardashvili", 6, 22, 1, 0, 0, 0, 0);
        Jugador portero7 = new Jugador("Filip", "Jorgensen", 7, 21, 1, 0, 0, 0, 0);
        Jugador portero8 = new Jugador("Stole", "Dimitrievski", 8, 29, 1, 0, 0, 0, 0);
        Jugador portero9 = new Jugador("Joan", "Garcia Pons", 9, 22, 1, 0, 0, 0, 0);
        Jugador portero10 = new Jugador("Paulo", "Gazzaniga", 10, 31, 1, 0, 0, 0, 0);
        Jugador portero11 = new Jugador("Alejandro", "Remiro Gargallo", 11, 28, 1, 0, 0, 0, 0);
        Jugador portero12 = new Jugador("Unai", "Simon Mendibil", 12, 25, 1, 0, 0, 0, 0);
        Jugador portero13 = new Jugador("Sergio", "Herrera", 13, 29, 1, 0, 0, 0, 0);
        Jugador portero14 = new Jugador("Predrag", "Rajkovic", 14, 27, 1, 0, 0, 0, 0);
        Jugador portero15 = new Jugador("Agustin", "Marchesin", 15, 35, 1, 0, 0, 0, 0);
        Jugador portero16 = new Jugador("Fernando", "Martinez Rubio", 16, 32, 1, 0, 0, 0, 0);
        Jugador portero17 = new Jugador("Jeremias", "Connan Ledesma", 17, 30, 1, 0, 0, 0, 0);
        Jugador portero18 = new Jugador("Jordi", "Masip", 18, 34, 1, 0, 0, 0, 0);
        Jugador portero19 = new Jugador("David", "Soria Solis", 19, 30, 1, 0, 0, 0, 0);
        Jugador portero20 = new Jugador("Edgar", "Badia", 20, 31, 1, 0, 0, 0, 0);
        Arbitro arbitro1 = new Arbitro("Juan Luis Pulido Santana", 5000, "Española", 1, 0, 0);
        Arbitro arbitro2 = new Arbitro("Isidro Díaz de Mera Escuderos", 5000, "Española", 2, 0, 0);
        Arbitro arbitro3 = new Arbitro("Javier Alberola Rojas", 5000, "Española", 3, 0, 0);
        Arbitro arbitro4 = new Arbitro("Ricardo de Burgos Bongoetxea", 5000, "Española", 4, 0, 0);
        Arbitro arbitro5 = new Arbitro("Carlos del Cerro Grande", 5000, "Española", 5, 0, 0);
        Arbitro arbitro6 = new Arbitro("Jorge Figueroa Vazquez", 5000, "Española", 6, 0, 0);
        Arbitro arbitro7 = new Arbitro("Jesus Gil Manzano", 5000, "Española", 7, 0, 0);
        Arbitro arbitro8 = new Arbitro("Pablo Gonzalez Fuertes", 5000, "Española", 8, 0, 0);
        Arbitro arbitro9 = new Arbitro("Alejandro Herandez Hernandez", 5000, "Española", 9, 0, 0);
        Arbitro arbitro10 = new Arbitro("Javier Iglesias Villanueva", 5000, "Española", 10, 0, 0);
        Arbitro arbitro11 = new Arbitro("Juan Martinez Munuera", 5000, "Española", 11, 0, 0);
        Arbitro arbitro12 = new Arbitro("Antonio Mateu Lahoz", 5000, "Española", 12, 0, 0);
        Arbitro arbitro13 = new Arbitro("Mario Melero Lopez", 5000, "Española", 13, 0, 0);
        Arbitro arbitro14 = new Arbitro("Jose Luis Munuera Montero", 5000, "Española", 14, 0, 0);
        Arbitro arbitro15 = new Arbitro("Alejandro Muñiz Ruiz", 5000, "Española", 15, 0, 0);
        Arbitro arbitro16 = new Arbitro("Miguel Angel Ortiz Arias", 5000, "Española", 16, 0, 0);
        Arbitro arbitro17 = new Arbitro("Valentin Pizarro Gomez", 5000, "Española", 17, 0, 0);
        Arbitro arbitro18 = new Arbitro("Jose Maria Sanchez Martinez", 5000, "Española", 18, 0, 0);
        Arbitro arbitro19 = new Arbitro("Cesar Soto Grado", 5000, "Española", 19, 0, 0);
        Arbitro arbitro20 = new Arbitro("Guillermo Cuadra Fernandez", 5000, "Española", 20, 0, 0);
        Jornada jornada1a = new Jornada("1a", "FCB-BET", 12 / 8, 1 - 0, "ninguna", "Todo OK");
        Jornada jornada2a = new Jornada("2a", "FCB-SEV", 19 / 8, 2 - 0, "ninguna", "Todo OK");
        Jornada jornada3a = new Jornada("3a", "FCB-ESP", 26 / 8, 4 - 0, "ninguna", "Todo OK");
        Jornada jornada4a = new Jornada("4a", "FCB-RSC", 2 / 9, 1 - 0, "ninguna", "Todo OK");
        Jornada jornada5a = new Jornada("5a", "FCB-VAL", 9 / 9, 3 - 1, "ninguna", "Todo OK");
        Jornada jornada6a = new Jornada("6a", "FCB-VIL", 16 / 9, 5 - 2, "ninguna", "Todo OK");
        Jornada jornada7a = new Jornada("7a", "FCB-GET", 30 / 9, 3 - 0, "ninguna", "Todo OK");
        Jornada jornada8a = new Jornada("8a", "FCB-ATH", 7 / 10, 2 - 1, "ninguna", "Todo OK");
        Jornada jornada9a = new Jornada("9a", "FCB-ATL", 14 / 10, 1 - 1, "ninguna", "Todo OK");
        Jornada jornada10a = new Jornada("10a", "FCB-RMA", 18 / 10, 3 - 0, "ninguna", "Todo OK");
        Jornada jornada11a = new Jornada("11a", "FCB-OSA", 22 / 10, 1 - 0, "ninguna", "Todo OK");
        Jornada jornada12a = new Jornada("12a", "FCB-VAD", 28 / 10, 4 - 0, "ninguna", "Todo OK");
        Jornada jornada13a = new Jornada("13a", "FCB-ALM", 4 / 11, 2 - 1, "ninguna", "Todo OK");
        Jornada jornada14a = new Jornada("14a", "FCB-CAD", 8 / 11, 1 - 1, "ninguna", "Todo OK");
        Jornada jornada15a = new Jornada("15a", "FCB-RAY", 29 / 11, 2 - 0, "ninguna", "Todo OK");
        Jornada jornada16a = new Jornada("16a", "FCB-GIR", 6 / 1, 1 - 2, "ninguna", "Todo OK");
        Jornada jornada17a = new Jornada("17a", "FCB-MRC", 13 / 1, 2 - 1, "ninguna", "Todo OK");
        Jornada jornada18a = new Jornada("18a", "FCB-CLT", 20 / 1, 1 - 0, "ninguna", "Todo OK");
        Jornada jornada19a = new Jornada("19a", "FCB-ELC", 27 / 1, 3 - 0, "ninguna", "Todo OK");

        //Observa este cambio y dime si lo entiendes
        for (int i = 0; i < DataSource.nombreEquipos.length; i++) {
            Equipo equipo = new Equipo(DataSource.nombreEquipos[i], DataSource.nombreEstadios[i],0,DataSource.nombreAficiones[i] );
            liga1.getEquipos().add(equipo);
        }

        /*
        Lo anterior sustituye a esto
        liga1.getEquipos().add(equipo1);
        liga1.getEquipos().add(equipo2);
        liga1.getEquipos().add(equipo3);
        liga1.getEquipos().add(equipo4);
        liga1.getEquipos().add(equipo5);
        liga1.getEquipos().add(equipo6);
        liga1.getEquipos().add(equipo7);
        liga1.getEquipos().add(equipo8);
        liga1.getEquipos().add(equipo9);
        liga1.getEquipos().add(equipo10);
        liga1.getEquipos().add(equipo11);
        liga1.getEquipos().add(equipo12);
        liga1.getEquipos().add(equipo13);
        liga1.getEquipos().add(equipo14);
        liga1.getEquipos().add(equipo15);
        liga1.getEquipos().add(equipo16);
        liga1.getEquipos().add(equipo17);
        liga1.getEquipos().add(equipo18);
        liga1.getEquipos().add(equipo19);
        liga1.getEquipos().add(equipo20);

         */


        /*
        equipo1.getJugadores().add(portero1);
        equipo2.getJugadores().add(portero2);
        equipo3.getJugadores().add(portero3);
        equipo4.getJugadores().add(portero4);
        equipo5.getJugadores().add(portero5);
        equipo6.getJugadores().add(portero6);
        equipo7.getJugadores().add(portero7);
        equipo8.getJugadores().add(portero8);
        equipo9.getJugadores().add(portero9);
        equipo10.getJugadores().add(portero10);
        equipo11.getJugadores().add(portero11);
        equipo12.getJugadores().add(portero12);
        equipo13.getJugadores().add(portero13);
        equipo14.getJugadores().add(portero14);
        equipo15.getJugadores().add(portero15);
        equipo16.getJugadores().add(portero16);
        equipo17.getJugadores().add(portero17);
        equipo18.getJugadores().add(portero18);
        equipo19.getJugadores().add(portero19);
        equipo20.getJugadores().add(portero20);*/
        jornada1a.getArbitros().add(arbitro1);
        jornada2a.getArbitros().add(arbitro2);
        jornada3a.getArbitros().add(arbitro3);
        jornada4a.getArbitros().add(arbitro4);
        jornada5a.getArbitros().add(arbitro5);
        jornada6a.getArbitros().add(arbitro6);
        jornada7a.getArbitros().add(arbitro7);
        jornada8a.getArbitros().add(arbitro8);
        jornada9a.getArbitros().add(arbitro9);
        jornada10a.getArbitros().add(arbitro10);
        jornada11a.getArbitros().add(arbitro11);
        jornada12a.getArbitros().add(arbitro12);
        jornada13a.getArbitros().add(arbitro13);
        jornada14a.getArbitros().add(arbitro14);
        jornada15a.getArbitros().add(arbitro15);
        jornada16a.getArbitros().add(arbitro16);
        jornada17a.getArbitros().add(arbitro17);
        jornada18a.getArbitros().add(arbitro18);
        jornada19a.getArbitros().add(arbitro19);
        System.out.println(liga1);
        fifa.agregarliga("Premier League", "Inglaterra", 1000000000);
        rfef.agregarliga("Liga Smartbank","España",1000000000);
        rfef.agregarliga("Primera RFEF", "España", 10000000);
        Mundial.agregargrupo("1","España","Italia","Eslovenia","Ecuador",0,0,0,0);
        Eurocopa.agregargrupo("1","Inglaterra","Alemania","Suecia","",0,0,0,0);
        Champions.agregargrupos("1","FC Barcelona","FB Bayern de Munich","Inter de Milan","Victoria Pilzen",0,0,0,0);
        Europa_League.agregargrupos("1","Sevilla FC","FC Eintrach de Frankfurt","CD Estrella Roja","CD Roma",0,0,0,0);
        Conference_League.agregargrupos("1","Villareal","FC Union Berlín","Fiorentina","FC Reins",0,0,0,0);
        rfef.getLigas().get(0).agregarequipo("Granada FC","Nuevo Los Carmenes",0, "Granadinos");
        rfef.getLigas().get(0).agregarestadios("Nuevo Los Carmenes", 40000,"Granada","Granada FC");
        rfef.getLigas().get(0).agregarjornada("1a","FCG-AMO",7/9,1-0,"Ninguna", "Todo OK");
        rfef.getLigas().get(0).agregararbitro("Manuel del Pozo", 3500,"Español",21,0,0);
        rfef.getLigas().get(1).agregarequipo("CD Badajoz","Nuevo Vivero", 0, "Pacenses");
        rfef.getLigas().get(1).agregarestadios("Nuevo Vivero", 40000,"Badajoz","CD Badajoz");
        rfef.getLigas().get(1).agregararbitro("Manuel de las Fuentes", 2000,"Español",41,0,0);
        rfef.getLigas().get(1).agregarjornada("1a","CDB-MER",12/8,2-0,"Asalto de campo","Penalti");
        fifa.getLigas().get(0).agregarequipo("Manchester City", "Etihad Stadium", 0, "Citycens");
        fifa.getLigas().get(0).agregarjornada("1a","MCY-MCU",12/8, 2-0,"Ninguna","Todo OK");
        fifa.getLigas().get(0).agregararbitro("",5000,"",100,0,0);
        fifa.getLigas().get(0).agregarestadios("Etihad Stadium",70000,"Manchester","Manchester City");
        Mundial.agregarseleccion("España",0,"La Roja");
        Mundial.agregarsede("España",700,"Estadio Olimpico de Barcelona");
        Mundial.agregarjornada("1a","Grupos","ESP-ITL",12,1-0,"Ninguna","Todo OK");
        Mundial.agregararbitro("Harry Potter", 6000, "Inglesa",110,0,0);
        Eurocopa.agregarseleccion("Inglaterra",0,"Loyals");
        Eurocopa.agregarsede("Francia",600,"Parque de los Principes");
        Eurocopa.agregarjornada("1a","Grupos","ING-ALM",1,2-1,"Ninguna","Todo OK");
        Eurocopa.agregararbitro("Alejandro Hernandez Hernandez",5500,"Español",9,0,0);
        Champions.agregarequipo("FC Barcelona","Spotify Camp Nou",0,"Culés");
        Champions.agregarjornada("1a","FCB-BAY",7/9,3-2,"Ninguna","Todo OK");
        Champions.agregararbitro("Lester Black",4000,"Inglesa",111,0,0);
        Europa_League.agregarequipo("Sevilla FC","Sanchez Pijuan",0,"Palanganas");
        Europa_League.agregarjornada("1a","SEV-EST",7/9,5-0,"Ninguna","Todo OK");
        Europa_League.agregararbitro("Menier Xamp",4500,"Francesa",401,0,0);
        Conference_League.agregarequipo("Villareal","Ceramica",0,"groguets");
        Conference_League.agregarjornada("1a","VIL-Fiorentina",7/9,1-2,"Ninguna","Todo OK");
        Conference_League.agregararbitro("Wolfgang Stark",4500,"Alemana",301,0,0);
        System.out.println(Champions);
        System.out.println(Europa_League);
        System.out.println(Conference_League);
        System.out.println(Mundial);
        System.out.println(Eurocopa);
        System.out.println(liga1);
    }
}