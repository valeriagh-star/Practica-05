García Herrera Valeria

• ¿Por qué eligieron esta opción?
R= Porque la versión de Genéricos (Versión 3) es la opción preferida en lenguajes como Java o C# para crear colecciones y clases de manejo de datos reutilizables y seguras en tipo.

•  De las tres opciones, ¿Cuál brinda mayor escalabilidad y por qué?
R= La opción que brinda mayor escalabilidad es la Versión 3: Genéricos. ¿Por qué? Por el Manejo de Nuevos Tipos (Escalabilidad Horizontal): Si en el futuro se añade un nuevo tipo de usuario, 
la implementación del ManejadorLista<T> no requiere cambios. Simplemente se instancia como ManejadorLista<Gerente>, y funcionará perfectamente. 
Así como también por la Elegancia del Código (Escalabilidad de Mantenimiento): Reduce la necesidad de código duplicado o de lógica compleja de casting. El código es más fácil de leer, mantener y extender.


• ¿Cuáles son las principales ventajas de la opción que seleccionaste para implementar?
1.	Seguridad de Tipos: Elimina la necesidad de casting explícito y verifica la validez de los tipos en tiempo de compilación, reduciendo errores en producción.
2.	Reutilización: La misma implementación del manejador de listas puede usarse con Empleado, Administrador, String, o cualquier clase futura, sin modificaciones.
3.	Claridad del Código: El código es más claro y menos propenso a errores, ya que el tipo de elemento de la lista está especificado de forma explícita (<T>).

• ¿Qué desventajas o limitaciones identificas  en la opción que implementaste?
1.	No Soporta Tipos Primitivos: Los genéricos generalmente no pueden ser instanciados directamente con tipos primitivos (como int, boolean, double). Se requiere usar sus clases wrapper (Integer, Boolean, Double).
2.	Complejidad en Clases Anidadas/Herencia: Puede ser un poco más complejo de entender o implementar al principio, especialmente al trabajar con herencia de genéricos o tipos con wildcards avanzados.

3.	Restricciones de Instanciación: En muchos lenguajes (como Java), no se puede instanciar directamente un arreglo del tipo genérico T debido al borrado de tipos (type erasure), lo que a veces requiere soluciones alternativas (como casting inseguro o pasar la clase Class<T> al constructor).

