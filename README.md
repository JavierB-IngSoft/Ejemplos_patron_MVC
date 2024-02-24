Esta página tiene por objeto mostrar la evolución de un programa JAVA sencillo pasando de un diseño monolítico a un diseño que sigue el patrón arquitectónico Modelo-Vista-Controlador, facilitando el cambio de interfaz gráfico de forma sencilla y separando las responsabilidades de las clases involucradas en el proceso. Su finalidad es meramente educativa.

De ese modo, el proyecto CalculadoraSuma implementa una calculadora simple que solamente suma dos números reales de manera que la única clase se encarga de:
  - Generar la interfaz gráfica.
  - Gestionar la interacción del usuario (gestión de eventos).
  - Realizar la operación suma.
Así, la cohesión de la clase es baja al asumir tres responsabilidades en lugar de operar con clases especializadas.

El proyecto CalculadoraSuma2 implementa dos clases diferenciando el Dominio de la interfaz gráfica o GUI. En este caso el cambio de interfaz es rápido, cambiando en el main el nombre de la clase que se encargará de mostrar el aspecto del programa. Sin embargo, esta clase además se encarga de la gestión de eventos asumiendo dos responsabilidades.

El proyecto Calculadora MVC serpara cada responsabilidad en una clase diferente:
  - Vista: Generar la interfaz gráfica -> CalculadoraVista.java, CalculadoraVista1.java.
  - Controlador: Gestionar la interacción del usuario (gestión de eventos) -> CalculadoraControlador.java.
  - Modelo: Realizar la operación suma -> CalculadoraModelo.java

El problema que se observa es que el cambio de intefaz gráfico implica modificar algunas líneas de código en los archivos CalculadoraControlador.java y CalculadorSumaMVC.java donde se encuentra el main del programa.

Para solucionar este problema, facilitando un rápido cambio de interfaz gráfica, se implementa una clase interface en el cuarto proyecto. De este modo, se respeta el patrón 
Modelo-Vista-Controlador y se facilita la sustitución de la capa gráfica sin afectar al modelo. Además se mejora la cohesión interna de cada una de las clases del programa al 
dedicarse a una sola tarea.

Se ha añadido un archivo Enterprise Architect en el que se recogen los Diagramas de Clases de cada proyecto para visualizar su estructura interna.
