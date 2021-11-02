# OpusList
## Opus List Requirements:
Escribir aplicacion con GUI para gestionar las obras de arte.
- La información estará en el fichero:
C:\Users\xxx\AppData\Local\OpusList\data\obres.json
- Las imagenes en C:\Users\xxx\AppData\Local\OpusList\images


## Funcionalidades:
- (C) Insertar nuevas obras
- (R) Visualizar en una lista todas las obras.
- (U) Actualizar la información de una obra.
- (D) Eliminar obras

En el form principal se visualizara la lista de obras.
Se debe incluir un menu con las opciones Insert new opus, Update opus, Delete Opus.
- Insert: Aparecerá un modal dialog con los campos necesarios para insertar una nueva obra.
- Update: Aparecerá un modal dialog con un textfield "Num. Registre". Pedirá la referencia (registre) de una obra y, si existe, mostrará los campos editables.
- Delete: Aparecerá un modal dialog con un JComboBox con todas las obras y un botón. Si se selecciona una obra y se pulsa el botón la obra se eliminará.

- En la ventana principal, si se hace doble click en un elemento de la lista de obras se mostrará el dialog update con el campo "Num. Registre" ya inicializado al valor correspondiente.

POJO
Serializar & Deserializar JSON
