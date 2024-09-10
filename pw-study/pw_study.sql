create database pw3_study;
use pw3_study;

CREATE TABLE TBL_DISCIPLINA(
    ID_DISCIPLINA BIGINT primary key identity ,
    TX_NOME VARCHAR(60) NOT NULL
);


CREATE TABLE TBL_MONITOR(
	ID_MONITOR BIGINT PRIMARY KEY IDENTITY,
	TX_NOME VARCHAR(60) NOT NULL,
	TX_FOTO VARCHAR(255) NOT NULL,
	TX_WHATSAPP VARCHAR(11) NOT NULL,
	TX_EMAIL VARCHAR(40) NOT NULL,
	TX_CONTEUDO VARCHAR(1000) NOT NULL,
	ID_DISCIPLINA BIGINT NOT NULL,
	FOREIGN KEY (ID_DISCIPLINA) REFERENCES TBL_DISCIPLINA (ID_DISCIPLINA)
);

CREATE TABLE TBL_DISPONIBILIDADE(
    ID_DISPONIBILIDADE BIGINT  PRIMARY KEY IDENTITY,
    TX_DIA_SEMANA VARCHAR(30) NOT NULL,
    DT_DAS DATETIME NOT NULL,
    DT_ATE DATETIME NOT NULL,
	
);

CREATE TABLE TBL_REL_MONITOR_DISPONIBILIDADE(
	ID_MONITOR BIGINT NOT NULL,
	ID_DISPONIBILIDADE BIGINT NOT NULL,
	FOREIGN KEY (ID_MONITOR) REFERENCES TBL_MONITOR (ID_MONITOR),
	FOREIGN KEY (ID_DISPONIBILIDADE) REFERENCES TBL_DISPONIBILIDADE (ID_DISPONIBILIDADE)
);

INSERT INTO TBL_DISCIPLINA VALUES('Programação Web');
INSERT INTO TBL_DISCIPLINA VALUES('Banco de dados');
INSERT INTO TBL_DISCIPLINA VALUES('Matemática');

select * from TBL_DISCIPLINA

select d1_0.ID_DISCIPLINA,d1_0.TX_NOME from TBL_DISCIPLINA d1_0