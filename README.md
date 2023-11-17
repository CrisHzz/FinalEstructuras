# FinalEstructuras (Recorrido en orden sin recursividad)

Se trata del enunciado final de la materia Estructuras de datos dinamicas.


## Enunciado
Escriba una función que tome un árbol binario y lo atraviese iterativamente utilizando la técnica de recorrido de árbol en orden; 
El recorrido no debe usar específicamente la recursividad. 
A medida que se atraviesa el árbol, se debe llamar a una función de devolución de llamada pasada como argumento a la función principal en cada nodo (es decir, callback(currentNode)).
Cada nodo BinaryTree tiene un valor entero, un nodo padre, un nodo hijo izquierdo y un nodo hijo derecho.
Los nodos hijos pueden ser nodos BinaryTree en sí, None o Null.

Ejemplo
Arbol Binario
[![Arbol](Arbol de ejemplo "Arbol")](http://https://github.com/CrisHzz/FinalEstructuras/blob/master/Arbol%20de%20ejemplo.png "Arbol")


Salida esperada
callback(4)
callback(9)
callback(2)
callback(1)
callback(6)
callback(3)
callback(7)
