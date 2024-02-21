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

CREATE TABLE tbREGISTRO
(
  CODIGO INT CONSTRAINT PK_tbREGISTRO PRIMARY KEY,
  REG_FUNC_RECEPCIONISTA VARCHAR2(20) NOT NULL,
  constraint FK_REG_FUNC_RECEPCIONISTA
             foreign key(REG_FUNC_RECEPCIONISTA)
             references tbRECEPCIONISTA(REGFUNC_RECEP),
  CPF_HOSPEDE VARCHAR2(14) not null,
  constraint FK_CPF_HOSPEDE
             foreign key(CPF_HOSPEDE)
             references tbHOSPEDE(CPF_HOSP),
  NUMERO_QUARTO INT NOT NULL,
  constraint FK_NUMERO_QUARTO
             foreign key(NUMERO_QUARTO)
             references tbQUARTO(NUM_QUARTO),
  DATA_ENTRADA DATE NOT NULL,
  DATA_SAIDA DATE,
  VALOR_HOSP NUMBER(9,3)
);

CREATE TABLE tbLISTA_SERVICO
(
  CODIGO_REGISTRO INT NOT NULL,
  constraint FK_CODIGO_REGISTRO
             foreign key(CODIGO_REGISTRO)
             references tbREGISTRO(CODIGO),
  CODIGO_SERV_QUARTO INT NOT NULL,
  constraint FK_CODIGO_SERV_QUARTO
             foreign key(CODIGO_SERV_QUARTO)
             references tbSERVICOQUARTO(CODIGO_SERVICO),
  SEQUENCIA INT
);