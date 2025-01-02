# Tienda: Aplicación de Gestión de Productos

## Descripción
Esta aplicación es una herramienta de línea de comandos desarrollada en Java que permite gestionar una base de datos de productos. Proporciona funcionalidades para agregar, listar, actualizar y eliminar productos utilizando JDBC para interactuar con una base de datos MySQL.

---

## Características principales
- **Agregar productos:** Inserta productos con nombre, precio y cantidad en la base de datos.
- **Listar productos:** Muestra todos los productos almacenados en la base de datos.
- **Actualizar precios:** Permite modificar el precio de productos existentes.
- **Eliminar productos:** Borra productos de la base de datos utilizando su nombre.

---

## Requisitos previos

1. **Java Development Kit (JDK):**
    - JDK 11 o superior instalado.
    - Verifica tu versión con:
      ```bash
      java -version
      ```

2. **Base de datos MySQL:**
    - Instala y configura MySQL.
    - Crea una base de datos llamada `Tienda`:
      ```sql
      CREATE DATABASE Tienda;
      ```
    - Crea la tabla `Productos` dentro de la base de datos:
      ```sql
      CREATE TABLE Productos (
          id INT AUTO_INCREMENT PRIMARY KEY,
          nombre VARCHAR(255) NOT NULL,
          precio FLOAT NOT NULL,
          cantidad INT DEFAULT 0
      );
      ```

3. **Driver JDBC para MySQL:**
    - Si usas Maven, incluye esta dependencia en el archivo `pom.xml`:
      ```xml
      <dependency>
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
          <version>8.0.34</version>
      </dependency>
      ```

---

## Configuración del proyecto

1. **Clona o descarga el proyecto:**
   ```bash
   git clone https://github.com/cesarmilan16/TiendaJavaDAO.git
   cd TiendaJavaDAO

---

# Configuración de la Base de Datos y Ejecución del Proyecto

## Configura las credenciales de la base de datos

1. **Abre la clase `DatabaseConnection.java`.**
2. Modifica las credenciales para que coincidan con tu configuración de MySQL:
   ```java
   private static final String USER = "root"; // Cambia "root" por tu usuario
   private static final String PASSWORD = "1234"; // Cambia "1234" por tu contraseña

---

## Carga las dependencias (si usas Maven)

1. En IntelliJ IDEA, haz clic derecho en el archivo `pom.xml`.
2. Selecciona Reload Maven Project.

---

# Ejecución de la Aplicación

## 1. Ejecuta la clase principal

1. Abre `Main.java` en IntelliJ IDEA.
2. Haz clic derecho y selecciona **Run 'Main.main()'**.

## 2. Resultados esperados

- Inserción de productos iniciales.
- Listado de productos.
- Actualización de precios de productos.
- Eliminación de productos.

---

## Estructura del proyecto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── tienda/
│   │           ├── DatabaseConnection.java
│   │           ├── ProductoDAO.java
│   │           └── Main.java
│   └── resources/
└── pom.xml
```
---

## Consejos y mejores prácticas

### Seguridad
- Evita almacenar credenciales directamente en el código.
- Usa variables de entorno o un archivo de configuración.

### Validación
- Asegúrate de validar los datos antes de insertarlos en la base de datos (por ejemplo, nombres vacíos o precios negativos).

### Manejo de errores
- Implementa un manejo más robusto de excepciones para identificar y registrar problemas.

### Extensiones
- Considera agregar funcionalidades como la búsqueda de productos por nombre o el manejo de inventarios.

---

## Contacto
Para cualquier duda o consulta, contacta a **cesarmilan16**.
