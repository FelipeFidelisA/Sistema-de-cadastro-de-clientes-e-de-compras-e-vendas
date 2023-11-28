-- View para procurar clientes por nome que começam com: 'ra'

create view clientes_por_nome as select * from cliente where nome like 'ra%';

-- View para procurar clientes por número de telefone que começa com: '1234'

create view vw_clientes_por_telefone as select * from cliente where telefone like '1234%';


