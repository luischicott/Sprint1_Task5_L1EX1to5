El programa llama en el main a 5 métodos que representan los 5 ejercicios respectivamente.
Método "directory.sortFiles(String directoryPath)": Ordena alfabéticamente los archivos dentro del directorio de la ruta relativa "directoryPath".
Método "directory.listFiles(File directory, int level)": Lista de manera recursiva el contenido del directorio y sus subdirectorios. La ruta del directorio se especifica mediante el objeto File y el nivel indica la profundidad del directorio en la estructura de árbol.
Método "directory.fileWriter(File directory, int level)": Guarda el resultado de listar los archivos en un archivo de texto. Los parámetros son el directorio especificado por el objeto File y el nivel de profundidad del directorio.
Método "directory.fileReader(String filePath)": Lee y muestra el contenido del archivo especificado por la ruta relativa filePath.
Métodos "amazonas.serialize(String fileName)" y "amazonas.deserialize(String fileName)": Serializan y deserializan un objeto de tipo 'State'. Los archivos de serialización y deserialización se especifican por el nombre de archivo proporcionado.
