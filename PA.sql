USE [LIBRERIA]
GO
Create PROCEDURE GetAutores
AS
BEGIN
    SELECT idAutor, nombre, idPais, vivo, fechaNacimiento, primeraPublicacion, publicaciones, calificacion
    FROM Autores;
END;