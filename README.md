# Criando uma APIRest com Spring Bot

<p>1- Criar package 'controllers' na pasta principal do projeto;</p>
<p>1.1- Criar a classe 'ProdutoController';</p>
<p>1.2- Adicionar as anotações @RestController para informar ao Spring que esta classe é uma controller;</p>
<p>1.3- Criar o método listar() e usar anotação @GetMapping:</p>

``` 
Public class ProdutoController{
    public String listar(){
          return "Lista de produtos";
    }
}
````

<p>E testar no terminal:</p>

``` 
mvn spring-boot:run 
```

<p>Para representar os dados da classe produto, criou-se a Model. Nesta classe constará os atributos da Produto. Nesta, será utilizado o Lombok, além das anotações @Data (Classe com data) e @AllArgsConstructor(getter e setters - Lombok).</p>

<p>O produto não será chamado diretamente no 'ProdutoController', ele irá ser chamado pelo 'ProdutoService', que deve ser criado agora. O package 'services' e a classe 'ProdutoService'.</p>

<p>Após criado, serão utilizadas as anotações @Service para criar o service e os métodos @findAll(retonar array com 2 produtos) para utilizar como resposta da listagem. @Service irá informar ao Spring para inicializar o service concominantemente com a aplicação e permite injeta-lo em qualquer outro módulo da solução.</p>

<p> Na classe 'ProdutoService' criar produtos manualmente com retorno em forma de lista, já que os produtos foram adicionados como Listproduto.</p>

