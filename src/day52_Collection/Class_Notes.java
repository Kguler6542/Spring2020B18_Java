package day52_Collection;

public class Class_Notes {
    /*
    06/22/2020
Topics: Collection
package name: day52_Collection
please go to Canvas -> java -> modules - > day52
        download day52 presentation and Collection Hierarchy
Data Structurs: in order to managae the data effeciently and in an organized manner

        -- Array (fixed)
        -- Collection (Dynamic)
        -- Map
Array: size is fixed
       supports primitives and objects
       Can be multi-dimensional
       has index, accept duplicates
collections framework:  consists of multiple interfaces, each interfaces has multiple implemntations
            all the clasess and interfaces are presented in "java.util"
Iterable(I): root interface. super-type of all interfaces in collections framework.
Collection (I):    extended by by List(I), Set(I), Queue(I)

            List(I): implemented by ArrayList(C), LinkedList(C), Vector(C)
                ArrayList(C): array based class. internally uses array, singly linked
                        singly linked ==> retriving data is faster ( get() )
                LinkedList(C): each objects are doublly linked
                        doubly linked ==> removing & adding are faster ( remove(), add() )
                Vector(C): array based class, is synchronized. only prefered in muti-thread
                        extended by Stack(C): array based class, is synchonized, Last In First Out order
                                pop(): LIFO, returns the last object from the stack and removes it from stack
synchronized: used for achiving thread-safety
        advantage: thread safe
        disadvantage: slower
thread: process of operating system scheduling object
multi-thread: two or more thread are being executed

     */
}