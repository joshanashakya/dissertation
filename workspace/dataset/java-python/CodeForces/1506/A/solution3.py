import math as m


# Python3 program to find element
# closet to given target.

# Returns element closest to target in arr[]
def findClosest(arr, n, target):
    # Corner cases
    if (target <= arr[0]):
        return arr[0], 0
    if (target >= arr[n - 1]):
        return arr[n - 1], n - 1

    # Doing binary search
    i = 0;
    j = n;
    mid = 0
    while (i < j):
        mid = (i + j) // 2

        if (arr[mid] == target):
            return arr[mid], mid

        # If target is less than array
        # element, then search in left
        if (target < arr[mid]):

            # If target is greater than previous
            # to mid, return closest of two
            if (mid > 0 and target > arr[mid - 1]):
                return getClosest(arr[mid - 1], arr[mid], target), 0

            # Repeat for left half
            j = mid

        # If target is greater than mid
        else:
            if (mid < n - 1 and target < arr[mid + 1]):
                return getClosest(arr[mid], arr[mid + 1], target), 0

            # update i
            i = mid + 1

    # Only single element left after search
    return arr[mid], mid


# Method to compare which one is the more close.
# We find the closest by taking the difference
# between the target and both values. It assumes
# that val2 is greater than val1 and target lies
# between these two.
def getClosest(val1, val2, target):
    if (target - val1 <= val2 - target):
        return val1
    else:
        return val2


# Driver code


test_Cases = int(input())
for i in range(0, test_Cases):
    row, column, cell_by_column = input().split()
    row = int(row)
    column = int(column)
    cell_by_column = int(cell_by_column)
    cell_by_column_temp = cell_by_column
    count = 0
    # while cell_by_column_temp%row!=0 :
    # cell_by_column_temp=cell_by_column_temp+1
    #  count+=1
    r = cell_by_column_temp / row
    if cell_by_column_temp % row != 0:
        r = r + 1
    r = int(r)
    count = row - (r * row - cell_by_column)
    # print(r,count)
    x_coordinate = r
    y_coordinates = count
    t1 = (y_coordinates - 1) * column
    t2 = x_coordinate
    print(t1 + t2)
