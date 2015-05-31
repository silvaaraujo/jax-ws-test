# jax-ws-test
Projeto para testes de criação e consumo de webservices com jax-ws.

#Documentação e/ou tutorial oficial:
https://docs.oracle.com/javaee/7/tutorial/jaxws.htm#BNAYL

#API JavaEE7
http://docs.oracle.com/javaee/7/api/

#Observações importantes:

1 - O projeto foi construído usando o maven, caso não conheça ou tenha dúvidas, pode saná-las em:
https://maven.apache.org/users/index.html

2 - Antes de executar qualquer exemplo é necessário realizar o deploy da aplicação em servidor de aplicação que implemente a especificação javaEE 7.
Os testes foram realizados utilizando o servidor de aplicação glassfish 4.1 que pode ser baixado gratuitamente em:
https://glassfish.java.net/download.html

3 - Para implementar seu próprio cliente para consumir os webservices disponíveis neste projeto é necessário utilizar o utilitário wsimport que vem junto com instalação padrão do JDK.
Exemplo, documentação e por quê utilizar o wsimport pode ser visto em: <b>http://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html</b>



#Exemplos e como executa-los:

1 - Servico
<br />
Este é um webservice bem simples, possui apenas um método que recebe uma String e devolve outra String informando o usuário que consumiu o serviço, com base no parametro informado.
O wsdl deste exemplo pode ser visualizado em: <b>http://localhost:8080/jax-ws-test/ServicoService?wsdl</b>
O webservice pode ser testado diretamente no navegador web de sua preferência em: <b>http://localhost:8080/jax-ws-test/ServicoService?Tester</b>


2 - Calculator
<br />
Este webservice simula uma calculadora com as quatro operações básicas: SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO, DIVISÃO 
O wsdl deste exemplo pode ser visualizado em: <b>http://localhost:8080/jax-ws-test/CalculatorService?wsdl</b>
O webservice e cada um de seus métodos podem ser testado diretamente no navegador web de sua preferência em: <b>http://localhost:8080/jax-ws-test/CalculatorService?Tester</b>