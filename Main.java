import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        
            Scanner user = new Scanner(System.in);
            
            System.out.println("Crie seu personagem.");
            System.out.println("Selecione uma uma Raça.  | HUMANO | ELFO | DRAGONATO |");
            String racaEscolhida = user.nextLine();
            Persona.Racas raca = Persona.Racas.valueOf(racaEscolhida.toUpperCase());
            System.out.println("Selecione uma uma Classe.  | GUERREIRO | LADINO | MAGO |");
            String classeEscolhida = user.nextLine();
            Persona.Classes classe = Persona.Classes.valueOf(classeEscolhida.toUpperCase());
            
            Persona p = new Persona(raca, classe);
            System.out.println(Persona);

        
        
        }

