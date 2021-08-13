-- Foi criada uma tabela para realizar este exericio que uni as tabelas aluno e responsavel em uma nova chamada usuario

CREATE TABLE `usuario` (
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cpf_responsavel` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`cpf`));


-- Dados inseridos
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('00557935613', 'alma', 'alma@gmail.com', NULL);
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('01555445662', 'lurdes', 'lurdes@hotmail.com', NULL);
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('01557995642', 'affonso', 'affonso@hotmail.com', NULL);
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('04557965617', 'joaquim', 'joaquim@yahoo.com', NULL);
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('00637935613', 'luiz', '2346545789','00557935613');
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('01787995642', 'carla', '6487456164','01557995642');
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('01965445662', 'beatriz', '1194567845', NULL);
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('04497965617', 'luana', '54132456879', NULL);
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('04664945456', 'joao', '46889754612','04557965617');
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('04687945612', 'Ana', '44999999999', '01555445662');
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('05684945612', 'paulo', '17649784562', NULL);
  INSERT INTO usuario (cpf, nome, email, cpf_responsavel) VALUES('08047945619', 'julia', '9754681664', NULL);


-- Query hierarquico 
-- Seleciona todos os usuarios que "descendem" do usuario com cpf 00557935613, "filhos". "netos" e assim por diante
with recursive cte (cpf, nome, cpf_responsavel) as (
  select     cpf,
             nome,
             cpf_responsavel
  from       usuario
  where      cpf_responsavel = '00557935613'
  union all
  select     p.cpf,
             p.nome,
             p.cpf_responsavel
  from       usuario p
  inner join cte
          on p.cpf_responsavel = cte.cpf
)
select * from cte order by cpf_responsavel ;