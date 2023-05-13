CREATE SCHEMA `docker` ;

CREATE TABLE `docker`.`book` (
                                 `Id` INT NOT NULL,
                                 `BookName` VARCHAR(45) NULL,
                                 `Inventory` INT NULL,
                                 PRIMARY KEY (`Id`));

INSERT INTO `docker`.`book` (`Id`, `BookName`, `Inventory`) VALUES ('1', '书籍1', '1');
INSERT INTO `docker`.`book` (`Id`, `BookName`, `Inventory`) VALUES ('2', '书籍2', '4');
INSERT INTO `docker`.`book` (`Id`, `BookName`, `Inventory`) VALUES ('3', '书籍3', '5');
INSERT INTO `docker`.`book` (`Id`, `BookName`, `Inventory`) VALUES ('4', '书籍4', '2');
INSERT INTO `docker`.`book` (`Id`, `BookName`, `Inventory`) VALUES ('5', '书籍5', '1');
INSERT INTO `docker`.`book` (`Id`, `BookName`, `Inventory`) VALUES ('6', '书籍6', '3');


