# Job Application Tracker (Spring Boot)

A simple Spring Boot backend system for managing job applications and tracking application status.

## Features

- Create a new job application
- View all applications
- Update application status
- Delete an application

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- REST API
- Maven

## API Endpoints

### Get all applications
GET /applications

### Get application by id
GET /applications/{id}

### Create application
POST /applications

### Update application
PUT /applications/{id}

### Delete application
DELETE /applications/{id}

## Example Request

```json
{
  "company": "Tencent",
  "position": "Java Backend Intern",
  "status": "Applied",
  "appliedDate": "2026-03-10"
}
