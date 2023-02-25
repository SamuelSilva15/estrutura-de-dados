# Estrutura de dados
Projeto feito para aprender e implementar estrutura de dados.

# *Fontes que utilizarei:*
- https://www.youtube.com/watch?v=N3K8PjFOhy4&list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi
- https://www.ime.usp.br/~cosen/verao/alg.pdf
- https://www.alura.com.br/artigos/estruturas-de-dados-introducao
- https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java

# *O que são estrutura de dados?*
- São maneiras de organizar uma massa de dados. As estruturas de dados podem ser:
  1. Lineares ou não lineares;
  2. Homogêneas ou heterogêneas;
  3. Estáticas ou dinâmicas.
 
- E deve definir duas coisas: 
  </br> i. A maneira como a informação será armazenada;
  </br>ii. A interface de uso com o usuário.
    
    
# *Tipo de estruturas:*
- Array(ArrayList): é uma porção de memória fixa e sequencial dividida em pedaços idênticos indexados a partir do 0, guardamos na verdade, uma referência para cada objeto. É uma lista ordenada de valores e tem uma capacidade fixa, sendo a mais comum das estruturas, arrays são utilizados em praticamente toda situação que envolva organizar dados de um mesmo tipo.
É muito similar a ArrayList, mas o ArrayList não é segura para ser compartilhada entre várias threads simultâneamente sem o devido cuidado.

- Pilha(Stack): utiliza a lógica de LIFO. Há mais controle sobre as operações que podem ser feitas na estrutura do que um array.  Em um uma pilha você só pode adicionar ou remover um elemento do topo. 
O caso de uso mais famoso da pilha é a call stack ou pilha de chamadas de um programa que está sendo executado: a ordem de execução dos processos “chamados” por um programa via funções ou métodos obedece o princípio de pilha.

- Filha(Queue): utiliza a lógica de FIFO. Em uma fila você só pode inserir um elemento no final da fila e remover um elemento do início da fila. Possui alguma variações, entre elas: 
  1. Deque: é uma variação da fila que aceita inserção e remoção de elementos tanto do início quanto do final da fila;
Um uso fácil de lembrar para a fila é justamente a fila de impressão dos sistemas operacionais: o último trabalho de impressão a ser adicionado à fila será o último a ser impresso.  
  2. Fila circular: onde o último elemento é conectado com o primeiro elemento. A fila circular busca resolver uma limitação da fila linear, que é lidar com espaços vazios que podem se enfileirar após a retirada de elementos do início da fila.
  
- Lista ligada(LinkedList): assim como arrays, as listas ligadas também armazenam elementos sequencialmente, porém, ao invés de armazenar os elementos de forma contígua na memória, como nos arrays, as listas ligadas não dependem desse tipo de organização. 
Elas utilizam ponteiros para unir os elementos, e cada elemento “aponta” para o endereço de memória do próximo da lista, sem que ele precise estar no bloco de memória seguinte.
Os programas utilizam a lista ligada para encadear os arquivos e “chamar” o próximo via setas do teclado ou botões de “anterior” e “próxima”.

- Conjunto(HashSet): A estrutura de dados conjunto (ou set) é uma lista não ordenada de elementos únicos. Ou seja, não é possível repetir o valor de um elemento dentro de um conjunto.
A técina de espalhamento consiste basicamente de duas partes: a função de espalhamento("Função de Hash") e a tabela de espalhamento("Tabela de hash"). Quando um gerar o mesmo índice para elementos distintos dizemos que houve colisão.
Na classe Object, define um método para gerar o código de espalhamento, o HashCode(), o método equals também o utiliza. Um dos usos mais comuns desta estrutura é em bancos de dados SQL.
- Mapa(HashMap):  é uma estrutura que guarda dados em pares de chave e valor e utiliza estas chaves para encontrar os elementos associados a elas, diferentemente das estruturas que vimos até agora, que trabalham com listas (sequenciais ou não) apenas de valores.
Há duas implementações que utilizam a técnica do espalhamento:  HashMap e HashTable.
