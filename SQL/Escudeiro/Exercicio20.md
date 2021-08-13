CREATE TABLE `mydb`.`endereço` (
  `id` INT NOT NULL,
  `rua` VARCHAR(150) NOT NULL,
  `cidade` VARCHAR(150) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `bairro` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`));
 
CREATE TABLE `mydb`.`fornecedor` (
  `id` INT NOT NULL,
  `endereço_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_fornecedor_endereço_idx` (`endereço_id` ASC),
  CONSTRAINT `fk_fornecedor_endereço1`
    FOREIGN KEY (`endereço_id`)
    REFERENCES `mydb`.`endereço` (`id`));
   
CREATE TABLE `mydb`.`cliente` (
  `id` INT NOT NULL,
  `endereço_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cliente_endereço_idx` (`endereço_id` ASC),
  CONSTRAINT `fk_cliente_endereço`
    FOREIGN KEY (`endereço_id`)
    REFERENCES `mydb`.`endereço` (`id`));
   
CREATE TABLE `mydb`.`usuario` (
  `id` INT NOT NULL,
  `email` VARCHAR(150) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `endereço_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_usuario_endereço_idx` (`endereço_id` ASC),
  CONSTRAINT `fk_usuario_endereço1`
    FOREIGN KEY (`endereço_id`)
    REFERENCES `mydb`.`endereço` (`id`));
   
CREATE TABLE `mydb`.`funcionario` (
  `id` INT NOT NULL,
  `endereço_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_funcionario_endereço_idx` (`endereço_id` ASC),
  CONSTRAINT `fk_funcionario_endereço1`
    FOREIGN KEY (`endereço_id`)
    REFERENCES `mydb`.`endereço` (`id`));