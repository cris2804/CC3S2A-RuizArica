# Actividad-Analisis-codigo-estatico

En esta actividad haremos uso de sonarquebe para el analisis de codigo estatico: 

![Untitled](images/Untitled.png)

Veamos el reporte de sonerqube : 

![Untitled](images/Untitled%201.png)

Entramos a issues para ver los olores de cogido : 

![Untitled](images/Untitled%202.png)

Resolvamos algunos olores de codigo : 

1. **Primer olor de codigo(Minor)**

![Untitled](images/Untitled%203.png)

![Untitled](images/Untitled%204.png)

Ejecutamos el sonar nuevamente : 

![Untitled](images/Untitled%205.png)

1. **Segundo olor de codigo (Major)**

![Untitled](images/Untitled%206.png)

Este olor de codigo nos menciona que el primer argumento debe ser el valor esperado , sin embargo los valores de los argumentos esta intercambiados .Corrijamos eso !

![Untitled](images/Untitled%207.png)

Vemos que son 3 clases que presentaban el mismo tipo de olor de codigo.Ahora ejecutemos nuevamente sonarquebe: 

![Untitled](images/Untitled%208.png)

1. **Tercer olor de codigo (Critical)**

![Untitled](images/Untitled%209.png)

![Untitled](images/Untitled%2010.png)

 Ejecutemos nuevamente sonarquebe: 

![Untitled](images/Untitled%2011.png)

Finalmente hemos reducido de 12 a 4 olores de codigo : 

![Untitled](images/Untitled%2012.png)