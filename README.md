## 10.1 Informamções 1xx

- **100 Continue:**
  - Indica que o cliente pode continuar com sua requisição.

- **101 Switching Protocols:**
  - Indica que o servidor concorda em trocar os protocolos solicitados pelo cliente.

## 10.2 Sucesso 2xx

- **200 OK:**
  - Indica que a requisição foi bem-sucedida.

- **201 Created:**
  - Indica que a requisição foi bem-sucedida e resultou na criação de um novo recurso.

- **202 Accepted:**
  - Indica que a requisição foi aceita, mas ainda não foi processada.

- **203 Non-Authoritative Information:**
  - Indica que a informação é não autoritativa.

- **204 No Content:**
  - Indica que a requisição foi bem-sucedida, mas não há conteúdo para enviar no corpo da resposta.

- **205 Reset Content:**
  - Indica que o agente do usuário deve redefinir o documento que enviou a requisição.

- **206 Partial Content:**
  - Indica que a parte do conteúdo solicitado foi entregue com sucesso.

## 10.3 Redirecionamento 3xx

- **300 Multiple Choices:**
  - Indica que a requisição tem mais de uma resposta possível.

- **301 Moved Permanently:**
  - Indica que o recurso solicitado foi permanentemente movido para outra localização.

- **302 Found:**
  - Indica que a requisição deve ser redirecionada temporariamente para outra localização.

- **303 See Other:**
  - Indica que a resposta à requisição pode ser encontrada em outra URI.

- **304 Not Modified:**
  - Indica que o recurso não foi modificado desde a última requisição.

- **305 Use Proxy:**
  - Não é mais usado. Indicava que o cliente deve usar um proxy especificado.

- **307 Temporary Redirect:**
  - Indica que a requisição deve ser redirecionada temporariamente para outra localização.

## 10.4 Erro no cliente 4xx

- **400 Bad Request:**
  - Indica que a requisição do cliente é inválida ou malformada.

- **401 Unauthorized:**
  - Indica que o cliente deve autenticar-se para obter a resposta solicitada.

- **402 Payment Required:**
  - Reservado para uso futuro.

- **403 Forbidden:**
  - Indica que o acesso é proibido.

- **404 Not Found:**
  - Indica que o recurso solicitado não foi encontrado.

- **405 Method Not Allowed:**
  - Indica que o método utilizado na requisição não é permitido.

- **406 Not Acceptable:**
  - Indica que o servidor não pode produzir uma resposta que satisfaça as condições de aceitação do cliente.

- **407 Proxy Authentication Required:**
  - Indica que o cliente deve primeiro se autenticar com o proxy.

- **408 Request Timeout:**
  - Indica que o servidor encerrou a conexão porque a requisição do cliente demorou muito.

- **409 Conflict:**
  - Indica que a requisição não pôde ser concluída devido a um conflito com o estado atual do recurso.

- **410 Gone:**
  - Indica que o recurso solicitado não está mais disponível e não será novamente.

- **411 Length Required:**
  - Indica que a requisição não especificou o comprimento do conteúdo.

- **412 Precondition Failed:**
  - Indica que uma das condições prévias definidas na requisição foi avaliada como falsa.

- **413 Request Entity Too Large:**
  - Indica que a requisição é maior do que o servidor está disposto ou capaz de processar.

- **414 Request-URI Too Long:**
  - Indica que o URI da requisição é muito longo para o servidor processar.

- **415 Unsupported Media Type:**
  - Indica que o formato de mídia da requisição não é suportado pelo servidor.

- **416 Requested Range Not Satisfiable:**
  - Indica que nenhum dos intervalos de dados na requisição pode ser satisfeito pelo servidor.

- **417 Expectation Failed:**
  - Indica que o servidor não pode atender às expectativas indicadas no cabeçalho Expect da requisição.

## 10.5 Erro no servidor 5xx

- **500 Internal Server Error:**
  - Indica um erro interno no servidor que impede o processamento bem-sucedido da requisição.

- **501 Not Implemented:**
  - Indica que o servidor não suporta a funcionalidade necessária para cumprir a requisição.

- **502 Bad Gateway:**
  - Indica que o servidor, enquanto atuando como gateway ou proxy, recebeu uma resposta inválida do servidor upstream.

- **503 Service Unavailable:**
  - Indica que o servidor não está pronto para lidar com a requisição. Geralmente, isso é temporário.

- **504 Gateway Timeout:**
  - Indica que o servidor, enquanto atuando como gateway ou proxy, não recebeu uma resposta a tempo.

- **505 HTTP Version Not Supported:**
  - Indica que a versão do HTTP usada na requisição não é suportada pelo servidor.
