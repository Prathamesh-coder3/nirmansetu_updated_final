# NirmaanSetu — Single Repository / Single Vercel Container

This repository is prepared for a **single GitHub repository + single Vercel project** deployment.

## Structure

```text
nirmaansetu/
├── vercel.json
├── Dockerfile.vercel
├── pom.xml
├── frontend/
└── backend/
```

The root `Dockerfile.vercel` builds the Vite frontend, copies `frontend/dist` into Spring Boot static resources, packages the Java application, and serves both through the same HTTP process.

## Vercel

Use the repository root as the Root Directory (`./`). Select the **Container** framework/preset if Vercel asks.

No separate frontend deployment and no separate backend deployment are required for this architecture.

## Local

Frontend and backend can still be developed independently using their normal local commands.
