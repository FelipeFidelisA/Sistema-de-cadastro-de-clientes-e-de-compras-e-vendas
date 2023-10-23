SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `empresa` ;
USE `empresa` ;

CREATE TABLE IF NOT EXISTS `empresa`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(12) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `empresa`.`vendas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `valor_total` DOUBLE NOT NULL,
  `cliente` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_vendas_cliente1_idx` (`cliente` ASC) VISIBLE,
  CONSTRAINT `fk_vendas_cliente1`
    FOREIGN KEY (`cliente`)
    REFERENCES `empresa`.`cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `empresa`.`produto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `preco` DOUBLE NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idproduto_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC) VISIBLE,
  UNIQUE INDEX `preco_UNIQUE` (`preco` ASC) VISIBLE)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `empresa`.`transacao` (
  `vendas_id` INT NOT NULL,
  `produto_id` INT NOT NULL,
  PRIMARY KEY (`vendas_id`, `produto_id`),
  INDEX `fk_vendas_has_produto_produto1_idx` (`produto_id` ASC) VISIBLE,
  INDEX `fk_vendas_has_produto_vendas1_idx` (`vendas_id` ASC) VISIBLE,
  CONSTRAINT `fk_vendas_has_produto_vendas1`
    FOREIGN KEY (`vendas_id`)
    REFERENCES `empresa`.`vendas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vendas_has_produto_produto1`
    FOREIGN KEY (`produto_id`)
    REFERENCES `empresa`.`produto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
