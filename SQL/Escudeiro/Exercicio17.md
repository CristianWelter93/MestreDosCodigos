Como existe um relacionamento entre as duas tabelas, assinale a consulta que irá ter a melhor performance e que está correta:

Opção 1 

SELECT c.nome, c.email
         FROM cliente c
         INNER JOIN vendas v on v.clienteID = c.id
         WHERE v.dt_venda > '01/01/2019'
         ORDER BY 1