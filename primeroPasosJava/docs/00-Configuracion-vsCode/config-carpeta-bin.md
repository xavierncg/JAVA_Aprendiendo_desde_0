Cómo configurarlo en VS Code

atajo:

Abre la configuración con Ctrl + Shift + P.

Escribe Preferences: Open Workspace Settings (JSON) y selecciónala.

Dentro del archivo .vscode/settings.json, agrega esta configuración:

{
"java.project.outputPath": "bin"
}

y si quieres ocultarlo en la carpeta bin el .class

{
"files.exclude": {
"\*_/_.class": true
}
}

Se recomienda usar el primero en
