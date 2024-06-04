# API REST - TURNOS BARBERIA

Esta API REST proporciona funcionalidades para la gestión de turnos de una barbería, permitiendo a los clientes reservar y cancelar turnos, así como a los barberos visualizar y gestionar los turnos asignados.

## Endpoints
### Clientes:
- **GET /api/clientes**: Obtiene todos los clientes.
- **GET /api/clientes/{id}**: Obtiene un cliente por su ID.
- **POST /api/clientes**: Crea un nuevo cliente.
- **DELETE /api/clientes/{id}**: Elimina un cliente por su ID.

### Barberos:
- **GET /api/barberos**: Obtiene todos los barberos.
- **GET /api/barberos/{id}**: Obtiene un barbero por su ID.
- **POST /api/barberos**: Crea un nuevo barbero.
- **DELETE /api/barberos/{id}**: Elimina un barbero por su ID.
  
### Turnos:
- **GET /api/turnos**: Obtiene todos los turnos.
- **GET /api/turnos/{id}**: Obtiene un turno por su ID.
- **POST /api/turnos**: Crea un nuevo turno.
- **DELETE /api/turnos/{id}**: Elimina un turno por su ID.

## Ejemplos

### Obtener todos los turnos

```
GET /api/turnos
```

Respuesta:

```json
[
    {
        "id": 1,
        "cliente": {
            "id": 1,
            "nombre": "Ruben",
            "apellido": "Tomes",
            "telefono": "1185953452"
        },
        "barbero": {
            "id": 1,
            "nombre": "Carlos"
        },
        "fecha": "2024-06-15",
        "hora": "09:00:00",
        "estado": "Pendiente"
    }
]
```

## Lenguajes utilizados

- Java 17
- MySQL 8
- Spring Boot
- Spring Data JPA
- Lombok
