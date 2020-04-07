PERSISTENCE (TUDO LIGADO AO BANCO DE DADOS FICA NESTE PACOTE)
#DAO
Data Access Object - DAO
Como temos regras de nefagocios temos a separação destas regras para as regras de acesso a banco de dados
Arquitetura MVC
Todas as funcionalidades de banco como conexoes e executar comandos sql são aqui.
usamos API's de baixo nivel como JPA e Hibernate

*1 PreparedStatement stmt;
https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html
As vezes é mais conveniente usar o preparedStatement para enviar instrucoes SQL ao banco
se vc vai usar ele muitas vezes e melhor usar o PreparedStatement

*2 ResultSet rs;
Mantem o cursor apontado para sua linha atual de dados.Inicialmente, o cursor é posicionado antes da primeira linha

*3 faz parte do pacote java.sql. para abrir uma conexao com um banco de dados usamos o DriverManager ele vai se comunicar com todos os drivers, precisamos invocar o metodo estático getConnection com uma String que indica o banco que vamos conectar
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdUM","root","");

*4 E um metódo estatico, ele tenta inicializar a class driver jdbc, o jdbc possui um bloco estatico que ira registrar essa classe como um driver JDBC,avisando o java.sql.driverManager pelo metodo registerDriver