USE [LIBRERIA]
GO

Create PROCEDURE GetAutores
AS
BEGIN
    SELECT idAutor, nombre, idPais, vivo, fechaNacimiento, primeraPublicacion, publicaciones, calificacion
    FROM Autores;
END;

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