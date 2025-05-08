## Fase 2: Análisis de utilidad y aplicación

### Criterio 6a) Objetivos estratégicos

**¿Qué objetivos estratégicos específicos de la empresa aborda tu software?**
- Mejora de la gestión interna de contactos (clientes, proveedores, empleados).
- Eliminación de procesos manuales y físicos.
- Reducción de errores humanos en el registro y consulta de datos.

**¿Cómo se alinea el software con la estrategia general de digitalización?**
- Facilita la migración desde formatos físicos a digitales.
- Se adapta a entornos sin conexión, permitiendo digitalización progresiva.
- Promueve el uso de software libre y accesible, clave en la transformación digital.
---

### Criterio 6b) Áreas de negocio y comunicaciones

**¿Qué áreas se ven más beneficiadas con tu software?**
- **Producción:** seguimiento de tareas, contactos de proveedores.
- **Negocio:** registro y consulta de clientes.
- **Comunicaciones:** trazabilidad de llamadas, reuniones, correos.

**¿Qué impacto operativo esperas?**
- Ahorro de tiempo.
- Mejora de la organización interna.
- Acceso rápido a información clave para la toma de decisiones.
---

### Criterio 6c) Áreas susceptibles de digitalización

**¿Qué áreas son más susceptibles de ser digitalizadas con tu software?**
- Gestión documental de agendas físicas.
- Registro de comunicaciones e interacciones con terceros.
- Planificación de tareas y citas.

**¿Cómo mejorará la digitalización esas operaciones?**
- Acceso inmediato a datos desde cualquier equipo con Kotlin/Java.
- Menor dependencia del papel.
- Datos más seguros y con menos posibilidad de extravío.
---

### Criterio 6d) Encaje de áreas digitalizadas (AD)

**¿Cómo interactúan las áreas digitalizadas con las no digitalizadas?**
- El software puede actuar como una "puerta de entrada" a la digitalización.
- Convive con documentos físicos, permitiendo entrada manual y validación cruzada.

**¿Qué mejoras propondrías?**
- Exportación a PDF o CSV.
- Integración futura con almacenamiento en la nube.
- Funcionalidades multicliente o multiusuario.
---

### 🔍 Criterio 6e) Necesidades presentes y futuras

**¿Qué necesidades actuales resuelve tu software?**
- Registro y consulta sencilla de contactos sin necesidad de internet.
- Solución asequible y mantenible para pequeñas empresas o autónomos.

**¿Y a futuro?**
- Puede evolucionar hacia un gestor de relaciones con clientes (CRM) básico.
- Posibilidad de uso colaborativo con control de accesos.
---

### Criterio 6f) Relación con tecnologías habilitadoras digitales (THD)

**¿Qué tecnologías habilitadoras has empleado?**
- **Kotlin:** lenguaje moderno, interoperable y eficiente.
- **Persistencia local:** permite uso offline sin complejidad de bases de datos.

**¿Qué beneficios aporta?**
- Facilidad de mantenimiento, bajo consumo de recursos, alta compatibilidad con sistemas existentes (Java, Android, etc.).
---

### Criterio 6g) Brechas de seguridad

**¿Qué posibles brechas podrían surgir?**
- Acceso no autorizado al fichero local, manipulación directa del archivo sin validación.

**¿Qué medidas propondrías?**
- Cifrado de archivos locales, control de acceso por usuario, registros de actividad o log de cambios.
---

### Criterio 6h) Tratamiento de datos y análisis

**¿Cómo se gestionan los datos?**
- Los datos se introducen por consola, se validan y se almacenan como archivos.

**¿Qué metodologías usas?**
- Separación de lógica y persistencia, control de errores y estructura de datos clara.

**¿Cómo garantizas la calidad y consistencia?**
- Validaciones en la entrada de datos, operaciones CRUD controladas, persistencia ordenada y estructurada en el sistema de archivos.
