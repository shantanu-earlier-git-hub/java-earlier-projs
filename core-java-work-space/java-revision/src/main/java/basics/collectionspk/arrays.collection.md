<sub>
Working with Arrays and Collections
•	Create Java arrays, List, Set, Map, and Deque collections, 
    and add, remove, update, retrieve and sort their elements

. List -> ordered , indexed can use forEach Method.... 

. Set -> SortedSet -> NavigableSet -> 
sets doesn't allow duplicates ... not sorted / ordered come doesn't guarantee the order...
But ... 

SortedSet -> is sorted and ordered ... can be reversed.. has first() , last(), toArray(),
lower(),higher(), headSet() , tailSet()... 

NavigableSet -> is extension of sortedSet and all above methods (TreeSet<>)

when creating a set using method ask for more specific and specialised Set than generic...

e.g.

NavigableSet<Integer> nSet = getDataSet();

// don't use set...
// Set<Integer> nSet = getDataSet(); // not sure here that it is sorted if expecting...



private NavigableSet<Integer> getDataset(){
        return new TreeSet<>();
}

</sub>