CREATE TABLE `mydb`.`Endereço` (
  `id` VARBINARY(36) NOT NULL,
  `cidade` VARCHAR(150) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `rua` VARCHAR(150) NOT NULL,
  `bairro` VARCHAR(150) NULL,
  `numero` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));



CREATE TABLE `mydb`.`Responsavel` (
  `cpf` VARCHAR(11) NOT NULL,
  `nome` VARCHAR(100) NULL,
  `email` VARCHAR(150) NULL,
  `telefone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE IF NOT EXISTS `mydb`.`Aluno` (
  `cpf` VARCHAR(11) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `endereço_id` VARBINARY(36) NOT NULL,
  `cpf_responsavel` VARBINARY(36) NULL DEFAULT NULL,
  PRIMARY KEY (`cpf`),
  INDEX `fk_Aluno_Endereço_idx` (`endereço_id` ASC) VISIBLE,
  INDEX `fk_Aluno_Responsavel_idx` (`cpf_responsavel` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno_Endereço1`
    FOREIGN KEY (`endereço_id`)
    REFERENCES `mydb`.`Endereço` (`id`),
  CONSTRAINT `fk_Aluno_Responsavel1`
    FOREIGN KEY (`cpf_responsavel`)
    REFERENCES `mydb`.`Responsavel` (`cpf`));

CREATE TABLE `mydb`.`Professor` (
  `cpf` VARCHAR(11) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `endereço_id` VARBINARY(36) NOT NULL,
  PRIMARY KEY (`cpf`),
  INDEX `fk_Professor_Endereço_idx` (`endereço_id` ASC) VISIBLE,
  CONSTRAINT `fk_Professor_Endereço1`
    FOREIGN KEY (`endereço_id`)
    REFERENCES `mydb`.`Endereço` (`id`));



CREATE TABLE `mydb`.`Qualificação` (
  `id` VARBINARY(36) NOT NULL,
  `titulo` VARCHAR(45) NULL,
  `anos de experiência` INT NULL,
  `nativo` TINYINT NULL,
  `cpf_professor` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`id`, `cpf_professor`),
  INDEX `fk_Qualificação_Professor_idx` (`cpf_professor` ASC) VISIBLE,
  CONSTRAINT `fk_Qualificação_Professor1`
    FOREIGN KEY (`cpf_professor`)
    REFERENCES `mydb`.`Professor` (`cpf`));



CREATE TABLE `mydb`.`Escola` (
  `id` VARBINARY(36) NOT NULL,
  `email` VARCHAR(150) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(45) NULL,
  `endereço_id` VARBINARY(36) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Escola_Endereço_idx` (`endereço_id` ASC) VISIBLE,
  CONSTRAINT `fk_Escola_Endereço1`
    FOREIGN KEY (`endereço_id`)
    REFERENCES `mydb`.`Endereço` (`id`));


CREATE TABLE `mydb`.`Curso` (
  `nome` VARCHAR(100) NOT NULL,
  `escola_id` VARBINARY(36) NOT NULL,
  PRIMARY KEY (`nome`, `escola_id`),
  INDEX `fk_Curso_Escola_idx` (`escola_id` ASC) VISIBLE,
  CONSTRAINT `fk_Curso_Escola1`
    FOREIGN KEY (`escola_id`)
    REFERENCES `mydb`.`Escola` (`id`));



CREATE TABLE `mydb`.`Livro` (
  `titulo` VARCHAR(45) NULL,
  `nivel` VARCHAR(45) NOT NULL,
  `nome_curso` VARCHAR(100) NOT NULL,
  `escola_id` VARBINARY(36) NOT NULL,
  PRIMARY KEY (`escola_id`, `nome_curso`, `nivel`),
  INDEX `fk_Livro_Curso1_idx` (`nome_curso` ASC, `escola_id` ASC) VISIBLE,
  CONSTRAINT `fk_Livro_Curso1`
    FOREIGN KEY (`nome_curso` , `escola_id`)
    REFERENCES `mydb`.`Curso` (`nome` , `escola_id`));



CREATE TABLE `mydb`.`Nota` (
  `descrição` VARCHAR(45) NOT NULL,
  `aluno_cpf` VARCHAR(11) NOT NULL,
  `valor` DOUBLE NULL,
  `escola_id` VARBINARY(36) NOT NULL,
  `nome_curso` VARCHAR(100) NOT NULL,
  `nivel_livro` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`descrição`, `aluno_cpf`, `escola_id`, `nome_curso`, `nivel_livro`),
  INDEX `fk_Notas_Aluno_idx` (`aluno_cpf` ASC) VISIBLE,
  INDEX `fk_Nota_Livro_idx` (`escola_id` ASC, `nome_curso` ASC, `nivel_livro` ASC) VISIBLE,
  CONSTRAINT `fk_Notas_Aluno1`
    FOREIGN KEY (`aluno_cpf`)
    REFERENCES `mydb`.`Aluno` (`cpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Nota_Livro1`
    FOREIGN KEY (`escola_id` , `nome_curso` , `nivel_livro`)
    REFERENCES `mydb`.`Livro` (`escola_id` , `nome_curso` , `nivel`));



CREATE TABLE `mydb`.`Curso_has_Professor` (
  `nome_curso` VARCHAR(100) NOT NULL,
  `id_escola` VARBINARY(36) NOT NULL,
  `cpf_professor` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`nome_curso`, `id_escola`, `cpf_professor`),
  INDEX `fk_Curso_has_Professor_Professor_idx` (`cpf_professor` ASC) VISIBLE,
  INDEX `fk_Curso_has_Professor_Curso_idx` (`nome_curso` ASC, `id_escola` ASC) VISIBLE,
  CONSTRAINT `fk_Curso_has_Professor_Curso1`
    FOREIGN KEY (`nome_curso` , `id_escola`)
    REFERENCES `mydb`.`Curso` (`nome` , `escola_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Curso_has_Professor_Professor1`
    FOREIGN KEY (`cpf_professor`)
    REFERENCES `mydb`.`Professor` (`cpf`));