# ANIMAIS POLIMÓRFICOS
## Descrição

Este exercício demonstra o uso de herança, polimorfismo e upcasting em Java através da modelagem de diferentes tipos de animais. O código inclui uma classe principal Main que executa exemplos de como diferentes tipos de animais (aves, mamíferos e répteis) se movem e emitem sons.

## Estrutura do Exercício
O exercício é composto por várias classes que representam diferentes tipos de animais. Cada classe estende uma classe abstrata base e implementa os métodos específicos para cada tipo de animal. O conceito de upcasting é utilizado para tratar diferentes tipos de animais de forma genérica.

## Classes e Métodos

### Main
* Classe principal que executa o programa e demonstra o uso das classes de animais.
* Utiliza upcasting para manipular diferentes tipos de animais através da classe base Animal, Mamifero ou Reptil.
* Chama os métodos de locomover e emitirSom para diferentes animais.

### Animal
* Classe abstrata base para todos os animais.
* Métodos abstratos:
  1. void locomover(int velocidade)
  2. void locomover(String terreno)
  3. void emitirSom()

### Ave
* Classe abstrata que estende Animal.
* Representa um grupo de animais que são aves.

### Mamifero
* Classe abstrata que estende Animal.
* Representa um grupo de animais que são mamíferos.

### Reptil
* Classe abstrata que estende Animal.
* Representa um grupo de animais que são répteis.

### Pato
* Classe que estende Ave.
* Implementa os métodos locomover e emitirSom para um pato.

### Pardal
* Classe que estende Ave.
* Implementa os métodos locomover e emitirSom para um pardal.

### Cachorro
* Classe que estende Mamifero.
* Implementa os métodos locomover e emitirSom para um cachorro.

### Gato
* Classe que estende Mamifero.
* Implementa os métodos locomover e emitirSom para um gato.

### Cobra
* Classe que estende Reptil.
* Implementa os métodos locomover e emitirSom para uma cobra.

### Tartaruga
* Classe que estende Reptil.
* Implementa os métodos locomover e emitirSom para uma tartaruga.

## Utilização de Upcasting
No código, o upcasting é utilizado para tratar diferentes tipos de animais através da classe base Animal, Mamifero ou Reptil. Isso permite que os objetos de subclasses específicas sejam manipulados de forma genérica, utilizando os métodos definidos na classe base. Por exemplo:

* Um objeto Pardal é tratado como um Animal para chamar os métodos locomover e emitirSom.
* Um objeto Cachorro é tratado como um Mamifero para demonstrar o polimorfismo.