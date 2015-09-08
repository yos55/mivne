Ex 2 - README
The class Graph - represent a non-directed graph.
•	We made changes in the constructor of the Graph.java file. The file type  of the graph were change from csv to dot file.
The constructor getting a file in format of a .dot graph file, while the figure of the graph is:
a--b[weight: 0.1234]
Means that there's an edge between vertex 'a' and veretex 'b', with weight 0.1234, which can be considered by the constructor Threshold if it is connected edge.
Every line contains is only one connection, between two vertexes.
The constructor insert every edge to a vertex set (by the connecting vertex for each source vertex).

•	We made improvement to the function:
 Vector<Clique>allC_seed(Clique edge, int min_size, int max_size)
The original function get 3 parameters: clique, min value and max value, build the vector with all the cliques in [min,max] range, and find max clique with the given clique and with another little clique.
Actually, the original function use smallest clique then the min value.
To improvement the code we added "if" condition that limit clique who's smallest then the min value.
This improvement felt in work on big clique.
•	Unit test
We made tests on the classes Graph, VertexSet, Clique.
The tests made on some function and classes with JunitAssert that existent in Java.
The tests successfully passed and proved the perfection of the code.

•	Max clique
To calculate the max clique we added 3 new function to the code:

1. This function finds the max size clique from all cliques:
public int MaxSizeAllClique()	
2. To improvement to memory consumption we send all clique from the first function  to this function:
	Public int checkSizeSpecCliqueCliqebyedge(Clique e)
This function check size of clique by edge.
In this function we used stack (not vector) to improvement the memory cunsumptoin.
3. This function find all the cliques in the max size we found: 
Public Vector<VertexSet>findAllCliqueswithMaxSize(int max).

Adding support the calculation based on DFS algorithm
The main problem:
Distribution of tasks to multiple computers

The solution:
The server receives graph with edges, he use the function “Minimal Cliques” that calculate the edges from graph.  
Then the server sends each time edge to one of the computers array (As calculation algorithm DFS, that sends vertex each time).
The computers calculates the length of maximal clique from an edge that was sent to him
The server receives databases from each of computer and updates the length of maximal clique as needed.
In the event, edge is not relevant and shorter then max clique, the server avoids sending. 

A server is an instance of a computer program that accepts and responds to requests made by another program, known as a client. 
The computers approached to server through a computer network to request information stored on the server.
Servers are used to manage network resources. 
Some servers are committed to a specific task, often referred to as dedicated. As a result, there are a number of dedicated server categories, like print servers, file servers, network servers and database servers.
Because they are commonly used to deliver services that are required constantly, most servers are never turned off. Servers are commonly high-end computers setup to be fault tolerant
