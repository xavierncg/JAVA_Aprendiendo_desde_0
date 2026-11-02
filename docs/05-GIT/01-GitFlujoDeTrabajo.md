4. Resumen de comandos
Acción	Comando
Revisar cambios	git status
Preparar cambios	git add .
Registrar cambios	git commit -m "Avances de Java"
Subir avances de desarrollo	git push origin develop
Cambiar a la rama estable	git switch main
Actualizar main desde GitHub	git pull origin main
Integrar develop en main	git merge develop
Publicar la versión estable	git push origin main
Volver al desarrollo	git switch develop

Regla para tu proyecto Java:
- main: versión estable del proyecto.
- develop: rama de trabajo diario.
- git switch: cambiar de rama.
- git merge: integrar cambios entre ramas.
- git push: subir cambios a GitHub.
- git pull: traer e integrar cambios desde GitHub.
Importante: no necesitas actualizar main después de cada ejercicio. Hazlo cuando quieras integrar un conjunto de avances como versión estable. Si Git informa de conflictos o de ramas divergentes, detente y revisa el mensaje antes de ejecutar otros comandos.