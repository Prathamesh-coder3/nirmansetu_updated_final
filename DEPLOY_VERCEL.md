# Vercel Deployment — Single Repo / Single Container

This version is intentionally **not** a Vercel Services multi-service project. It is a single HTTP container containing both the React frontend and Spring Boot backend.

## GitHub

Put the contents of this directory directly at the root of one GitHub repository:

```text
nirmaansetu/
├── vercel.json
├── Dockerfile.vercel
├── pom.xml
├── frontend/
└── backend/
```

Do not upload the ZIP itself and do not create an extra `NirmaanSetu_.../` folder inside the repository.

## Vercel

1. Import the one GitHub repository.
2. Root Directory: `./`
3. Framework Preset: `Container` (or let Vercel auto-detect `Dockerfile.vercel`).
4. Deploy.

Vercel detects the root `Dockerfile.vercel`, builds the image, stores it in Vercel Container Registry, and serves it as a Vercel Function. The container exposes HTTP traffic on `$PORT`.

## Runtime routing

```text
https://your-domain.vercel.app/
    -> React frontend (embedded in Spring Boot)

https://your-domain.vercel.app/api/*
    -> Spring Boot API
```

Because the browser and API are on the same origin, the frontend keeps using relative `/api/...` URLs.

## Important

The Vercel runtime is stateless. The default application profile currently uses an in-memory H2 database. Use a managed PostgreSQL database and environment variables for persistent production data.
