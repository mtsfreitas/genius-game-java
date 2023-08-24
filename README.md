# genius-game-java

O objetivo deste projeto é o desenvolvimento de um jogo de memória que foi muito popular na década de 80, chamado de Genius. O objetivo do jogador é memorizar e repetir a sequência de cores que são compostas por 4 cores (vermelho, azul, amarelo, verde).

O sistema possui as seguintes funcionalidades: botão para iniciar/resetar o jogo, exibir a sequência de cores, informar acerto ou erro da sequência, sendo que o jogador deve escolher uma cor dentro de 5 segundos a cada escolha.

![7wra9m](https://github.com/mtsfreitas/genius-game-java/assets/21324690/83749909-901e-4c68-8752-91cc96830c5e)

[animação do game desenvolvido]

# Arquitetura
Para este respectivo projeto foi seguido o padrão de software (MVC) Model-View-Controller, que isola as regras de negócios da lógica de apresentação, a interface com o usuário. Possibilitando a divisão do projeto em camadas muito bem definidas para suas classes.

# Model
genius.model: É o coração da execução, responsável por tudo que a aplicação vai fazer a partir dos comandos da camada de controle em um ou mais elementos de dados, respondendo a perguntas sobre o sua condição e a instruções para mudá-las.

# View
Não se dedica em saber como o conhecimento foi retirado ou de onde ela foi obtida, apenas trata da exibição na interface do usuário.

# Decisões de Implementação
Foram utilizados estruturas de vetores que contém o armazenamento do ArrayList de sequência de cores gerada de forma aleatória e o Vetor em que é armazenado as escolhas do jogador. Foi necessário a implementação de 2 Threads para cuidar do tempo de espera limite de 5 segundos e o tempo de transição de cada sequência de cor gerada. O tratamento de erros e exceções foi feito por 4 condições de if-else, tendo em vista um funcionamento robusto que permite executar até quando o usuário desejar.

o desenvolvimento do software na linguagem Java, utilizando a orientação objetos, possui seus pacotes devidamente organizados, inclui também o tratamento de possíveis erros que um determinado usuário possa eventualmente cometer através de estruturas de comparação
