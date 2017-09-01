-- MySQL Script generated by MySQL Workbench
-- 09/01/17 11:16:27
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`professores`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`professores` ;

CREATE TABLE IF NOT EXISTS `mydb`.`professores` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `cpf` VARCHAR(20) NOT NULL,
  `login` VARCHAR(50) NOT NULL,
  `senha` VARCHAR(50) NOT NULL,
  `data_nascimento` DATE NULL,
  `celular` VARCHAR(20) NULL,
  `email` VARCHAR(100) NULL,
  `registro` VARCHAR(50) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`disciplinas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`disciplinas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`disciplinas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `id_professor` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_professor_idx` (`id_professor` ASC),
  CONSTRAINT `disciplinas__professores_id`
    FOREIGN KEY (`id_professor`)
    REFERENCES `mydb`.`professores` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`escolas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`escolas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`escolas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `cnpj` VARCHAR(20) NOT NULL,
  `telefone` VARCHAR(20) NULL,
  `rua` VARCHAR(50) NULL,
  `numero` VARCHAR(10) NULL,
  `bairro` VARCHAR(50) NULL,
  `cep` VARCHAR(15) NULL,
  `cidade` VARCHAR(100) NULL,
  `email` VARCHAR(150) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `cnpj_UNIQUE` (`cnpj` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`salas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`salas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`salas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_escola` INT NOT NULL,
  `codigo` VARCHAR(50) NOT NULL,
  `maximo_alunos` TINYINT NULL,
  `funcional` TINYINT(1) NULL,
  PRIMARY KEY (`id`),
  INDEX `id_escola_idx` (`id_escola` ASC),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC),
  CONSTRAINT `salas__escolas_id`
    FOREIGN KEY (`id_escola`)
    REFERENCES `mydb`.`escolas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`niveis`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`niveis` ;

CREATE TABLE IF NOT EXISTS `mydb`.`niveis` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `descricao` TEXT NULL,
  `media_aprovacao` DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`turmas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`turmas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`turmas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_nivel` INT NOT NULL,
  `id_sala` INT NULL,
  `codigo` VARCHAR(20) NULL,
  PRIMARY KEY (`id`),
  INDEX `id_sala_idx` (`id_sala` ASC),
  INDEX `id_nivel_idx` (`id_nivel` ASC),
  CONSTRAINT `turmas__salas_id`
    FOREIGN KEY (`id_sala`)
    REFERENCES `mydb`.`salas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `turmas__niveis_id`
    FOREIGN KEY (`id_nivel`)
    REFERENCES `mydb`.`niveis` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`alunos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`alunos` ;

CREATE TABLE IF NOT EXISTS `mydb`.`alunos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `cpf` VARCHAR(20) NOT NULL,
  `login` VARCHAR(50) NOT NULL,
  `senha` VARCHAR(50) NOT NULL,
  `data_nascimento` DATE NULL,
  `numero_matricula` VARCHAR(10) NULL,
  `email` VARCHAR(100) NULL,
  `celular` VARCHAR(20) NULL,
  `mae` VARCHAR(150) NULL,
  `pai` VARCHAR(150) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`turmas_disciplinas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`turmas_disciplinas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`turmas_disciplinas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_turma` INT NOT NULL,
  `id_disciplina` INT NOT NULL,
  `id_aluno` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_disciplina_idx` (`id_disciplina` ASC),
  INDEX `id_turma_idx` (`id_turma` ASC),
  INDEX `id_aluno_idx` (`id_aluno` ASC),
  CONSTRAINT `turmas_disciplinas__disciplinas_id`
    FOREIGN KEY (`id_disciplina`)
    REFERENCES `mydb`.`disciplinas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `turmas_disciplinas__turmas_id`
    FOREIGN KEY (`id_turma`)
    REFERENCES `mydb`.`turmas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `turmas_disciplinas__alunos_id`
    FOREIGN KEY (`id_aluno`)
    REFERENCES `mydb`.`alunos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`chamadas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`chamadas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`chamadas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `id_turma_disciplina` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_turma_disciplina_idx` (`id_turma_disciplina` ASC),
  CONSTRAINT `chamadas__turmas_disciplinas_id`
    FOREIGN KEY (`id_turma_disciplina`)
    REFERENCES `mydb`.`turmas_disciplinas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`frequencias`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`frequencias` ;

CREATE TABLE IF NOT EXISTS `mydb`.`frequencias` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_chamada` INT NOT NULL,
  `presente` TINYINT(1) NOT NULL,
  `id_aluno` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_chamada_idx` (`id_chamada` ASC),
  INDEX `frequencias__alunos_id_idx` (`id_aluno` ASC),
  CONSTRAINT `frequencias__chamadas_id`
    FOREIGN KEY (`id_chamada`)
    REFERENCES `mydb`.`chamadas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `frequencias__alunos_id`
    FOREIGN KEY (`id_aluno`)
    REFERENCES `mydb`.`alunos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`atividades`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`atividades` ;

CREATE TABLE IF NOT EXISTS `mydb`.`atividades` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `descricao` TEXT NULL,
  `id_turma_disciplina` INT NOT NULL,
  `data_entrega` DATE NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_turma_disciplina_idx` (`id_turma_disciplina` ASC),
  CONSTRAINT `atividades__turmas_disciplinas_id`
    FOREIGN KEY (`id_turma_disciplina`)
    REFERENCES `mydb`.`turmas_disciplinas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`notas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`notas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`notas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nota` DOUBLE NOT NULL,
  `id_atividade` INT NOT NULL,
  `id_aluno` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_atividade_idx` (`id_atividade` ASC),
  INDEX `notas__alunos_id_idx` (`id_aluno` ASC),
  CONSTRAINT `notas__atividades_id`
    FOREIGN KEY (`id_atividade`)
    REFERENCES `mydb`.`atividades` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `notas__alunos_id`
    FOREIGN KEY (`id_aluno`)
    REFERENCES `mydb`.`alunos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`hora_aula`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`hora_aula` ;

CREATE TABLE IF NOT EXISTS `mydb`.`hora_aula` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `hora_inicio` TIME NOT NULL,
  `hora_fim` TIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `mydb`.`grade_horarios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`grade_horarios` ;

CREATE TABLE IF NOT EXISTS `mydb`.`grade_horarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dia_semana` TINYINT NOT NULL,
  `id_turma_disciplina` INT NOT NULL,
  `id_hora_aula` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_turma_disciplina_idx` (`id_turma_disciplina` ASC),
  INDEX `id_hora_aula_idx` (`id_hora_aula` ASC),
  CONSTRAINT `grade_horarios__turmas_disciplinas_id`
    FOREIGN KEY (`id_turma_disciplina`)
    REFERENCES `mydb`.`turmas_disciplinas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `grade_horarios__hora_aula_id`
    FOREIGN KEY (`id_hora_aula`)
    REFERENCES `mydb`.`hora_aula` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`coordenadores`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`coordenadores` ;

CREATE TABLE IF NOT EXISTS `mydb`.`coordenadores` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `cpf` VARCHAR(20) NOT NULL,
  `login` VARCHAR(50) NOT NULL,
  `senha` VARCHAR(50) NOT NULL,
  `data_nascimento` DATE NULL,
  `celular` VARCHAR(20) NULL,
  `email` VARCHAR(100) NULL,
  `id_escola` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC),
  INDEX `coordenadores__escola_id_idx` (`id_escola` ASC),
  CONSTRAINT `coordenadores__escola_id`
    FOREIGN KEY (`id_escola`)
    REFERENCES `mydb`.`escolas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;