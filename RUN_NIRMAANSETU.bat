@echo off
setlocal
echo Starting NirmaanSetu backend on http://localhost:8080 ...
call mvn -pl backend -am spring-boot:run
