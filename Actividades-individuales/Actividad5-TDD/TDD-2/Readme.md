# Actividad TDD1

1. Escribe el siguiente código para comenzar nuestra prueba:

![Untitled](Images/Untitled.png)

1. Para comenzar el diseño, decidimos usar una clase llamada Word para representar nuestra
   palabra. También decidimos proporcionar la palabra a adivinar como un parámetro de construcción
   para nuestra instancia de objeto de la clase Word que queremos crear. Codificamos estas decisiones
   de diseño en la prueba:

![Untitled](Images/Untitled%201.png)

1. Usamos autocompletar en este punto para crear una nueva clase Word en tu propio archivo.
   Doble click en src/main folder tree y no en src/test. Haz clic en OK para crear el archivo en el árbol
   fuente dentro del paquete correcto.

![Untitled](Images/Untitled%202.png)

1. Ahora, renombramos el parámetro del constructor de Word

![Untitled](Images/Untitled%203.png)

1. A continuación, volvemos a la prueba. Capturamos el nuevo objeto como una variable local para
   que podamos probarlo:

![Untitled](Images/Untitled%204.png)

1. Pasar la adivinación es una decisión fácil: usaremos un método que llamaremos guess(). Podemos
   codificar estas decisiones en la prueba:

![Untitled](Images/Untitled%205.png)

1. Pasar la adivinación es una decisión fácil: usaremos un método que llamaremos guess(). Podemos
   codificar estas decisiones en la prueba:

![Untitled](Images/Untitled%206.png)

1. Haz clic en Enter para agregar el método, luego cambie el nombre del parámetro a un **nombre**
   **descriptivo**:

![Untitled](Images/Untitled%207.png)

1. A continuación, agreguemos una forma de obtener la puntuación resultante de esa suposición.
   Comienza con la prueba:

![Untitled](Images/Untitled%208.png)

1.  Captura estas decisiones en la prueba
2. Ahora, ejecuta esta prueba. Falla. Este es un paso sorprendentemente importante. Podríamos
   pensar al principio que solo queremos ver pasar las pruebas. Esto no es totalmente cierto. Parte del trabajo en TDD es tener la confianza de que sus pruebas están funcionando. Ver fallar una prueba cuando sabemos que no hemos escrito el código para que pase, nos da la confianza de que nuestra prueba probablemente esté verificando las cosas correctas

![Untitled](Images/Untitled%209.png)

3. Hagamos que la prueba pase agregando código a la clase Word:

![Untitled](Images/Untitled%2010.png)

4. A continuación, crea la clase score:

![Untitled](Images/Untitled%2011.png)

Nuevamente, usamos atajos de IDE para hacer la mayor parte del trabajo al escribir ese código por
nosotros. ¿La prueba pasa?. Explica los detalles

![Untitled](Images/Untitled%2012.png)

Vemos que los  test no pasan, ahora escribamos el minimo codigo de prueba para que estas pasen .

- creamos la clase Letter  que tiene como Objeto INCORRECT:

![Untitled](Images/Untitled%2013.png)

- Ahora en la clase Score adicionamos la línea **`return (Letter) Letter.INCORRECT;`** implica una conversión explícita de un objeto de tipo **`Object`** a un objeto de tipo **`Letter`**.

![Untitled](Images/Untitled%2014.png)

- Probamos el test y finalmente paso :

![Untitled](Images/Untitled%2015.png)

Exportamos el test en formato HTML y asi finaliza la actividad TDD1

![Untitled](Images/Untitled%2016.png)