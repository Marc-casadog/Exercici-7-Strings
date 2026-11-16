import java.util.Scanner;

void main() {
     Scanner sc = new Scanner (System.in);

    String[] preguntes = new String[50];
    String[] opcioA = new String[50];
    String[] opcioB = new String[50];
    String[] opcioC = new String[50];
    String[] opcioD = new String[50];
    String[] solucions = new String[50];

    int comptador;
    String resposta;
    boolean continuar;

    comptador = 0;
    continuar = true;


    // Pregunta 1
    preguntes[0] = "Què és Java?";
    opcioA[0] = "Un llenguatge de programació";
    opcioB[0] = "Un joc";
    opcioC[0] = "Un ordinador";
    opcioD[0] = "Un sistema operatiu";
    solucions[0] = "a";

    // Pregunta 2
    preguntes[1] = "Qui va crear Java?";
    opcioA[1] = "Bill Gates";
    opcioB[1] = "James Gosling";
    opcioC[1] = "Steve Jobs";
    opcioD[1] = "Mark Zuckerberg";
    solucions[1] = "b";

    // Pregunta 3
    preguntes[2] = "Quina és l'extensió d'un fitxer Java?";
    opcioA[2] = ".html";
    opcioB[2] = ".py";
    opcioC[2] = ".java";
    opcioD[2] = ".txt";
    solucions[2] = "c";

    // Pregunta 4
    preguntes[3] = "Quina paraula serveix per declarar un nombre enter?";
    opcioA[3] = "text";
    opcioB[3] = "decimal";
    opcioC[3] = "number";
    opcioD[3] = "int";
    solucions[3] = "d";

    // Pregunta 5
    preguntes[4] = "Quin tipus de dada s'utilitza per guardar text?";
    opcioA[4] = "String";
    opcioB[4] = "int";
    opcioC[4] = "boolean";
    opcioD[4] = "double";
    solucions[4] = "a";

    // Pregunta 6
    preguntes[5] = "Quin tipus de dada permet guardar nombres decimals?";
    opcioA[5] = "int";
    opcioB[5] = "double";
    opcioC[5] = "boolean";
    opcioD[5] = "char";
    solucions[5] = "b";

    // Pregunta 7
    preguntes[6] = "Quins valors pot tenir un boolean?";
    opcioA[6] = "0 i 1";
    opcioB[6] = "Sí i no";
    opcioC[6] = "true i false";
    opcioD[6] = "a i b";
    solucions[6] = "c";

    // Pregunta 8
    preguntes[7] = "Quin operador s'utilitza per assignar un valor?";
    opcioA[7] = "==";
    opcioB[7] = "!=";
    opcioC[7] = ">";
    opcioD[7] = "=";
    solucions[7] = "d";

    // Pregunta 9
    preguntes[8] = "Quin tipus de dada guarda un sol caràcter?";
    opcioA[8] = "char";
    opcioB[8] = "String";
    opcioC[8] = "int";
    opcioD[8] = "boolean";
    solucions[8] = "a";

    // Pregunta 10
    preguntes[9] = "Quina paraula s'utilitza per declarar una constant?";
    opcioA[9] = "static";
    opcioB[9] = "final";
    opcioC[9] = "constant";
    opcioD[9] = "fixed";
    solucions[9] = "b";

    // Pregunta 11
    preguntes[10] = "Quina estructura permet prendre decisions?";
    opcioA[10] = "for";
    opcioB[10] = "while";
    opcioC[10] = "if";
    opcioD[10] = "import";
    solucions[10] = "c";

    // Pregunta 12
    preguntes[11] = "Quina paraula s'utilitza com a alternativa a if?";
    opcioA[11] = "then";
    opcioB[11] = "otherwise";
    opcioC[11] = "default";
    opcioD[11] = "else";
    solucions[11] = "d";

    // Pregunta 13
    preguntes[12] = "Quin operador comprova si dos valors són iguals?";
    opcioA[12] = "==";
    opcioB[12] = "=";
    opcioC[12] = "!=";
    opcioD[12] = "<";
    solucions[12] = "a";

    // Pregunta 14
    preguntes[13] = "Quin operador comprova si dos valors són diferents?";
    opcioA[13] = "==";
    opcioB[13] = "!=";
    opcioC[13] = "=";
    opcioD[13] = ">";
    solucions[13] = "b";

    // Pregunta 15
    preguntes[14] = "Quin operador representa l'AND?";
    opcioA[14] = "||";
    opcioB[14] = "!";
    opcioC[14] = "&&";
    opcioD[14] = "==";
    solucions[14] = "c";

    // Pregunta 16
    preguntes[15] = "Quin operador representa l'OR?";
    opcioA[15] = "&&";
    opcioB[15] = "!";
    opcioC[15] = "==";
    opcioD[15] = "||";
    solucions[15] = "d";

    // Pregunta 17
    preguntes[16] = "Quin bucle es repeteix mentre una condició sigui certa?";
    opcioA[16] = "while";
    opcioB[16] = "if";
    opcioC[16] = "switch";
    opcioD[16] = "break";
    solucions[16] = "a";

    // Pregunta 18
    preguntes[17] = "Quin bucle s'utilitza habitualment quan sabem quantes vegades repetir?";
    opcioA[17] = "while";
    opcioB[17] = "for";
    opcioC[17] = "if";
    opcioD[17] = "else";
    solucions[17] = "b";

    // Pregunta 19
    preguntes[18] = "Quina instrucció permet sortir d'un switch?";
    opcioA[18] = "continue";
    opcioB[18] = "return";
    opcioC[18] = "break";
    opcioD[18] = "exit";
    solucions[18] = "c";

    // Pregunta 20
    preguntes[19] = "Quina paraula s'utilitza com a opció per defecte en un switch?";
    opcioA[19] = "else";
    opcioB[19] = "otherwise";
    opcioC[19] = "if";
    opcioD[19] = "default";
    solucions[19] = "d";

    // Pregunta 21
    preguntes[20] = "Quin mètode mostra informació per consola?";
    opcioA[20] = "System.out.println()";
    opcioB[20] = "Scanner()";
    opcioC[20] = "read()";
    opcioD[20] = "input()";
    solucions[20] = "a";

    // Pregunta 22
    preguntes[21] = "Quina classe permet llegir dades del teclat?";
    opcioA[21] = "String";
    opcioB[21] = "Scanner";
    opcioC[21] = "System";
    opcioD[21] = "Math";
    solucions[21] = "b";

    // Pregunta 23
    preguntes[22] = "Quin mètode de Scanner llegeix un nombre enter?";
    opcioA[22] = "nextLine()";
    opcioB[22] = "nextDouble()";
    opcioC[22] = "nextInt()";
    opcioD[22] = "nextBoolean()";
    solucions[22] = "c";

    // Pregunta 24
    preguntes[23] = "Quin mètode de Scanner llegeix una línia de text?";
    opcioA[23] = "nextInt()";
    opcioB[23] = "nextDouble()";
    opcioC[23] = "nextBoolean()";
    opcioD[23] = "nextLine()";
    solucions[23] = "d";

    // Pregunta 25
    preguntes[24] = "Quina paraula permet importar una classe?";
    opcioA[24] = "import";
    opcioB[24] = "include";
    opcioC[24] = "using";
    opcioD[24] = "package";
    solucions[24] = "a";

    // Pregunta 26
    preguntes[25] = "Quina paraula serveix per definir una classe?";
    opcioA[25] = "object";
    opcioB[25] = "class";
    opcioC[25] = "define";
    opcioD[25] = "new";
    solucions[25] = "b";

    // Pregunta 27
    preguntes[26] = "Quina paraula s'utilitza per crear un objecte?";
    opcioA[26] = "class";
    opcioB[26] = "static";
    opcioC[26] = "new";
    opcioD[26] = "void";
    solucions[26] = "c";

    // Pregunta 28
    preguntes[27] = "Què significa void en un mètode?";
    opcioA[27] = "Retorna un enter";
    opcioB[27] = "Retorna text";
    opcioC[27] = "Retorna un booleà";
    opcioD[27] = "No retorna cap valor";
    solucions[27] = "d";

    // Pregunta 29
    preguntes[28] = "Quina paraula indica que un mètode és estàtic?";
    opcioA[28] = "static";
    opcioB[28] = "final";
    opcioC[28] = "private";
    opcioD[28] = "public";
    solucions[28] = "a";

    // Pregunta 30
    preguntes[29] = "Com s'anomena el mètode principal en Java tradicional?";
    opcioA[29] = "start";
    opcioB[29] = "main";
    opcioC[29] = "run";
    opcioD[29] = "begin";
    solucions[29] = "b";

    // Pregunta 31
    preguntes[30] = "Com es declara un array d'enters?";
    opcioA[30] = "int numeros;";
    opcioB[30] = "array int numeros;";
    opcioC[30] = "int[] numeros;";
    opcioD[30] = "numeros int[];";
    solucions[30] = "c";

    // Pregunta 32
    preguntes[31] = "Quin és el primer índex d'un array?";
    opcioA[31] = "1";
    opcioB[31] = "-1";
    opcioC[31] = "Depèn de l'array";
    opcioD[31] = "0";
    solucions[31] = "d";

    // Pregunta 33
    preguntes[32] = "Quina propietat indica la mida d'un array?";
    opcioA[32] = "length";
    opcioB[32] = "size";
    opcioC[32] = "count";
    opcioD[32] = "length()";
    solucions[32] = "a";

    // Pregunta 34
    preguntes[33] = "Quins símbols s'utilitzen per accedir a una posició d'un array?";
    opcioA[33] = "()";
    opcioB[33] = "[]";
    opcioC[33] = "{}";
    opcioD[33] = "<>";
    solucions[33] = "b";

    // Pregunta 35
    preguntes[34] = "Quin mètode retorna la longitud d'un String?";
    opcioA[34] = "size()";
    opcioB[34] = "length";
    opcioC[34] = "length()";
    opcioD[34] = "count()";
    solucions[34] = "c";

    // Pregunta 36
    preguntes[35] = "Quin mètode compara dos Strings ignorant majúscules i minúscules?";
    opcioA[35] = "equals()";
    opcioB[35] = "compare()";
    opcioC[35] = "contains()";
    opcioD[35] = "equalsIgnoreCase()";
    solucions[35] = "d";

    // Pregunta 37
    preguntes[36] = "Quin mètode comprova si un String conté un text?";
    opcioA[36] = "contains()";
    opcioB[36] = "equals()";
    opcioC[36] = "substring()";
    opcioD[36] = "length()";
    solucions[36] = "a";

    // Pregunta 38
    preguntes[37] = "Quin mètode busca la posició d'un text dins d'un String?";
    opcioA[37] = "substring()";
    opcioB[37] = "indexOf()";
    opcioC[37] = "equals()";
    opcioD[37] = "length()";
    solucions[37] = "b";

    // Pregunta 39
    preguntes[38] = "Quin mètode extreu una part d'un String?";
    opcioA[38] = "contains()";
    opcioB[38] = "indexOf()";
    opcioC[38] = "substring()";
    opcioD[38] = "equals()";
    solucions[38] = "c";

    // Pregunta 40
    preguntes[39] = "Com es comparen correctament dos Strings pel seu contingut?";
    opcioA[39] = "Amb ==";
    opcioB[39] = "Amb =";
    opcioC[39] = "Amb !=";
    opcioD[39] = "Amb equals()";
    solucions[39] = "d";

    // Pregunta 41
    preguntes[40] = "Quina classe conté mètodes matemàtics?";
    opcioA[40] = "Math";
    opcioB[40] = "Scanner";
    opcioC[40] = "String";
    opcioD[40] = "System";
    solucions[40] = "a";

    // Pregunta 42
    preguntes[41] = "Quin operador calcula el residu d'una divisió?";
    opcioA[41] = "/";
    opcioB[41] = "%";
    opcioC[41] = "*";
    opcioD[41] = "+";
    solucions[41] = "b";

    // Pregunta 43
    preguntes[42] = "Quin operador incrementa una variable en una unitat?";
    opcioA[42] = "--";
    opcioB[42] = "+";
    opcioC[42] = "++";
    opcioD[42] = "**";
    solucions[42] = "c";

    // Pregunta 44
    preguntes[43] = "Quin valor representa el nombre enter zero?";
    opcioA[43] = "null";
    opcioB[43] = "false";
    opcioC[43] = "0.0";
    opcioD[43] = "0";
    solucions[43] = "d";

    // Pregunta 45
    preguntes[44] = "Quin modificador permet accedir a una classe des d'altres paquets?";
    opcioA[44] = "public";
    opcioB[44] = "private";
    opcioC[44] = "protected";
    opcioD[44] = "static";
    solucions[44] = "a";

    // Pregunta 46
    preguntes[45] = "Quin modificador restringeix l'accés a un atribut?";
    opcioA[45] = "public";
    opcioB[45] = "private";
    opcioC[45] = "static";
    opcioD[45] = "void";
    solucions[45] = "b";

    // Pregunta 47
    preguntes[46] = "Què és un constructor?";
    opcioA[46] = "Un bucle";
    opcioB[46] = "Un tipus de variable";
    opcioC[46] = "Un mètode especial per inicialitzar objectes";
    opcioD[46] = "Un operador";
    solucions[46] = "c";

    // Pregunta 48
    preguntes[47] = "Quin tipus de comentari s'utilitza per generar documentació Javadoc?";
    opcioA[47] = "//";
    opcioB[47] = "/* */";
    opcioC[47] = "#";
    opcioD[47] = "/** */";
    solucions[47] = "d";

    // Pregunta 49
    preguntes[48] = "Quina etiqueta Javadoc descriu un paràmetre?";
    opcioA[48] = "@param";
    opcioB[48] = "@return";
    opcioC[48] = "@author";
    opcioD[48] = "@throws";
    solucions[48] = "a";

    // Pregunta 50
    preguntes[49] = "Quina etiqueta Javadoc descriu el valor retornat?";
    opcioA[49] = "@param";
    opcioB[49] = "@return";
    opcioC[49] = "@author";
    opcioD[49] = "@version";
    solucions[49] = "b";

    while (comptador < 50 && continuar == true) {
        
        System.out.println("\npregunta" + comptador +1);
        System.out.println(preguntes[comptador]);

        System.out.println("a) " + opcioA[comptador]);
        System.out.println("b) " + opcioB[comptador]);
        System.out.println("c) " + opcioC[comptador]);
        System.out.println("d) " + opcioD[comptador]);

        System.out.print("Introdueix la resposta (a, b, c o d): ");
        resposta = sc.nextLine();
        
        if (resposta.equals("a") || resposta.equals("b") ||
                resposta.equals("c") || resposta.equals("d")) {

            if (resposta.equals(solucions[comptador])) {
                System.out.println("Correcte");
            } else {
                System.out.println("Incorrecte");
            }

            comptador++;

        } else {
            System.out.println("Resposta no vàlida. El qüestionari ha finalitzat.");
            continuar = false;
        }
    }

    if (comptador == 50) {
        System.out.println("\nHas completat les preguntes");
    }

    System.out.println("Final");


}



















