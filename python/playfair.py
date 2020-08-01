import string
char_matrix = dict()
coordinate_matrix = dict()
def playfairMatrix(key):
    curr_coordinate = (0,0)
    for k in key:
        if k == 'j':
            continue
        if k not in char_matrix:
            char_matrix[k] = curr_coordinate
            coordinate_matrix[curr_coordinate] = k
            curr_coordinate = increment(curr_coordinate)
    alphabet_string = string.ascii_lowercase
    for c in alphabet_string:
        if c == 'j':
            continue
        if c not in char_matrix:
            char_matrix[c] = curr_coordinate
            coordinate_matrix[curr_coordinate] = c
            curr_coordinate = increment(curr_coordinate)

# Now the coordinates range from (0,0) to (4,4)

def encrypt(pair,shift):
    if pair[0] == pair[1]:
        if pair[0] != 'x':
            return match((pair[0],'x'),shift)
        else:
            return match(('x','q'),shift)
    else:
        return match(pair,shift)

def match(pair,shift):
    co_ord_0 = char_matrix[pair[0]]
    co_ord_1 = char_matrix[pair[1]]
    if isHorizontal(co_ord_0,co_ord_1):
        #They are in a row
        # co_ord_0[0] = co_ord_1[0]
        # when doing right shift value of x does not change
        x = co_ord_0[0]
        y0 = (co_ord_0[1] + shift) % 5
        y1 = (co_ord_1[1] + shift) % 5
        return (coordinate_matrix[(x,y0)],coordinate_matrix[(x,y1)])

    elif isVertical(co_ord_0,co_ord_1):
        #do something
        y = co_ord_0[1]
        x0 = (co_ord_0[0] + shift) % 5
        x1 = (co_ord_1[0] + shift) % 5
        return (coordinate_matrix[(x0,y)],coordinate_matrix[(x1,y)])
    else:
        x0 = co_ord_0[0]
        x1 = co_ord_1[0]
        y0 = co_ord_1[1]
        y1 = co_ord_0[1]
        return (coordinate_matrix[(x0,y0)],coordinate_matrix[(x1,y1)])

def increment(p):
    if p[1] + 1 > 4:
        return (p[0]+1,0)
    else:
        return (p[0],p[1]+1)

def _encryption(message,shift):
    # when calling this function there should be no whitespaces
    odd_chars = []
    even_chars = []
    cipher_text = ''

    if len(message)%2 == 1:
        message += 'x'
    for i,c in enumerate(message):
        if i%2 == 0:
            even_chars.append(c)
        else:
            odd_chars.append(c)
    
    for pair in zip(even_chars,odd_chars):
        a,b = encrypt(pair,shift)
        cipher_text += (a+b)
    return cipher_text

def encryption(message):
    return _encryption(''.join(message.split()),1)

def isHorizontal(p0,p1):
    return p0[0] == p1[0]

def isVertical (p0,p1):
    return p0[1] == p1[1]

def decryption(cipher_text):
    return _encryption(cipher_text,-1)
