CREATE SCHEMA `new_schema1_1` DEFAULT CHARACTER SET utf8;
CREATE TABLE IF NOT EXISTS `new_schema1_1`.`users` (
    `id` INT NOT NULL,
    `email` VARCHAR(45) NOT NULL,
    `id` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`, `id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB