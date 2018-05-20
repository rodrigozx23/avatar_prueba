CREATE DATABASE IF NOT EXISTS dbAvatar;
use dbAvatar;

CREATE  TABLE IF NOT EXISTS `dbAvatar`.`tb_prueba` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  `height` VARCHAR(45) NULL ,
  `mass` VARCHAR(45) NULL ,
  `hair_color` VARCHAR(45) NULL ,
  `gender` VARCHAR(45) NULL ,
  `planet` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;