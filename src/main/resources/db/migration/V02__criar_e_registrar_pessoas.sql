CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo CHAR(1) NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(10),
	complemento VARCHAR(20),
	bairro VARCHAR(20),
	cep VARCHAR(10),
	cidade VARCHAR(50),
	estado VARCHAR(20)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES('Bruna Ferreira Duarte Mucheniski', 'S', 'rua sl', '255', 'bl03 apto24', 'centro', '86000000', 'Londrina', 'Paraná');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES('Diego Mucheniski', 'S', 'rua sl', '255', 'bl03 apto24', 'centro', '86000000', 'Londrina', 'Paraná');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES('Miguel Duarte Mucheniski', 'S', 'rua sl', '255', 'bl03 apto24', 'centro', '86000000', 'Londrina', 'Paraná');
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES('Livia Duarte Mucheniski', 'S', 'rua sl', '255', 'bl03 apto24', 'centro', '86000000', 'Londrina', 'Paraná');
INSERT INTO pessoa (nome, ativo)
VALUES('Bruna Ferreira Duarte Mucheniski', 'S');