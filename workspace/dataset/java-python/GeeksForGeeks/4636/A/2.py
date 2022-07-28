

# Python3 program to determine 
# the focal length of a lens 
  
# Function to determine the focal length of a lens 
def focal_length(image_distance, object_distance) 
    : return 1 / ((1 / image_distance) + (1 / object_distance)) 
  
# Driver Code 
# Variable to store the distance 
# between the lens and the image 
image_distance = 2
  
# Variable to store the distance 
# between the lens and the object 
object_distance = 50
  
result = focal_length(image_distance, object_distance) 
print("Focal length of a lens is ", result, " units.") 

