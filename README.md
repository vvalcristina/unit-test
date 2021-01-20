# Testes Unitários com Java

    O Teste é a menor parte testável de um Código.

## Regras de Negócio

Este repositório se trata de um código de locação de veículos. Onde os veículos podem ou não estar disponíveis para locação. Conforme aumenta-se a quantidade de dias de locação há um desconto progressivo no preço da diária da locação. 

Procure implementar testes unitários para os métodos existentes no código, após a implementação dos testes e se certificar que todos passarem sinta-se a vontade para refatorar classes e implementar novos métodos.

## Tecnologias
    
    Java, JUnit, Maven e Mockito

## Etapas do Teste

* 1 : Criar o cenário de teste (inicialização dos objetos - mocks quando necessários).
* 2 : Realizar a ação (chamar os métodos).
* 3 : Realizar a validação (comparar o retorno - utilizem Asserts).

## Padrões e melhores práticas

* Classe de Teste deve ter o nome da classe a ser testada seguida da palavra "Test" (ClasseTest).
* Colocamos a classe de teste no mesmo pacote de classe de produção (Ex: service => CalculadoraTest)
* Utilize asserts (import static org.junit.Assert).
* Quando lidamos com listas, por exemplo, é sempre interessante tratarmos o caso da lista cheia, da lista com apenas um elemento, da lista vazia.
* Se estamos lidando com algoritmos cuja ordem é importante, precisamos testar ordem crescente, decrescente, randômica.
* Teste todos os caminhos possíveis em um determinado código.
* Comece sempre pelo teste mais simples.
* Sempre que for implementar testes no seu projeto verifique o padrão que vem sendo utilizado.

## Comandos Úteis 

* **Assert.assertEquals(valorEsperado,valorReal,delta)**: compara se dois valores são iguais. 
  
  **delta*-> é uma diferença de valor que deve ser ignorado pelo JUnit na comparação. Como double tem problemas de arredondamento, a versão mais nova do JUnit pede para você passar o "tamanho do erro aceitável". No caso, estamos passando 0.00001. Ou seja, a diferença entre o esperado e o calculado pode ser de até 0.00001, que o JUnit entenderá como erro normal de arredondamento.
    
* **Assert.assertTrue(resultado)**: espera-se que o resultado seja verdadeiro (True).

* **Assert.assertFalse(resultado)**: espera-se que o resultado seja falso (False).

## Anotações de Teste no JUnit

**@Test**: Utilizado para identificar o método que contém o teste específico.

**@Before** : Utilizado no metodo que será executado antes da execução do método se teste. Geralmente utilizado para instanciar objetos. O metodo anotado com @Before será executado sempre antes de cada teste. Por padrão o nome deste método á setUp().

**@After** : Métodos anotados com @After são executados após a execução do método de teste. Muito utilizado em teste de integração. (acessam banco de dados, abrem arquivos, abrem sockets, e etc.)

**@BeforeClass** : São executados apenas uma vez, antes de todos os métodos de teste. Eles podem ser bastante úteis quando temos algum recurso que precisa ser inicializado apenas uma vez e que pode ser consumido por todos os métodos de teste sem a necessidade de ser reinicializado.

**@AfterClass** : é executado uma vez, após a execução do último método de teste da classe.