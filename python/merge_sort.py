"""
mergeSort(list) = merge (mergeSort(firstHalf) , mergeSort(secondHalf))
"""
# Naming conventions. For a simple int variable you may use x,y,etc., as
# variable name
# In the same way for lists I use xs meaning plural of x

def mergeSort(xs):
    if len(xs) == 0:
        return []
    elif (len(xs)) == 1:
        return xs
    else:
        n = length(xs) // 2
        return merge(mergeSort(take(n,xs)), mergeSort(drop(n,xs)))
    # take (5, list(range(10))) = [0,1,2,3,4]
    # drop (5,list(range(10))) = [5,6,7,8,9]

def merge(xs,ys):
    # let xs = [x1,x2,..,xn]
    # let ys = [y1,y2,..,yn]
    # if x1 <= y1
    # ans [x1] + merge([x2,..,xn],[y1,...,yn])
    if len(xs) == 0:
        return ys
    elif len(ys) == 0:
        return xs
    elif xs[0] <= ys[0]:
        return [fst(xs)] + merge(drop(1,xs),ys)
    else:
        return [fst(ys)] + merge(xs,drop(1,ys)) 