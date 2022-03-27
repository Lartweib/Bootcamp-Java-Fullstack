# Ejercicio sobre GIT

 1. Crear un directorio local desde Git Bash con el comando mkdir  

 2. Crear un archivo .md para registrar los pasos a seguir en el proceso de subir/bajar archivos entre un repositorio local y remoto  

 3. Inicializar Git con el comando git init dentro de la carpeta previamente creada, añadir el documento .md con el comando git add . y hacer un commit con el comando git commit -m "mensaje"

 4. Crear un repositorio remoro en GitHub, y asociarlo al repositorio local con los comandos: git remote add origin https://github.com/hachi22/repo01.git, git branch -M main y git push -u origin main (Asociar el repositorio local con el online, crear la rama main y subir la carpeta a la rama main respectivamente)

## Comandos Git  
---

- Git init (inicializar git en la carpeta donde estás creando el repositorio local)
---  
- Git add . (Añadir todos los ficheros al repositorio (stagging))
---
- Git commit -m " " (Hacer un snapshot de los documentos dentro del repositorio local)

---
- Git remote add origin 'url' (Asociar el repositorio local con el online)
---
- Git branch -M main (Crear la rama main dentro del repositorio)
---
- Git push -u origin main (Pasar los archivos a los que se ha hecho commit a la rama nombrada del repositorio remoto, en este caso la main)
