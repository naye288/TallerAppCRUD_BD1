Configuración de Conexión a la Base de Datos
Ubicación: La conexión se configura en SQLConnection.java en:


Copiar código
src/com/mycompany/TallerAppCRUD_BD1/SQLConnection.java
Parámetros a modificar en la variable connectionString:

Copiar código
private static final String connectionString = 
    "jdbc:sqlserver://<HOST>\\<INSTANCE>:<PORT>;"
    + "database=<DATABASE_NAME>;"
    + "user=<USER>;"
    + "password=<PASSWORD>;"
    + "encrypt=true;"
    + "trustServerCertificate=true;"
    + "loginTimeout=30;";
<HOST>: Nombre del servidor o localhost si es local.
<INSTANCE>: Nombre de la instancia (e.g., SQLEXPRESS).
<PORT>: Puerto de SQL Server (por defecto 1433).
<DATABASE_NAME>: Nombre de tu base de datos.
<USER> y <PASSWORD>: Credenciales de acceso.
