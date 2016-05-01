1. Using List of WindowSystem. List is much faster for searching and its also memory save. 

2. Adding window -  create a new SimpleWindow instance and add it to the list. A List will automatically add new object to the end of the list. 
Removing window -  get the index of the window, decrease the index value of other windows with bigger index. Then remove the object from the list using the index. When you have the object index, its easy and fast to delete it from a list.

Drawing windows from back to front -  Draw windows from window with the smallest index to the biggest index. 

