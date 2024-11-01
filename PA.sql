USE [LIBRERIA]
GO

--Read 
Create PROCEDURE GetAutores
AS
BEGIN
    SELECT idAutor, nombre, idPais, vivo, fechaNacimiento, primeraPublicacion, publicaciones, calificacion
    FROM Autores;
END;

--Insert
Create PROCEDURE InsertarAutor
    @nombre NVARCHAR(50),
    @pais NVARCHAR(2),
	@vivo nvarchar(2),
    @fechaNacimiento DATE,
    @fechaPrimeraPublicacion DATE,
	@publicaciones INT,
	@cali int,
    @id INT OUTPUT
AS
BEGIN
    INSERT INTO Autores (nombre, pais, vivo, fechaNacimiento, primeraPublicacion, publicaciones, calificacion)
    VALUES (@nombre, @pais, @vivo, @fechaNacimiento, @fechaPrimeraPublicacion, @publicaciones, @cali);

    SET @id = SCOPE_IDENTITY();
END;

--En caso de que no este el pais registrado en la tabla
Create PROCEDURE InsertPais
	@nombre nvarchar(50), --pais
	@codigo nvarchar(2) 
AS
BEGIN
    --declarar variable para ver si existe la abreviatura del pais recibido
	declare @IdPExists as int;
	set @IdPExists = (select COUNT(*) -- @IdPExists > 0 si existe
					 from Paises
					 where lower(Paises.nombre) = lower(TRIM(@nombre)))

	IF ( @IdPExists = 0) --no existe
		BEGIN
			INSERT INTO Pais (code, nombre, continente)
			VALUES (@codigo, @nombre, 'null');
		END
END;

Create PROCEDURE deleteAutores
	@id int
AS
BEGIN 
	Delete from Autores
	where ID = @id
END
GO