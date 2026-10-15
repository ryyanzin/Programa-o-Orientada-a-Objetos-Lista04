# Programa-o-Orientada-a-Objetos-Lista04

Lista de Exercícios - Programação Orientada a Objetos:

## Exercícios Teóricos:

**1.** a)

**Verdadeira.** Os atributos e métodos de uma superclasse podem ser herdados por suas subclasses, respeitando as regras de acesso. Entretanto, os construtores não são herdados, pois são responsáveis pela inicialização dos objetos de uma classe. A subclasse pode chamar um construtor da superclasse utilizando a palavra-chave `super`.

b)

**Falsa.** Um relacionamento "tem um" é implementado por meio de um atributo de uma classe que referencia um objeto de outra classe. Por exemplo, um `Carro` pode possuir um atributo do tipo `Motor`, representando que o carro tem um motor. Já a herança representa um relacionamento "é um", como `Cachorro` é um `Animal`.

c)

**Falsa.** Quando uma subclasse redefine um método da superclasse utilizando a mesma assinatura, ocorre uma sobrescrita (*overriding*), e não uma sobrecarga (*overloading*). Uma sobrecarga (ou *overloading*) ocorre quando uma classe possuí métodos com o mesmo nome, mas com parâmetros diferentes. A anotação `@Override` é opcional, mas recomendada, pois permite ao compilador verificar se o método realmente está sobrescrevendo um método herdado.

---

**2.**

O modificador `private` restringe o acesso direto aos atributos e métodos à própria classe, permitindo que ela controle como seus dados são acessados e modificados. Oferecendo maior controle sobre o encapsulamento.

Já o modificador `protected` permite que subclasses e classes do mesmo pacote acessem esses membros, oferecendo maior flexibilidade na herança e personalização. Entretanto, pode prejudicar o encapsulamento ao permitir que subclasses acessem ou modifiquem diretamente dados da superclasse.

Logo, `private` se torna mais adequado quando se deseja maior proteção, enquanto `protected` pode ser útil quando o acesso pelas subclasses é necessário e planejado.

---

**3.**

A chamada do construtor da superclasse é obrigatória porque a subclasse herda atributos que fazem parte do objeto e precisam ser inicializados. Pode ocorrer explicitamente, por meio da palavra-chave `super()`, ou implicitamente, quando uma chamada é inserida ao construtor sem argumentos da superclasse. Assim, a parte herdada do objeto é inicializada antes da execução do corpo do construtor da subclasse.


