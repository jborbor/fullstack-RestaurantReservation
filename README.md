# Restaurant Reservation System - Full Stack Project

Este es un sistema de reservas de restaurantes desarrollado con una arquitectura Hexagonal para el Backend; usando **Spring Boot**, **Angular**, **MySQL** y **Docker**.

## 📦 Estructura del Proyecto

```
fullstack-HotelReservation/
├── backend/         # Backend - API restaurants
├── database/
│   └── sql/         # Scripts y stored procedures
├── frontend/        # Interfaz de usuario (Angular)
├── docker-compose.yml
```

## 🚀 Tecnologías Usadas

- Spring Boot 3 (Java 21)
- Angular 20
- MySQL 8
- Docker + Docker Compose

## 🐳 Cómo levantar el proyecto

1. Clona el repositorio:

```bash
git clone https://github.com/jborbor/fullstack-HotelReservation.git
cd fullstack-HotelReservation
```

2. Levanta los contenedores:

```bash
docker compose up --build
```

Esto levantará:

- La base de datos MySQL
- Ejecutara automaticamente los scripts de creacion de BD, stored procedures, etc:
- El Backend de Spring Boot
- El frontend Angular (vía NGINX)

## 📬 Contacto

Proyecto desarrollado por [Jonathan Borbor].
