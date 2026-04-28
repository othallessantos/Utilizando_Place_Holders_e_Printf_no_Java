import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Antes de tudo, só avisando que os 2 códigos então sendo ativados
        um seguido do outro. Espero que goste desse projeto.
        */

        /*
        Basicamente, o "%s" é um placeholder - é uma maneira mais limpa e
        fácil de "concatenar" todos os tipos de objetos. Também existem
        outros tipos de "%" para outros tipos.

        Principais especificadores:

        %s String (qualquer objeto)
        %d Inteiro (int, long)
        %f Decimal (float, double)
        %b Booleano (true or false)
        %c Caractere (char - como "a")
        %n Quebra de linha (utilizado com o "printf" ou "printf" ao invés de /n por
        possíveis problemas de quebra de linha em windows ou outros).

        Você também pode adicionar alguns detalhes neles, como "%.2f" - é um float com
        2 casas decimais, "%10d" - um inteiro com largura de 10 (o número que você
        colocar aí se desloca para a direita e fica um espaço à esquerda dele) ou
        "%-10d" = um inteiro com largura de 10 (o número que você colocar aí se
        desloca para a esquerda e ficará um espaço à direita dele).
        */

//        Primeiro exemplo ():

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
            String name = scanner.nextLine();
        System.out.println("Qual é a sua idade? ");
            int age = scanner.nextInt();
            scanner.nextLine();
        System.out.println("Qual é a sua cidade? ");
            String city = scanner.nextLine();
        System.out.println("Quantos habitantes existem na sua cidade ? " +
                "(Coloque o número sem pontos ou vírgulas) ");
            int habitants = scanner.nextInt();
            scanner.nextLine();


        System.out.println("Primeiro Projeto: ");

        System.out.printf(Locale.of("pt","BR"), "%nO nome da pessoa que escreve esse código é %s.%nEle" +
                " tem %d anos e mora em %s.%nA cidade %s tem %,d habitante(s)%n", name, age, city, city, habitants);


        System.out.println("Louco,né? (Digite 'true' ou 'false')");
        boolean louco = scanner.nextBoolean();

        if (louco){
            System.out.println("O usuário acha muito louco!!\n");
        }else{
            System.out.println("O usuário não acha louco...\n");
        }

        /*
        OBS: O "if" só executa se o boolean for "true". Se o usuário escolher
        "false" o código irá passar para o else nesse caso.
        */

        /*

        Observações sobre o código:

        Nesse código, tive que utilizar o import.java.util.locale para forçar
        a localização do meu código para pt-BR, já que o código estava configurado à
        localização norte-americana

        Por conta disso, lá no printf (utilizamos o printf para usar os "% - placeholders")
        eu também utilizei o "Locale.of ("pt","BR")". Não utilizei o "new Locale", pois ele foi
        descontinuado desde o Java 19.

        Além disso, tive que colocar uma vírgula no placeholder do integer (número dos habitantes)
        para funcionar. Ele era assim: "%d" e ficou assim "%,d".

        OBS: Nesse código, eu utilizei o "Printf". Você também verá o "printf". Não tem quase
        diferença nenhuma entre eles. A única diferença é que o "printf" vem do C e C++ - mais
        "antigo" - e o "printf" vem do Java puro mesmo. Na maior parte das vezes você verá o
        "printf" sendo mais utilizado em materiais de estudo, mas caso você veja o "printf", saiba
        que é praticamente o mesmo.

        */

        //Segundo exemplo (conta de supermercado):

        System.out.println("Segundo Projeto: ");

        System.out.printf("%n%-15s %5s %8s%n", "Produto", "Qtd", "Preço");
        System.out.printf("%-15s %5d %2s R$ %5.2f%n", "Maça", 2,"", 2.50);
        System.out.printf("%-15s %5d %2s R$ %5.2f%n", "Uva", 6, "", 8.50);
        System.out.printf("%-15s %5d %2s R$ %5.2f%n", "Abacate", 4, "", 9.50);
        System.out.printf("%-15s %5d %2s R$ %5.2f%n", "Laranja", 25, "", 10.00);
        System.out.printf("%-15s %5d %2s R$ %5.2f%n", "Banana", 3, "", 3.50);
        System.out.printf("%-15s %5d %2s R$ %5.2f%n", "Limão", 40, "", 25.00);
    }
}