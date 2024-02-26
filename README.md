<h1> Automação de E-mails.</h1>

<p> Essa aplicação é feita em Java, com o poderoso Spring Boot e JavaMail.</p>
<p> Ela possibilita a leitura e análise de e-mails recebidos via POP3, permitindo uma gestão proativa da caixa de entrada.</p>
<p> Também é possível configurar Clientes Importantes, para que assim, sempre que esses clientes enviarem um e-mail para a caixa de entrada, eles terão uma resposta automática confirmando que o e-mail foi recebido.</p>

<h2>Como utilizar?</h2>
<p> Para utilizar essa aplicação, é necessário possuir uma IDE de sua escolha que compile códigos em Java</p>
<p>Após isso, clone esse repositório. </p>
<p>Nas seguintes partes do código, adicione o seu Gmail e a sua senha de app: </p>
<p>A senha de app é feita diretamente através da sua conta do Google, encontre mais informações em: https://support.google.com/accounts/answer/185833?hl=pt-BR </p>

<hr>

<p> MailReader.java, linha  16: String username = "Digite seu gmail aqui";</p> 
<p> MailReader.java, linha 17: String password = "Digite a sua senha de app do Google aqui"; </p> 

<p> MailSender.java, linha  13: String username = "Digite seu gmail aqui";</p> 
<p> MailSender.java, linha  14: String password = "Digite a sua senha de app do Google aqui"; </p> 

<hr>

<p>Após isso, é preciso configurar a sua conta do Gmail para "Ativar POP para e-mails que chegarem a partir de agora
"</p>
<p>Esse é um passo bem simples, só basta você entrar na sua conta do Gmail e ir nas configurações.</p>
<p>Agora é so compilar o código e fazer um bom uso da aplicação. Muito obrigado!! </p>
