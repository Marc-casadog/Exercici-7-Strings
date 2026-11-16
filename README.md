/*Pseudocodi Exercici 7 
Los objetivos de este ejercicio son:
  -Uso de la línea de comandos para interactuar con el usuario
  -Uso de sentencias condicionales
  -Uso de String
  -Uso Java Documentation
Desarrolla un programa en Java que presente una pregunta al usuario con 4 posibles respuestas
(a,b,c,d). Sólo una de las respuestas será correcta. Permite que el usuario seleccione la respuesta (a, b,
c, d) que considera correcta e indícale si ha acertado o no. Si no introduce un valor válido (a, b, c, d) el
programa termina. En las siguientes imágenes se muestran unos ejemplos de ejecución del programa: 
*/
/*

INICI

DEFINIR preguntes COMO ARRAY DE 50 TEXTOS
DEFINIR opcioA COMO ARRAY DE 50 TEXTOS
DEFINIR opcioB COMO ARRAY DE 50 TEXTOS
DEFINIR opcioC COMO ARRAY DE 50 TEXTOS
DEFINIR opcioD COMO ARRAY DE 50 TEXTOS
DEFINIR solucions COMO ARRAY DE 50 TEXTOS 

DEFINIR comptador COMO ENTER
DEFINIR resposta COMO TEXT
DEFINIR continuar COMO BOOLEÀ

// PREGUNTES

preguntes[0] ← "Què és Java?"
opcioA[0] ← "Un llenguatge de programació"
opcioB[0] ← "Un joc"
opcioC[0] ← "Un ordinador"
opcioD[0] ← "Un sistema operatiu"
solucions[0] ← "a"

preguntes[1] ← "Qui va crear Java?"
opcioA[1] ← "Bill Gates"
opcioB[1] ← "James Gosling"
opcioC[1] ← "Steve Jobs"
opcioD[1] ← "Mark Zuckerberg"
solucions[1] ← "b"

preguntes[2] ← "Quina extensió tenen els fitxers Java?"
opcioA[2] ← ".html"
opcioB[2] ← ".txt"
opcioC[2] ← ".java"
opcioD[2] ← ".py"
solucions[2] ← "c"

preguntes[3] ← "Quina paraula declara un número enter?"
opcioA[3] ← "String"
opcioB[3] ← "boolean"
opcioC[3] ← "double"
opcioD[3] ← "int"
solucions[3] ← "d"

preguntes[4] ← "Quin tipus de dada emmagatzema text?"
opcioA[4] ← "String"
opcioB[4] ← "int"
opcioC[4] ← "char"
opcioD[4] ← "boolean"
solucions[4] ← "a"

preguntes[5] ← "Quin tipus de dada permet guardar decimals?"
opcioA[5] ← "int"
opcioB[5] ← "double"
opcioC[5] ← "boolean"
opcioD[5] ← "char"
solucions[5] ← "b"

preguntes[6] ← "Quins valors pot tenir un boolean?"
opcioA[6] ← "Sí i no"
opcioB[6] ← "1 i 2"
opcioC[6] ← "true i false"
opcioD[6] ← "0 i 1"
solucions[6] ← "c"

preguntes[7] ← "Quin operador assigna un valor?"
opcioA[7] ← "=="
opcioB[7] ← "!="
opcioC[7] ← "+"
opcioD[7] ← "="
solucions[7] ← "d"

preguntes[8] ← "Quin tipus de dada guarda un caràcter?"
opcioA[8] ← "char"
opcioB[8] ← "String"
opcioC[8] ← "int"
opcioD[8] ← "double"
solucions[8] ← "a"

preguntes[9] ← "Quina paraula declara una constant?"
opcioA[9] ← "static"
opcioB[9] ← "final"
opcioC[9] ← "const"
opcioD[9] ← "fixed"
solucions[9] ← "b"

preguntes[10] ← "Quina estructura permet prendre decisions?"
opcioA[10] ← "for"
opcioB[10] ← "while"
opcioC[10] ← "if"
opcioD[10] ← "import"
solucions[10] ← "c"

preguntes[11] ← "Quina paraula s'utilitza amb if per indicar una alternativa?"
opcioA[11] ← "case"
opcioB[11] ← "break"
opcioC[11] ← "default"
opcioD[11] ← "else"
solucions[11] ← "d"

preguntes[12] ← "Quin operador comprova si dos valors són iguals?"
opcioA[12] ← "=="
opcioB[12] ← "="
opcioC[12] ← "!="
opcioD[12] ← "&&"
solucions[12] ← "a"

preguntes[13] ← "Quin operador significa diferent?"
opcioA[13] ← "=="
opcioB[13] ← "!="
opcioC[13] ← ">"
opcioD[13] ← "<"
solucions[13] ← "b"

preguntes[14] ← "Quin operador representa AND?"
opcioA[14] ← "||"
opcioB[14] ← "!"
opcioC[14] ← "&&"
opcioD[14] ← "=="
solucions[14] ← "c"

preguntes[15] ← "Quin operador representa OR?"
opcioA[15] ← "&&"
opcioB[15] ← "!"
opcioC[15] ← "=="
opcioD[15] ← "||"
solucions[15] ← "d"

preguntes[16] ← "Quina estructura repeteix instruccions mentre es compleix una condició?"
opcioA[16] ← "while"
opcioB[16] ← "if"
opcioC[16] ← "switch"
opcioD[16] ← "import"
solucions[16] ← "a"

preguntes[17] ← "Quin bucle utilitza habitualment un comptador?"
opcioA[17] ← "if"
opcioB[17] ← "for"
opcioC[17] ← "switch"
opcioD[17] ← "else"
solucions[17] ← "b"

preguntes[18] ← "Quina instrucció permet sortir d'un cas d'un switch?"
opcioA[18] ← "continue"
opcioB[18] ← "return"
opcioC[18] ← "break"
opcioD[18] ← "exit"
solucions[18] ← "c"

preguntes[19] ← "Quina opció s'utilitza per defecte en un switch?"
opcioA[19] ← "else"
opcioB[19] ← "case"
opcioC[19] ← "break"
opcioD[19] ← "default"
solucions[19] ← "d"

preguntes[20] ← "Quin mètode mostra informació per consola?"
opcioA[20] ← "System.out.println()"
opcioB[20] ← "System.in"
opcioC[20] ← "Scanner"
opcioD[20] ← "print.input()"
solucions[20] ← "a"

preguntes[21] ← "Quina classe permet llegir dades del teclat?"
opcioA[21] ← "String"
opcioB[21] ← "Scanner"
opcioC[21] ← "Math"
opcioD[21] ← "System"
solucions[21] ← "b"

preguntes[22] ← "Quin mètode de Scanner llegeix un número enter?"
opcioA[22] ← "nextLine()"
opcioB[22] ← "nextDouble()"
opcioC[22] ← "nextInt()"
opcioD[22] ← "readInt()"
solucions[22] ← "c"

preguntes[23] ← "Quin mètode de Scanner llegeix una línia de text?"
opcioA[23] ← "nextInt()"
opcioB[23] ← "nextDouble()"
opcioC[23] ← "readLine()"
opcioD[23] ← "nextLine()"
solucions[23] ← "d"

preguntes[24] ← "Quina paraula permet importar una classe?"
opcioA[24] ← "import"
opcioB[24] ← "include"
opcioC[24] ← "using"
opcioD[24] ← "package"
solucions[24] ← "a"

preguntes[25] ← "Quina paraula s'utilitza per definir una classe?"
opcioA[25] ← "object"
opcioB[25] ← "class"
opcioC[25] ← "new"
opcioD[25] ← "method"
solucions[25] ← "b"

preguntes[26] ← "Quina paraula s'utilitza per crear un objecte?"
opcioA[26] ← "class"
opcioB[26] ← "this"
opcioC[26] ← "new"
opcioD[26] ← "static"
solucions[26] ← "c"

preguntes[27] ← "Què significa void en un mètode?"
opcioA[27] ← "Que retorna un enter"
opcioB[27] ← "Que és privat"
opcioC[27] ← "Que és estàtic"
opcioD[27] ← "Que no retorna cap valor"
solucions[27] ← "d"

preguntes[28] ← "Quina paraula indica que un mètode és estàtic?"
opcioA[28] ← "static"
opcioB[28] ← "final"
opcioC[28] ← "void"
opcioD[28] ← "public"
solucions[28] ← "a"

preguntes[29] ← "Quin és el nom del mètode principal tradicional de Java?"
opcioA[29] ← "start()"
opcioB[29] ← "main()"
opcioC[29] ← "run()"
opcioD[29] ← "begin()"
solucions[29] ← "b"

preguntes[30] ← "Com es declara un array d'enters?"
opcioA[30] ← "int numeros"
opcioB[30] ← "array int numeros"
opcioC[30] ← "int[] numeros"
opcioD[30] ← "numeros int[]"
solucions[30] ← "c"

preguntes[31] ← "Quin és el primer índex d'un array?"
opcioA[31] ← "1"
opcioB[31] ← "-1"
opcioC[31] ← "2"
opcioD[31] ← "0"
solucions[31] ← "d"

preguntes[32] ← "Quina propietat indica la longitud d'un array?"
opcioA[32] ← "length"
opcioB[32] ← "size()"
opcioC[32] ← "length()"
opcioD[32] ← "count"
solucions[32] ← "a"

preguntes[33] ← "Quins símbols s'utilitzen per accedir a una posició d'un array?"
opcioA[33] ← "()"
opcioB[33] ← "[]"
opcioC[33] ← "{}"
opcioD[33] ← "<>"
solucions[33] ← "b"

preguntes[34] ← "Quin mètode indica la longitud d'un String?"
opcioA[34] ← "size()"
opcioB[34] ← "length"
opcioC[34] ← "length()"
opcioD[34] ← "count()"
solucions[34] ← "c"

preguntes[35] ← "Quin mètode compara Strings ignorant majúscules i minúscules?"
opcioA[35] ← "equals()"
opcioB[35] ← "compare()"
opcioC[35] ← "contains()"
opcioD[35] ← "equalsIgnoreCase()"
solucions[35] ← "d"

preguntes[36] ← "Quin mètode comprova si un String conté un text?"
opcioA[36] ← "contains()"
opcioB[36] ← "equals()"
opcioC[36] ← "substring()"
opcioD[36] ← "indexOf()"
solucions[36] ← "a"

preguntes[37] ← "Quin mètode busca la posició d'un text dins d'un String?"
opcioA[37] ← "substring()"
opcioB[37] ← "indexOf()"
opcioC[37] ← "equals()"
opcioD[37] ← "length()"
solucions[37] ← "b"

preguntes[38] ← "Quin mètode extreu una part d'un String?"
opcioA[38] ← "contains()"
opcioB[38] ← "indexOf()"
opcioC[38] ← "substring()"
opcioD[38] ← "equals()"
solucions[38] ← "c"

preguntes[39] ← "Com es comparen dos Strings pel seu contingut?"
opcioA[39] ← "=="
opcioB[39] ← "compareTo() només"
opcioC[39] ← "="
opcioD[39] ← "equals()"
solucions[39] ← "d"

preguntes[40] ← "Quina classe permet realitzar operacions matemàtiques?"
opcioA[40] ← "Math"
opcioB[40] ← "Scanner"
opcioC[40] ← "String"
opcioD[40] ← "System"
solucions[40] ← "a"

preguntes[41] ← "Quin operador calcula el residu d'una divisió?"
opcioA[41] ← "/"
opcioB[41] ← "%"
opcioC[41] ← "*"
opcioD[41] ← "+"
solucions[41] ← "b"

preguntes[42] ← "Quin operador incrementa una variable en una unitat?"
opcioA[42] ← "--"
opcioB[42] ← "+="
opcioC[42] ← "++"
opcioD[42] ← "**"
solucions[42] ← "c"

preguntes[43] ← "Quin valor representa el número enter zero?"
opcioA[43] ← "1"
opcioB[43] ← "-1"
opcioC[43] ← "null"
opcioD[43] ← "0"
solucions[43] ← "d"

preguntes[44] ← "Quin modificador permet accedir a una classe des d'altres paquets?"
opcioA[44] ← "public"
opcioB[44] ← "private"
opcioC[44] ← "protected"
opcioD[44] ← "static"
solucions[44] ← "a"

preguntes[45] ← "Quin modificador restringeix l'accés a un atribut?"
opcioA[45] ← "public"
opcioB[45] ← "private"
opcioC[45] ← "static"
opcioD[45] ← "final"
solucions[45] ← "b"

preguntes[46] ← "Què és un constructor?"
opcioA[46] ← "Un tipus de variable"
opcioB[46] ← "Un bucle"
opcioC[46] ← "Un mètode especial per inicialitzar objectes"
opcioD[46] ← "Un operador"
solucions[46] ← "c"

preguntes[47] ← "Quin comentari s'utilitza per generar documentació Javadoc?"
opcioA[47] ← "//"
opcioB[47] ← "/* */"
opcioC[47] ← "#"
opcioD[47] ← "/** */"
solucions[47] ← "d"

