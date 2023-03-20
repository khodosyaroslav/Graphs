# BFS

The task of the work was to develop a program that:

1. Randomly generates the coordinates of 8 vertices and displays them
2. Prompts the user to enter the value d from the keyboard, on the basis of which the graph is built on a set of points in the following way: all pairs of points, the distance between which is less than the given value d, are connected by edges. Loops are ignored.
3. Outputs the list of edges in the format Ei (vi -ui), where both vi and ui are the numbers of the end vertices of the edge. The user needs to choose such a value d that the number of edges in the graph is 10-13.
4. Calculates and displays the matrix of distances between vertices, informs the user at what d value the graph becomes complete.
5. Calculates and outputs the adjacency matrix.
6. Calculates and displays the adjacency list.
7. Builds and outputs the incidence matrix.
8. Offers the user to choose a vertex (by number) for which the breadth-first search algorithm will be implemented. Display the resulting search tree.

Solution:

1. Vertices are generated randomly
![[Pasted image 20230320191853.png]]

2.  Enter d = 18 and the graph is connected by twelve edges and has the following form:
![[Pasted image 20230320191947.png]]

3. List of edges:
![[Pasted image 20230320192205.png]]

4. The matrix of distances between vertices and the message about the d value at which the graph will be complete:
![[Pasted image 20230320192215.png]]

5. Adjacency matrix:
![[Pasted image 20230320192223.png]]

6. Adjacency list:
![[Pasted image 20230320192231.png]]

7. Incidence matrix:
![[Pasted image 20230320192238.png]]

8. We select the starting vertex 2, for which the breadth-first search algorithm will be performed and display the resulting search tree:
![[Pasted image 20230320192247.png]]
![[Pasted image 20230320192252.png]]