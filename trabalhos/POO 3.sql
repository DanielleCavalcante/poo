CREATE TABLE tbHOSPEDE
(
    CPF_HOSP VARCHAR2(14) CONSTRAINT PK_TBHOSPEDE PRIMARY KEY,
    NOME_HOSP VARCHAR2(200) NOT NULL,
    ENDERECO_HOSP VARCHAR2(100),
    TELEFONE_HOSP VARCHAR2(50) NOT NULL,
    TAXA_DESCONTO NUMBER(6,2)
);

CREATE TABLE tbRECEPCIONISTA
(
    REGFUNC_RECEP VARCHAR2(20) CONSTRAINT PK_TBRECEPCIONISTA PRIMARY KEY,
    NOME_RECEP VARCHAR2(200) NOT NULL,
    ENDERECO_RECEP VARCHAR2(100),
    TELEFONE_RECEP VARCHAR2(100),
    TURNO_RECEP CHAR(1) NOT NULL
);

CREATE TABLE tbQUARTO
(
    NUM_QUARTO INT CONSTRAINT PK_TBQUARTO PRIMARY KEY,
    VALORDIARIA_QUARTO NUMBER(6,2) NOT NULL,
    TIPO_QUARTO VARCHAR2(10) NOT NULL,
    TOTAL_FATURADO NUMBER(6,2),
    STATUS INT
);

CREATE TABLE tbSERVICOQUARTO
(
    CODIGO_SERVICO INT CONSTRAINT PK_TBSERVICOQUARTO PRIMARY KEY,
    DESCRICAO_SERVICO VARCHAR2(100) NOT NULL,
    VALOR_SERVICO NUMBER(6,2) NOT NULL
);