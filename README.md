# 🛠️ Ferretería
> Sistema de Gestión de Inventario y Ventas

Aplicación web desarrollada con Spring Boot 3 para la gestión integral de una ferretería.
El sistema permite administrar productos, inventario, usuarios y operaciones básicas del negocio, utilizando Spring Data JPA, MySQL y Spring Security.

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3.5
- Spring Boot DevTools
- Spring Data JPA (Hibernate)
- Spring Security
- MySQL Connector/J
- Lombok
- Spring Web
- Maven
- HTML / CSS / Bootstrap

## 📌 Funcionalidades principales
>📦 Gestión de productos
- Listar productos
- Registrar nuevos productos
- Actualizar información de productos
- Eliminar productos
- Buscar productos por nombre

## 📊 Control de inventario
- Visualización de stock disponible
- Gestión de precios
- Control de existencias en tiempo real

## 🔐 Seguridad
- Implementación de Spring Security
- Preparado para autenticación y autorización de usuarios
- Protección de rutas del sistema

## 🧩 Módulos del sistema
- Productos
- Proveedores
- Ventas
- Usuarios
- Almacén
- Reportes

## 🖥️ Interfaz de usuario
- Interfaz web intuitiva
- Menú de navegación superior
- Formularios dinámicos para registro y edición
- Tabla de inventario con información clara (ID, nombre, precio, existencia)

## 🗄️ Base de datos
- MySQL
- Persistencia mediante Spring Data JPA
- Mapeo ORM con Hibernate
- Uso de Lombok para reducir código repetitivo (@Getter, @Setter, @NoArgsConstructor, etc.)

## ⚙️ Configuración del proyecto
1️⃣ Crear la base de datos
``` 
CREATE DATABASE ferreteria;
```
2️⃣ Configurar application.properties
``` 
spring.datasource.url=jdbc:mysql://localhost:3306/ferreteria
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
3️⃣ Ejecutar el proyecto
``` 
mvn spring-boot:run
```
4️⃣ Acceder a la aplicación
``` 
http://localhost:8081
```

## 📚 Aprendizajes
- Desarrollo de aplicaciones web con Spring Boot 3
- Implementación de operaciones CRUD con Spring Data JPA
- Integración con bases de datos MySQL
- Configuración básica de Spring Security
- Uso de arquitectura en capas
- Mejora de la mantenibilidad del código con Lombok

## 👤 Autor
> Marcelo Joel Rodríguez Cabrera

## 📖 Referencia / Inspiración
- Curso Spring Boot – Gestión de Ferretería
(Serie de videos)
### 📚 Créditos
Proyecto desarrollado siguiendo y adaptando el tutorial disponible en:
https://www.youtube.com/playlist?list=PL2Z95CSZ1N4EWw14HZ0NFD3woFcn6uiCm

El código fue modificado y personalizado con fines académicos.