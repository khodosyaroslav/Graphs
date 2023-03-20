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

![image](https://user-images.githubusercontent.com/90519548/226420421-021491b1-1531-4565-801f-75af28025926.png)

2.  Enter d = 18 and the graph is connected by twelve edges and has the following form:

![image](https://user-images.githubusercontent.com/90519548/226420448-923576cd-d9e0-420d-80e9-fcfbe305a989.png)

3. List of edges:

![image](https://user-images.githubusercontent.com/90519548/226420473-a1c3a750-0001-43ef-9373-f210c1e02c5d.png)

4. The matrix of distances between vertices and the message about the d value at which the graph will be complete:

![image](https://user-images.githubusercontent.com/90519548/226420609-7caaebb2-1517-4e5c-af46-afe774df1e1f.png)

5. Adjacency matrix:

![image](https://user-images.githubusercontent.com/90519548/226420632-3475cffb-f3cd-42e3-a0ac-1c8e0d654c8d.png)

6. Adjacency list:

![image](https://user-images.githubusercontent.com/90519548/226420664-f95c0111-a0e1-4eba-be7c-c5cb60488454.png)

7. Incidence matrix:

![image](https://user-images.githubusercontent.com/90519548/226420696-8d5a141d-8a0b-49fb-b95f-61bda1ef11d9.png)

8. We select the starting vertex 2, for which the breadth-first search algorithm will be performed and display the resulting search tree:

![image](https://user-images.githubusercontent.com/90519548/226420714-92560e6b-179a-4f4e-9a6b-bf64bbcfa99b.png)

![image](https://user-images.githubusercontent.com/90519548/226420732-23aea27e-39ba-44a2-b96e-03141193dd5b.png)
