* Seleciona a quantidade de cursos de cada escola

	select count(*) as quantidade_de_cursos, e.nome as escola
	from curso c 
	inner join escola e ON c.escola_id = e.id
	group by c.escola_id;


* Seleciona os alunos que tem notas em Matematica e/ou em Portugues

	select aluno_cpf from nota where nome_curso = 'Matematica' union select aluno_cpf from nota where nome_curso = 'Portugues';

* Exibe o nome do aluno e do responsável, caso não tenha resposável é exibida a mensagem 'Sem responsável'

    select a.nome as nome_aluno,
	(case when (r.nome is not null) then r.nome else 'Sem responsável' end) as nome_responsavel
	from aluno a left join responsavel r on r.cpf = a.cpf_responsavel;

* Exibe o nome das escolas que não tem nenhuma nota lançada

    select  e.nome as escola
	from aluno a
	join nota n on a.cpf = n.aluno_cpf 
	right join escola e on e.id = n.escola_id
	where a.cpf is null;

* Exibe os professore sem escola

    select p.nome from professor p where p.nome not in (
	select p1.nome from curso_has_professor chp
	join professor p1 on chp.cpf_professor = p1.cpf group by p1.cpf 
	)
