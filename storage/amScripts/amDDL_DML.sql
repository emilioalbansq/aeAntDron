-- © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
-- database: storage\Databases\antCiberDron.sqlite
DROP TABLE IF EXISTS amAntCiberDron;
DROP TABLE IF EXISTS amHormiga;
DROP TABLE IF EXISTS amSexo;
DROP TABLE IF EXISTS amEstado;
DROP TABLE IF EXISTS amHormigaTipo;
DROP TABLE IF EXISTS amAlimentoTipo; 
 
CREATE TABLE amAlimentoTipo(
     IdamAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT
    ,amNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,amDescripcion    VARCHAR(100) NULL
    ,amEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,amFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,amFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE amHormigaTipo (
     IdamHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT
    ,amNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,amDescripcion    VARCHAR(100) NULL
    ,amEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,amFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,amFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE amEstado (
     IdamEstado       INTEGER PRIMARY KEY AUTOINCREMENT
    ,amNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,amDescripcion    VARCHAR(100) NULL
    ,amEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,amFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,amFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE amSexo (
     IdamSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,amNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,amDescripcion    VARCHAR(100) NULL
    ,amEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,amFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,amFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE amHormiga (
     IdamHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdamHormigaTipo  INTEGER NOT NULL REFERENCES HormigaTipo (IdamHormigaTipo)
    ,IdamSexo         INTEGER NOT NULL REFERENCES Sexo        (IdamSexo)
    ,IdamEstado       INTEGER NOT NULL REFERENCES Estado      (IdamEstado)
    ,amNombre         VARCHAR(20) NOT NULL  UNIQUE
    ,amDescripcion    VARCHAR(20) NULL

    ,amEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,amFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,amFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE amAntCiberDron (
     IdamAntCiberDron     INTEGER PRIMARY KEY AUTOINCREMENT
    ,amSerie              VARCHAR(10) NOT NULL  UNIQUE
    ,amEstado             VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,amFechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,amFechaModifica      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

-- Insert initial data into Sexo table
INSERT INTO amSexo 
 (amNombre, amDescripcion)  VALUES 
 ('Macho'  ,' masculino')
,('Hembra' ,' femenina') 
,('Asexual',' Asexual');

INSERT INTO amAlimentoTipo
 (amNombre, amDescripcion)  VALUES
 ('Carnivoro'   ,'Azucar')
,('Herbívoro' ,'Proteina')
,('Omnívoro'  ,'Lipidico')
,('Nectarivoro','Vitaminico');

INSERT INTO amHormigaTipo
 (amNombre, amDescripcion)  VALUES 
 ('Larva'     ,' en etapa de larva')
,('Soldado'   ,' encargada de la defensa')
,('Rastreadora',' encargada de buscar alimento')
,('Reina'     ,' encargada de la reproducción')
,('Zángano'   ,' macho para reproducción');

INSERT INTO amEstado
 (amNombre, amDescripcion)  VALUES 
 ('Vive' ,' está viva'),
 ('Muere',' ha muerto'),
 ('Finge',' su muerte');

INSERT INTO amAntCiberDron
(amSerie)     VALUES 
('S001'),
('S002'),
('S003'),
('S004');
    
INSERT INTO amHormiga
(IdamHormigaTipo, IdamSexo, IdamEstado, amNombre, amDescripcion) values 
(1, 2, 1, 'Hormiga1', 'Primera hormiga'),
(2, 1, 1, 'Hormiga2', 'Segunda hormiga'),
(3, 2, 1, 'Hormiga3', 'Tercera hormiga'),
(4, 1, 1, 'Hormiga4', 'Cuarta hormiga');

select * from amSexo;
select * from amHormigaTipo;
select * from amEstado;
select * from amAlimentoTipo;
SELECT * FROM amHormiga;


DROP VIEW IF EXISTS amVwHormiga;

CREATE VIEW amVwHormiga AS
SELECT 
     H.IdamHormiga
    ,HT.amNombre AS amTipo
    ,S.amNombre  AS amSexo
    ,E.amNombre  AS amEstadoHormiga
    ,H.amNombre  AS amNombre
    ,H.amDescripcion
    ,H.amEstado
    ,H.amFechaCreacion
    ,H.amFechaModifica
FROM amHormiga H
JOIN amHormigaTipo    HT ON H.IdamHormigaTipo = HT.IdamHormigaTipo
JOIN amSexo           S  ON H.IdamSexo        = S.IdamSexo
JOIN amEstado         E  ON H.IdamEstado      = E.IdamEstado
WHERE H.amEstado = 'A';

SELECT * FROM amVwHormiga;

SELECT IdamHormiga
,amTipo
,amSexo
,amEstadoHormiga
,amNombre
,amDescripcion
,amEstado
,amFechaCreacion
,amFechaModifica  
FROM amVwHormiga;

SELECT * FROM amHormiga;
UPDATE amEstado   SET amNombre = 'VIVA'
WHERE IdamEstado = 1;

UPDATE amEstado   SET amNombre = 'MUERTA'
WHERE IdamEstado = 2;

UPDATE amEstado   SET amEstado = 'X'
WHERE IdamEstado = 3;

select * from amEstado;