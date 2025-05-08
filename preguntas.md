## Preguntas a responder

### 1. Ciclo de Vida del Dato (5b)
- ¿Cómo se gestionan los datos desde su generación hasta su eliminación en tu proyecto?
  Los archivos se guardan en una carpeta y dentro de esta se guarda un archivo de texto, estos no se eliminan de forma automatica.
- ¿Qué estrategia sigues para garantizar la consistencia e integridad de los datos?
  Se verifica el archivo antes de almacenarlos y se actualiza el archivo para que la pila muestre los archivos guardados.
- Si no trabajas con datos, ¿cómo podrías incluir una funcionalidad que los gestione de forma eficiente?
  Se podría incluir hash para verificar la integridad del programa.

### 2. Almacenamiento en la Nube (5f)
- Si tu software utiliza almacenamiento en la nube, ¿cómo garantizas la seguridad y disponibilidad de los datos?
  El software almacena archivos en el sistema local, pero para la nube se podría integrar con Google Drive.
- ¿Qué alternativas consideraste para almacenar datos y por qué elegiste tu solución actual?
  Utilizar mySQL para tener una base de datos. Elegí esta solución por ser más simple que usar una base de datos.
- Si no usas la nube, ¿cómo podrías integrarla en futuras versiones?
  Sincronizando el archivo a la nube tras el almacenamiento local.

### 3. Seguridad y Regulación (5i)
- ¿Qué medidas de seguridad implementaste para proteger los datos o procesos en tu proyecto?
  No hay control para proteger los datos.
- ¿Qué normativas (e.g., GDPR) podrían afectar el uso de tu software y cómo las has tenido en cuenta?
  GDPR podría requerir control sobre qué archivos se almacenan, con opción de eliminación segura.
- Si no implementaste medidas de seguridad, ¿qué riesgos potenciales identificas y cómo los abordarías en el futuro?
  Los riesgos serían acceso no autorizado a archivos, pérdida de datos por fallos del sistema.
  Unas posibles soluciones son cifrado de archivos, autenticación, copias de seguridad.

### 4. Implicación de las THD en Negocio y Planta (2e)
- ¿Qué impacto tendría tu software en un entorno de negocio o en una planta industrial?
  Podría utilizarse en control de versiones de documentos o almacenamiento temporal de archivos
- ¿Cómo crees que tu solución podría mejorar procesos operativos o la toma de decisiones?
  Facilita el almacenamiento estructurado de archivos sin una base de datos compleja.
- Si tu proyecto no aplica directamente a negocio o planta, ¿qué otros entornos podrían beneficiarse?
  Agregando integración con sistemas ERP.

### 5. Mejoras en IT y OT (2f)
- ¿Cómo puede tu software facilitar la integración entre entornos IT y OT?
  Puede actuar como una solución ligera de almacenamiento de archivos para sistemas industriales sin depender de bases de datos.
- ¿Qué procesos específicos podrían beneficiarse de tu solución en términos de automatización o eficiencia?
  Gestión de logs y registros en plantas industriales, asegurando un orden de recuperación de archivos controlado.
- Si no aplica a IT u OT, ¿cómo podrías adaptarlo para mejorar procesos tecnológicos concretos?
  Integrarlo a la nube para que tenga más flexibilidad.

### 6. Tecnologías Habilitadoras Digitales (2g)
- ¿Qué tecnologías habilitadoras digitales (THD) has utilizado o podrías integrar en tu proyecto?
  Usa un almacenamiento local de ficheros.
- ¿Cómo mejoran estas tecnologías la funcionalidad o el alcance de tu software?
  La nube permitiría acceso remoto y sincronización entre dispositivos.
- Si no has utilizado THD, ¿cómo podrías implementarlas para enriquecer tu solución?
  Usando blockchain para auditoría de almacenamiento o implementando IA para clasificar archivos automáticamente.


