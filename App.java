public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona(Persona.Racas.HUMANO, Persona.Classes.GUERREIRO);
        Persona p2 = new Persona(Persona.Racas.ELFO, Persona.Classes.MAGO);
        Persona p3 = new Persona(Persona.Racas.DRACONATO, Persona.Classes.LADINO);

        System.out.println(p1.getStatus());
        System.out.println(p2.getStatus());
        System.out.println(p3.getStatus());
    }
}
