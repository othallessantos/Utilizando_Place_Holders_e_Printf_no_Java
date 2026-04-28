# Place Holders e printf

Basicamente, o "%s" é um placeholder - é uma maneira mais limpa e
fácil de "concatenar" todos os tipos de objetos. Também existem
outros tipos de "%" para outros tipos.

## Principais especificadores:

%s <strong>String</strong> (qualquer objeto)

%d <strong>Inteiro</strong> (int, long)

%f <strong>Decimal</strong> (float, double)

%b <strong>Booleano</strong> (true or false)

%c <strong>Caractere</strong> (char - como "a")

%n <strong>Quebra de linha</strong> (utilizado com o <br>"printf" ou "printf" ao invés de /n por<br> possíveis
problemas de quebra de linha <br>em windows ou outros).

## Modicando eles:

Você também pode adicionar alguns detalhes neles, como "%.2f" - é um float com
2 casas decimais, "%10d" - um inteiro com largura de 10 (o número que você
colocar aí se desloca para a direita e fica um espaço à esquerda dele) ou
"%-10d" = um inteiro com largura de 10 (o número que você colocar aí se
desloca para a esquerda e ficará um espaço à direita dele).

Para utilizar eles dentro de suas strings, você utiliza o "printf". Existem pelo 
menos 3 tipos de printar algo no Java. 

## Print:
Você irá imprimir algo na tela, porém não terá nenhuma quebra de linha.

## Println:
Também irá imprimir o que você quiser na tela, porém terá quebra de linha.

## Printf:
Com ele você consequira imprimir algo na tela, utilziar os placeholders e ele 
também já contém a quebra de linha naturalmente, sem a necessidade do \n.

OBS: No printf o ideial é utilizar o <strong>%n</strong> pelo motivo citado na linha 14 e 15
desse README.
