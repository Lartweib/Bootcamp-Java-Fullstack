# Ejercicio sobre GIT

 1. Crear un directorio local desde Git Bash con el comando mkdir

 2. Crear un documento readme para registrar los pasos a seguir  

 3. Agregar el fichero con el comando ("git add .") y posteriormente realizamos un commit ("git commit -m 'carga de archivos'")

 4. Crear un repositorio remoto en GitHub, y lo asociamos al repositorio local ("git remote add origin https://github.com/Lartweib/Bootcamp-Java-Fullstack.git") y subimos los cambios con un push ("git push -u origin master")
 
 5. Añadimos el documento markdown modificado y los subimos nuevamente ("git add ."),("git commit -m 'actualizacion markdown'"),("git push -u origin master")

 6. 

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
