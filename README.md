# DesignPatternsLoja

projeto simples para aplicar conceitos de alguns padrões de projetos:

Strategy - 
    sempre que tiver um algoritimo (regra, validação, etc..) e para não deixar o código cheio de if,else 
(condicionais e crescento eternamente) implementamos uma interface comum (polimorfismo) que sendo passada 
(no método ou contrutor) implementa a sua maneira específicam melhorando a coesão e legibilidade.

Chain of Responsability
    Quando se tem um fluxo com validações, coloca-se em cadeia para que todas validações sejam verificadas e chame a próxima.

Template Method
    Modelo padrão

State
    Parecido com strategy, mas ele representa o estado de um atributo e como ele deve se comportar dentro da aplicação quando
a transição destes acontece.

Command
    Criado para separar a lógica de negócios das classes de dados (handlers).

Observer
    Classes que ficam observando um evento e assim que chamada, executa o que foi proposto.

Adpater
    Adptador para deixar o código bem flexível e de fácil manutenção.

Decorator
    Objeto é composto por outro objeto que este altera seu comportamento original.

Composite
    Compor objetos sem comprometer a flexibilidade do código, podendo acessar tanto o todo como somente o objeto em si.

