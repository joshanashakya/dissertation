

# Python program to print level order traversal  
# in spiral form using one deque.  
class Node : 
    def __init__(self,val) : 
        self.data = val; 
        self.left = None; 
        self.right = None;  
  
def spiralOrder(root) : 
  
    d = [];  
  
    # Push root  
    d.append(root);  
  
    # Direction 0 shows print right to left  
    # and for Direction 1 left to right 
    direct = 0;  
    while (len(d) != 0) : 
        size = len(d);  
          
        while (size) : 
            size -= 1; 
              
            # One whole level 
            # will be print in this loop 
            if (direct == 0) : 
                temp = d.pop(); 
                  
                if (temp.right) : 
                    d.insert(0, temp.right); 
                      
                if (temp.left) : 
                    d.insert(0, temp.left); 
                      
                print(temp.data, end= " "); 
                  
            else : 
                temp = d[0]; 
                d.pop(0); 
                  
                if (temp.left) : 
                    d.append(temp.left); 
                      
                if (temp.right) : 
                    d.append(temp.right); 
                      
                      
                print(temp.data ,end= " ");  
          
        print() 
          
        # Direction change  
        direct = 1 - direct;  
  
if __name__ == "__main__" :  
  
    # Build the Tree  
    root = Node(10);  
    root.left = Node(20);  
    root.right = Node(30);  
    root.left.left = Node(40);  
    root.left.right = Node(60);  
  
    # Call the Function  
    spiralOrder(root);  
  
# This code is contributed by AnkitRai01 

