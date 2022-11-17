/* ---------------------------------------------------- */
/*  Generated by Enterprise Architect Version 15.0 		*/
/*  Created On : 15-nov.-2022 17:06:33 				*/
/*  DBMS       : SQL Server 2012 						*/
/* ---------------------------------------------------- */

/* Drop Foreign Key Constraints */
Create database BDpala
GO

use BDpala
GO


IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_AsignaturaTarea_Tarea]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [AsignaturaTarea] DROP CONSTRAINT [FK_AsignaturaTarea_Tarea]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_AsignaturaTarea_Asignatura]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [AsignaturaTarea] DROP CONSTRAINT [FK_AsignaturaTarea_Asignatura]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_Estudiante_Tablero]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [Estudiante] DROP CONSTRAINT [FK_Estudiante_Tablero]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_Formulario_Tablero]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [Formulario] DROP CONSTRAINT [FK_Formulario_Tablero]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_Tarea_Tablero]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [Tarea] DROP CONSTRAINT [FK_Tarea_Tablero]
GO

/* Drop Tables */

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[Asignatura]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [Asignatura]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[AsignaturaTarea]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [AsignaturaTarea]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[Estudiante]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [Estudiante]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[Formulario]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [Formulario]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[Tablero]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [Tablero]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[Tarea]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [Tarea]
GO

/* Create Tables */

CREATE TABLE [Asignatura]
(
	[AsignaturaID] int NOT NULL,
	[Nombre] nvarchar(50) NULL
)
GO

CREATE TABLE [AsignaturaTarea]
(
	[TareaID] int NULL IDENTITY (1, 1),
	[AsignaturaID] int NULL IDENTITY (1, 1)
)
GO

CREATE TABLE [Estudiante]
(
	[EstudianteID] int NOT NULL IDENTITY (1, 1),
	[TableroID] int NOT NULL IDENTITY (1, 1),
	[Estado] nvarchar(50) NULL,
	[Nombre] nvarchar(50) NULL,
	[Apellidos] nvarchar NULL,
	[Correo] nvarchar NULL,
	[Nomusuario] nvarchar NULL,
	[Contraseña] nvarchar(50) NULL
)
GO

CREATE TABLE [Formulario]
(
	[FormularioID] int NOT NULL IDENTITY (1, 1),
	[TableroID] int NOT NULL IDENTITY (1, 1)
)
GO

CREATE TABLE [Tablero]
(
	[TableroID] int NOT NULL IDENTITY (1, 1)
)
GO

CREATE TABLE [Tarea]
(
	[TareaID] int NOT NULL IDENTITY (1, 1),
	[TableroID] int NULL IDENTITY (1, 1),
	[Estado] varchar NULL,
	[Descripcion] nvarchar(200) NULL,
	[Vencimiento] date NULL,
	[T_restante] nvarchar NULL
)
GO

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE [Asignatura] 
 ADD CONSTRAINT [PK_Asignatura]
	PRIMARY KEY CLUSTERED ([AsignaturaID] ASC)
GO

ALTER TABLE [Estudiante] 
 ADD CONSTRAINT [PK_Estudiante]
	PRIMARY KEY CLUSTERED ([EstudianteID] ASC)
GO

ALTER TABLE [Formulario] 
 ADD CONSTRAINT [PK_Formulario]
	PRIMARY KEY CLUSTERED ([FormularioID] ASC)
GO

ALTER TABLE [Tablero] 
 ADD CONSTRAINT [PK_Tablero]
	PRIMARY KEY CLUSTERED ([TableroID] ASC)
GO

ALTER TABLE [Tarea] 
 ADD CONSTRAINT [PK_Tarea]
	PRIMARY KEY CLUSTERED ([TareaID] ASC)
GO

/* Create Foreign Key Constraints */

ALTER TABLE [AsignaturaTarea] ADD CONSTRAINT [FK_AsignaturaTarea_Tarea]
	FOREIGN KEY ([TareaID]) REFERENCES [Tarea] ([TareaID]) ON DELETE Cascade ON UPDATE Cascade
GO

ALTER TABLE [AsignaturaTarea] ADD CONSTRAINT [FK_AsignaturaTarea_Asignatura]
	FOREIGN KEY ([AsignaturaID]) REFERENCES [Asignatura] ([AsignaturaID]) ON DELETE Cascade ON UPDATE Cascade
GO

ALTER TABLE [Estudiante] ADD CONSTRAINT [FK_Estudiante_Tablero]
	FOREIGN KEY ([TableroID]) REFERENCES [Tablero] ([TableroID]) ON DELETE No Action ON UPDATE No Action
GO

ALTER TABLE [Formulario] ADD CONSTRAINT [FK_Formulario_Tablero]
	FOREIGN KEY ([TableroID]) REFERENCES [Tablero] ([TableroID]) ON DELETE No Action ON UPDATE No Action
GO

ALTER TABLE [Tarea] ADD CONSTRAINT [FK_Tarea_Tablero]
	FOREIGN KEY ([TableroID]) REFERENCES [Tablero] ([TableroID]) ON DELETE No Action ON UPDATE No Action
GO
