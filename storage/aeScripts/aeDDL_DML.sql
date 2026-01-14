-- © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
-- database: storage\Databases\antCiberDron.sqlite
DROP TABLE IF EXISTS aeAntCiberDron;
DROP TABLE IF EXISTS aeHormiga;
DROP TABLE IF EXISTS aeSexo;
DROP TABLE IF EXISTS aeEstado;
DROP TABLE IF EXISTS aeHormigaTipo;
DROP TABLE IF EXISTS aeAlimentoTipo; 
 
CREATE TABLE aeAlimentoTipo(
     IdaeAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT
    ,aeNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,aeDescripcion    VARCHAR(100) NULL
    ,aeEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,aeFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,aeFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE aeHormigaTipo (
     IdaeHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT
    ,aeNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,aeDescripcion    VARCHAR(100) NULL
    ,aeEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,aeFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,aeFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE aeEstado (
     IdaeEstado       INTEGER PRIMARY KEY AUTOINCREMENT
    ,aeNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,aeDescripcion    VARCHAR(100) NULL
    ,aeEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,aeFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,aeFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE aeSexo (
     IdaeSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,aeNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,aeDescripcion    VARCHAR(100) NULL
    ,aeEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,aeFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,aeFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE aeHormiga (
     IdaeHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdaeHormigaTipo  INTEGER NOT NULL REFERENCES HormigaTipo (IdaeHormigaTipo)
    ,IdaeSexo         INTEGER NOT NULL REFERENCES Sexo        (IdaeSexo)
    ,IdaeEstado       INTEGER NOT NULL REFERENCES Estado      (IdaeEstado)
    ,aeNombre         VARCHAR(20) NOT NULL  UNIQUE
    ,aeDescripcion    VARCHAR(20) NULL

    ,aeEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,aeFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,aeFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE aeAntCiberDron (
     IdaeAntCiberDron     INTEGER PRIMARY KEY AUTOINCREMENT
    ,aeSerie              VARCHAR(10) NOT NULL  UNIQUE
    ,aeEstado             VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,aeFechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,aeFechaModifica      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

-- Insert initial data into Sexo table
INSERT INTO aeSexo 
 (aeNombre, aeDescripcion)  VALUES 
 ('Macho'  ,' masculino')
,('Hembra' ,' femenina') 
,('Hibrido',' Hibrido')
,('Asexual',' Asexual');

INSERT INTO aeAlimentoTipo
 (aeNombre, aeDescripcion)  VALUES
 ('Carnivoro'   ,'Azucar')
,('Herbívoro' ,'Proteina')
,('Omnívoro'  ,'Lipidico')
,('Nectarivoro','Vitaminico');

INSERT INTO aeHormigaTipo
 (aeNombre, aeDescripcion)  VALUES 
 ('Larva'     ,' en etapa de larva')
,('Soldado'   ,' encargada de la defensa')
,('Rastreadora',' encargada de buscar alimento')
,('Reina'     ,' encargada de la reproducción')
,('Zángano'   ,' macho para reproducción');

INSERT INTO aeEstado
 (aeNombre, aeDescripcion)  VALUES 
 ('Vive' ,' está viva'),
 ('Muere',' ha muerto'),
 ('Finge',' su muerte');

INSERT INTO aeAntCiberDron
(aeSerie)     VALUES 
('S001'),
('S002'),
('S003'),
('S004');
    
INSERT INTO aeHormiga
(IdaeHormigaTipo, IdaeSexo, IdaeEstado, aeNombre, aeDescripcion) values 
(1, 2, 1, 'Hormiga1', 'Primera hormiga'),
(2, 1, 1, 'Hormiga2', 'Segunda hormiga'),
(3, 2, 1, 'Hormiga3', 'Tercera hormiga'),
(4, 1, 1, 'Hormiga4', 'Cuarta hormiga');

select * from aeSexo;
select * from aeHormigaTipo;
select * from aeEstado;
select * from aeAlimentoTipo;
SELECT * FROM aeHormiga;


DROP VIEW IF EXISTS aeVwHormiga;

CREATE VIEW aeVwHormiga AS
SELECT 
     H.IdaeHormiga
    ,HT.aeNombre AS aeTipo
    ,S.aeNombre  AS aeSexo
    ,E.aeNombre  AS aeEstadoHormiga
    ,H.aeNombre  AS aeNombre
    ,H.aeDescripcion
    ,H.aeEstado
    ,H.aeFechaCreacion
    ,H.aeFechaModifica
FROM aeHormiga H
JOIN aeHormigaTipo    HT ON H.IdaeHormigaTipo = HT.IdaeHormigaTipo
JOIN aeSexo           S  ON H.IdaeSexo        = S.IdaeSexo
JOIN aeEstado         E  ON H.IdaeEstado      = E.IdaeEstado
WHERE H.aeEstado = 'A';

SELECT * FROM aeVwHormiga;

SELECT IdaeHormiga
,aeTipo
,aeSexo
,aeEstadoHormiga
,aeNombre
,aeDescripcion
,aeEstado
,aeFechaCreacion
,aeFechaModifica  
FROM aeVwHormiga;

SELECT * FROM aeHormiga;
UPDATE aeEstado   SET aeNombre = 'VIVA'
WHERE IdaeEstado = 1;

UPDATE aeEstado   SET aeNombre = 'MUERTA'
WHERE IdaeEstado = 2;

UPDATE aeEstado   SET aeEstado = 'X'
WHERE IdaeEstado = 3;

select * from aeEstado;