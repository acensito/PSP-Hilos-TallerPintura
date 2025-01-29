# Ejercicio de Hilos: Fabrica de bicicletas

## 🚲 Fabrica de piezas
Tendremos una fabrica de piezas de bicicletas, donde se fabrican las piezas de las bicicletas y se embalan para enviar al taller de armado de bicicletas. 

En dicha fabrica trabajan **cinco operarios**, que tienen una **cadencia entre 3 y 5 minutos para completar un paquete de piezas** y enviarlo al almacen de piezas a la espera de que el taller de armado de bicicletas lo retire. Cada trabajador tras completar un paquete de piezas **descansa entre 2 y 5 minutos** antes de poder comenzar a trabajar en un nuevo paquete de piezas.

Los trabajadores de la fabrica de piezas de bicicletas **no produciran mas piezas si el almacen de piezas esta lleno**, es decir, si hay mas de 10 paquetes de piezas en el almacen de piezas.

## 🚲 Almacen de piezas
Tendrá un almacen de piezas con **capacidad para 15 paquetes de piezas.** Cuando el almacen de piezas esta lleno, los trabajadores de la fabrica de piezas de bicicletas no producen mas piezas. Cuando el nivel de piezas en el almacen de piezas **baja**, los trabajadores de la fabrica de piezas de bicicletas vuelven a producir piezas.

## 🚲 Taller de armado
En el taller de armado de bicicletas, se reciben los paquetes de piezas y se arman las bicicletas. Tienen una **cadencia entre 5 y 8 minutos para armar una bicicleta** y enviarla al deposito de bicicletas.

En dicho taller trabajan tres operarios, que tras armar una bicicleta **descansan entre 2 y 3 minutos antes de comenzar a armar una nueva bicicleta**. 

## 🏗️ Funcionamiento
- 🚲 Solo se pueden fabricar piezas **si hay espacio en el almacen de piezas**.
- 🚲 Solo se pueden armar bicicletas **si hay piezas en el almacen de piezas**.
- 🚲 El taller dispone de un **deposito de bicicletas con capacidad para 25 bicicletas**, donde se almacenan las bicicletas armadas.
- Cuando el deposito de bicicletas esta lleno, se ha completado la producción, finalizandose la aplicacion y marchandose todos los operarios a sus casas.
- Los minutos vendran a ser **simulados como segundos en la aplicacion**.