preguntes[48] ← "Quina etiqueta de Javadoc descriu un paràmetre?"
opcioA[48] ← "@param"
opcioB[48] ← "@return"
opcioC[48] ← "@author"
opcioD[48] ← "@throws"
solucions[48] ← "a"

preguntes[49] ← "Quina etiqueta de Javadoc descriu el valor retornat?"
opcioA[49] ← "@param"
opcioB[49] ← "@return"
opcioC[49] ← "@author"
opcioD[49] ← "@version"
solucions[49] ← "b"

// INICI DEL QÜESTIONARI

comptador ← 0
continuar ← CERT

MENTRE comptador < 50 I continuar = TRUE FER

ESCRIURE preguntes[comptador]
ESCRIURE "a) ", opcioA[comptador]
ESCRIURE "b) ", opcioB[comptador]
ESCRIURE "c) ", opcioC[comptador]
ESCRIURE "d) ", opcioD[comptador]

ESCRIURE "Introdueix la resposta (a, b, c o d): "
LLEGIR resposta

SEGONS resposta FER

CAS "a":
CAS "b":
CAS "c":
CAS "d":

SI resposta = solucions[comptador] LLAVORS
ESCRIURE "Correcte"
SINO
ESCRIURE "Incorrecte"
FI SI

comptador ← comptador + 1

SINO:
ESCRIURE "Resposta no vàlida. El qüestionari ha finalitzat."
continuar ← FALSE

FI SEGONS

FI MENTRE

SI comptador = 50 LLAVORS
ESCRIURE "Has completat totes les preguntes"
FI SI

FI

