select ve.nome , c.nome, sum(v.totalvenda) from vendas v
join cliente c on c.id = v.clientId
join vendedor ve on ve.id = v.vendedorId
group by v.vendedorId , v.clientId;