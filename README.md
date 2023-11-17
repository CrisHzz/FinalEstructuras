
## Enunciado
Escriba una función que tome un árbol binario y lo atraviese iterativamente utilizando la técnica de recorrido de árbol en orden; 
El recorrido no debe usar específicamente la recursividad. 
A medida que se atraviesa el árbol, se debe llamar a una función de devolución de llamada pasada como argumento a la función principal en cada nodo (es decir, callback(currentNode)).
Cada nodo BinaryTree tiene un valor entero, un nodo padre, un nodo hijo izquierdo y un nodo hijo derecho.
Los nodos hijos pueden ser nodos BinaryTree en sí, None o Null.

##Ejemplo de arbol
[![Arbol-de-ejemplo.png](https://i.postimg.cc/02jf14Vr/Arbol-de-ejemplo.png)](https://postimg.cc/SJ08WgFp)





Salida esperada
callback(4)
callback(9)
callback(2)
callback(1)
callback(6)
callback(3)
callback(7)

## Uml de la funcion
[![Uml.png](https://i.postimg.cc/yd0G9bM7/Uml.png)](https://postimg.cc/zbXpY0DQ)
