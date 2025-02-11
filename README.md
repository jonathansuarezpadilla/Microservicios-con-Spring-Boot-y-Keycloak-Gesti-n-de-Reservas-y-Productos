"# Microservicios-con-Spring-Boot-y-Keycloak-Gesti-n-de-Reservas-y-Productos" 



Descripción del Proyecto:
Este proyecto demuestra la implementación de una arquitectura de microservicios utilizando Spring Boot y Keycloak para manejar la autenticación y autorización. El enfoque principal es la gestión de reservas y productos, aplicando patrones de resiliencia como Circuit Breaker con Resilience4j. A continuación, se presentan los componentes clave del proyecto:

Config Server: Proporciona la configuración centralizada para todos los microservicios desde un repositorio de GitHub.

Product Stock Microservice: Gestiona el inventario de productos y se comunica con una base de datos para verificar la disponibilidad de los productos.

Booking Microservice: Maneja las reservas de productos, verificando primero la disponibilidad en el Stock Microservice antes de confirmar la reserva.

Product Microservice: Administra la información de productos, permitiendo operaciones como crear, actualizar y eliminar productos.

API Gateway: Utiliza Spring Cloud Gateway para enrutar las solicitudes entrantes a los microservicios adecuados y actúa como punto de entrada para todas las interacciones de los usuarios.

Auth Server (Keycloak): Proporciona autenticación y autorización basada en roles para asegurar el acceso a los microservicios.

API Consumer: Representa a los diferentes clientes que interactúan con los microservicios a través del API Gateway.

Características Adicionales:
Resilience4j Circuit Breaker: Implementación de Circuit Breaker para manejar fallos y latencia en las llamadas a los microservicios, mejorando la resiliencia del sistema.

Submódulos de Git: Organización de los repositorios de cada microservicio y componentes relacionados utilizando submódulos de Git para una mejor gestión de dependencias y modularidad.


